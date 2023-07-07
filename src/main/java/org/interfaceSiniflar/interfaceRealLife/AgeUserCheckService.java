package org.interfaceSiniflar.interfaceRealLife;

public class AgeUserCheckService implements IUserCheckService{
    // Method

    public boolean checkUser(User user) {
        return user.getAge() >= 18;
    }
}
