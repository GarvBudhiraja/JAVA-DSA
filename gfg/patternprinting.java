//STAR RECTANGLE
// import java.util.*;
// public class patternprinting {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows = ");
//         int rows = sc.nextInt();
//         System.out.print("Enter number of columns = ");
//         int col = sc.nextInt();
//         for(int i=1; i<=rows; i++){
//             for(int j=1; j<=col; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


//STAR SQUARE
// public class patternprinting{
//     public static void main(String[] args) {
//         int rows=4;
//         int col=4;
//         for(int i=1; i<=rows; i++){
//             for(int j=1; j<=col ; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//     }
// }
//or
// import java.util.*;
// public class patternprinting{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n = ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


//Print krna 12345 agar 5 imput diya
// import java.util.*;
// public class patternprinting {
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter the value of n = ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=5;j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//Print krna 1111 2222 3333 4444 
// import java.util.*;
// public class patternprinting {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n = ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=4;j++){
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//STAR TRIANGLE Print * fir nextline mai ** fir nextline mai *** fir nextline mai ****
// import java.util.*;
// public class patterprinting{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n = ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*" + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//1 fir nextline mai 12 fir nextline mai 123 fir nextline mai 1234
// import java.util.*;
// public class patternprinting{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n = ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//1 fir nextline mai 22 fir nextline mai 333 fir nextline mai 4444
// import java.util.*;
// public class patternprinting{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n = ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// STAR TRIANGLE HORIZONTALY FLIPPED **** fir nextline mai *** fir nextline mai ** fir nextline mai *
//formula = n+1-i
// import java.util.*;
// public class patternprinting{
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the value of n = ");
//     int n = sc.nextInt();
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n+1-i;j++){
//             System.out.print("*" + " ");
//         }
//         System.out.println();
//     }
// }
// }

//same upr wala bas ab numbers ke saath
// import java.util.*;
// public class patternprinting{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n = ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n+1-i;j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//or ek or trika hai iska
// import java.util.*;
// public class patternprinting{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value of n = ");
//         int n = sc.nextInt();
//         int a = n; //number of stars to be printed in each line
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=a; j++){
//                 System.out.print("*" + " ");
//             }
//             a--;
//         System.out.println();
//     }}
// }


//Hollow rectangle
// import java.util.*;
// public class patternprinting{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows = ");
//         int r = sc.nextInt();
//         System.out.print("Enter number os coloumns = ");
//         int c = sc.nextInt();
//         for(int i=1;i<=r;i++){
//             for(int j=1;j<=c;j++){
//                 if(i==1 || i==r || j==1 || j==c){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

//STAR PLUS
// import java.util.*;
// public class patternprinting{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n = ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==3 || j==3){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// } //ye ocde tho square ya fir code diya ho esa print krnahai us hisab se kr skte hai use kyko mid pta lag jayga agar vese mathematical krna ho tho vo niche hai n=(n/2)+1

// import java.util.*;
// public class patternprinting{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n = ");
//         int n = sc.nextInt();
//         int mid = (n/2) + 1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==mid || j==mid){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

//STAR CROSS
// import java.util.*;
// public class patternprinting{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n = ");
//         int n = sc.nextInt();
//         int mid = (n/2) + 1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==j || i+j==n+1){ //ye formula hai 
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
            
//             System.out.println();
        
//         }
      
//     }
// }


//FLOYAD TRIANGLE
// import java.util.*;
// public class patternprinting{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n = ");
//         int n = sc.nextInt();
//         int a = 1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(a + " ");
//                 a++;
//             }
//             System.out.println();
//         }
//     }
// }


//Binary Triangle
// import java.util.*;
// public class patternprinting{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n = ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j)%2==0){
//                     System.out.print(1 + " ");
//                 }
//                 else{
//                     System.out.print(0 + " ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


//ODD NUMBER TRIANGLE
// import java.util.*;
// public class patternprinting{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of n = ");
//         int n = sc.nextInt();
//         int a = 1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(a + " ");
//                 a = a + 2;
//             }
//             System.out.println();
//         }
//     }
// }

