package team02_ilk_java_proje;

import java.util.Scanner;

public class GirisMenusu {
    public static void main(String[] args) {
        girisMenusuMethod();

    }

    public static void girisMenusuMethod(){

    Scanner scan = new Scanner(System.in);
        System.out.println("Team02 Rent A Car uygulamasinina hos geldiniz. Lutfen asagidaki islemlerden birini seciniz" +
                "\n1-) Araclarimiz\n2-) Arac Kirala\n3-) Hakkimizda\n4-) Iletisim\n5-) Kampanyalar\n6-) Cikis Yap");
        int secim = scan.nextInt();

        do{
            if(secim <=0 || secim >=7){
                System.out.println("Yanlis giris yaptiniz tekrar deneyin");
                secim = scan.nextInt();
            }else if (secim==1){
                System.out.println("Lutfen Gormek istediginiz araclarin yakit tipini seciniz\n1-) Benzinli" +
                        "\n2-) Dizel\n3-) LPG");
                int aracGor = scan.nextInt();
              if(aracGor==1){
                  BenzinliArabalar benzinliArabalar = new BenzinliArabalar();
                  benzinliArabalar.ToyotaCorolla();
                  System.out.println("========================================");
                  benzinliArabalar.BMWExecutive();
                  System.out.println("========================================");
                  benzinliArabalar.VolkswagenGolf();
                  System.out.println("========================================");
                  benzinliArabalar.ToyotaYaris();
                  System.out.println("========================================");
                  benzinliArabalar.RenaultMegane();
                  System.out.println("========================================");
                  benzinliArabalar.OpelCorsa();
                  System.out.println();
                  System.out.println("Hangi islemi gerceklestirmek istersiniz? \n1-) Ana Sayfaya Geri Don\n2-) Programi Sonlandir");
                  int tercih = scan.nextInt();
                  if (tercih ==1){
                      girisMenusuMethod();
                  }else {
                      break;
                  }
                  break;
              }else if (aracGor==2){
                  DizelArabalar dizelArabalar = new DizelArabalar();
                  dizelArabalar.VolkswagenJetta();
                  System.out.println("========================================");
                  dizelArabalar.MercedesBenz();
                  System.out.println("========================================");
                  dizelArabalar.FordFocus();
                  System.out.println("========================================");
                  dizelArabalar.BMW4Serisi();
                  System.out.println("========================================");
                  dizelArabalar.AudiA6();
                  System.out.println("========================================");
                  dizelArabalar.RenaultFluence();
                  System.out.println("========================================");
                  dizelArabalar.SkodaOctavia();
                  System.out.println("========================================");
                  dizelArabalar.Peugeot301();
                  System.out.println();
                  System.out.println("Hangi islemi gerceklestirmek istersiniz? \n1-) Ana Sayfaya Geri Don\n2-) Programi Sonlandir");
                  int tercih = scan.nextInt();
                  if (tercih ==1){
                      girisMenusuMethod();
                  }else {
                      break;
                  }
                  break;
              }else if (aracGor==3){
                  LpgliArabalar lpgliArabalar = new LpgliArabalar();
                  lpgliArabalar.HondaCivic();
                  System.out.println("========================================");
                  lpgliArabalar.MitsubishiColt();
                  System.out.println("========================================");
                  lpgliArabalar.HyundaiAccent();
                  System.out.println("========================================");
                  lpgliArabalar.ChevroletKalos();
                  System.out.println("========================================");
                  lpgliArabalar.Mazda323();
                  System.out.println("========================================");
                  lpgliArabalar.MitsubishiEclipse();
                  System.out.println();
                  System.out.println("Hangi islemi gerceklestirmek istersiniz? \n1-) Ana Sayfaya Geri Don\n2-) Programi Sonlandir");
                  int tercih = scan.nextInt();
                  if (tercih ==1){
                      girisMenusuMethod();
                  }else {
                      break;

                  }
                  break;
              }else {
                  System.out.println("Yanlis secim tekrar deneyiniz");
              }
            }else if(secim==2){

            }else if(secim==3){
                Hakkimizda hakkimizda=new Hakkimizda();
                hakkimizda.hakkimizdaMethod();
                break;
            }else if(secim==4){
                Iletisim iletisim = new Iletisim();
                iletisim.iletisimMethod();
              break;

            }else if (secim==5){
                Kampanyalar kampanyalar = new Kampanyalar();
                kampanyalar.kampanyalarMethod();
                break;//
            }
        }while(secim!=6);
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
        System.out.println("******************************************");


    }
}
