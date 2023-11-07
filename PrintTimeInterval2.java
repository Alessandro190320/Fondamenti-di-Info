/**Esercizio 2
* Argomento: uso dell'input standard; manipolazione di stringhe e numeri
*
* Scrivere il programma PrintTimeInterval2.java, modificando il programma PrintTimeInterval visto in precedenza in modo che funzioni correttamente anche se il secondo 
* orario è inferiore al primo (cioè per un intervallo di tempo che comprenda la mezzanotte), come in questo esempio di funzionamento:

* Inserire il primo orario: 1730
* Inserire il secondo orario: 0900
* Tempo trascorso: 15 ore e 30 minuti
*/ 
import java.util.Scanner;
public class PrintTimeInterval2{
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
		
		// sottraggo il piu' grande
		if(oreInMin2>= oreInMin1) 
			ore = oreInMin2 - oreInMin1;
		else{
			ore = oreInMin2 - oreInMin1;
			ore += 24*60;
		} 
		
		System.out.println("Tempo trascorso " + (ore/60) + " ore " + (ore%60) + " minuti");
	}
}
