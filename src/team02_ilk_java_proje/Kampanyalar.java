package team02_ilk_java_proje;

import java.util.Scanner;

public class Kampanyalar {
    public static void kampanyalarMethod() {
        Scanner input = new Scanner(System.in);

        System.out.println("KAMPANYALAR\r\n");
        System.out.println("*************\r\n");
        System.out.println("*************\r\n");
        System.out.println("*************\r\n");
        while (true) {

            System.out.println("Hangi islemi gerceklestirmek istersiniz? \n1-) Ana Sayfaya Geri Don \n2-) Programi Sonlandir");
            int cevap = input.nextInt();
            input.nextLine();


            if(cevap==1) {
                GirisMenusu liste=new GirisMenusu();
                liste.girisMenusuMethod();
                break;
            }
            else if (cevap==2) {
                break;
            }else {
                System.out.println("Yanlis secim tekrar deneyiniz");
            }

        }
    }
}
