package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateMain {

	public static void main(String[] args) {
		Connection conn = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");	
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
                "javauser", "javapass");	//데이터베이스와 연결
            
            String query = "update song set lyrics=? where _id=?";
            
            java.sql.PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setString(1, "왜 예쁜 날 두고 가시나");
            psmt.setInt(2, 117);
            
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
