import java.util.NoSuchElementException;

public class Oblig1 {

    public static int maks(int[] a){
        int størsttall=0;
        //lager feilhåndtering for en tabell med mindre enn 1 verdi*/
        if(a.length<1){
            throw new NoSuchElementException("tabellen har inkorrekt lengde");
        }
        //lager to forloops, en for det første tallet og en for det tallet det skal bli sammenlignet med/*
        for (int i =0; i<a.length-1;i++){
            for (int j = 1; j <a.length ; j++) {
                //hvis tallet som ligger i indeks 0 er mindre enn tallet som ligger i indeks 1 bytt plass/*
                if(a[i]<a[j]){
                    a[i]=a[j];
                    // lagre det største tallet i et variabel for return/*
                    størsttall =a[j];
                }
            }

        }
        return størsttall;

    }

}
