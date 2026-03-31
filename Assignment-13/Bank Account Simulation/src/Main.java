import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        BankAccount premium=new BankAccount("Deeksha","premium");
        BankAccount regular=new BankAccount("kali","premium");
        BankAccount basic=new BankAccount("Tanya","premium");

        Thread premiumUser=new Thread(premium);
        Thread regularUser=new Thread(regular);
        Thread basicUser=new Thread(basic);

        premiumUser.setPriority(Thread.MAX_PRIORITY);
        regularUser.setPriority(Thread.NORM_PRIORITY);
        basicUser.setPriority(Thread.MIN_PRIORITY);

        premiumUser.start();
        regularUser.start();
        basicUser.start();
    }
}
