import java.util.*;
import java.math.*;

public class sort
{

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int base=0,num=0;
        for(int i=0 ; i<n ; i++)
        {
            base = in.nextInt();
            num = in.nextInt();
            mod(base, num);
            continue;
        }


        in.close();

    }

    static void mod(int base,int num){
        
        int ans;
        for(int i=base ; num==0 ;)
        {
           ans+=num%base;
           num/=base;
           ans*=10;
        }

        System.out.print(ans);

    }
}