package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMain {

	public static void main(String[] args) {
		Connection conn = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");	
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
                "javauser", "javapass");	//데이터베이스와 연결
            
            String query = "insert into song (title, lyrics) values (?, ?);";
            
            java.sql.PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setString(1, "가시나");
            psmt.setString(2, "선미");
            
            psmt.executeUpdate();
            
            conn.close();
           
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (st != null)
                    st.close();
            } catch (SQLException se2) { }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

	}

}
