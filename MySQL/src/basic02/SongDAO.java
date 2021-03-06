package basic02;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SongDAO {
	private Connection conn;
	Statement st = null;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";

	public SongDAO() {
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    conn = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
            ex.printStackTrace();
        } 
	}
	
	public void insertSong(SongDTO song) {
		String query = "insert into song (title, lyrics) values (?, ?);";
		PreparedStatement pStmt= null;
	
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, song.getTitle());
			pStmt.setString(2, song.getLyrics());
			
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
	
	public SongDTO selectOne(int id) {
		String query = "select * from song where _id=?;";
		PreparedStatement pStmt= null;
		SongDTO song = new SongDTO();
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, id);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
                song.setId(rs.getInt("_id"));		// rs.getInt(1)
                song.setTitle(rs.getString("title"));
                song.setLyrics(rs.getString("lyrics"));
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
		return song;
	}
	
	public void updateSong(SongDTO song) {
		String query = "update song set title=?, lyrics=? where _id=?";
		PreparedStatement pStmt= null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, song.getTitle());
			pStmt.setString(2, song.getLyrics());
			pStmt.setInt(3, song.getId());
			
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
	
	public void deleteSong(SongDTO song) {
		String query = "delete from song where _id=?;";
		PreparedStatement pStmt= null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, song.getId());
			
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
	
	public List<SongDTO> selectAll() {
		String query = "select * from song;";
		PreparedStatement pStmt= null;
		List<SongDTO> list = new ArrayList<SongDTO>();
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				SongDTO song = new SongDTO();
                song.setId(rs.getInt("_id"));		// rs.getInt(1)
                song.setTitle(rs.getString("title"));
                song.setLyrics(rs.getString("lyrics"));
                list.add(song);
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
		return list;
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
