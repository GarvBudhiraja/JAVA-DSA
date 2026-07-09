
//     public static void main(String[] args) {
//         int[] x = {6, 5, 34, 75, 17, 2, 4};
//         //indexing
//         System.out.println(x[0]);
//         //updating the value
//         x[3] = 71; //yaha pe 75 ki jgha 71 value daldi hai
//         System.out.println(x[3]);
//     }
// }


// public class array {
//     public static void main(String[] args) {
//         int[] arr = new int[4]; // 4 size ki array | 0 to 3
//         arr[0] = 10;
//         arr[1] = 20;
//         arr[2] = 30;
//         arr[3] = 21;
        
//     }
// }


//INPUT OUTPUT ARRAY
// public class array{
//     public static void main(String[] args) {
//         int[] arr = {23,54,13,1,5,71}; //length 6
//         //Agar for loop se krna hai tho 
//         for(int i=0; i<=5; i++){
//         //vese hum ese bhi likh skte hai jese for loop mai i<=5 likhre tho iski jgha i<6 likhdo jitni length hai vo 
//             System.out.println(arr[i]);
//         }
//         //WHILE LOOP SE AGAR KRNA
//         // int i=0;
//         // while(i<=5){
//         //     System.out.println(arr[i]);
//         //     i++;
//         // }
//     }
// }


//ARRAY LENGTH
// public class array{
//     public static void main(String[] args) {
//         int[] arr = {2,42,1,45,23,3,24,265,98};

//         // AGAR AB HME ISKI LENGTH DEKHNI HAI KI KITNI HAI

//         System.out.println(arr.length);
//     }
// }

//or isko arr.length krke bhi for loop ya koi bhi loop chla skte hai

// public class array {
//     public static void main(String[] args) {
//         int[] arr = {2,4,5,7,3,1,75,2,45,21};
//         for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

// ya yhi ek or bdiya trika hota hai arr.length wala he jese upr for loop se kra

// public class array{
//     public static void main(String[] args) {
//         int[] arr = {2,43,12,3,53,23,90,8};
//         int n = arr.length;  //Index 0 to n-1
//         for(int i=0;i<n;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }


//By default hmari sari values 0(zero) hoti hai proof ke liye niche code diya hai
// public class array{
//     public static void main(String[] args) {
//         int[] arr = new int[7];
//         for(int i=0;i<7;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


//Input array
// import java.util.*;
// public class array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[7];
//         for(int i=0;i<7;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<7;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

//or isko ek or trike se likh skta hu
// import java.util.*;
// public class array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[7];
//         int count=1;
//         for(int i=0;i<7;i++){
//             System.out.print("Enter number " + count + " = ");
//             arr[i] = sc.nextInt();
//             count++;
//         }
//         for(int i=0;i<7;i++){
//             System.out.println(arr[i]);
//         }

//     }
// }

//ab ek kaam kr number ko input lo or unko double krdo 
// import java.util.*;
// public class array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[9];
//         int count = 1;
//         for(int i=0;i<9;i++){
//             System.out.print("Enter number " + count + " = ");
//             arr[i] = sc.nextInt();
//             count++;
//         }
//         for(int i=0;i<7;i++){
//             System.out.println(2*(arr[i]));
//         }
//     }
// }


//AB HUM SIRF NEGATIVE NUMBER PRINT KRAYAGE EK ARRAY MAI SE JU USER INPUT DEGA YA VALUES DEGA USME SE
// import java.util.*;
// public class array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[7];
//         int count = 1;
//         for(int i=0;i<7;i++){
//             System.out.print("Enter number " + count + " = ");
//             arr[i] = sc.nextInt();
//             count++;
//         }
//         for(int i=0;i<7;i++){
//             if(arr[i] < 0){
//                 System.out.print(arr[i] + " ");
//             }
//             else{

//             }
//         }

//     }
// }


//PRINT SUM OF ELEMENTS OF ARRAYS
// import java.util.*;
// public class array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the length of the array = ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         int count = 1;
//         int sum = 0;
//         for(int i=0; i<n; i++){
//             System.out.print("Enter number " + count + " = ");
//             arr[i] = sc.nextInt();
//             count++;
//         }
//         for(int i=0; i<n; i++){
//             sum+=arr[i];
//         }
//          System.out.println("Sum is = " + sum);

//     }
// }


