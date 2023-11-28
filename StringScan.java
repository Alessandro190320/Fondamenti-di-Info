/**
Esercizio 3
Argomento: gestione delle eccezioni; scansione di una stringa

Acquisire da standard input una stringa e farne una scansione con Scanner riportando in uscita, una sotto l'altra, tutte le parole che la compongono

*/
import java.util.Scanner;
public class StringScan{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		String s;
		
		System.out.print("inserisci una frase ");
		s = console.nextLine();	
		console.close();
		
		Scanner stringa = new Scanner(s);
		
		while(stringa.hasNext()){
			System.out.println(stringa.next());
		}
		
		stringa.close();
	}
}
