/*
Obiettivo: esercitarsi con le operazioni aritmetiche
Scrivere il programma PrintEasterDayForYear che calcoli la data della domenica di Pasqua di un anno specifico (dichiarare una variabile di tipo intero e assegnarle il valore dell'anno che volete utilizzare). La domenica di Pasqua è la prima domenica dopo la prima luna piena di primavera e la sua data può essere calcolata con questo algoritmo, individuato da Carl Friedrich Gauss nel 1800.

    Parti dal valore assegnato all'anno y, un numero intero non negativo
    Dividi y per 19, ottenendo il resto a. Ignora il quoziente.
    Dividi y per 100, ottenendo quoziente b e resto c.
    Dividi b per 4, ottenendo quoziente d e resto e.
    Dividi (8b+13) per 25, ottenendo il quoziente g. Ignora il resto.
    Dividi (19a+b-d-g+15) per 30, ottenendo il resto h. Ignora il quoziente.
    Dividi c per 4, ottenendo quoziente j e resto k.
    Dividi (a+11h) per 319, ottenendo il quoziente m. Ignora il resto.
    Dividi (2e+2j-k-h+m+32) per 7, ottenendo il resto r. Ignora il quoziente.
    Dividi (h-m+r+90) per 25, ottenendo il quoziente n. Ignora il resto.
    Dividi (h-m+r+n+19) per 32, ottenendo il resto p. Ignora il quoziente.
    Pasqua è il giorno p del mese n dell'anno y. 

Dopo aver provato con valori di variabili assegnati direttamente nel codice sorgente, modificare il programma in modo che l'anno y venga specificato dall'utente leggendolo da standard input e non fissato nel codice.  
*/

public class PrintEasterDayForYear{
	public static void main(String[] args){
		int data = 2023; 
		int a = data%19;
		int quozienteB = data/100;
		int restoC = data%100;
		int restoE = quozienteB%4;
		int quozienteD = quozienteB/4;
		int quozienteG = ( 8 * quozienteB  +13 ) / 25;
		int h = (19 * a + quozienteB - quozienteD - quozienteG + 15 ) % 30;
		int j = restoC /4;
		int k = restoC %4;
		int m = ( a + (11*h )) / 319;
		int r = ((2 * restoE ) + (2*j) - k - h + m + 32) % 7;
		int n = ( h - m + r + 90 ) / 25;
		int p = ( h - m + r + n + 19 ) % 32;
		System.out.println("Pasqua e' il giorno " + p + " del mese " + n + " dell'anno " + data); 	 									
	}
}
