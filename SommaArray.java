/*
Esercizio 5

Argomento: array, cicli

Chiedere all'utente di inserire un numero intero. Leggere due serie di numeri in virgola mobile di lunghezza pari all'intero specificato. Ciacun numero della serie deve essere specificato in una riga di input (= premere invio dopo ogni numero inserito). Restituire in uscita la somma di ciascuna componente corrispondente e la somma totale. Ad esempio:

Quanti elementi?

4

Inserisci gli elementi del primo array, uno per riga:

1.2

2.3

3.4

4.5

Inserisci gli elementi del secondo array, uno per riga:

1.1

0

2.2

2.2

In output:

2.3 2.3 5.6 6.7

16.9


*/
import java.util.Scanner;
public class SommaArray{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		int num;
		double somma = 0;
		
		// acquisisco il numero di elementi
		System.out.print("Quanti elementi? ");
		num = console.nextInt();
		
		// creo i due array di dim = num
		double[] array1 = new double[num];
		double[] array2 = new double[num];
		
		//inserimento dati primo array
		System.out.println("Inserisci gli elementi del secondo array, uno per riga: ");
		for(int i = 0; i<array1.length ; i++)
			array1[i] = console.nextDouble();
		
		//inserimento dati secondo array
		System.out.println("Inserisci gli elementi del secondo array, uno per riga: ");
		for(int i = 0; i<array2.length ; i++)
			array2[i] = console.nextDouble();
		
		//Somma valori array
		System.out.println("Inserisci gli elementi del secondo array, uno per riga: ");
		for(int i = 0; i<array1.length ; i++){
			System.out.print("  " + (array1[i] + array2[i]) );
			array1[i] += array2[i];
			somma += array1[i];			
		}
		System.out.print("\n " + somma);
		
	
		
		
		
		
		
 		
	}
}
