/**	
Esercizio 6
Argomento: gestione delle eccezioni; uso della terminazione di input; lettura/scrittura  file

Scrivere il programma Leggi3.java modificando il programma precedente in modo che i segni di punteggiature (virgola e punto di domanda) vengano considerati come separatori. Per far cio' sara' necessario invocare il metodo useDelimiter passando come parametro la stringa "[,?\\s]+". Il contenuto della stringa viene chiamato "espressione regolare". In sostanza stiamo dicendo di considerare come separatori la virgola, il punto di domanda e tutti gli spazi (\\s) ripetuti almento una volta (il + dopo la parentesi quadra). Le espressioni regolari sono un argomento avanzato che esula dal programma del corso.
Pero' possiamo facilmente creare dei separatori, ad esempio provate a definire come separatore la sola lettera "o" e vedere come si separa la frase.
*/
import java.io.*;
import java.util.*;
public class Leggi3{
	public static void main(String args[]){
		String specialChar ="[,?\\s]+";
		
		try(FileReader r = new FileReader("input.txt"); Scanner scan = new Scanner(r)){
			Scanner prova;
			while(scan.hasNext()){ 
				prova = scan.useDelimiter(specialChar); // ritorna uno scanner che legge tutti i caratteri tranne quelli speciali passati
				System.out.println(prova.next()); // stampo ogni parola
			}	
			
		}catch(IOException e){
			System.out.println("problemi di apertura file");
		}
	}
}


