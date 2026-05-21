
// Multithreading
//1 extends Thread class
//2 implements runnable interface

/*class Thread1 extends Thread{


    @Override
    public void run() {
        for (int i =1;i<=10;i++){

            System.out.println("I am a thread 1 ................");

            try {
                Thread.sleep(1000);
            }catch(Exception e ){
                System.out.println(e);
            }
        }
    }

}

class Thread2 extends Thread{
    @Override
    public void run() {
        for (int i =1;i<=10;i++){

            System.out.println("I am a thread 2 ................");
            try {
                Thread.sleep(1000);
            }catch(Exception e ){
                System.out.println(e);
            }

        }
    }

}
*/

// 2 implements runnable interface -------

class Thread1  implements Runnable{

    public synchronized void run(){

        synchronized (this){

        }


        System.out.println ("Hello I am Runnable Interface ......................");
    }

}
public class Multithreading {

   public static void main (String []args) throws InterruptedException {

//         A ref1 = new A();
//         ref1.start();
          // ref1.join();

//       A ref2 = new A();
//       ref2.start();

      // Thread1 t1 = new Thread1();
      // t1.start();
       //t1.join();
       // t1.yield();
      // t1.stop();

     //  Thread2 t2 = new Thread2();
     //  t2.start();


   Thread1 ref = new Thread1();

   Thread t = new Thread(ref);

   t.start();




   }

}
