import java.math.BigInteger;
import java.util.Scanner;

public class lastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            BigInteger b = new BigInteger(sc.nextLine());

            if(b.equals(BigInteger.valueOf(0))){
                break;
            }
            else{
                BigInteger a = new BigInteger("0");

                BigInteger i = new BigInteger("1");
                for(; !(i.equals(b.add(BigInteger.valueOf(1)))); i = i.add(BigInteger.valueOf(1))) {
                    
                    BigInteger temp = i;
                    for(BigInteger j = new BigInteger("1"); !(j.equals(i)); j = j.add((BigInteger.valueOf(1)))){
                        temp = temp.multiply(i);
                    }

                    a = a.add(temp);
                }

                String ans = a.toString();

                System.out.println(ans.charAt(ans.length() - 1));
            }
        }
    }
}