//PRINT THE MAXIMUM ELEMENTS IN ARRAY
// import java.util.*;
// public class array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the length of the array = ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         int count = 1;
//         for(int i=0;i<n;i++){
//             System.out.print("Enter number " + count + " = ");
//             arr[i] = sc.nextInt();
//             count++;
//         }
//         int max = arr[0];
//         for(int i=0;i<n;i++){
//             if(arr[i] > max){
//                 max = arr[i];
//         }
//     }
//     System.out.print("Maximum number is = " + max);
// }
// }


//Name ka bhi array bna skte hai hum
// public class array{
//     public static void main(String[] args) {
//         String[] arr = {"Garv", "G", "A", "R", "V"};
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }


//PASSING ARRAY TO METHOD
// public class array{

//     public static void change(int[] y){
//         y[2]=99;
//     }
//     public static void main(String[] args) {
//         int[] x = {23,543,13,12};
//         System.out.println(x[2]);
//         change(x);//ye jo hai array x naam ki ka adress bhejra hai change function mai jisk through jo hi changes mai y mai kruga vo sidha x mai hoga kyoki change mai tho values ka adress gya hai value nhi
//         System.out.println(x[2]);
//     }
// }


//ShallowCopyDeep
// public class array{
//     public static void main(String[] args) {
//         int[] arr = {12,43,25,41};
//         int[] x = arr; //x is shallow copy of arr .... matlab ki arr ki sari value x mai aagyi matlab ki x mai change krege tho sidha arr mai hoga
//         x[0] = 100;
//         System.out.println(arr[0]);
//     }
// }

//deepcopy mai kya hota hai ki jese agar dusre array mai change krege tho tho original vali mai kuch change ni hoga
//Deep copy matlab naya array ban gaya, original se koi link nahi. Change karne pe original safe rehta hai
// import java.util.Arrays;
// public class array{
//     public static void main(String[] args) {
//         int[] arr = {10,23,131,24};
//         int[] deep = Arrays.copyf(arr,arr.length); // deep copy //copyOf ese likhna vo jab kr raha hu ab vhi dikkat ari sare upr vale code gayab hojate hai isliye halka sa error chod diya code mai
//         deep[0] = 122;
//         System.out.println(arr[0]);
//     }
// }


//SORTING
// import java.util.Arrays;
// public class array{
//     public static void main(String[] args) {
//         int[] arr = {23,13,24,1,24,11};
//         Arrays.sort(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//         System.out.println();
        
//     }
    
// }

//ab hum isko function ke throufh kre 
// import java.util.Arrays;
// public class array{
//     public static void ascending(int[] arr) {
//         Arrays.sort(arr);
//         for(int i=0;i<arr.length;i++){
            
//             System.out.println(arr[i]);
//         }
//     }
//     public static void main(String[] args){
//         int[] arr = {23,53,13,134,1,4,42};
//         ascending(arr);
//         }
//     }


//Multiply odd indexed elements by 2 and add 10 to the even indexed elements

// public class array{
//     public static void main(String[] args) {
//         int[] arr = {10,20,30,40,50,60};
//         for(int i=0;i<arr.length;i++){
//             if(i%2!=0){
//                 System.out.println(arr[i]*2);
//             }
//             else if(i%2==0){
//                 System.out.println(arr[i]+10);
//             }
//         }
//     }
// }


//SEARCH IN ARRAY
// public class array{
//     public static void main(String[] args) {
//         int[] arr = {10,20,30,40,50};
//         int target = 30;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==target){
//                 System.out.println("Found at index = " + i);
//                 break;
//             }
    
//         }
//     }
// }

//ab hum isko alag trike se krege
// import java.util.*;
// public class array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         //user se array ki length li
//         System.out.println("Enter length of the array = ");
//         int n = sc.nextInt();
//         System.out.println("Enter the value in array = ");
//         int[] arr = new int[sc.nextInt()];
//         System.out.println("Enter the target which mean which number you want to find = ");
//         int target = sc.nextInt();
//         for(int i=0;i<n;i++){
//             if(arr[i]==target){
//                 System.out.println(target);
//                 break;
//             }
//         }
//     }
// } isko baad mai kruga dimag khrab hogya


