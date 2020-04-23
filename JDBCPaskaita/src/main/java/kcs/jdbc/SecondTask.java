package kcs.jdbc;

import tasks.MyJDBCUtils;

import java.sql.*;

public class SecondTask {
    public static void main(String[] args) throws SQLException {

        Connection connection = MyJDBCUtils.getConection();
        if (connection == null) {
            return;
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE students set name=?, surname=?, email=?, phone=? where id =?");
            preparedStatement.setString(1,"NewName");
            preparedStatement.setString(2,"NewSurname");
            preparedStatement.setString(3,"noemail@gmail.com");
            preparedStatement.setString(4,"+37061234561");
            preparedStatement.setInt(5,3);
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
