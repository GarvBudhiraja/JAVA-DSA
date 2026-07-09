// public class bubblesort {
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
// public class bubblesort{
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
//             for(int j=0;j<n-1-j;j++){
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
// public class bubblesort{
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

