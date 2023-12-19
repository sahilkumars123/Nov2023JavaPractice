package javabasics;

import java.util.Arrays;

public class ArraysLiterals {

    public static void main(String[] args) {



        int[] arr = new int[10]; //declaration

        arr[0] = 1; //intaillaization
        arr[1] = 3;
//        arr[2] = 345;
//        arr[3] = 345;
        arr[4] = 345;

        System.out.println(Arrays.toString(arr));



        //cricket players


        //Array literals
       // String[] days = {"Sunday", "Monday", "Tuesday", "Wed", "Thur", "Frid", "Sat"};

//        for(String e: days)
//            System.out.println(e);


//        System.out.println(days[0]);
//
//        System.out.println(Arrays.toString(days));
//
//        double d[] = {12.33, 44.55, 8.99};
//
//        System.out.println(Arrays.toString(d));
//
//        char c[] = {'a', 'b', 'r'};
//        System.out.println(Arrays.toString(c));
//
//        c[0] = 'z';
//
//        System.out.println(Arrays.toString(c));



      //  String[] days = {"Sunday", "Monday", "Tuesday", "Wed", "Thur", "Frid", "Sat"};

//
//        Object[] employee = {"Sahil", 28, true,500000.25};
//        Object[] employee1 = {"Sahil", 28, true,500000.25};
//        Object[] employee2 = {"Sahil", 28, true,500000.25};
//        Object[] employee2 = {"Sahil", 28, true,500000.25};




    //use-cases

        //myntra - clothes  - ecommerce
        //cricket - 11plyers - 4 bench


        short[] sh = new short[5];
        sh[0] = 23;

        System.out.println(sh); //address of sh
        System.out.println(Arrays.toString(sh)); // 23, 0, 0, 0, 0


        char[] ch = new char[5];
        ch[0] = 'h';
        System.out.println(Arrays.toString(ch));


        //default value -  primitive
        //int, short, long, byte: 0
        //double, float: 0.0
        //char: blank space
        //boolean: false


        //non-primitive: String, Object: null
    }
}
