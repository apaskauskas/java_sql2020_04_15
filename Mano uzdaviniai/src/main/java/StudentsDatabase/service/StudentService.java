package StudentsDatabase.service;

import StudentsDatabase.Objects.Student;
import StudentsDatabase.StudentRepository;
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

    public Student createStudent(Student student) {
        PreparedStatement preparedStatement = studentRepository.getPrepearedStatment("insert into students(name, surname, phone, email)values(?,?,?,?)");
        if (preparedStatement == null) {
            return null;
        }
        try {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setString(3, student.getPhone());
            preparedStatement.setString(4, student.getEmail());

            preparedStatement.execute();

            return getStudents().stream()
                    .filter(s -> s.equals(student))
                    .findFirst()
                    .orElse(null);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();

        PreparedStatement preparedStatement = studentRepository.getPrepearedStatment("SELECT * from students");
        if (preparedStatement != null) {
            try {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
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
