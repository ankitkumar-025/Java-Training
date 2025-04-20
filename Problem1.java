//ConditionalAndLoops 
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        /*
         * Syntax of if statements:
         * if(boolean exp T or F){
         * //body
         * }
         * else{
         * do this
         * }
         * 
         */
        // double salary;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary:");
        double salary = sc.nextDouble();
        if (salary >= 10000) {
            salary = salary + 5000;
        } else {
            salary = salary + 1000;
        }
        System.out.print(salary);
        sc.close();
    }
}