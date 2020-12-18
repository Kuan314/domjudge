import java.util.Scanner;


public class PrimeNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String ans = "";

        for(int i = 2; i <= a; i++){
            if(i == 2){
                ans += "2 ";
            }
            else{
                if(check(i)){
                    String temp = i + " ";
                    ans += temp;
                }
            }
        }

        System.out.println(ans);

        sc.close();
    }

    public static boolean check(int num){
        for(int j = 2; j < num; j++){
            if(num%j == 0){
                return false;
            }
        }
        return true;
    }
}