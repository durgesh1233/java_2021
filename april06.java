import java.io.*;
import java.util.*;

public class april06 {
    public static void main(String[] args) {
      Scanner scn= new Scanner(System.in);
      int n=scn.nextInt();
      int arr[] = new int [n];
      for(int i=0 ; i<arr.length ; i++){
          arr[i]=scn.nextInt();
      }
      int grt=-1;
      int sm=1000;
      for(int i=0 ; i<arr.length ;i++){
          if(arr[i]<sm){
              sm=arr[i];
          }
          if(arr[i]>grt){
              grt=arr[i];
          }

      }
      System.out.println(sm + " "+ grt);    
    }
    
}
//git remote add origin https://github.com/durgesh1233/java_2021.git