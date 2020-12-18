import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ans = new int[n];
        
        if(n<=100 && n >= 0){
            for(int i = 0; i < n; i++){
                int temp = sc.nextInt();
                if(temp <= 46 && temp >= 0){
                    ans[i] = fib(temp);
                }
            }
        }

        for(int i = 0; i < n; i++)
            System.out.println(ans[i]);
        
        sc.close();
    }

    public static int fib(int i){
        if(i <= 1){
            return i;
        }
        else{
            return fib(i-1)+fib(i-2);
        }
    }
}