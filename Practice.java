import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle:");
        float p = sc.nextFloat();
        System.out.print("Enter the time :");
        float t = sc.nextFloat();
        System.out.print("Enter the rate :");g
        float r = sc.nextFloat();
        double ci = p * Math.pow((1 + r / 100), t);
        System.out.println("COMPOUND INTREST:" + ci);
        sc.close();
    }
}
