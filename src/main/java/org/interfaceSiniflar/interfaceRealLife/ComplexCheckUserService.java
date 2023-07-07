package org.interfaceSiniflar.interfaceRealLife;

public class ComplexCheckUserService implements IUserCheckService {

    public boolean checkUser(User user) {
        if (user.getAge() >= 18 && user.getName().startsWith("Me")) return true; else  return false;
    }
}
