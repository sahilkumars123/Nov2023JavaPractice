package javabasics;

public class Dowhile_Loop {

    public static void main(String[] args) {

//        int i = 15;


//        do{
//            System.out.println(i);  //15
//            i++;
//        }while(i<=10);
//
//        int l = 1;
//        do {
//            System.out.println(l);
//            if (l == 5) {
//                System.out.println("Hi");
//                break;
//            }
//            l++;
//        } while (l <= 100);
//
//        for (int e = 2; e <= 10; e = e + 2) {
//            System.out.println(e);
//        }

//        for (int num = 1; num <= 100; num++) {
//            System.out.println(num);
//            if (num % 5 == 0) {
//                System.out.println("hii");
//            }
//        }

//        for (double d = 1.0; d <= 10.0; d++) {
//            System.out.println(d);
//        }

//        for(double v=1.0; v<=10.0; v=v+0.1) {
//			System.out.println(v);
//		}


//        int pointer = 0;
//        while (true) {
//            System.out.println("checking the element in attempt : " + pointer);
//
//            if (pointer == 10) {
//                System.out.println("element is displsyed...click on ele");
//                break;
//            }
//            pointer++;
//        }


        //  8. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while loop
//        char d = 'A';
//
//        while (d<='Z'){
//
//            System.out.println(d);
//            d++;
//        }
//        char c='a';
//        while (c<='z'){
//
//            System.out.println(c);
//            c++;
//
//        }
//        char c1='0';
//        while (c1<='9'){
//
//            System.out.println(c1);
//            c1++;
//
//        }


        //Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".'

        int count = 1;

        while(count <= 10){

            System.out.println(count); //1

            if(count ==7){
                System.out.println("bye, see you tomorrow");
                break;
            }
            count++;
        }


    }


}
