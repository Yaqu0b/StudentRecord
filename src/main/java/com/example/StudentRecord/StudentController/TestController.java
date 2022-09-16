package com.example.StudentRecord.StudentController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/test/hello")
    public String hello(){
        return "Hello";
    }

    @RequestMapping("/index")
    public String welcome(){ //function name cannot be the same as the request mapping.
        return "StudentsIndex.html";
    }

    @RequestMapping("/update")
    public String welcome2(){ //function name cannot be the same as the request mapping.
        return "UpdateStudent.html";
    }


    @RequestMapping("/admin")
    public String admin(){
        return "AdminConsole.html";
    }


}
