package com.sunglowsys.dockerjenkins.rest;

import com.sunglowsys.dockerjenkins.service.CalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CalController {

    private final CalService service;

    public CalController(CalService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public int add() {
        int result = service.addition(10, 20);
        return result;
    }

    @GetMapping("/sub")
    public int subtract() {
        int result = service.subtraction(20, 10);
        return result;
    }

    @GetMapping("/mul")
    public int multiplication() {
        int result = service.multiplication(10,5);
        return result;
    }
}
