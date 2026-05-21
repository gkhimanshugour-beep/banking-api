

/*

Polymorphism
     Compile Time Polymorphism ( Method overloading )
     Runtime Rime Polymorphism ( Method overriding )
 */

//1 ,Compile Time Polymorphism ( Method overloading )--------------------------

/*class A {

    int add(int x ,int y){
        int  c=x+y;

        System.out.println ("Add two numbers = "+c);
        return c;
    }

    int add(int x ,int y,int m){
        int  c=x+y+m;

        System.out.println ("Add three numbers = "+c);
        return c;
    }

}*/

//2 Runtime Rime Polymorphism ( Method overriding )

/*class Animal {

    void sound(){
        System.out.println ("I don't No ");
    }

}
class Dog extends Animal{

    @Override

    void sound() {
     //super.sound();
        System.out.println("Bow Bow ......");
    }

}



public class polymorphism {

    public static void main (String args[]){

  //  A ref = new A();
//    ref.add(12,3,4);
//    ref.add(12,23);

    Animal ref = new Dog();
    ref.sound();


    }



}
*/