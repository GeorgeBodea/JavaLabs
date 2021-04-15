package com.georgeb.tasks;

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

