import java.util.*;
import java.io.*;
public class pattern {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
      
        int nst=1;
        int nsp=n/2;
        int row=0;
        while(row<n){
            int csp=0;
            while(csp<=nsp){
                System.out.print("\t");
                csp++;
            }
            //code:all code functioning .

            int cst=0;
            int val=row;
            while(cst<nst){
                System.out.print(val+"\t");
                if(cst<=n/2){
                    val++;
                }
                    else{
                        val--;
                    }
            cst++;
                
            }
                    
            if(row<n){
                nsp--;
                nst+=2;
            }
            row++;
            System.out.println();
        }
    }
    
}

