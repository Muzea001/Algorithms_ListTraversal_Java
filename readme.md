Algoritmer og datastrukturer.
Oblig 1.
Studentnummer s333161.

Oppgave 1 )
Når blir det flest ombyttinger? 
Det blir flest ombyttinger i algoritmen dersom tallene i permutasjonen er sortert fra minst tall til størst tall. I en slik tilfelle vil ombyttingen av a[i] og a[j] foregå hver gang i og  j blir sammenlignet, fordi j kommer alltid til å være større enn i. Denne tilfellen får da funksjonen O=(n-1)².

Når blir det færrest? 
Det blir færrest ombyttinger i algoritmen dersom tallene i permutasjonen er sortert fra størst til minst. I en slik tilfelle vil ombyttingen av a[i] og a[j] aldri forekomme. I denne tilfellen blir funksjonen O=(n-1).

Hvor mange blir det i gjennomsnitt? 
Antall ganger den dominerende operasjonen foregår er avhangig av antall tall n i arrayet. Gjennomsnittet for antall ganger ombyttingen faktisk skjer kan regnes ut ved bruk at det harmoniske tallet Hn. Funksjonen for gjennomsnittet blir dat Hn = log(n)+0,577.

Oppgave 2)
Laget en metode som sammenligner tallet som ligger i indeks[0] med tallet som ligger i indeks[0+1]. Hvis tallene ikke er like så øker teller variablet med 1. Teller variablet starter med verdi 1 istedenfor 0 fordi tallet som ligger i indek[0] er alltid unikt, siden det er ingen tall før den og tabellen er sortert. Siden tabellen er sortert og det sjekkes for det så trenger vi bare å sammenligne med indeksen som er etter tallet, og trenger ikke å løpe gjennom hele tabellen hver gang vi sammenligner.  

Oppgave 3)
Laget en metode som finner antall elementer som ikke er repetert i et array. Gjorde dette ved bruk av to hjelpevariabler. Jeg hentet første indeks fra arrayet og brukte et nested array for å løpe gjennom å sjekke hvor mange ganger den finnes. Hvis den finnes bare en gang økte jeg telleren med en.

Oppgave 4)

I denne oppgaven startet vi med å sortere arrayet slik at alle hele tall ligger til venstre og alle oddetall til høyere. Vi gjorde dette gjennom å halvere arrayet, loope gjennom  venstre og høyere siden av arrayet med en iterator. Vi stopper dersom vi finner et tall til venstre som ikke er helt, eller et tall til høere som ikke er oddetall. Da swapper vi tallane med hverandre. Etter at denne sorteringen er ferdig så sorterer vi venstre siden i økende rekkefølge og høyere siden i minkende rekkefølge. 
