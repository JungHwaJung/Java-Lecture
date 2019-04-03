package basic03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EaglesDAO {
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";

	public EaglesDAO() {
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    conn = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
            ex.printStackTrace();
        } 
	}
	
	public EaglesDTO selectOne(int backNo) {
		String query = "select * from eagles where back_number=?;";
		PreparedStatement pStmt= null;
		EaglesDTO player = new EaglesDTO();
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, backNo);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				player.setBackNo(rs.getInt(1));		
				player.setName(rs.getString(2));
				player.setPosition(rs.getString(3));
				player.setHs(rs.getString(4));
				player.setTh(rs.getString(5));
				player.setSh(rs.getString(6));
				player.setBirth(rs.getString(7));
				player.setIncome(rs.getInt(8));
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
		return player;
	}
	
	public void insertPlayer(EaglesDTO player) {
		String query = "insert into eagles values (?, ?, ?, ?, ?, ?, ?, ?);";
		PreparedStatement pStmt= null;
	
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, player.getBackNo());
			pStmt.setString(2, player.getName());
			pStmt.setString(3, player.getPosition());
			pStmt.setString(4, player.getHs());
			pStmt.setString(5, player.getTh());
			pStmt.setString(6, player.getSh());
			pStmt.setString(7, player.getBirth());
			pStmt.setInt(8, player.getIncome());
			
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

	public void updatePlayer(EaglesDTO player) {
		String query = "update eagles set name=?, posit=?, high_school=?, throwing_hand=?, slapping_hand=?, birth=?, income=? where back_number=?;";
		PreparedStatement pStmt= null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, player.getName());
			pStmt.setString(2, player.getPosition());
			pStmt.setString(3, player.getHs());
			pStmt.setString(4, player.getTh());
			pStmt.setString(5, player.getSh());
			pStmt.setString(6, player.getBirth());
			pStmt.setInt(7, player.getIncome());
			pStmt.setInt(8, player.getBackNo());
			
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
	
	public void deletePlayer(int backNo) {
		String query = "delete from eagles where back_number=?;";
		PreparedStatement pStmt= null;
	
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, backNo);
			
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
	
	public List<EaglesDTO> selectPlayersByPosition(String position) {
		String sql = "select * from eagles where posit like '" + position + "';";
		List<EaglesDTO> playerList = selectCondition(sql);
		return playerList;
	}
	
	public List<EaglesDTO> selectPlayersByIncome(int income) {
		String sql = "select * from eagles where income>=" + income + ";";
		List<EaglesDTO> playerList = selectCondition(sql);
		return playerList;
	}
	
	public List<EaglesDTO> selectCondition(String query) {
		PreparedStatement pStmt= null;
		List<EaglesDTO> playerList = new ArrayList<EaglesDTO>();
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				EaglesDTO player = new EaglesDTO();
				player.setBackNo(rs.getInt(1));		
				player.setName(rs.getString(2));
				player.setPosition(rs.getString(3));
				player.setHs(rs.getString(4));
				player.setTh(rs.getString(5));
				player.setSh(rs.getString(6));
				player.setBirth(rs.getString(7));
				player.setIncome(rs.getInt(8));
				playerList.add(player);
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
		return playerList;
	}
	
	public List<EaglesDTO> selectAll() {
		String sql = "select * from eagles;";
		List<EaglesDTO> playerList = selectCondition(sql);
		return playerList;
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
