import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
//        String name = new String("Dinesh karthik 13");
        String name = "harry ";
        System.out.println(name);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = Math.pow(a, b);
        System.out.printf("the power of %d to the base %d id %f", a, b, c);

    }
}
