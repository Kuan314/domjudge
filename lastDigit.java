import java.util.Scanner;

public class lastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] maps = new int[100];

        maps[0] = 0;
        for(int i = 1; i < 100; i++){
            int a = i % 10;
            int b = i % 10;

            for(int j = 2; j <= i; j++){
                b = (b * a) % 10;
            }
            maps[i] = (b + maps[i - 1]) % 10;
        }

        while(true){

            String a = sc.next();

            if(a.equals("0")){
                break;
            }

            int len = a.length();
            int value;
            if(len > 1){
                value = (a.charAt(len - 2) - '0') * 10 + (a.charAt(len - 1) - '0');
            }
            else{
                value = a.charAt(len - 1) - '0';
            }

            System.out.println(maps[value]);
        }
    }
}