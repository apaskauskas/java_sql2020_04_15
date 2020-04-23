package kcs.jdbc;

import java.sql.*;

public class JDBCExample {

    public static void main(String[] args) throws SQLException {
        //1. Žingsnis
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.01:3306/kcs", "root", "");
        // 2 Zingsnis
        Statement statement = connection.createStatement();
        // 3 Zingsnis
        ResultSet resultSet = statement.executeQuery("SELECT  * from students");

        while (resultSet.next()){
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getString("surname"));
            System.out.println(resultSet.getString("phone"));
            System.out.println(resultSet.getString("email"));
        }

    }

}
