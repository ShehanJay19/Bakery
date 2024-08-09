import java.io.BufferedReader;
import java.util.Scanner;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("============================================================================================");
        System.out.println("******************************** Welcome to WASANTHA BAKERS ********************************");
        System.out.println("============================================================================================");
        System.out.println();
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (Admin.authenticateAdmin(username, password)) {
            System.out.println("============================================================================================");
            System.out.println("******************************** Welcome to WASANTHA BAKERS ********************************");
            System.out.println("============================================================================================");
            System.out.println();
            System.out.println("A. View Available Bakery Items\n");
            System.out.println("B. Manage Item and Package Details\n");
            System.out.println("C. Exit\n");
            System.out.print("Select option: ");
            char option;
            option = scanner.next().charAt(0);

                switch (option) {
                    case 'A':
                        Admin.viweItems();
                        break;
                    case 'B':
                        System.out.println("1.Add Items");
                        System.out.println("2.Delete Items");
                        System.out.println("3.Exit");
                        int option2;
                        option2=scanner.nextInt();
                        switch(option2){
                            case 1 :
                                Admin.addItems();
                            break;
                            case 2:
                                Admin.deleteItems();
                            break;
                            case 3:
                            break;
                            default: System.out.println("Invalid option");

                        }

                       break;
                    case 'C':

                        break;

                    default:
                        System.out.println("Invalid option");

                }

        }
        else if  (User.authenticateUser(username, password)){
            System.out.println("============================================================================================");
            System.out.println("******************************** Welcome to WASANTHA BAKERS ********************************");
            System.out.println("============================================================================================");
            System.out.println();


        }

        else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();


        System.out.println("helllo hello hello");

    }
}