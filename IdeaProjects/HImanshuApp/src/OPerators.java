public class OPerators {
    public static void main(String []args){


        //1.Arithmetic OPreators ----------------------------------------------------------
       /* int a = 10;
        int b= 8;
        System.out.println( "Additions = "+ (a+b));
        System.out.println( "Subtraction= " + (a-b));
        System.out.println( "Multiplication =  "+(a*b));
        System.out.println( "Divided ="+(a/b));
        System.out.println( "Moduls = "+(a%b));

       // find simple interset

        int principle = 200000;
        int  rate = 5;
        int time = 12;

        int simpleInterset = (principle * rate * time)/100;
        System.out.println( " Simple interst = "+simpleInterset);*/

        //2. Comparision or Relational  Operator -------------------------------------------------

       /* int a = 10;
        int b= 20;

        System.out.println(a==b); // false
        System.out.println(a!=b); // true
        System.out.println(a>b); // false
        System.out.println(a<b); // true
        System.out.println(a>=b); //false
        System.out.println(a<=b);// true*/

        //3.Assignment opretors ----------------------------------------------------------------

       /* int a = 10;
        int b= a ;
           int c=   a  +=5 ; // a= 15

           int  d= a -=9; // a= 6
           int e= a *= 2;  // a= 12
           int f= a /=4;  // a= 3
           int g= a %=2;

         System.out.println(a); //0
        System.out.println(b); //10
        System.out.println (c); //15
        System.out.println (d); //6
        System.out.println(e);  //  12
        System.out.println(f);// 3
        System.out.println(g); //1
*/


   // 4.Logical operator-------------------------------------------------------------

  /* int a =10;
   int b=10;

   System.out.println((a==10) && (b==2)); // false
        System.out.println((a==10) || (b==2)); // true
        System.out.println( !(a==10)); // false ! true --*/

   //5. Unary --------------------------------------------------

 //  int a =+5;  // positive number ----------
  // int b =-5;  // nagative number ----------
  // System.out.println(a==b); // false

      //  incriment -----------++

//        int a =10;
//       ++ a; a--;  a++; a--; a++; --a;
//        System.out.println(a);

        // dicriment --===========

//        int a = 4;
//        int b = 6;
//
//        int c = ++a + b-- + a++ + --b + ++a;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

        //7.  Ternary operator in java ------------------------------------------------

//       int a = 10;
//       int b= 20;
//
//        String  c = (a==b) ? "Equal": "Not Equal";
//       System.out.println( c);

//int a = 1000;
//int b= 200;
//int c =  30;
//
// String r = (a > b || a > c)? "A is max "
//         : (b > c )? "b is max ":"c is max ";
//
//        System.out.println( r);



  // 7. Bitwise operator in java

        //1. Bitwise and &  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
//        int a = 88;
//        int b = 210;
//        System.out.println(a & b);

     // 2. Bitwise or |  - - - -  -- - -   - -
//        int a = 30;
//        int b = 57;
//        System.out.println(a | b);// 63 -- in decimal number

        // 3. Bitwise xor ^ __________________________________________-
//        int a = 39;
//        int b = 45 ;
//        int c = a^b;
//        System.out.println(c);

        //4. Bitwise complement ~ not
//        int a =5;
//        System.out.println(~a); //a =  -(5 + 1) == -6

       // 5. Left shift (<<) --------------------------
//       int a =56;
//       System.out.println(a<<1); // 5 * 2 = 112;

        // 6. Right shift (>>) ----------------------------

//        int  a = 45;
//        System.out.println(a>>1);  // 45/ 2 = 22-----

        // 7.


        int a = -5;

        System.out.println(a >>> 1);

    }

}
