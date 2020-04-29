package com.kcs.student.app.service;

import com.kcs.student.app.dto.Student;
import com.kcs.student.app.dto.StudentAddress;
import com.kcs.student.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentAddressService {
    @Autowired
    private StudentRepository studentRepository;

    public List<StudentAddress> getStudentAddresses() {
        String sql = "SELECT * FROM adress";
        return getStudentAddresses(sql, null);
    }

    public List<StudentAddress> getStudentAddresses(int studentId) {
        String sql ="SELECT * FROM address where student_id = ?";
        return getStudentAddresses(sql, studentId);
    }

    private List<StudentAddress> getStudentAddresses(String sql, Integer studentId) {
        List<StudentAddress> studentAddresses = new ArrayList<>();

        PreparedStatement preparedStatement = studentRepository.getPrepearedStatment("SELECT * FROM address where student_id = ?");
        if (preparedStatement != null) {
            try {
                if (studentId !=null) {
                    preparedStatement.setInt(1, studentId);
                }
                ResultSet resultSet = preparedStatement.executeQuery();

                while(resultSet.next()){
                    studentAddresses.add(new StudentAddress(resultSet.getInt("id"),
                            resultSet.getInt("student_id"),
                            resultSet.getString("country"),
                            resultSet.getString("city"),
                            resultSet.getString("street"),
                            resultSet.getString("post_code")));
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return studentAddresses;
    }

    public List<StudentAddress> createStudentAddress(StudentAddress studentAddress) {
        PreparedStatement preparedStatement = studentRepository.getPrepearedStatment("insert into address(student_id, country, city, street, postcode) values(?,?,?,?)");
        if(preparedStatement != null){
         } try{
            preparedStatement.setInt(1, studentAddress.getStudentId());
            preparedStatement.setString(2, studentAddress.getCountry());
            preparedStatement.setString(2, studentAddress.getCity());
            preparedStatement.setString(2, studentAddress.getStreet());
            preparedStatement.setString(2, studentAddress.getPostCode());
        }
    }
}
