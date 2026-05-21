import java.net.SocketTimeoutException;
import java.util.Scanner;

public class project2 {
   public static void main(String []args){

       Scanner sc = new Scanner(System.in);
 //==========================================================================================================
//       Section 2 – Flow Control (Conditional Statements)
//       - If
//       - If-Else
//       - Else-If
//       - Nested If-Else
//       - Ternary operator
//       - Switch



//  *1. Write a program to accepts a number from user and check given number is even or odd.

       /*System.out.println("Enter a number = ");int num = sc.nextInt();
       if (num%2==0){System.out.print(num+"is Even");}else System.out.print("number is odd");*/
// 😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊


//   *2. Write a program  to accepts two numbers from user and calculates first no is divisible by
//       second or not.
     /* System.out.println("Enter a num1 =  ");
      int num1=sc.nextInt();
      System.out.println("Enter a num2 =  ");
       int num2=sc.nextInt();
       if (num2==0){
           System.out.println(" 0 is not Allowed ");
       }
       else if (num1 % num2 == 0)
       {
           System.out.println("Num1 is divisible by num2");
       }
       else{System.out.println("Num1 is  not divisible by num2");}*/
// 😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊


//  *3. Write a program to accepts three numbers from user and calculate biggest number out of
//  three numbers.
      /* System.out.println("Enter a num1 =  ");
       int num1=sc.nextInt();
       System.out.println("Enter a num2 =  ");
       int num2=sc.nextInt();
       System.out.println("Enter a num3 =  ");
       int num3=sc.nextInt();

       if (num1 >num2 && num1>num3){
           System.out.println("Num1 is big ");
       }
        else if   (num2 >num1 && num2>num3){
           System.out.println("Num2 is big ");
       }
       else{
       System.out.println("Num3 is big ==");
       }*/
       // 😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊

//*4. Write a program to calculate whether character is in lowercase or uppercase.
     /*  System.out.println("Enter  a character  =  ");
       char ch = sc.next().charAt(0);
       if (ch >='A' &&  ch<='Z'){
          System.out.println("your letter is uppercase----------------------");
       }
       else if (ch >='a' && ch <='z'){
           System.out.println("your letter is lowercase --------------  -----------");
       }else {
           System.out.println("please enter a valid letters --------  ---------  ");
       }*/
// 😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊


//*5. Write a  program to input basic salary of an employee and calculate its Gross salary
//       according to following rules:
//       Basic Salary <= 10000 : HRA = 20%, DA = 80%
//               Basic Salary <= 20000 : HRA = 25%, DA = 90%
//               Basic Salary > 20000 : HRA = 30%, DA = 95%
//               Gross Salary = Basic Salary + HRA + DA

    /* System.out.println("Enter A Employee Basic Salary = ");
     float BS= sc.nextFloat();


            if (BS <= 10000){
              float HRA =  (BS * 20)/100;
              float DA =  (BS * 80)/100;

                System.out.println("your Basic Salary = "+BS);
              System.out.println("your House Rent Allowance ="+HRA);
                System.out.println("Dearness Allowance ="+DA);

                float gross= BS+HRA+DA;
                System.out.println("After Add  your Salary  HRA and DA Your total Gross Salary is = "+gross);
            }
      else  if (BS <= 20000){
           float HRA =  (BS * 25)/100;
           float DA =  (BS * 90)/100;

           System.out.println("your Basic Salary = "+BS);
           System.out.println("your House Rent Allowance ="+HRA);
           System.out.println("Dearness Allowance ="+DA);

           float gross= BS+HRA+DA;
           System.out.println("After Add  your Salary  HRA and DA Your total Gross Salary is = "+gross);
       }

     else   if (BS > 20000){
           float HRA =  (BS * 30)/100;
           float DA =  (BS * 95)/100;

           System.out.println("your Basic Salary = "+BS);
           System.out.println("your House Rent Allowance ="+HRA);
           System.out.println("Dearness Allowance ="+DA);

           float gross= BS+HRA+DA;
           System.out.println("After Add  your Salary  HRA and DA Your total Gross Salary is = "+gross);
       }
else {
    System.out.println("please Enter a valid  Amount ");

            }*/
// 😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊
//  *6. Write a program to show day of week according to user input by using switch case.

    /*System.out.println("Enter a alphabet According to day like you print Monday so you Enter m -");
    System.out.println("Enter a alphabet = ");
    char ch = sc.next().charAt(0);
    switch(ch){

        case'm','M':
            System.out.println("Monday");
            break;

        case't','T':
            System.out.println("Tuesday");
            break;

        case'w','W':
            System.out.println("Wednesday");
            break;

        case'h','H':
            System.out.println("Thursday");
            break;

        case'f','F':
            System.out.println("Friday");
            break;


        case's','S':
            System.out.println("Saturday");
            break;
        default:
            System.out.println("Enter a valid choice ");
    }*/

// 😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊

//*7. Write a program to perform all arithmetic operations according to user choice (for ex-for
//       addition press ‘+’...) by using switch case.

   /* System.out.print("Enter a num1 = ");
    int num1 =sc.nextInt();
       System.out.print("Enter a num2 = ");
       int num2 =sc.nextInt();
       System.out.print("Enter your perform arithmetic =  ");
       char ch =sc.next().charAt(0);

       switch(ch){

           case'+':
               int sum = num1+num2;
               System.out.println(num1+" + "+num1+" = "+sum );
         break;

         case'-':
               int sub = num1-num2;
             System.out.println(num1+" - "+num1+" = "+sub );
               break;

           case'*':
               int multi = num1*num2;
               System.out.println(num1+" * "+num1+" = "+multi );
               break;

           case'/':
               int div = num1/num2;
               System.out.println(num1+" / "+num1+" = "+div);
               break;

           case'%':
               int mod = num1%num2;
               System.out.println(num1+" % "+num1+" = "+mod );
               break;

           default:
               System.out.println("Enter a Valid choice = ");
       }*/
// 😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊

//*8. Write a program to find maximum between two numbers. use ternary operator

      /* System.out.println("Enter a num1 = ");
       int num1=sc.nextInt();
       System.out.println("Enter a num2 = ");
       int num2=sc.nextInt();

       int   max =(num1>num2)? num1:num2;
       System.out.println("max number is ="+max);*/
// 😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊

// *9. Write a program to find maximum between three numbers using if-else and ternary
//     operator.

       /*System.out.println("Enter a num1 = ");
       int num1=sc.nextInt();
       System.out.println("Enter a num2 = ");
       int num2=sc.nextInt();
       System.out.println("Enter a num3 = ");
       int num3=sc.nextInt();

       int max  = (num1>num2 && num1>num3)? num1:(num2>num1 && num2>num3)? num2:num3;
       System.out.println("MAx number is ="+max);*/
// 😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊

// *10.Write a program to calculate sum of digits of a number of three digit number using if
//else
      /* System.out.println("Enter a three number of digits= ");
       int num =sc.nextInt();

       if (num>100 && num<=999){
        int d1= num/100;
        int d2 =(num/10)%10;
        int d3 =num %10;
        int sum=d1+d2+d3;
        System.out.println("Sum of digits = "+sum);
       }else{
        System.out.println("Please Enter a valid choice ");
       }*/
       // 😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊


//*11. Write a "Bonus Distribution Program" using logical operators. Bonus will be given to
//     all those employees who have salary less than 20000 and tenure is more than 3 years.
// so employee give bonus 20% -------

      /* System.out.print("Enter a employees salary  = ");
       int salary= sc.nextInt();
       System.out.print("Enter a employees tenure  = ");
       int tenure= sc.nextInt();

        if (salary <= 20000 && tenure >=3)
        {
          int bonus = (salary *20)/100;

            System.out.print("Employee Salary  = "+salary);
           System.out.print("\nEmployee Bonus = "+bonus);

           int total_gross= salary+bonus;
            System.out.print("\nEmployee total gross  = "+total_gross);

        }else {
            System.out.println("please Enter a valid Amount ----------");
        }*/
// 😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊


// *12  Write a code (using nested switch case) to suggest a diet plan (calories) to
//      a consumer on behalf of inputs(gender and food time).
//#1. Write a program that accepts the age of person, find out the person is eligible for voting
//       or not.
//#2. Write a program that accepts a number from user and find whether it is positive or
//       negative or zero.
//#3. Write a program to calculate whether year is leap year or not.
//#4. Write a program that accepts five subjects ’marks from user and calculate the total marks
//       then calculate Percentage. Display message according to following condition:
//       Percentage >=60 then print message Grade A
//       Percentage >=50 then print message Grade B
//       Percentage >= 40 then print message Grade C
//       Percentage < 40 then print message Grade D
//#5. Write a program for generating electricity Bill. Accept last month unit and current month
//       unit from user, then calculate and print bill amount according to following condition:
//       0-150 charges 4 rs/unit
//       151-300 charges 6 rs/unit
//       301-500 charges 8rs/unit
//               >500 charges 10rs/unit
//#6. Write a program to show name of month . Ask user to enter between 1 and 12.  Use
//       switch case.
//#7. Write a program that accepts a character and check given character is vowel or not by
//       using switch case.
//#8. Write a program to check whether a number is even or odd using switch case.
//#9. Write a program to find the greatest of four numbers entered by the user.
//#10. Write a program to calculate the income tax of an employee.
//               The tax slabs according to annual salary are :
//       upto rs.300000 tax is 0%
//               from rs.300000 to rs. 500000 tax is 10%
//               from rs.500000 to rs. 1000000 tax is 15%
//               more than 100000 tax is 20%
//               Note: 250000 is exempted from tax criteria
//#11. Write a code for call center (using nested switch case). E,g, 1 for prepaid, 2 for post
//       paid. If 1 selected then show all the options for prepaid plans
//







   }




}
