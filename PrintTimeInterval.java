/**Esercizio 1
*
* Argomento: uso dell'input standard; manipolazione di stringhe e numeri
* Scrivere il programma PrintTimeInterval.java che legga dall'input standard due orari nel formato "24 ore", ciascuno di quattro cifre (ad esempio, 0900 oppure 1730), 
* con il secondo orario successivo al primo visualizzi sull'output standard il numero di ore e di minuti (separatamente) che intercorrono fra i due orari secondo il 
* seguente esempio
* Inserire il primo orario: 0900
* Inserire il secondo orario: 1730
* Tempo trascorso: 8 ore e 30 minuti
*/ 
import java.util.Scanner;
public class PrintTimeInterval{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		int ora1, ora2,oreInMin1,oreInMin2,ore;
		System.out.print("inserisci il primo orario: ");
		ora1 = console.nextInt();
		
		System.out.print("inserisci il secondo orario: ");
		ora2 = console.nextInt();
		
		console.close();
		
		oreInMin1 = (((ora1 /100 ) *60) + ((ora1 % 100))); // converto tutto in minuti e sommo 
		oreInMin2 = (((ora2 /100 ) *60) + ((ora2 % 100)));  // stessa cosa di sopra
		
		ore = oreInMin2 - oreInMin1; // sottraggo il secondo dal primo
		
		System.out.println("Tempo trascorso " + (ore/60) + " " + (ore%60));
	}
}
