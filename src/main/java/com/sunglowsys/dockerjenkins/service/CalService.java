package com.sunglowsys.dockerjenkins.service;

import org.springframework.stereotype.Service;

@Service
public class CalService {

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }
}
