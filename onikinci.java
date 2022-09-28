package eskiler;

import java.util.Scanner;

public class onikinci {
    import java.util.Scanner;


        public static void main(String[] args) {
            System.out.println("If ...Else");
            System.out.println("**************");
            System.out.println("*********");
            System.out.println("******");
            System.out.println("***");
            Scanner klavye = new Scanner(System.in);

            int yas = 0;
            int kilosu = 0;

            System.out.println("Lütfen yaşınızı giriniz ---->");
            yas = klavye.nextInt();




            if(yas > 18){
                System.out.println("Kişinin yaşı 18 den büyük...");
                System.out.println("Lütfen kilonuzu giriniz");
                kilosu = klavye.nextInt();


                if(kilosu >50){
                    System.out.println("Yaşınız ve Kilonuz uygundur");
                }else{
                    System.out.println("kilonuz uygun değil");
                }


            }else{
                System.out.println("Yaşı 18 den küçük.Kan verebilmek için yasınız 18 den büyük olmalı") ;

            }

            if ((yas  > 18) && (kilosu  > 50)){
                System.out.println("Yaşınız ve Kilonuz kan vermeye  uygundur");

            }else{
                System.out.println("Şartlarınız uygun değil");
            }



        }
    }


