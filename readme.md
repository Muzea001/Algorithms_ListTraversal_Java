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