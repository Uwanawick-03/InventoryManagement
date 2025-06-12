package database;

import java.sql.*;

public class UserTest {

    public static void main(String[] args) {
        DBConnection ob = DBConnection.getInstance();
        Connection mycon = ob.getConnection();

        try {
            //Adding an admin user for test purposers
            PreparedStatement pstmt = mycon.prepareStatement("INSERT INTO user (Name, Username, Password, Role, Email, Phone_Number, NIC, Branch, Status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pstmt.setString(1, "Admin");
            pstmt.setString(2, "admin");
            pstmt.setString(3, "admin");
            pstmt.setString(4, "Admin");
            pstmt.setString(5, "admin@gmail.com");
            pstmt.setString(6, "0712345678");
            pstmt.setString(7, "123456789012");
            pstmt.setString(8, "Main Branch");
            pstmt.setString(9, "Active");
            pstmt.executeUpdate();
            
            
            //Testing the connection
            /*Statement st = mycon.createStatement();
            ResultSet rs = st.executeQuery("select * from user");
            while (rs.next()) {
                System.out.println(rs.getString(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getString(4)+""+rs.getString(5)+""+rs.getString(6)+""+rs.getString(7)+""+rs.getString(8)+""+rs.getString(9));
                
            }*/
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
