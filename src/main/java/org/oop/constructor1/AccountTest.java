package org.oop.constructor1;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account();
        System.out.println(account1.getEmail());


        Account account2 = new Account("Ahmet", "test", "34567890009");
        //System.out.println(account2.getIsim());
        //System.out.println(account2.getBakiye());
        account2.bilgileriGoster();

    }
}
