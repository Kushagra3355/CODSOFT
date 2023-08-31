import java.util.*;

public class Atm_Interface {

    public static void main(String[] args) {
        System.out.println("\n\n\n\tWelcome to ATM Machine\n\n\n");
        Atm a1 = new Atm();
        a1.Pwd_check();
    }
}

class User_details {
    String Acc_Holder_Name = "Kushagra Omar";
    String Acc_Pwd = "1234";
    float Acc_Bal = 6065;
}

class Atm extends User_details {

    Scanner sc = new Scanner(System.in);

    public void Pwd_check() {
        System.out.print("Enter password to login-");
        String login_pwd = sc.nextLine();
        if (login_pwd.equals(Acc_Pwd)) {
            System.out.println("\nAccount Holder Name : " + Acc_Holder_Name);
            landing_page();
        } else {
            System.out.println("Wrong Password!\n");
        }
    }

    public void landing_page() {
        System.out.println("\nPress 1 to Withdraw");
        System.out.println("Press 2 to Deposit");
        System.out.println("Press 3 to Check Account Balance");
        System.out.println("Press 4 to Log-out\n");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                Withdraw_From_Acc();
                break;
            case 2:
                Deposit_to_Acc();
                break;
            case 3:
                Check_balance();
                break;
            case 4:
                System.out.println("Logged-out.");
                break;
        }
    }

    public void Withdraw_From_Acc() {
        System.out.println("Enter PIN:");
        String pin = sc.next();
        if (pin.equals(Acc_Pwd)) {
            System.out.println("Amount you want to withdraw:");
            float Amount_to_be_withdrawn = sc.nextFloat();
            {
                if (Amount_to_be_withdrawn > 0) {
                    if (Acc_Bal > Amount_to_be_withdrawn) {
                        Acc_Bal = Acc_Bal - Amount_to_be_withdrawn;
                        System.out.println("Amount Withdrawn Successfully.");
                    } else {
                        System.out.println("Transaction Canceled,\nAccount Holder have insufficient balance.");
                    }
                } else {
                    System.out.println("Invalid!");
                }
            }
        } else {
            System.out.println("Wrong PIN.");
        }

        System.out.println("\nPress 0 to go to the Main Menu\nPress 1 to log-out.\n");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Logged-out");
                break;
            case 0:
                System.out.println("\nRedirecting to Main Menu.....Please wait.\n");
                landing_page();
                break;

        }
    }

    public void Deposit_to_Acc() {
        System.out.println("Amount to be deposited-");
        float Acc_Deposit = sc.nextFloat();
        Acc_Bal = Acc_Bal + Acc_Deposit;
        System.out.println("Amount Self-deposited successfully.\n");
        // System.out.println("Available balance : " + Acc_Bal);
        System.out.println("\nPress 0 to go to the Main Menu\nPress 1 to log-out.\n");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Logged-out.");
                break;
            case 0:
                System.out.println("\nRedirecting to Main Menu.....Please wait.\n");
                landing_page();
                break;
        }

    }

    public void Check_balance() {
        System.out.println("Password :");
        String pswd = sc.next();
        if (pswd.equals(Acc_Pwd)) {
            System.out.println("Available balance :" + Acc_Bal);
        } else {
            System.out.println("Wrong password.");
        }
        System.out.println("\nPress 0 to go to the Main Menu\nPress 1 to log-out.\n");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Logged-out.");
                break;
            case 0:
                System.out.println("\nRedirecting to Main Menu.....Please wait.\n");
                landing_page();
                break;
        }
    }

}