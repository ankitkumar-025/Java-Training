import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);uuu
        System.out.print("Enter any number:");
        int number=sc.nextInt();
        if(number%2==0){
            System.out.print(number +" is even");
        }
        else{
            System.out.print(number +" is odd");
        }
       sc.close();;

    }
}
