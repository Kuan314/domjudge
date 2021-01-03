import java.util.Scanner;

public class decompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        String output = "";
        int i = 0;

        while(i < word.length()){
            if(Character.isDigit(word.charAt(i))){
                int start = i;
                while(Character.isDigit(word.charAt(i))){
                    i++;
                }
                int num = Integer.parseInt(word.substring(start, i));

                String temp = "";
                while(Character.isLetter(word.charAt(i))){
                    temp += word.charAt(i);
                    i++;
                    if(i == word.length()){
                        break;
                    }
                }
                for(int j = 0; j < num; j++){
                    output += temp;
                }
            }
            else{
                i++;
            }
        }
        System.out.println(output);

    }
}