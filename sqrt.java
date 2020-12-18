import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n >= 0 && n <= 10000){
            float ans = squareRoot(n);
            System.out.println(String.format("%.3f", ans));
        }
    }

    static float squareRoot(int n){
        float temp = 0;

        float ans = n / 2;

        do{
            temp = ans;
            ans = (temp +(n / temp)) / 2;
        }
        while(ans - temp != 0);

        return ans;
    }
}
