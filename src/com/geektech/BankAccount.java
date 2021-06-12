package com.geektech;

public class BankAccount {
    private double amount;


    public double deposit(double sum) {
        amount += sum;
        return this.amount;

    }

    public int getAmount() {

        return (int)amount;
    }

    public double  withDraw(int sum)  throws LimitException{

        if (sum > amount){
            throw new LimitException(" Запрашиваемый сумма больше чем остаток ",sum);
        }
        System.out.println(" Остаток " + amount + " сом " + " снято " + sum + " сом");

        return amount -=sum;
    }
}
