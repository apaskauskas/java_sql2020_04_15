package kcs.jdbc;

import tasks.MyJDBCUtils;

import java.sql.*;

public class ThirdTask {
    public static void main(String[] args) {
        Connection connection = MyJDBCUtils.getConection();
        if (connection == null) {
            return;
        }
        if (QueryUtils.isTableExist(connection, "student")) {
            System.out.println("Lentele egzistuoje");
        } else {
            System.out.println("lenteles nera");
        }

    }
}
