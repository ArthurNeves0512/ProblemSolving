import java.util.ArrayList;
import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        ArrayList result = new ArrayList();
        for (int i=0; i<q;i++){
            Integer a = in.nextInt();
            Integer b = in.nextInt();
            Integer n = in.nextInt();
            result.add(a+1*b);
            for(int u=2;u==n;u++){

                result.add(result.size()-1 + u*b);
            }

        }
        for (Object mu:result) {
            System.out.println(mu);
        }

    }
}
