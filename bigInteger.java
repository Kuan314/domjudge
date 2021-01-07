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
                for(int j = ans.length - 1; j >= 0; j--){
                    output += ans[j];
                }
            }
            else if(symbol == '-'){
                ans = minus(a, b);

                int j = ans.length - 1;
                while(ans[j] == 0){
                    j--;
                    if(j < 0){
                        j = 0;
                        break;
                    }
                }
                for(; j >= 0; j--){
                    output += ans[j];
                }
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
        int count = 0;
        int carry = 0;
        int i = a.length - 1;
        int j = b.length - 1;
        while(i >= 0 && j >= 0){
            ans[count] = a[i] + b[j] + carry;
            if(ans[count] >= 10){
                ans[count] -= 10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            i--;
            j--;
            count++;
        }

        while(i >= 0){
            ans[count] = a[i];
            count++;
            i--;
        }

        while (j >= 0){
            ans[count] = b[j];
            count++;
            j--;
        }
        return ans;
    }

    static int[] minus(int[] a, int[] b){ 
        int ans[] = new int[30];
        int count = 0;
        int borrow = 0;
        int i = a.length - 1;
        int j = b.length - 1;
        while(i >= 0 && j >= 0){
            ans[count] = a[i] - b[j] + borrow;
            if(ans[count] < 0){
                ans[count] += 10;
                borrow = -1;
            }
            else{
                borrow = 0;
            }
            i--;
            j--;
            count++;
        }

        while(i >= 0){
            ans[count] = a[i];
            count++;
            i--;
        }

        while (j >= 0){
            ans[count] = b[j];
            count++;
            j--;
        }
        return ans;
    }
}