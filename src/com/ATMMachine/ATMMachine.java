package  com.ATMMachine;
//a classic ATM-machine by using class and objects .
import java.util.Scanner;

class ATM{
    float Balance;
    int pin= 1010;

    public void checkPin()
    {
        System.out.println("Enter your pin: ");
        Scanner in = new Scanner(System.in);
        int pin_input=in.nextInt();

        if(pin_input==pin){
            menu();
        }else {
            System.out.println("Enter a valid pin .");
            menu();
        }
    }

    private void menu() {
        System.out.println("Enter Your Choice :");
        System.out.println("1. Check you A/C Balance ");
        System.out.println("2. Withdraw Money ");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner in = new Scanner(System.in);
        int opt = in.nextInt();

        if(opt==1){
            checkBalance();
        } else if (opt==2) {
            withdrawMoney();

        } else if (opt==3) {
            depositMoney();

        }else if (opt==4){
            return ;

        }
        else {
            System.out.println("Enter a valid choice");
        }


    }

    public void depositMoney() {

        System.out.println("Enter the Amount : ");
        Scanner in = new Scanner(System.in);
        float amount = in.nextFloat();
        Balance=Balance+amount;
        System.out.println("Money Deposited Successfully ");
        menu();

    }

   public void withdrawMoney() {
       System.out.println("Enter Amount to Withdraw : ");
       Scanner in = new Scanner(System.in);
       float amount = in.nextFloat();
       if(amount>Balance){
           System.out.println("Insufficient Balance .");


       }else {
           Balance = Balance-amount;
           System.out.println("Money Withdraw Successful");

       }
          menu();
    }

    public void checkBalance() {
        System.out.println("Balance"+Balance);
        menu();
    }


}
public class ATMMachine{
    public static void main(String[] args) {
        ATM ob=new ATM();
        ob.checkPin();

    }
}