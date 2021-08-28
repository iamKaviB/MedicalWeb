package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBconnetionUtil {
    private static Connection conn;

    private DBconnetionUtil() {
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        try {
            if( conn == null || conn.isClosed() )
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medilife",
                        "root",
                        "naduni123");
            }
        }
        catch (ClassNotFoundException  e) {

            e.printStackTrace();
        }


        return conn;
    }

    public static void closeConnection(PreparedStatement preparedStatement , Connection conn) {
        try {
            if(preparedStatement != null) {
                preparedStatement.close();
            }
            if(conn != null) {
                conn.close();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
