import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }

        int[] num = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            num[i] = list.get(i);
        }

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num.length - i - 1; j++){
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < num.length; i++){
            System.out.print(num[i]);
            if(i != num.length - 1){
                System.out.print(" ");
            }
        }
    }
}