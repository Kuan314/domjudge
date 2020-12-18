import java.util.Scanner;

public class bigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[3];
        String output = "";
        String a = sc.next();       //for get the enter

        for(int i = 0; i < n; i++){
            str = sc.nextLine().split(" ");

            int num = 29;
            int num1 = str[0].length() - 1;
            int num2 = str[2].length() - 1;

            char[] word = new char[30];
            char[] word1 = str[0].toCharArray();
            char[] word2 = str[2].toCharArray();

            while(num1 == -1 || num2 == -1){
                word[num] += (char) (word1[num1] + word2[num2] - '0');
                if(word[num] > '9'){
                    word[num-1]++;
                    word[num] -= '9' - 1;
                }
                num--;
                num1--;
                num2--;
            }

            while(num1 == -1 && num2 >= 0){
                word[num] += word2[num2];
                num2--;
            }

            while(num2 == -1 && num1 >= 0){
                word[num] += word1[num1];
                num1--;
            }

            int j = 0;
            while(word[j] == '0'){
                j++;
            }

            for( ; j < 30; j++){
                output += word[j];
            }
            output += "\n";
        }

        System.out.print(output);
    }
}
