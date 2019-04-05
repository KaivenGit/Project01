package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

public class TemplatesTest {


    //模板6：prsf：可生成 private static final
    private static final Customer custer = new Customer();
    //变形：psf
    public static final int NUM =1;
    //变形：psfi
    public static final int NUM2 = 2;
    //变形：psfs
    public static final String NATION = "china";


    //模板一:psvm
    public static void main(String[] args) {
        //模板二:
        System.out.println("hello!");
        //变形:soutp / soutm / soutv / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //模板3：fori
        String[] arr  = new String[]{"1","2","3","4"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        //变形iter(增强for循环)
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar(普通的for循环)
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }
        //模板4：list.for
        ArrayList list = new ArrayList();
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(7);
        for (Object o : list) {
            System.out.println(o);
        }
        //变形:list.fori(普通的for循环)
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形:list.forr(逆序的遍历)
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }

    public static void method(){
        System.out.println("TemplatesTest.method");


        //模板5：ifn
        ArrayList list = new ArrayList();
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(7);

        //变形:inn
        if (list != null) {

        }
        //变形:xxx.nn / xxx.null
        if (list == null) {

        }

        if (list != null) {

        }


    }
}
