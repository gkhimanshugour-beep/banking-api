

class demo1
{
   int a = 10;
   int b= 10;

   int sum(){
       return a+b;
   }
    int sub(){
        return a-b;
    }

   //static String name= "Himanshu"; // static variable--------

}


public class Variable {

 public static void main(String[]args) {

     //int a = 10;// Local variable--------------------

    // System.out.println(demo1.name);
     //System.out.println(demo1.name);

     demo1 d = new demo1();
     System.out.println(d.sum());
     System.out.println(d.sub());

 }

}
