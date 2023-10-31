/* Obiettivo: esercitarsi con operazioni divisione e modulo fra interi
Scrivere un programma che converta un numero decimale in una base qualsiasi b > 1. Si scelga il numero da convertire nell'intervallo chiuso [0, b^3-1] in modo che sia esprimibile con tre cifre nella nuova base. La base b e il numero da convertire vanno dichiarati come variabili intere nel codice, dove potete assegnare loro un valore. Esempio se la base scelta e' 7, si scelga il numero fra 0 e 342 (73 = 34^3). Suggerimento per l'algoritmo da usare: algoritmo di conversione da base decimale a base generica b (invece che dividere per 2, come visto in classe per il caso binario, si divide per b). Verificare il risultato: ad esempio se il numero decimale e' 256 e 
la base b=7: 256_10 = 514_7 = 5*7^2 + 1*7^1 + 4*7^0
Dopo aver provato con valori di variabili assegnati direttamente nel codice sorgente, modificare il programma in modo che la base e il valore decimale da convertire vengano specificati dall'utente da standard input e non fissati nel codice. 
*/
import java.util.Scanner;

public class Convertitore{
	public static void main(String args[]){
	int b = 7;
	int n = 73;
	int r1,r2,r3;
	int q;
	
	if(n<= (b*b*b)-1 && n>= 0){
		r1 = n%b; // 200%7= 4
		q = n/b; // 200/7= 28
		r2 = q%b; // 28%7 = 0
		q /= b; // 28/7= 4 
		r3 = q%b; // 4%7=4
		q /= b;
		
		System.out.println("il numero " + n + " in base " + b + " e' " + r3 + r2 + r1);
		}
	else 
		System.out.println("numero escluso dal range");	
	
	}
}
