package kcs.jdbc;

import tasks.MyJDBCUtils;

import java.sql.*;

public class FirstTask {
    public static void main(String[] args) throws SQLException {
try {
    Connection connection = MyJDBCUtils.getConection();
    if (connection == null){
        return;
    }
    Statement statement = connection.createStatement();

    ResultSet resultSet = statement.executeQuery("SELECT  * from students");
    while (resultSet.next()){
        System.out.print(resultSet.getInt("id") + " ");
        System.out.print(resultSet.getString("name") + " ");
        System.out.print(resultSet.getString("surname") + " ");
        System.out.print(resultSet.getString("phone") + " ");
        System.out.print(resultSet.getString("email") + " \n");
}}catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
