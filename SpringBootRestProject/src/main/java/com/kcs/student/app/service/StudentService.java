package com.kcs.student.app.service;

import com.kcs.student.app.dto.Student;
import com.kcs.student.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        PreparedStatement preparedStatement = studentRepository.getPrepearedStatment("SELECT * from students");
        if (preparedStatement != null) {
            try {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()){
                    students.add(new Student(resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getString("surname"),
                            resultSet.getString("email"),
                            resultSet.getString("phone")));
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return students;
    }
}
