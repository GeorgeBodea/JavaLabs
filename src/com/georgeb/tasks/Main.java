package com.georgeb.tasks;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        MockClass mockClass = new MockClass("NAME", 1);
        MockClass mockClass2 = new MockClass("SURNAME", 2);

        FileOutputStream fileStream = new FileOutputStream(new File("outputFile.txt"));
        ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);

        objectStream.writeObject(mockClass);
        objectStream.writeObject(mockClass2);

        objectStream.close();
        fileStream.close();


        FileInputStream fileStreamInp = new FileInputStream(new File("outputFile.txt"));
        ObjectInputStream objectStreamInp = new ObjectInputStream(fileStreamInp);

        MockClass output = (MockClass) objectStreamInp.readObject();
        MockClass output2 = (MockClass) objectStreamInp.readObject();

        System.out.println(output);
        System.out.println(output2);

        objectStreamInp.close();
        fileStreamInp.close();

    }
}
