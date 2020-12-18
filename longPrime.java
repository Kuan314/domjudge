import java.util.Scanner;

public class longPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ans = "";

        while(sc.hasNextLong()){
            long temp = sc.nextLong();

            for(int j = 2; j < temp/2; j++){
                if(temp % j == 0){
                    ans += "No\n";
                    break;
                }
                if(temp - 1 == j){
                    ans += "Yes\n";
                }
            }
        }

        System.out.print(ans);

        sc.close();
    }

}
