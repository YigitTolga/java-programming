package day13_conditional_statements;
import java.util.Scanner;
public class ATMPincodeProgram {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("****** WELCOME TO TD BANK ATM ******");
        int secretPincode = scan.nextInt();
        int inputPincode = scan.nextInt();

        if (secretPincode == inputPincode) {
            System.out.println("Welcome to your account!");
            System.out.println("You can withdraw, check your balance, deposit");
        } else {
            System.out.println("Incorrect pincode! " + inputPincode);
            System.out.println("Please try again!");
        }

        System.out.println("Thank you for using TD Bank ATM!");

    }
}
