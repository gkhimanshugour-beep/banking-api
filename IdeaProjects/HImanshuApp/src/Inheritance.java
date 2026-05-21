

// Inheritance in java ===========

//1 Single level Inheritance------------------------------

/*class father {

    String Zammin ;
    int money ;

     public void fatherinfo(){
        System.out.println("Zammin ="+Zammin);
        System.out.println("money ="+money);
    }
}

class child extends father{

    int bitcoine;

    public  void childinfo(){
        System.out.println("Bitcoine = "+bitcoine);
    }

}
*/

// 2. Multilevel Inheritance --------------------------


// class GrandFather{
//
//    String farm ;
//
// }
//
// class Father extends  GrandFather{
//
//     int money;
//
// }
//
// class Child extends Father{
//
//   int bitCoin;
//
//   public void ChildProperty(){
//
//       System.out.println ("Child Inherit Farm = "+farm);
//       System.out.println ("Child Inherit Money  = "+money);
//       System.out.println ("Child  Bitcoin  = "+bitCoin);
//
//   }
//
// }

 // 3. Hierarchical Inheritance ----------


// class Father {
//
//     String Farm ;
// }
//
// class child1 extends Father{
//
//     int  bitcoin ;
//
//     void child1Property(){
//         System.out.println("Child1 Inherit Farm = "+Farm);
//         System.out.println("Child1 Bitcoin  = "+bitcoin);
//
//     }
//
// }
//
// class child2 extends Father{
//
//     int  bitcoin ;
//
//     void child2Property(){
//         System.out.println("Child2 Inherit Farm = "+Farm);
//         System.out.println("Child1 Bitcoin  = "+bitcoin);
//
//     }
//
// }


 // 4 Multiple Inheritance With the Help of Abstraction (Interface )


/*interface Father{

    int fatherProperty(String  Farm);

}
interface Mother{

    int motherProperty(String gold);
}

class child implements Father,Mother{

    @Override
    public int fatherProperty(String Farm) {
        System.out.println (" Father Farm ="+Farm);
        return 0;
    }

    @Override
    public int motherProperty(String gold) {
        System.out.println (" Mother Gold  ="+gold);
        return 0;
    }

    public int childProperty(int bitcoin){
        System.out.println (" Child  ="+bitcoin);


    return 0;
    }
}


public class Inheritance{

    public static void main (String []args){

//        child ref = new child();
//        ref.Zammin ="50 biga ";
//        ref.money =2000000;
//        ref.bitcoine=50;
//        ref.fatherinfo();
//        ref.childinfo();


//        Child ref = new Child();
//        ref.farm ="50 Biga";
//        ref.money = 200000;
//        ref.bitCoin =90;
//        ref.ChildProperty();

//       System.out.println ("Child 1 Property ");
//        child1 ref1 = new child1();
//        ref1.Farm="50 Biga ";
//        ref1.bitcoin=90;
//        ref1.child1Property();
//
//        System.out.println( );
//        System.out.println ("Child 2 Property ");
//        child2 ref2 = new child2();
//        ref2.Farm="50 Biga ";
//        ref2.bitcoin=90;
//        ref2.child2Property();


      System.out.println ("Child Inherit Property From Father And Mother ");
    child ref = new child();
    ref.fatherProperty("50 Biga ");
    ref.motherProperty("20 kg ");
    ref.childProperty(90);









    }

}
*/