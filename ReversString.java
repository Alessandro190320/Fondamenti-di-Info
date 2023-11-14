/*
Leggere da standard input una riga di testo. Inviare a standard output una corrispondente riga in cui i caratteri sono disposti in ordine inverso.

Esempio:
input:  uno due tre
output: ert eud onu
*/
import java.util.Scanner;

public class ReversString{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		String dritta,revers = " ";
		System.out.print("input: ");
		dritta = console.nextLine();
		
		for(int i = dritta.length() -1; i >= 0; i--)
			revers += dritta.charAt(i);
		
		System.out.print("output:" + revers);
		
	}
}
