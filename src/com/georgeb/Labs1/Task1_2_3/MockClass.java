package com.georgeb.Labs1.Task1_2_3;

import java.io.Serializable;

public class MockClass implements Serializable{
    private String randomName;
    private int randomNumber;

    public MockClass() {
    }

    public MockClass(String name, int number) {
        randomName = name;
        randomNumber = number;
    }
    
    @Override
    public String toString() {
        return "MockClass{" +
                "randomName='" + randomName + '\'' +
                ", randomNumber=" + randomNumber +
                '}';
    }
}

