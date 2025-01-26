import java.util.Scanner;

public class practice_set_pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int v = sc.nextInt();
        int u = sc.nextInt();
        int s = sc.nextInt();
        double pro = (Math.pow(v, 2) - Math.pow(u, 2)) / (2 * a * s);
        System.out.println(pro);
    }
}
