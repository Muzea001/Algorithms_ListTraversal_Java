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
                // hver gang ombyttingen skjer øker vi hjelpevariabelen med 1
                if (a[i] < a[j]) {
                    teller++;
                }
            }

        }
        //returnerer antall ganger ombyttingen skjedde/*
        return teller;

    }

    //Oppgave 2


    public static int antallUlikeSortert(int[] a) {
        int teller = 0;
        if (!erSortert(a)) {
            throw new IllegalStateException("tabellen er ikke sortert!");
        }
        for (int i = 0; i < a.length - 1; i++) {
            //sammenligner indeks[0] med indeksen etter for å finne ut om tallet gjentas eller ikke
            if (a[i] != a[i + 1]) {
                //lager et teller variabel som lagrer antall ganger tallene ikke er like
                teller++;
            }
        }
        return teller;
    }

    public static boolean erSortert(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Oppgave 3

    public static int antallUlikeUsortert(int[] a) {
        int antall=0;
        if (a.length==0) {
            return 0;
        }
        // looper to ganger gjennom arrayet, tar indeks 0 og løper gjennom listen for å finne hvor mange duplikater den har osv.
        for (int i = 0; i < a.length; i++ ) {
            for (int j = i+1; j < a.length; j++) {
                //bruker et hjelpevariabel for å lagre antall ganger et duplikat eksisterer.
                if (a[i]==a[j]) {
                    antall++;
                }
            }

            }

        // tar listens lengde minus antall duplikater for å finne hvor mange tall finnes i arrayet.
        return a.length-antall+1;
    }


    //Oppgave 4


    public static void delSortering(int[] a) {
        int n = a.length / 2;
        for (int i = 0; i < n; i++) {
            for (int j = a.length - 1; j > n; j--) {
                if (a[i] >= 0
                        && a[j] >= 0
                        && a[i] % 2 != 0
                        && a[j] % 2 == 0) {
                    int tall = a[i];
                    a[i] = a[j];
                    a[j] = tall;
                }
            }
        }
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int j = a.length-1; j > n + 1; j--) {
            for (int i = j-1; i >= n; i--) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    //Oppgave 5


    public static void rotasjon (char[]a){
        for (int i = 0; i <1 ; i++) {
            char siste;
            siste = a[a.length-1];
            for (int j = a.length-1; j >0; j--) {
                a[j]=a[j-1];
            }
            a[0]=siste;

        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }

    //Oppgave 6

    public static void rotasjon2(char[]a,int k){
        if (k > 0) {
            for (int i = 0; i < k; i++) {

                char siste;
                siste = a[a.length - 1];
                for (int j = a.length - 1; j > 0; j--) {
                    a[j] = a[j - 1];
                }
                a[0] = siste;
            }
        }
            else {
            for (int i = 0; i > k; i--) {
                char siste;
                siste = a[0];
                for (int j = 0; j <a.length-1; j++) {
                    a[j] = a[j + 1];
                }
                a[a.length - 1] = siste;
            }
        }


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int [] array = {1,2,2,3,3,3,4,4,4,5,6,6};
        System.out.println(antallUlikeUsortert(array));
    }
}


