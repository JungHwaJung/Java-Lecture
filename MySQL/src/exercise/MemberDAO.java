package exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";

	public MemberDAO() {
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    conn = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
            ex.printStackTrace();
        } 
	}
	
	public MemberDTO selectOne(int id) {
		String query = "select * from member where id=?;";
		PreparedStatement pStmt= null;
		MemberDTO members = new MemberDTO();
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, id);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				members.setId(rs.getInt(1));	
				members.setPassword(rs.getString(2));
				members.setName(rs.getString(3));
				members.setBirthday(rs.getString(4));
				members.setAddress(rs.getString(5));
			}
		} catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        try {
	        	if (pStmt != null && !pStmt.isClosed())
	        		pStmt.close();
	        } catch (SQLException se) {
                se.printStackTrace();
            }
	    }
		return members;
	}
	
	public void insertMember(MemberDTO members) {
		String query = "insert into member(password, name, birthday, address) values (?, ?, ?, ?);";
		PreparedStatement pStmt= null;
	
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, members.getPassword());
			pStmt.setString(2, members.getName());
			pStmt.setString(3, members.getBirthday());
			pStmt.setString(4, members.getAddress());
			
			pStmt.executeUpdate();
		} catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        try {
	        	if (pStmt != null && !pStmt.isClosed())
	        		pStmt.close();
	        } catch (SQLException se) {
                se.printStackTrace();
            }
	   }
	}
	
	public void updateMember(MemberDTO members) {
		String query = "update member set password=?, name=?, birthday=?, address=? where id=?;";
		PreparedStatement pStmt= null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, members.getPassword());
			pStmt.setString(2, members.getName());
			pStmt.setString(3, members.getBirthday());
			pStmt.setString(4, members.getAddress());
			pStmt.setInt(5, members.getId());
			
			pStmt.executeUpdate();
		} catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        try {
	        	if (pStmt != null && !pStmt.isClosed())
	        		pStmt.close();
	        } catch (SQLException se) {
                se.printStackTrace();
            }
	    }
	}
	
	public void deleteMember(int id) {
		String query = "delete from member where id=?;";
		PreparedStatement pStmt= null;
	
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, id);
			
			pStmt.executeUpdate();
		} catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        try {
	        	if (pStmt != null && !pStmt.isClosed())
	        		pStmt.close();
	        } catch (SQLException se) {
                se.printStackTrace();
            }
	   }
	}

	public List<MemberDTO> selectCondition(String query) {
		PreparedStatement pStmt= null;
		List<MemberDTO> memberList = new ArrayList<MemberDTO>();
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				MemberDTO members = new MemberDTO();
				members.setId(rs.getInt(1));		
				members.setPassword(rs.getString(2));
				members.setName(rs.getString(3));
				members.setBirthday(rs.getString(4));
				members.setAddress(rs.getString(5));
				memberList.add(members);
			}
		} catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        try {
	        	if (pStmt != null && !pStmt.isClosed())
	        		pStmt.close();
	        } catch (SQLException se) {
                se.printStackTrace();
            }
	    }
		return memberList;
	}
	
	public List<MemberDTO> selectAll() {
		String sql = "select * from member order by id desc;";
		List<MemberDTO> memberList = selectCondition(sql);
		return memberList;
	}
	
	public List<MemberDTO> searchMemberByName(String name) {
		String sql = "select * from member where name like '" + name + "';";
		List<MemberDTO> memberList = selectCondition(sql);
		return memberList;
	}
	
	
	public void close() {
		try {
			if ( conn != null && !conn.isClosed())
				conn.close();
		} catch (SQLException E) {
			E.printStackTrace();
		}
	}
}
