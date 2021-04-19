import java.util.*;
public class first {
    //floor & building question
//     public static void main(String[] args) {
//        Scanner scn=new Scanner (System.in);
//        int n=scn.nextInt();
//        int arr[]=new int [n];
//        for(int i=0 ;i<arr.length ;i++){
//            arr[i]=scn.nextInt();
//        }
// int max=arr[0];
// for(int i=0 ;i<arr.length ;i++){
//     if(max<arr[i]){
//         max=arr[i];
//     }  
// }
// for(int floor=max; floor>=1 ;floor--){
//  for(int i=0; i<arr.length ;i++){
//      if(arr[i]>=floor){
//          System.out.print("*");
//      }
//      else{
//          System.out.print(" ");
//      }
//  }
// System.out.println();

// }
 public int[] runningSum(int[] nums) {
      for(int i=1 ; i<nums.length ;i++){
          nums[i]+=nums[i-1];
      }
return nums;

    }
    
}
