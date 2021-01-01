import java.math.BigInteger;
import java.util.Scanner;

public class lastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        while(true){
            BigInteger b = new BigInteger(sc.nextLine());

            if(b.equals(BigInteger.valueOf(0))){
                break;
            }
            else{
                int a = 0;

                BigInteger i = new BigInteger("1");
                for(; !(i.equals(b.add(BigInteger.valueOf(1)))); i = i.add(BigInteger.valueOf(1))) {
                    
                    int temp = count[i.intValue() % 10];
                    for(BigInteger j = new BigInteger("1"); !(j.equals(i)); j = j.add((BigInteger.valueOf(1)))){
                        temp *= count[i.intValue() % 10];
                        temp %= 10;
                    }
                    a += temp;
                    a %= 10;
                };

                System.out.println(a);
            }
        }
    }
}
