package com.kcs.student.app.controller;

import com.kcs.student.app.dto.StudentAddress;
import com.kcs.student.app.service.StudentAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students/address")
public class StudentAddressController {

    @Autowired
    private StudentAddressService studentAddressService;

    @GetMapping
    public List<StudentAddress> getStudentAddress() {
        return studentAddressService.getStudentAddresses();
    }

    @GetMapping("/{studentId}/student")
    public List<StudentAddress> getStudentAddresses(@PathVariable("studentId") int studentId) {
        return studentAddressService.getStudentAddresses(studentId);
    }

    @PostMapping("/{studentId}/student/save")
    public List<StudentAddress> createStudentAddress(@RequestBody StudentAddress studentAddress, @PathVariable("studentId") int sutdentId) {
        StudentAddress.setStudentId(sutdentId);
        return studentAddressService.createStudentAddress(studentAddress);
    }
}
