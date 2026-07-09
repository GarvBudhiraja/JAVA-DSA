//With the help of inbuilt function 3 numbers ka maximum kese nikale
// import java.util.*;
// public class methods {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your first number = ");
//         int a = sc.nextInt();
//         System.out.print("Enter your second number = ");
//         int b = sc.nextInt();
//         System.out.print("Enter your third number = ");
//         int c = sc.nextInt();
//         System.out.print(Math.max(Math.max(a,b),c));
//     }
// }


//Find the maximum of four numbers through inbuilt function
// import java.util.*;
// public class methods{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number = ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number = ");
//         int b = sc.nextInt();
//         System.out.print("Enter third number = ");
//         int c = sc.nextInt();
//         System.out.print("Enter fourth number = ");
//         int d = sc.nextInt();
//         System.out.println(Math.max(Math.max(a,b), Math.max(c,d)));
//     }
// }


//function for finding power

// public class methods{
//     public static void main(String[] args) {
//         System.out.println(Math.pow(2,6));  //Ye tho jus simple krke dekha
//     }
// }


//Syntax

// public class methods{

//     public static void harsh(){
//         System.out.println("Ashirwad");
//     }
//     public static void main(String[] args) {
//         System.out.println("Roshan");
//         harsh();
//         System.out.println("Sharvan");
//         harsh();
//     }
// }



// public class methods{

//     public static void garv(){
//         System.out.println("Prikshit");
//     }
//     public static void main(String[] args) {
//         sadhika();
//     }

//     public static void sadhika(){
//         System.out.println("Khushi");
//         garv();
//         System.out.println("Tanish");
//         nanu();
//     }

//     public static void nanu(){
//         garv();
//         System.out.println("Garv");
//     }
// }


//ARGUMENTS

// public class methods{

//     public static void sum(int a, int b){    //parameters (ye boxes hai int a,b vgera)
//         System.out.println(a+b);
//     }
//     public static void main(String[] args) {
//         sum(5,7);   //arguments  ye values hai
//     }
// }

//maximum if else 
// public class methods{
//     public static void max(int a, int b, int c){
//         if(a>b && a>c) System.out.println(a);
//         else if(b>a && b>c) System.out.println(b);
//         else System.out.println(c);
//     }
//     public static void main(String[] args) {
//         max(5,4,7);
//     }
// }




//RETURN TYPE

// public class methods{

//     public static int spiderman(){
//         System.out.println("Batman");
//         System.out.println("Superman");
//         return 5;
//     }
//     public static void main(String[] args) {
//         System.out.println(spiderman());
//     }
// }

//or

// public class methods{

// public static int prasun(){
//     System.out.println("Delhi");
//     System.out.println("Bombay");
//     return 5;
// }
//     public static void main(String[] args) {
//         int x = prasun();
//         System.out.println(x);
//     }
// }


// //Find maximum function through return
// public class methods{
//     public static int max(int a, int b, int c){
//         if (a>b && a>c) return a;
//         else if(b>a && b>c) return b;
//         else return c;
//     }
//     public static void main(String[] args) {
//         // int x = max(2,7,9);
//         // System.out.println(x);
//         //or
        
//         System.out.println(max(2,7,9));
//     }
// }