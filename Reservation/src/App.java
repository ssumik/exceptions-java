import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Account;
import exceptions.DomainExceptions;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Account Data:");
            System.out.print("Number:");
            int accNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Initial deposit: ");
            double initialDeposit = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            Account account = new Account(accNumber,name,initialDeposit,withdrawLimit);
            System.out.print("Enter the withdraw amount: ");
            account.withdraw(sc.nextDouble());
        }
        catch(InputMismatchException e){
            System.out.println("An error ocurred: " + e.getMessage());
        }
        catch(DomainExceptions e){
            System.out.println(e.getMessage());
        }
        finally{
            if (sc != null) {
                sc.close();
            }
        }
    }
}
