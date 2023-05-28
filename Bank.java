
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lincolnquick
 */
public class Bank extends Thread{
    protected double[] accounts;
    final int BANK_SIZE = 100;
    final double STARTING_BALANCE = 100000.00;
    final double MAX_AMOUNT = 1000.0;
    final int DELAY = 400;
    
    
    public Bank(){
        // create accounts and initialize with starting balance
        accounts = new double[BANK_SIZE];
        Arrays.fill(accounts, STARTING_BALANCE);
        
    }
    
    public Bank(int numberOfAccounts, double initialBalance){
        accounts = new double[numberOfAccounts];
        Arrays.fill(accounts, initialBalance);
    }
    
    
    public int size(){
        return accounts.length;
    }
    
    public double getTotalBalance(){
        double totalBalance = 0.0;
        for (int i=0; i<accounts.length; i++){
            totalBalance += accounts[i];
        }
        return totalBalance;
    }
    
    public void transfer(int from, int to, double amount){
        System.out.print(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf(" %10.2f from %d to %d", amount, from, to);
        accounts[to] += amount;
        System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
    }
    
    public void run(){
        try {
            while (true){
                int toAccount = (int) (size() * Math.random());
                int fromAccount = (int) (size() * Math.random());
                double amount = MAX_AMOUNT * Math.random();
                transfer(fromAccount, toAccount, amount);
                Thread.sleep((int) (DELAY * Math.random()));
            }
        } catch (InterruptedException ex){
            ex.printStackTrace();
            
        }
        
    }
}
