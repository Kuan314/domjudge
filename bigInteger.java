import java.util.Scanner;

public class bigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a;
        int[] b;
        int[] ans = new int[30];
        String output = "";

        for(int i = 0; i < n; i++){
            
            String[] temp = sc.next().split("");
            a = stringToInt(temp);

            char symbol = sc.next().charAt(0);

            temp = sc.next().split("");
            b = stringToInt(temp);
            
            if(symbol == '+'){
                ans = add(a, b);
            }
            else if(symbol == '-'){
                ans = minus(a, b);
            }

            for(int j = 0; j < ans.length; j++){
                output += ans[i];
            }

            output += "\n";
        }

        System.out.print(output);
    }

    static int[] stringToInt(String[] a){
        int[] val = new int[a.length];
        for(int i = 0; i < a.length; i++){
            val[i] = Integer.parseInt(a[i]);
        }
        return val;
    }

    static int[] add(int[] a, int[] b){ 
        int ans[] = new int[30];
        int carry = 0;
        for(int i = 0; i < 30; i++){
            ans[i] = a[i] + b[i] + carry;
            carry = ans[i] / 10;
            ans[i] %= 10;
        }
        return ans;
    }

    static int[] minus(int[] a, int[] b){
        int[] ans = new int[30];
        int borrow = 0;
        for(int i = 0; i < 30; i++){
            ans[i] = a[i] - b[i] - borrow;
            if(ans[i] < 0){
                borrow = 1;
                ans[i] += 10;
            }
            else{
                borrow = 0;
            }
        }
        return ans;
    }
}