package Algorithms;

import com.sun.xml.internal.ws.encoding.StringDataContentHandler;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 * Created by Kovval on 2017-07-29.
 */
public class DataDzien extends AbstractAlgorithm {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String runAlgorithm(String[] input) {


        int rok = Integer.parseInt(input[3]);
        int miesiac = Integer.parseInt(input[2]);
        int dzien = Integer.parseInt(input[1]);

        if (miesiac > 12) {
            System.out.print("\nnie ma takiego miesiąca");
            return null;
        }
        if (dzien > 28 && miesiac == 2) {
            System.out.print("\nnie ma takiego dnia");
        }
        if (dzien > 31 && (miesiac == 1 || miesiac == 3 || miesiac == 5 ||
        miesiac == 7 || miesiac == 8 || miesiac == 10 || miesiac == 12)) {
            System.out.print("\nnie ma takiego dnia");
        return null;
    }
        if(dzien > 30 && (miesiac == 4 || miesiac == 6 || miesiac == 9 || miesiac == 11)) {
            System.out.print("\nnie ma tekigo roku");
            return null;
        }
        if (rok%4 == 0 && rok%100 != 0 || rok%400 == 0 ) {// rok przestępny
            if (dzien > 29 && miesiac == 2 ) {
                System.out.print("\nnie ma takiego dnia");
            }
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");// wymuszamy format daty
        LocalDateTime data = LocalDateTime.of(rok, miesiac, dzien, 12,00);//godzina i minuty są potrzebne by to cos miało działać
        LocalDateTime poczatekRoku = LocalDateTime.of(rok, 1, 1, 12,00 ); // wszystko jest ustawione na poczatek roku, potem wczytany rok by był ten sam co w podanej dacie

        Duration czasTrwania = Duration.between(poczatekRoku, data);

        System.out.println(data.format(formatter));// podana data
        System.out.println(poczatekRoku.format(formatter));//poczatek roku

        System.out.printf("ilość dni od początku roku to: %s ", czasTrwania.toDays()+1); //ilosc dni od poczatku roku +1 bo liczymy to pierwszy dzien tez wliczamy




        return null;
    }
}
