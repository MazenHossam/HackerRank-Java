import java.util.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            double sum=0;
            for (int k=0 ; k<n ; k++){
                sum = (Math.pow(2,k))*b+sum;
                System.out.print(a+(int)sum+" ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
