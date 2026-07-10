// public class Bubble_Selection_InsertionSort {
//     public static void print(int[] arr){
//         for(int i=0;i<arr.length;i++){
//             //for(int ele: arr) ye bhi likh skte hai hum for loop ki jgha ye elemts prit krvane mai madad kregi{
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int[] arr = {3,5,-2,0,3,9};
//         int n = arr.length;
//         print(arr);
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-1-i;j++)
//             if(arr[j]>arr[j+1]){
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;     
//              }
//         }
// print(arr);
// }
// }


//bubble sort(thoda better)
// public class Bubble_Selection_InsertionSort{
//     public static void print(int[] arr){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();

//     }
//     public static void main(String[] args) {
//         int[] arr = {2,5,3,-1,4,0};
//         int n = arr.length;
//         print(arr);
//         for(int i=0;i<n-1;i++){
//             int swap = 0;
//             for(int j=0;j<n-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//                 swap++;
//             }
//         }
//         if(swap==0) break;
//     }
//     print(arr);
// }}


//SORT AN ARRAY IN DECREASING ORDER USING BUBBLE SORT
// public class Bubble_Selection_InsertionSort{
//     public static void print(int[] arr){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         int[] arr = {3,-1,4,0,6,2};
//         int n = arr.length;
//         print(arr);
//         for(int i=0;i<n-1;i++){
//             int swap=0;
//             for(int j=0;j<n-1-i;j++){
//                 if(arr[j]<arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     swap++;
//                 }
//             }
//             if(swap==0) break;
//         }
//         print(arr);
//     }
// }



//SELECTION SORT
//SELECT THE SMALLEST ELEMENT SWAP IT WITH THE FIRST ELEMENT
// public class Bubble_Selection_InsertionSort{
//     public static void print(int[] arr){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int[] arr = {3,5,-1,0,4};
//         int n = arr.length;
//         print(arr);
        
//         for(int i=0;i<n-1;i++){
//             int min = Integer.MAX_VALUE;
//              int minIdx = -1;     //ye n-1 isliye ki manle 100 bcho ki bikhri hui row hai unko jab 99 ve bche shi krege tho akhri 100th bcha tho khud shi position pe aajega 
//             for(int j=i;j<n;j++){
//                 if(arr[j]<min){
//                     min = arr[j];
//                     minIdx = j;
//                 }
//             }
//             int temp = arr[i];
//             arr[i] = arr[minIdx];
//             arr[minIdx] = temp;
//         }
//         print(arr);
//     }
// }



//SELECT THE LARGEST ELEMENT SWAP IT WITH THE LAST ELEMENT
