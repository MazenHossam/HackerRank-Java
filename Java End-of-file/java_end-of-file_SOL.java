import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=1;
        while (scan.hasNext()){
            String a = scan.nextLine();
            System.out.print(i +" "+ a + "\n");
            i+=1;
        }
        scan.close();
    }
}
