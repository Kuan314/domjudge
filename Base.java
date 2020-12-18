import java.util.*;

public class Base{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            int [] number = new int [10000];
            int count = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            if(b==0){
                System.out.printf("0\n");
            }
            else{   
                while(b!=0){
                    int x = b % a;
                    number[count] = x;
                    b /= a;
                    count++;
                }
                for(int j=count-1;j>=0;j--){
                    System.out.printf("%d", number[j]);
                }
                System.out.printf("\n");
            }
            
        }
        
    }
}