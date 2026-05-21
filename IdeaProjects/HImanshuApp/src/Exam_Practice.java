
import java.util.Scanner;

public class Exam_Practice {

    // All user defined method in java
    // 1. No return type and no parameter ======

    public  void printname(){
        System.out.println("Hello methods ");
    }

    // 2 return type But No parameter =======

    public int add(){
        return 12+12;
    }

    // 3 No return type with parameters

    public void  multi(int a, int b ){

       System.out.println(a*b) ;

    }
// 4 return type and parameter also==================

    public int sum(int a, int b ){

        return a+b;
    }

 // static method =========================

    public static  int sub(int a ,int b ){

        return a-b;
    }






    public static void main(String []args){



        System.out.println("Start Practice for java Exam");

  // operator in java

  // 1) Arithmetic operator ==============  + - * / %==========

  /*int num1 = 10;
  int num2= 5 ;
  System.out.println("add = "+ (num1+num2));
        System.out.println("sub = "+(num1 - num2));
        System.out.println("multi = "+ (num1*num2));
        System.out.println("division = "+(num1 / num2));
        System.out.println("modules = "+ (num1 % num2));*/


 // 2) Assignment operator ---------------------------------- = ,+=,-=,/=,*= ,%=------------

//        int a = 10;
//        int b = a ;
//        int c  =+2;
//
//        System.out.println(b);
//        System.out.println(c);

 // 3 Relational ( Comparison ) operator =------------------[ == ,!= ,> ,< >= <= ] return value true or false

      /*  int value = 10;
        System.out.println (value ==10); // true
        System.out.println (value !=11);  // true
        System.out.println (value >4);
        System.out.println (value <20);
        System.out.println (value >=10);
        System.out.println (value <=20);*/

   // logical operators ----- in java and or not

   /* int num1=10;
    int num2 =20;

    System.out.println (num1>82 &&num2 <30);
        System.out.println (num1>82 ||num2 <30);
        System.out.println (! ( num1>82  &&num2 <30));*/
// 5 unary operators
//        int a = 1;
//        int b =9;
//          a++;--a;a--;a++;a++ ;
//        System.out.println (a);

    // 6 Ternary operator

//        int age = 19;
//         String result = (age > 18) ? "user can vote" : "user can not vote";
//
//        System.out.println(result);


 // Control flow
 // 1) conditional statement if ,if else ,leader if else nested if else ,switch case
        Scanner sc = new Scanner (System.in);
       /* System.out.println("Enter a age =  ");

        int age =sc.nextInt();

        if (age >=60){
            System.out.println ("A old man ");

        }else if (age >=25 && age <= 59){
            System.out.println ("A yong man");

        }
        else if (age >=20 && age <24){
            System.out.println ("Yuva ");
        }
        else if (age >=10 && age <=19){
            System.out.println ("Tanager ");

        }else {
            System.out.println("Child ");
        }*


        */

//        char day= 'Y';
//        switch(day){
//            case'M':
//                System.out.println ("Monday");
//                break;
//
//            default :
//                System.out.println ("palse Enter a valid choice ");
//
//        }

// loops in java  for ,while , do while , for each

//        int i =1;
//        while (i<=10){
//            System.out.println ("Hello java ");
//            i++;
//        }

//        byte i=1;
//
//        do{
//          System.out.println("Hello java  do while ");
//          i++;
//
//        }while (i<=10);

// for (int i=1; i<=10; i++,System.out.println("hello"));

// for each =========================
//        int arr []={12,23,2,32,3,23,};
//        for (int all : arr){
//            System.out.println (all);
//        }

//        Exam_Practice e = new Exam_Practice();
//        System.out.println (e.add(12,23));


       // int arr[][]={{12,23,3,2},{12,34,45,56}};

       /* int  arr [][][]={
                {{12,23,34},{12,34,45}} ,
                {{1,2,3},{2,3,4,5}},
                {{2,2,3,4},{89,90,11}}

        };

        for (int i=0;i<arr.length;i++){

           for (int j=0;j<arr[i].length;j++){

               for (int k =0; k<arr[i][j].length;k++){

                   if (arr[i][j][k]%2==0){  // print onlay even number ----------
                       System.out.print (arr[i][j][k]+" ");
                   }

               }
          System.out.println();

           }
            System.out.println();

        }*/




        // String in java =================================

//        String a = new String ("hello");
//        System.out.println (a);

       /* String name ="Himanshu";

        System.out.println(name.length());

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());

        System.out.println(name.startsWith("H"));
        System.out.println(name.endsWith("u"));

        System.out.println(name.substring(2));

        System.out.println(name.indexOf("i"));

        System.out.println(name.lastIndexOf("h"));
        System.out.println(name.charAt(3));

       String  fullname= name.concat("gour");
        System.out.println(fullname);*/


       // Exam_Practice.printname();


        Exam_Practice Ex = new Exam_Practice();
        Ex.printname();
       System.out.println(Ex.add());
        Ex.multi(12,12);
        System.out.println(Ex.sum(12,13));


        System.out.println(Exam_Practice.sub(12,10));







    }


}
