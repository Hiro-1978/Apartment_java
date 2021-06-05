package apartment;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class MyConnect {

     public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/dbapart?useUnicode=true&characterEncoding=UTF-8", "root", "");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "ยังไม่ได้เชื่อมต่อกับฐานข้อมูล", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        return conn;
    }
}