//PRODUCT OF ARRAY
// public class array{
//     public static void main(String[] args) {
//         int[] arr = {2,3,1,4,5};
//         int product = 1;
//         for(int i=0;i<arr.length;i++){
//             product*=arr[i];
//         }
//         System.out.println(product);
//     }
// }


//Minimum of array
// public class array{
//     public static void main(String[] args) {
//         int[] arr = {2,4,3,1,5,6,3};
//         int min = arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(min>arr[i]){
//                 min = arr[i];
//                 System.out.println("Minimum array = " + min);
//             }
            
//         }
//     }
// }



//Linear search
// public class array{
//     public static void main(String[] args) {
//         int[] arr = {23,24,14,5,25,42};
//         int target = 24;
//         boolean flag = false;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i] == target){
                
//                 flag = true;
//                 break;
//             }
           
//         }
//          if(flag==true)System.out.println("Target exist in the array");
//             else{
//                 System.out.println("Target not exist in array");
//             }
//     }
// }


//TWO SUM
// import java.util.*;
// public class array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = {4,6,3,5};
//         int target = 7;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]+arr[j]==target){
//                     System.out.println("i = " + i + "j = " + j);
//                 }
//     }
    
//         }

        //ye tho hogya hai input lene ka trika array mai
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
            
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]);
        // }
        
        
    
//PRINT THE SECOND MAXIMUM ELEMENT IN THE ARRAY
// import java.util.*;
// public class array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = {2,5,3,4,6};
//         int max = Integer.MIN_VALUE;
//         int smax = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(max<arr[i]){
//                 max = arr[i];
//             }  
//         }

//         for(int i=0;i<arr.length;i++){
//             if(smax<arr[i] && arr[i]!=max){
//                 smax=arr[i];
//             }
//         }

//         System.out.println("First Maximum Element in the Array is = " + max);
//         System.out.println("Second Maximum Element in the Array is = " + smax);
//     }
// }

//FOR EACH LOOP
// public class array{
// public static void main(String[] args){
//     int[] arr = {4,2,3,6,7,1};
//     for(int ele : arr){
//         System.out.print(ele + " ");
//     }
// }
// }


//REVERSE ARRAY
// public class array{
//     public static void main(String[] args) {
//         int[] arr  ={3,5,2,1,4,6};
//         int n = arr.length;
//         int i = 0;
//         int j = n-1;
//         while(i<j){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//         }
//         for(i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


//ROTATE ARRAY
//MISSING ARRAY (ye do question smjne chatgpt se)

//Segregate 0s and 1s
//Missing in array
//Linear Search


//Reverse Array
// import java.util.*;
// public class array{
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 int[] arr = {2,5,3,1,7,4};
//                 int n = arr.length;
//                 int i = 0;
//                 int j = n-1;
//                 while(i<j){
//                         int temp = arr[i];
//                         arr[i] = arr[j];
//                         arr[j] = temp;
//                         i++;
//                         j--;
//                 }
//                 for(i=0;i<n;i++){
//                         System.out.print(arr[i] + " ");
//                 }
//         }
// }

//ROTATE ARRAY
// public class array{
//         public static void main(String[] args) {
//                 int[] arr = {2,4,3,1,5};
//                 int n = arr.length;
//                 int temp = arr[n-1];
//                 for(int i=n-1; i>0; i--){
//                         arr[i] = arr[i-1];
//                 }
//                 arr[0] = temp;
        
//         for(int i=0;i<n;i++){
//                 System.out.print(arr[i] + " ");
//         }
// }}



//Array List
// import java.util.ArrayList;
// public class array{
//         public static void main(String[] args){
//                 ArrayList<Integer> arr = new ArrayList<>();
//                 arr.add(25);
//                 arr.add(43);
//                 arr.add(53);
//                 arr.add(18);

//                 System.out.println(arr.get(2)); //arr[2]
//                 arr.set(3,50); // arr[3] = 50;

//                 System.out.println(arr); //puri array list print krne ke liye

//                 //arraylist ki length nhi hoti size hota hai

//                 int n = arr.size();
//                 for(int i=0;i<n;i++){
//                 System.out.print(arr.get(i) + " ");
//                 }

//                 System.out.println();

//                 //25, 43, 53, 18
//                 arr.add(76); // 25 43 53 18 76
//                 arr.add(1,100); // 25 100 43 53 18 76
//                 System.out.println(arr);
//                 arr.remove(1);
//                 System.out.println(arr  );
//         }
// }