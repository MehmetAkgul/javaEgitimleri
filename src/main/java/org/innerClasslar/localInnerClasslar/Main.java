package org.innerClasslar.localInnerClasslar;


public class Main {
    public static void main(String[] args) {



        class Alan {
            public void daireAlanHesapla(int yaricap) {
                System.out.println("Dairenin alani :" + (yaricap * yaricap * Math.PI));
            }
        }

        Alan alan = new Alan();
        alan.daireAlanHesapla(5);

        Alan alan2 = new Alan();
        alan2.daireAlanHesapla(4);


    }

    public  static  void  deneme(){
       // Alan alan = new  Alan();
    }
}
