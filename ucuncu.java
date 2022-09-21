package eskiler;

public class ucuncu {
       public class Concatenation {
        public static void main(String[] args) {
            System.out.println("Concatenation iþlemleri...");
            System.out.println("--------------------------");
            System.out.println("Ankara" + "gücü"); //output--> Ankaragücü
            System.out.println("Mehmet" + "ali"); //output--> Mehmetali
            System.out.println("Elma" + 5); //output--> Elma5
            System.out.println(5 + "Elma"); //output--> 5Elma
            System.out.println(5 + "Elma" + 5); //output--> 5Elma5
            System.out.println(15 + 25); //aritmetik toplama yapar ve ouutput-->40 olur.

            float kdv = 0.18f;
            int elmaFiyati = 100;
            int kacKilo = 1;
            float toplam = 0.0f;
            float toplamKdvli = 0.0f;

            kacKilo = 1;
            toplam = elmaFiyati * kacKilo; //KDV siz
            toplamKdvli = toplam * (1 + kdv); //toplamKdvli = (toplam * kdv) * 100

            System.out.println(); //Boþ satýr yazar
            System.out.println(toplam);

            System.out.println("Elmanýn fiyatý........= " + elmaFiyati);
            System.out.println("Elma kilogram.........= " + kacKilo);
            System.out.println("KDV siz toplam fiyatý = " + toplam);
            System.out.println("KDV oraný.............= " + kdv);
            System.out.println("KDV li  toplam fiyatý = " + toplamKdvli);
//Written by.......................






        }

        }
}
