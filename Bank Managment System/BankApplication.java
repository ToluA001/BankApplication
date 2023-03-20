//check balence, deposit amount, withdraw amount, previos transaction, exit 
//name and customerID

import java.util.Scanner;

public class BankApplication{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, Please enter a name and CustomerID.");

        System.out.print("Name: ");
        String CustomerName = scan.nextLine();

        System.out.print("ID: ");
        String CustomerID = scan.nextLine();

        BankAccount mainba = new BankAccount(CustomerName, CustomerID);
        mainba.main();

    }    
}
class BankAccount{
    double bal = 0;

    double prevbal;

    String customerName;
    String customerID;
    BankAccount(String customerName, String customerID){
        this.customerID = customerID;
        this.customerName = customerName;
    }

    void ViewBalance(double bal){
        if (!(bal > 0)){
            System.out.println("******");
            System.out.println("Your current balence is 0 ");
            System.out.println("******");
        }
        else {
            System.out.println("******");
            System.out.println("Your current balence is " +  bal);
            System.out.println("******");
        }
         
    }

    void Deposit(){
        System.out.println("WORKS!");
    }
    
    void Withdraw(){

    }

    void PreviousTransaction(){

    }

    void main(){
        Scanner scan = new Scanner(System.in);
        String option;

        System.out.println("******\nWelcome " + customerName);
        System.out.println("Actions: View Balence(vb), Deposit(d), Withdrawa(w), View(v), quit(q)");
        System.out.print("Choose action: ");
        
        option = scan.nextLine();


        while (!(option.equals("q"))){
            if (option.equals("vb")){
                ViewBalance(bal);
            }
        }




    }
}