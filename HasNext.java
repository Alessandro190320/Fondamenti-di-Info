/*
Esercizio 4

Argomento: cicli e manipolazione di stringhe

Leggere da standard input un numero arbitrario di parole, una per ogni riga. Inviare a standard output una riga di testo unica in cui i caratteri di ciascuna parola sono disposti in ordine inverso.

Esempio:

input:

uno

due

tre

output: onu eud ert
*/
import java.util.Scanner;

public class HasNext{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		String input = "", output = "";
		System.out.print("input: ");
		
		while(console.hasNextLine()){
			input += console.nextLine();
			input += " ";
			
		}
		for(int i = input.length() -1; i>= 0; i--)
			output += input.charAt(i);
		System.out.print("output:"+ output);
	}
}
	
