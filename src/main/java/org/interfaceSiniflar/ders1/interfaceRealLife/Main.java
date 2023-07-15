package org.interfaceSiniflar.ders1.interfaceRealLife;

public class Main {

    public static void main(String[] args) {
        SingUpManager singUpManager = new SingUpManager(new ComplexCheckUserService());
        singUpManager.singUp(new User(1, "Mehmet", 18));
    }
}
