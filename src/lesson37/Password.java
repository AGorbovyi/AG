package lesson37;

import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
//        Scanner scan = new Scanner (new File("the\\dir\\myFile.extension"));
//        Scanner keyboard = new Scanner (System.in);
//        String user = scan.nextLine();
//        String pass = scan.nextLine(); // looks at selected file in scan


//        Scanner keyboard = new Scanner (System.in);
//        String user = "Login";
//        String pass = "Password";
//
//        System.out.print("Enter Login: ");
//        String inpUser = keyboard.nextLine();
//
//        System.out.print("Enter Password: ");
//        String inpPass = keyboard.nextLine(); // gets input from user
//
//        if (inpUser.equals(user) && inpPass.equals(pass)) {
//            System.out.print("Welcome back Anton!");
//        } else {
//            System.out.print("Wrong login or password. Access denied. Please try again!");
//        }
//    }

        String Username;
        String Password;

        Password = "Password";
        Username = "Anton";

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter Username : ");
        String username = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter Password : ");
        String password = input2.next();

        if (username.equals(Username) && password.equals(Password)) {

            System.out.println("Welcome back Anton!");
        }

        else if (username.equals(Username)) {
            System.out.println("Invalid Password!");
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }

    }


}
