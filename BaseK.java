import java.util.Scanner;

public class BaseK{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int ans;
        String output = "";

        for(int i = 0; i < a; i++){
            int base = sc.nextInt();
            ans = sc.nextInt();
            String tmp = "";

            while(ans != 0){
                int temp = ans%base;
                tmp += temp;
                ans /= base;
            }

            for(int j = tmp.length() - 1; j >= 0; j--){
                output += tmp.charAt(j);
            }
            output+="\n";
        }

        System.out.print(output);
    }
}