import java.util.Scanner;

public class decompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] word = sc.nextLine().toCharArray();
        String output = "";
        if(word.length <= 1024){
            for(int i = 0; i < word.length; i++){
                boolean check = false;
                int tem = 0;
                if(word[i] == '0')
                    break;

                while(i < word.length && word[i] >= '0' && word[i] <= '9'){
                    tem += word[i] - '0';
                    if(check){
                        tem *= 10;
                    }
                    i++;
                    check = true;
                }
                i--;
                String s = "";

                if(tem >= 1 && tem <= 1000){
                    do{
                        i++;
                        s += word[i];
                    }while(i + 1 < word.length && word[i+1] >= 'a' && word[i+1] <= 'z' || i + 1 < word.length && word[i+1] >= 'A' && word[i+1] <= 'Z');
                }
                else{
                    break;
                }

                while(tem != 0){
                    output += s;
                    tem--;
                }
            }

            System.out.println(output);
        }
        sc.close();
    }
}
