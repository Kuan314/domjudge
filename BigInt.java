import java.util.Scanner;

public class BigInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String ans = "";

        for(int i = 0; i < n; i++){
            
            char[] a = sc.next().toCharArray();
            char mid = sc.next().charAt(0);
            char[] b = sc.next().toCharArray();

            int[] intA = new int[a.length];
            int[] intB = new int[b.length];

            for(int j = 0; j < a.length; j++){
                intA[j] = a[j] - '0';
            }

            for(int j = 0; j < b.length; j++){
                intB[j] = b[j] - '0';
            }

            if(mid == '+'){
                ans += add(intA, intB);
            }
            else if(mid == '-'){
                ans += minus(intA, intB);
            }

            ans += "\n";
        }

        System.out.print(ans);
        sc.close();
    }

    static String add(int[] a, int[] b){
        int i = a.length - 1;
        int j = b.length - 1;
        int[] ans = new int[35];
        int cnt = 34;
        int carry = 0;
        String out = "";

        while(i >= 0 && j >= 0){
            ans[cnt] = a[i] + b[j] + carry;
            
            if(ans[cnt] >= 10){
                carry = 1;
                ans[cnt] -= 10;
            }
            else{
                carry = 0;
            }

            i--;
            j--;
            cnt--;
        }

        while(i >= 0){
            ans[cnt] = a[i] + carry;

            carry = 0;
            i--;
            cnt--;
        }

        while(j >= 0){
            ans[cnt] = b[j] + carry;

            carry = 0;
            j--;
            cnt--;
        }

        cnt++;

        for(; cnt < 35; cnt++){
            out += ans[cnt];
        }
        
        return out;
    }

    static String minus(int[] a, int[] b){
        int i = a.length - 1;
        int j = b.length - 1;
        int[] ans = new int[35];
        int cnt = 34;
        int borrow = 0;
        String out = "";
        boolean negative = false;

        if(check(a, b)){
            negative = false;
            while(i >= 0 && j >= 0){
                ans[cnt] = a[i] - b[j] - borrow;
                
                if(ans[cnt] < 0){
                    borrow = 1;
                    ans[cnt] += 10;
                }
                else{
                    borrow = 0;
                }

                i--;
                j--;
                cnt--;
            }
        }
        else{
            negative = true;
            while(i >= 0 && j >= 0){
                ans[cnt] = b[j] - a[i] - borrow;
                
                if(ans[cnt] < 0){
                    borrow = 1;
                    ans[cnt] += 10;
                }
                else{
                    borrow = 0;
                }

                i--;
                j--;
                cnt--;
            }

        }

        while(i >= 0){
            ans[cnt] = a[i] - borrow;

            borrow = 0;
            i--;
            cnt--;
        }

        while(j >= 0){
            ans[cnt] = b[j] - borrow;

            borrow = 0;
            j--;
            cnt--;
        }

        while(ans[cnt] == 0){
            cnt++;
            if(cnt >= ans.length){
                out = "0";
                return out;
            }
        }

        if(negative){
            out += "-";
        }
        for(; cnt < 35; cnt++){
            out += ans[cnt];
        }
        
        return out;
    }

    static boolean check(int[] a, int[] b){
        if(a.length > b.length){
            return true;
        }
        else if(a.length < b.length){
            return false;
        }
        else if(a.length == b.length){
            for(int i = 0, j = 0; i < a.length || j < b.length; i++, j++){
                if(a[i] < b[j]){
                    return false;
                }
            }
        }
        
        return true;
    }
}
