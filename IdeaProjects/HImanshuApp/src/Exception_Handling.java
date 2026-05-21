import java.security.InvalidAlgorithmParameterException;


class Ex{

    int divide () throws ArithmeticException{
        int a =10;
        int b=0;
        int c = a/b;
        return c;
    }
}





public class Exception_Handling {

    public static void main (String []args){



       // System.out.println ("Main Method are started .....................");

//        int a =10;
//        int b =0;
//        try {
//            int c = a / b;
//
//            System.out.println(c);
//        }catch(Exception e){
//            System.out.println (e);
//        }
//
//        finally {
//            System.out.println("Finally block always runs <-><-><-><-><-><-><><><><><><><><><><><>");
//
//        }

//     throw ---------------------------
//         int age =12;
//
//         if (age<18){
//
//             throw new ArithmeticException("You can not vote");
//         }else {
//             System.out.println("Yes you can vote");
//         }
//
//
//        System.out.println ("Main Method are Ended <><<><><><><<><><<><<><><><><><>><><><><>");
//


        Ex ref = new Ex();
       int a = ref.divide();
       System.out.println ("value = "+a);





    }}

