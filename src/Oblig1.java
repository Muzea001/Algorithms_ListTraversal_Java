import java.util.NoSuchElementException;

public class Oblig1 {

    //Oppgave 1 /*

    public static int maks(int[] a) {
        int størsttall = 0;
        //lager feilhåndtering for en tabell med mindre enn 1 verdi*/
        if (a.length < 1) {
            throw new NoSuchElementException("tabellen har inkorrekt lengde");
        }
        //lager to forloops, en for det første tallet og en for det tallet det skal bli sammenlignet med/*
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length; j++) {
                //hvis tallet som ligger i indeks 0 er mindre enn tallet som ligger i indeks 1 bytt plass/*
                if (a[i] < a[j]) {
                    a[i] = a[j];
                    // lagre det største tallet i et variabel for return/*
                    størsttall = a[j];
                }
            }

        }
        return størsttall;

    }

    public static int ombyttinger(int[] a) {
        //definerer en hjelpevariabel.
        int teller = 0;
        if (a.length < 1) {
            throw new NoSuchElementException("tabellen har inkorrekt lengde");
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length; j++) {
                // hver gang ombyttingen skjer øker vi hjelpevariabelen med 1/*
                if (a[i] < a[j]) {
                    teller++;
                }
            }

        }
        //returnerer antall ganger ombyttingen skjedde/*
        return teller;

    }

    //Oppgave 2 /*


    public static int antallUlikeSortert(int[] a) {
        int teller = 0;
        for (int i = 0; i < a.length-1; i++) {
            //sammenligner indeks[0] med indeksen etter for å finne ut om tallet gjentas eller ikke/*
            if(a[i]!=a[i+1]){
                //lager et teller variabel som lagrer antall ganger tallene ikke er like/*
                teller++;
            }
        }
        return teller;
    }

    public static void main(String[] args) {
        int array[] = {3, 3, 4, 5, 5, 6, 7, 7, 7, 8};
        System.out.println(antallUlikeSortert(array));
    }
}
