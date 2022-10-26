import java.util.Scanner;

public class JavaLoops1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(String.format("%d"+" x "+ "%d" +" = %d", value,i, value*i));
        }
    }
}
