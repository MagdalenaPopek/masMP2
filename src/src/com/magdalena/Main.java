package src.com.magdalena;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {

        //Tu tworzę datę, bo potem za dużo zabawy z dodawaniem nowych dat urodzenia etc
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = sdf.parse("2007-01-01");
        } catch (ParseException e) {
            e.printStackTrace();
        }

/*




        // Kompozycja Stajnia <>-- Boks
        System.out.println("-------------------------------");
        *//*Stable nowaHuta = null;
        Stall.createStall(nowaHuta);*//*
        Stable stajenka = new Stable("stajenka", "Okopowa 5, Warszawa", "1234567");
        Stall boks1 = Stall.createStall(stajenka);
        Stall boks2 = Stall.createStall(stajenka);
        stajenka.showStalls();


            //asocjacja binarna dodaję konia do boksu i boks do konia
            boks1.addHorse(kali);
            kali.addStall(boks1);

        System.out.println("-------------");
        System.out.println(boks1.toString());
        System.out.println(kali.getHorsesStall());

//        Stable.removeStable(stajenka);
//        stajenka = null;



        // Atrybut asocjacji  Zawody ---- Zawodnik ---- Osoba
        System.out.println("-------------------------------");
        Owner alicja = new Owner(new Person("Alicja", "Nowa", date, "1233"), 1275);
        Competition ujezdzenieA = new Competition(date, "Regionalne", "6A4");
        Contestant alicjaContestant = new Contestant(alicja, ujezdzenieA);
        System.out.println(alicjaContestant.toString());
*/
    }
}
