import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Principle Amount:");
        double p=sc.nextDouble();
        System.out.print("Enter Rate:");i
        int r=sc.nextInt();
        System.out.print("Enter Time:" );
        int t=sc.nextInt();
        double SI=(p*r*t)/100;
        System.out.print("Simple_interest="+SI);
        sc.close();
    }
}
