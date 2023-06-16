package org.oop.referanslar;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = account1;

        if (account1 == account2) {
            System.out.println("Account1 ve Account 2 Ayni Objeyi gosteriyolar...");
        } else {
            System.out.println("Account1 ve Account 2 Ayni Objeyi GOSTERMIYORLAR...");
        }


        if (account1 == account3) {
            System.out.println("Account1 ve Account 3 Ayni Objeyi gosteriyolar...");
        } else {
            System.out.println("Account1 ve Account 3 Ayni Objeyi GOSTERMIYORLAR...");
        }


        new Account("Ahmet", "test", "34567890009").bilgileriGoster();

    }
}
