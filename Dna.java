/*
Esercizio 5

Argomento: cicli e manipolazione di stringhe

Leggere da standard input una stringa definita sull'alfabeto del DNA (A,C,G,T). Dopo aver verificato che non siano presenti altri caratteri, inviare a standard output una la stringa "inversa-complementare" cosi' definita: 

    Ad ogni A della stringa originale corrisponde una T; 
    Ad ogni T della stringa originale corrisponde una A; 
    Ad ogni C della stringa originale corrisponde una G; 
    Ad ogni G della stringa originale corrisponde una C; 

la stringa viene invertita (l'ultimo carattere e' il primo).

Esempio:

input: ACCTGGTAC

output: GTACCAGGT
*/
import java.util.Scanner;

public class Dna{
	public static void main(String args[]){
		String control = "ATCG";
		String dnaRevers = "TAGC";
		
		Scanner console = new Scanner(System.in);
		boolean f = false;
		String input	;
		
		do{
			System.out.print("Inserisci una stringa che contenga parole dell'alfabeto ACGT \n");
			 input = console.next();
			
			for(int i=0; i< input.length(); i++){
				f = false;
				for(int j= 0; j<control.length(); j++){
					if(input.charAt(i) == control.charAt(j))
						f = true;
				}
				if(!f)
					break;	
			}
						
			if(!f)
				System.out.print("stringa non valida\n");
			else 
				System.out.print("stringa valida\n");
				
		}while(!f);	
		console.close();
		
		System.out.print("output: ");
		for(int i = input.length() -1; i>=0; i--)
			for(int j = 0; j<dnaRevers.length(); j++)
				if(input.charAt(i) == control.charAt(j))
					System.out.print(dnaRevers.charAt(j));	
	}		
}

