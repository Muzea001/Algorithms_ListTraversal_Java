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
        int antall = 0;
        if (a.length == 0) {
            return 0;
        }
        // looper to ganger gjennom arrayet, tar indeks 0 og løper gjennom listen for å finne hvor mange duplikater den har osv.
        int temp = -10;
        for (int i = 0; i < a.length; i++) {
            if (temp==a[i]){
                i++;
            }
            for (int j = 0; j < a.length; j++) {
                if(i==j && j<a.length-1){
                    j++;
                }
                if (a[i] == a[j]) {
                    antall++;
                    temp = a[j];
                    break;
                }

                // tar listens lengde minus antall duplikater for å finne hvor mange tall finnes i arrayet.

            }

        }
        return antall;
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

    //Oppgave 7 a)

    public static String flett(String a, String b){
        String resultat = "";
        int lengdeA = a.length();
        int lengdeB = b.length();
        if(lengdeA==lengdeB){

        char[] aliste = a.toCharArray();
        char[] bliste = b.toCharArray();

        for (int i = 0; i < aliste.length; i++) {
            resultat+=aliste[i];
            resultat+=bliste[i];
        }

        }
        else {
            int minimumLengde = Math.min(a.length(),b.length());
            for (int i = 0; i <minimumLengde ; i++) {
                resultat+=a.charAt(i);
                resultat+=b.charAt(i);
            }
            resultat+=a.substring(minimumLengde);
            resultat+=b.substring(minimumLengde);
        }
        return resultat;

        }


        //Oppgave 7b;

    public static String flett(String s){
        String resultat="";

        String[] ordliste = s.split(" ");
        for (int i = 0; i < ordliste.length; i++) {
            for (int j = 0; j < ordliste.length-1; j++) {
                resultat+=ordliste[i].charAt(j);
                break;

            }
        }
        return resultat;
    }


    // Oppgave 8;


    public static void indeksSortering(int [] a) {
        int n = a.length;
        int[] indeks = new int[n];
        int min = a[0];
        int temp = a[0];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                i = indeks[0];
                for (int j = 0; j < a.length; j++) {
                    if (a[j] < temp && a[j] > min) {
                        min = a[j];
                        j = index;
                    }

                    for (int k = 1; k < indeks.length; j++) {
                        indeks[k] = index;
                    }
                }
            }
        }
        for (int i = 0; i <indeks.length ; i++) {
            System.out.println(indeks[i]+" ");
        }
    }



    public static void main(String[] args) {
        int array[]={0,1,2,3,4,5};
        indeksSortering(array);
    }
}


