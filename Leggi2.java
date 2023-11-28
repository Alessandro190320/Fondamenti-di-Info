/**
Esercizio 5
Argomento: lettura da file per righe; lettura da file per righe e lettura delle parole di ciascuna riga

Scrivere un programma Leggi2.java che legga il file input.txt una riga alla volta e stampi le parole contenute in ciascuna riga a video una sotto l'altra.

Ad esempio con file input.txt:

ciao, come stai?
io bene e tu?

Stampera' in output:

ciao,
come
stai?
io
bene
e
tu?


Suggerimento: ricordarsi che lo scanner puo' essere utilizzato anche per estrarre "token" da una stringa! Quindi una volta letta la riga da file e' possibile creare un altro scanner passando come argomento la stringa e usare i metodi di scanner per stampare una parola alla volta


*/
import java.util.*;
import java.io.*; // IOException 

public class Leggi2{
	public static void main(String args[]){
		String s;
		
		try(FileReader r = new FileReader("input.txt"); Scanner scan = new Scanner(r)){
			while(scan.hasNext()){
				s = scan.next(); // leggo spezzettato
				Scanner string = new Scanner(s); // apro lo scanner con la stringa
				System.out.println(string.next()); // stampo
				string.close(); // chiudo lo scanner
			}
				
		}catch(IOException e){
			System.out.println("problemi di apertura file");
		}
	}
}
