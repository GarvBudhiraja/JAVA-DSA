
// public class basicloop {
//     public static void main(String[] args) {
//         for(int i=1; i<=7; i++){
//             System.out.println("Garv");
//         }
//     }
// }

//2)Taking how much number of times a user can print a name which is GARV
// import java.util.*;
// public class basicloop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("How much time you want to print 'GARV' = ");
//         int a = sc.nextInt();
//         for(int i=1; i<=a; i++){
//             System.out.println("GARV");
//         }
//     }
// }

//3)Ab jo hai user se puchege ki kitne time or kya print krvana hai
// import java.util.*;
// public class basicloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("What you want to print = ");
//         String a = sc.nextLine();
//         System.out.print("How much time you want to print this = ");
//         int b = sc.nextInt();
//         for(int i=1; i<=b; i++){
//             System.out.println(a);
//         }
//     }
// }

//4)Print number 1 to 10
// public class basicloop {
//     public static void main(String[] args) {
//         for(int i=1; i<=10; i++){
//             System.out.println(i);
//         }
//     }
// }

//5))Print number from 1 to n
// import java.util.*;
// public class basicloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Which number untill you want to till print last from 1 to = ");
//         int a = sc.nextInt();
//         for(int i=1; i<=a; i++){
//             System.out.println(i);
//         }
//     }
// }

//6)Print even numbers from 1 to 100
// public class basicloop {
//     public static void main(String[] args) {
//         for(int i=1; i<=100; i++){
//             if(i%2==0) System.out.println(i);
//         }
//     }
// }

//7)Print table
// import java.util.*;
// public class basicloop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Which table you wants to print : ");
//         int a = sc.nextInt();
//         for(int i=1; i<=10; i++){
//             System.out.println(a + " * " + i + " = " + (a*i));
//         }
//     }
// }

//8)Ab hum user se puchege ki bhai kha tak or konsa table ka krvana hai 
// import java.util.*;
// public class basicloop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Bhai konsa table chaiye = ");
//         int a = sc.nextInt();
//         System.out.print("Bhai kha tak multiply krvana hai = ");
//         int b = sc.nextInt();
//         for(int i=1; i<=b; i++){
//             System.out.println(a + " * " + i + " = " + (a*i));
//         }
//     }
// }

//9)Print all odd numbers divisible by 3 from 1 to 100\
// public class basicloop {
//     public static void main(String[] args){
//         for(int i=1; i<=100; i++){
//             if(i%2!=0 && i%3==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }

//10)Print numbers from n to 1
// import java.util.*;
// public class basicloop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
//         for(int i=n; i>=1; i--){
//             System.out.println(i);
//         }

        
//     }
// }

//11)Ques: Display this AP - 2,5,8,11... upto 'n' terms
// import java.util.*;
// public class basicloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Haaji kha lag deva ge n term = ");
//         int n = sc.nextInt();
//         for(int i=2; i<=(3*n-1); i+=3){
//             System.out.println(i);
//         }
//     }
// }

//12)Print this series - 99,95,91,87,... upto all terms which are positive
// public class basicloop {
//     public static void main(String[] args) {
//         for(int i=99; i>=1; i-=4){
//             System.out.println(i);
//         }
        
//     }
// }

//13)Ques: Display this GP - 1,2,4,8.. upto 'n' terms  (GP)GP mai hmshe multiply divide hota hai or decreasing tho divide nhi tho increasing multiply
// import java.util.*;
// public class basicloop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter n term = ");
//         int n = sc.nextInt
//         int a=1;
//         for(int i=1; i<=n; i++){
//             System.out.println(a + " ");
//             a*=2;
//         }
//     }
// }

//14)WAP to print if number is composite or not
// import java.util.*;
// public class basicloop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the your number for checking weather it is composite number or not = ");
//         //Composite numbers: Jinke 2 se zyada factors hote hain ya fir ye bhi khe skte hai ki Jo numbers 1 aur khud ke alawa kisi aur number se bhi divide ho jaye, unhe composite numbers kehte hain.
//         int n = sc.nextInt();
//         for(int i=2; i<=n-1 ; i++){
//             if(n%i==0) {
//                 System.out.println("Composite");
//             break;
            
//             }
//             else{
//                 System.out.println("Not composite");
//         }}
//     }
// }                                                                                   

//Prime or Not prime check
// import java.util.*;
// public class basicloop {
//     public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      System.out.println("Enter a number for checking weather it is Prime or Not = ");
//         int n = sc.nextInt();
//         int count=0;
//         for (int i=1; i<=n; i++){
//             if(n%i==0)
//                 count++;
//         }
//         if(count==2){
//             System.out.println("Prime");
//         }
//             else{
//                 System.out.println("Not Prime");
//             }
//         }
//     }




//WHILE LOOP

//1)WAP to print numbers from 1 to 10
// public class basicloop {
//     public static void main(String[] args) {
//         int i=1;
//         while(i<=10){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

//2))WAP to print numbers from 1 to n
// import java.util.*;
// public class basicloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter that number u want to print till = ");
//         int n = sc.nextInt();
//         int i=1;
//         while(i<=n){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

//3)WAP to print numbers from n to 1
// import java.util.*;
// public class basicloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number from which u can decrease = ");
//         int n = sc.nextInt();
//         int i=n;
//         while(i>=1){
//             System.out.println(i);
//             i--;
//         }
//     }
// }



//DO-WHILE LOOP

//1)WAP to print number from 1 to 10
// public class basicloop{
//     public static void main(String[] args) {
//         int i = 1;
//         do{
//             System.out.println(i);
//             i++;
//         }while(i<=10);
//     }
// }


//Count digits of a number
// import java.util.*;
// public class basicloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your number = ");
//         int n = sc.nextInt();
//         int count = 0;
//         // while(n!=0){
//         //     n/=10;
//         //     count++;
//         // }
//         //or for se krke dekhte hai
//         // for(; n!=0; n/=10){
//         //     count++;
//         // }
//         System.out.println(count);

//     }
// }

//Print sum of digits of number
// import java.util.*;
// public class basicloop{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your number n = ");
//         int n = sc.nextInt();
//         int sum = 0;
//         while(n!=0){
//             sum += n%10;
//             n/=10;
//         }
//         System.out.println(sum);
//     }
// }
//% se lastr digit niklta hai or / is se last digit htaya jata hai gayab kiya jata hai

//Reverse of a number
// import java.util.*;
// public class basicloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter your number for reversing = ");
//         int n = sc.nextInt();
//         int r;
//         while(n!=0){
//             r = n%10;
//             n/=10;
//             System.out.print(r + " ");
//         }
        
//     }
// }

//iska proper reverse krna ka yt pe ye hai jo ab niche kruga mai
// import java.util.*;
// public class basicloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number for reversing = ");
//         int n = sc.nextInt();
//         int r = 0;
//         while(n!=0){
//             r*=10;
//             r+=(n%10);
//             n/=10;
            
//         }
//         System.out.println(r);
        
//     }
// }

//FIND THE FACTORIAL
// import java.util.*;
// public class basicloop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your number for finding factorial = ");
//         int n = sc.nextInt();
//         int fact = 1;
//         for(int i=1; i<=n; i++){
//             fact*=i;
//         }
//         System.out.println(fact);
//     }
// }

//A power B
// import java.util.*;
// public class basicloop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value of a = ");
//         int a = sc.nextInt();
//         System.out.print("Enter the value of power b = ");
//         int b = sc.nextInt();
//         int p = 1;
//         for(int i=1; i<=b; i++){
//             p = p*a;
//         }
//         System.out.println(p);
//     }
// }