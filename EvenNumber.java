/**
* Esercizio 5
*
* Argomento: lettura da input, decisioni, confronto tra numeri
* 
* Progettare il programma EvenNumber che:
*     •    chieda all'utente di fornire un numero pari (ovviamente intero...)
*    •    se il numero fornito è dispari, chieda di nuovo all'utente di fornire un numero pari, dopo aver visualizzato una segnalazione d'errore
*    •    se il numero fornito (al primo o secondo tentativo) è pari, scriva un messaggio di congratulazioni all'utente, riportando anche il numero fornito (es. "Bravo! * Il numero 26 è pari")
*     •    se, invece, neanche il secondo numero fornito è pari, scriva un messaggio di disappunto
* Attenzione: se il primo numero fornito è pari, il programma NON deve chiedere un secondo numero.
*/
import java.util.Scanner;

public class EvenNumber{
	public static void main(String args[]){
		int numeroPari;
		Scanner console = new Scanner(System.in);
		System.out.print("inserisci un numero pari ");		
		numeroPari = console.nextInt();
		console.close();
		
		if(numeroPari %2 != 0){
			System.out.print("il numero non e' pari\ninserisci un numero pari ");		
			numeroPari = console.nextInt();
			if(numeroPari %2 != 0 ){
				System.out.print("il numero non e' pari\ninserisci un numero pari ");		
				numeroPari = console.nextInt();
				if(numeroPari %2 != 0 )
					System.out.print("indubbiamente non sai cosa sia un numero pari, leggiti: https://www.treccani.it/enciclopedia/numero-			pari_%28Enciclopedia-della-Matematica%29/ ");
					else
						System.out.print("congratualzioni il numero " + numeroPari + " e' pari");
			}
			else
				System.out.print("congratualzioni il numero " + numeroPari + " e' pari");
		}
		else
			System.out.print("congratualzioni il numero " + numeroPari + " e' pari");
	}
}
