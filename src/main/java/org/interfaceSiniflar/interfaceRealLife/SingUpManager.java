package org.interfaceSiniflar.interfaceRealLife;

public class SingUpManager {

    private IUserCheckService iUserCheckService;

    public SingUpManager(IUserCheckService iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
    }

    public void singUp(User user) {


        /// AgeUserCheckService ageUserCheckService = new AgeUserCheckService();


        if (!iUserCheckService.checkUser(user))
            System.out.println("Kullanici Kayit olamadi ");
        else
            System.out.println("Kullanici kayit olu : " + user.getName());


    }
}
