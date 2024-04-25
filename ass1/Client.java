import java.rmi.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String serverUrl = "rmi://localhost/Server";
            ServerApp serverApp = (ServerApp)Naming.lookup(serverUrl);

            System.out.println("Enter num1");
            double num1 = sc.nextDouble();
            System.out.println("Enter num2");
            double num2 = sc.nextDouble();

            System.out.println("num1 :"+ num1);
            System.out.println("num2 :"+ num2);

            System.out.println("------------------------");
            System.out.println("add "+serverApp.addition(num1, num2));
            System.out.println("sub "+serverApp.subtraction(num1, num2));
            System.out.println("mul "+serverApp.multiplication(num1, num2));

        } catch (Exception e) {
            e.getMessage();
        }
    }
}
