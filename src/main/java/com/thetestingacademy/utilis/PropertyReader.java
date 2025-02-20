package com.thetestingacademy.utilis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Key;
import java.util.Properties;

public class PropertyReader {
    //Read the browser = chrome -> give to DriveManager


    public PropertyReader(){


    }
    public static String readKey(String key){
        FileInputStream fileInputStream = null;
        Properties p = null;
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir") +"/src/main/resources/Data.properties");
            p= new Properties();
            p.load(fileInputStream);
            return  p.getProperty(key);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
