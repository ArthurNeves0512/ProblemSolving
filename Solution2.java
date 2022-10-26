import javax.imageio.metadata.IIOMetadataNode;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            String x =String.valueOf(sc.nextInt());
            if( x.length()<3 ){
                x = String.format("%3s", x).replace(' ', '0');
            }
            System.out.println(String.format("%-15s", s1)+x);
        }
        System.out.println("================================");
    }
}
