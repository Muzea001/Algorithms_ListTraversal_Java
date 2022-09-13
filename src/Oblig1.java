import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

        if (a.length==0){
            return 0;
        }
        ArrayList<Integer> nyliste = new ArrayList<Integer>();
        nyliste.add(a[0]);
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < nyliste.size(); j++) {
                if(nyliste.contains(a[i])){
                    j++;
                }
                else {
                    nyliste.add(a[i]);
                }
            }
        }
        return nyliste.size();
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

        for (int j = a.length - 1; j > n + 1; j--) {
            for (int i = j - 1; i >= n; i--) {
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


    public static void rotasjon(char[] a) {
        for (int i = 0; i < 1; i++) {
            char siste;
            siste = a[a.length - 1];
            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = siste;

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    //Oppgave 6

    public static void rotasjon2(char[] a, int k) {
        if (k > 0) {
            for (int i = 0; i < k; i++) {

                char siste;
                siste = a[a.length - 1];
                for (int j = a.length - 1; j > 0; j--) {
                    a[j] = a[j - 1];
                }
                a[0] = siste;
            }
        } else {
            for (int i = 0; i > k; i--) {
                char siste;
                siste = a[0];
                for (int j = 0; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                }
                a[a.length - 1] = siste;
            }
        }


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    //Oppgave 7 a)

    public static String flett(String a, String b) {
        String resultat = "";
        int lengdeA = a.length();
        int lengdeB = b.length();
        if (lengdeA == lengdeB) {

            char[] aliste = a.toCharArray();
            char[] bliste = b.toCharArray();

            for (int i = 0; i < aliste.length; i++) {
                resultat += aliste[i];
                resultat += bliste[i];
            }

        } else {
            int minimumLengde = Math.min(a.length(), b.length());
            for (int i = 0; i < minimumLengde; i++) {
                resultat += a.charAt(i);
                resultat += b.charAt(i);
            }
            resultat += a.substring(minimumLengde);
            resultat += b.substring(minimumLengde);
        }
        return resultat;

    }


    //Oppgave 7b;

    public static String flett(String[] s) {
        int m = s[0].length();
        for (int i = 0; i < s.length; i++) {
            int lengde = s[i].length();
            if(lengde>m){
                m=lengde;
        }
        }

        StringBuilder nyString = new StringBuilder();
        for (int i = 0; i <m ; i++) {
            for (String ord : s){
                if(i<ord.length()){
                    nyString.append(ord.charAt(i));
                }
            }
        }
        return nyString.toString();
    }



    // Oppgave 8;


    public static Integer[] indeksSortering(int[] a) {
       Integer[] indesker = new Integer[a.length];
        for (int i = 0; i <a.length ; i++) {
            indesker[i]=i;
        }

        Arrays.sort(indesker, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return a[o1]-a[o2];
            }
        });
        return indesker;
        }


        //Oppgave 9;



    private static void bytt(int[] a, int i, int j)
    { int temp = a[i]; a[i] = a[j]; a[j] = temp; }



    public static int[] indeks(int[] a){
        int[] indeks = new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            indeks[i]=i;
        }

        for (int i = 0; i < a.length-2; i++) {
            for (int j = 0; j < indeks.length-2; j++) {
                if (a[indeks[j]] > a[indeks[j+1]]){ bytt(indeks, j, j+1);}
                if (a[indeks[j+1]] > a[indeks[j+2]]) {bytt(indeks, j, j+2);};
                if (a[indeks[j]] > a[indeks[j+1]]){ bytt(indeks,j,j+1);}

            }


        }
        return indeks;

    }





    public static int[] tredjeMin(int[] a){
        int n = a.length;
        if (n < 3)     // må ha minst tre verdier
        {
            throw new NoSuchElementException("a.length(" + n + ") < 3!");
        }

        int[] indeks = indeks(a);

        int m =  indeks[0];   // m er indeksen til minste verdi
        int nm = indeks[1];   // nm er indeksen til nest minste verdi
        int tm = indeks[2];   // tm er indeksen til tredje minste verdi

        int minverdi = a[m];         // minste verdi
        int nestminverdi = a[nm];    // nest minste verdi
        int tredjeminverdi = a[tm];  // tredje minste verdi

        for (int i = 3; i < n; i++)
        {
            int verdi = a[i];

            if (verdi < tredjeminverdi)
            {
                if (verdi < nestminverdi)
                {
                    if (verdi < minverdi)
                    {
                        tm = nm;
                        tredjeminverdi = nestminverdi;

                        nm = m;
                        nestminverdi = minverdi;

                        m = i;
                        minverdi = verdi;
                    }
                    else  // verdi < nestminverdi && verdi >= minverdi
                    {
                        tm = nm;
                        tredjeminverdi = nestminverdi;

                        nm = i;
                        nestminverdi = verdi;
                    }
                }
                else // verdi < tredjeminverdi && verdi >= nestminverdi
                {
                    tm = i;
                    tredjeminverdi = verdi;
                }
            }

        } // for

        return new int[] { m, nm, tm };


    }









    public static void main(String[] args) {
        int array[]= {7,3,5,2,11,8,1,6,2};
        int array2[]={0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(indeks(array)));
        System.out.println(Arrays.toString(indeksSortering(array)));
    }
}


