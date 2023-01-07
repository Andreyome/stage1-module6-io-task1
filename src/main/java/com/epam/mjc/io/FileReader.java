package com.epam.mjc.io;

import java.io.*;


public class FileReader {
    public Profile getDataFromFile(File file) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new java.io.FileReader("src/main/resources/Profile.txt"));
            String [] line = (reader.readLine()).split(": ");
            String name =line [1];
            String [] line1 = (reader.readLine()).split(": ");
            int age = Integer.parseInt(line1 [1]);
            String [] line2 = (reader.readLine()).split(": ");
            String  e_mail = line2 [1];
            String [] line3 = (reader.readLine()).split(": ");
            long phone = Long.parseLong(line3 [1]);
            System.out.println(name +" "+ age+" "+e_mail+" "+phone);
            return new Profile(name,age,e_mail,phone);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return new Profile();
    }
}
