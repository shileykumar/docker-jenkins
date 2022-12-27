package com.sunglowsys.dockerjenkins.service;

import org.springframework.stereotype.Service;

@Service
public class CalService {

    public int addition(int a, int b) {
        return a + b;
    }
}
