

// ======================class and object demo =============================
/*class Demo {
    int id =101;
    String name ="Himanshu";

   public void show (){
     System.out.println("id = "+id );
       System.out.println("Name  = "+name );

   }
}*/

// Constructor in java by default constructor use
// 1.no Argument , 2.peremiterized constructor
// 3. copy constructor, 4. private constructor




import javax.xml.transform.stream.StreamSource;
import java.awt.*;

//class A {
//
//    int id ;
//    String Name ;


    //=================1.no Argument constructor ===================================

//    A(){
//       id  =101;
//       Name ="JackiSorf";
//    }


 //  2.peremiterized constructor========================

//    A(int x  ,String y){
//       id =x;
//       Name =y;
//    }

 // 3.Copy constructor -=======================

//    A( int x, String y){
//        id =x;
//        Name =y;
//
//    }
//    A( A ref ){
//        id = ref.id;
//        Name =ref.Name;
//    }

  // 4 Private constructor ==============================================

   /*A(int x ,String y){

      id = x;
      Name = y;
  }





    public void show (){
        System.out.println("Student id = "+id);
        System.out.println("Student Name  = "+Name);


    }

}
public class oops {

    public static void main (String []args){

 A ref = new A(101,"RaviGupta");
 //A ref1 = new A(ref);
 ref.show();
       // ref1.show();



    }
}*/


// Encapsulation in java==============================================


class Demo {

    private int pinNo;
    private float Amount ;

     //setter
    public void setPinNo(int pinNo){
         this.pinNo=pinNo;
    }

    // getter
    public int getPinNo(){
        return pinNo;
    }

    // setter
    public void setAmount (float Amount ){
        this.Amount=Amount ;
    }

    // getter
    public float getAmount() {

        return Amount ;
    }

    }


public class oops {

    public static void main (String []args) {

        Demo ref = new Demo();
        ref.setPinNo(10101);
        ref.setAmount(1000000.f);

        System.out.println ("Pin code is = "+ref.getPinNo());
        System.out.println ("Amount is  = "+ref.getAmount());
    }
}




