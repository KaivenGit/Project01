package com.atguigu.java;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWord {

    private static int num;

    public HelloWord() {
    }

    private static final int INATIAL_SIZE = 1;

    //这是单行注释
    public static void main(String[] args) {
        ArrayList a = getList();

        /*ArrayList a = new ArrayList();

        synchronized ()*/

        Date date = new Date();

        a.add(0, 123);

        //thid();
    }

    public static ArrayList getList() {
        //region Description
        System.out.println("helloworld!");
        System.out.println("helloworld!");

        //endregion
        return new ArrayList();
    }

    public static void thid() {

        num = 0;

        try {
            FileInputStream fileInputStream = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


}
