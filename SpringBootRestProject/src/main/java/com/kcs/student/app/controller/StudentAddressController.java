package com.kcs.student.app.controller;

import com.kcs.student.app.dto.StudentAddress;
import com.kcs.student.app.service.StudentAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students/addresses")
public class StudentAddressController {

    @Autowired
    private StudentAddressService studentAddressService;

    @GetMapping
    public List<StudentAddress> getStudentAddress() {
        return studentAddressService.getStudentAddress();
    }

    @GetMapping("/{studentId}/student")
    public List<StudentAddress> getStudentAddresses(@PathVariable("studentId") int studentId) {
        return studentAddressService.getStudentAddress(studentId);
    }

    @PostMapping("/{studentId}/student/save")
    public List<StudentAddress> createStudentAddresses(@RequestBody StudentAddress studentAddress, @PathVariable("studentId") int studentId){
        studentAddress.setStudentId(studentId);
        return studentAddressService.createStudentAddress(studentAddress);
    }
    @DeleteMapping("/{studentId}/student/{addressId}/delete")
    public void deleteStudentAddress(@PathVariable ("studentId") int studentId, @PathVariable("addressId") int addressId){
        studentAddressService.deleteStudentAddress(studentId, addressId);
    }
}

