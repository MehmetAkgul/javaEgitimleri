package org.oop.constructor2;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setHesapNo("123456");
        account1.setIsim("Mehmet Akgul");
        account1.setEmail("mehmetakgul.dev@gmail.com");
        account1.setBakiye(50000);
        account1.setTelefonNo("5370537000");
        Account account2 = new Account("12345", 60000, "Mehmet", "test@test.com", "5554443322");

        account2.paraYatir(15000);
        account2.paraCek(45000);
    }
}
