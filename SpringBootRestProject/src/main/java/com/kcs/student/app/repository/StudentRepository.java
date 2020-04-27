package com.kcs.student.app.repository;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class StudentRepository {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/kcs";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public PreparedStatement getPrepearedStatment(String sql) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return connection.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}