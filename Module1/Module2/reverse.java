import java.util.*;
import java.io.*;
public class reverse {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        int n=scn.nextInt();
         int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
    int nod=count;
     //r=97%5=2
     r=r%count;
     if(r<0){
         r=r+nod;
     }
     int pow1=(int)Math.pow(10,r);
     int a=n%pow1;
     int b=n/pow1;
     int pow2=(int)Math.pow(10,count-r);
     int rv=a*pow2+b;
     System.out.println(rv);       
    }
    
}
