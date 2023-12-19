package javabasics;

public class LoopsAssignment {

    public static void main(String[] args) {


       // 5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using while loop
        int i = 1;


        while (i<=100){
            if(i%5 == 0){
                System.out.print(i);
            }
            i++;
        }



        //8. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while loop

//        char a = 'A';
//
//        while(a < 'Z'){
//            System.out.println((int)a);
//            a++;
//        }
//
//        char b = 'a';
//
//        while(b < 'z'){
//            System.out.println((int)b);
//            b++;
//        }
//
//
//        char c = '0';
//
//        while(c < '9'){
//            System.out.println((int)c);
//            c++;
//        }


        //Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.

        char a = 'a';
        while(a < 'z'){
            if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
                System.out.println(a);
            }
           a++;
        }



    }
}
