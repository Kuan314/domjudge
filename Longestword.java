import java.util.*;

public class Longestword{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String word = "";
        int length = 0;
        while(in.hasNextLine()){
            String line = in.nextLine();
            String [] linewords = line.split(" |\"|\'|&|,|\\.|:|;|-|\\(|\\)|\\[|\\]|\\{|\\}");
            int size = linewords.length;
            for(int i=0;i<size;i++){
                if(linewords[i].length()>length){
                    word = linewords[i].toLowerCase();
                    length = linewords[i].length();
                }
                else if(linewords[i].length()==length && linewords[i].toLowerCase().compareTo(word)<0){
                    word = linewords[i].toLowerCase();
                    length = linewords[i].length();
                }
            }
        }
        System.out.printf("%s, %d", word, length);
    }
}