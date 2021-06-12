package com.geektech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        BankAccount bankAccount = new BankAccount();
        System.out.println(" На ваш баланс добавлен " + bankAccount.deposit(20000) + " сом");
        LimitException limitException = new  LimitException("Запрашиваемая сумма больше ",bankAccount.getAmount());

        while (true)
            try {
                bankAccount.withDraw(6000);
            }catch (LimitException e){
                System.out.println(" У ваз на счету " + bankAccount.getAmount() + " сом");
                System.out.println(" Хотите снять остаток?");
                Scanner scanner = new Scanner(System.in);
                String s = scanner.nextLine();
                if (s.equals("да") || s.equals("ДА") || s.equals("Да"))
               {
                    try {
                        bankAccount.withDraw(bankAccount.getAmount());

                    }catch (LimitException a ){
                        System.out.println(a);
                    }
                    break;
                }
                else System.out.println("Вы сняли остаток");
                }
        System.out.println("На вашем счету " + bankAccount.getAmount() + " сом");


    }

}
