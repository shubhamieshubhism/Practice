package otherPractice;

import java.sql.*;

public class JDBCPRACTICE {
    public void jdbcConnection() throws SQLException {
        String url = "url";
        String username = "username";
        String password = "password";
        String query = "query";
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println("ID : " + rs.getInt(1) + " \nName : " + rs.getString(2));
        }
        stmt.close();
        conn.close();
    }
}
