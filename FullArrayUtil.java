/*Esercizio 6

Argomento: array riempiti solo in parte, semplici algoritmi su array

Aggiungere alla classe ArrayUtil gli algoritmi su array visti a lezione utilizzando array riempiti solo in parte.

    generazione di un array di interi di numeri casuali (randomIntArray); 

       public static int[] randomIntArray(int length, int n) 

    stampare il contenuto di un array (printArray); 

       public static String printArray(int[] v, int vSize)

    eliminare un elemento (ordine non importante);

      public static void remove(int[] v, int vSize, int index)

    eliminare un elemento (ordine importante)

       public static void removeSorted(int[] v, int vSize, int index)

    inserire un elemento

       public static void insert(int[] v, int vSize, int index, int value)

    ricerca del minimo

      public static int findMin(int[] v, int vSize)

    ricerca del massimo

      public static int findMin(int[] v, int vSize)

    ricerca di un valore in modo sequenziale

      public static int find(int[] v, int vSize, int target)


Testare gli algoritmi scrivendo una classe di collaudo ArrayUtilTester che

    riceva da standard input la dimensione e l'intervallo di variabilità di un array di numeri interi casuali
    Stampi il contenuto dell'array generato
    Collaudi gli algoritmi visualizzando dopo ogni operazione il contenuto dell'array attraverso la sequenza di richieste:

    Chiedere all'utente un valore e una posizione in cui inserirlo
    Chiedere all'utente di indicare la posizione di un elemento da eliminare (senza considerare rilevante l'ordine)
    Chiedere all'utente di indicare la posizione di un elemento da eliminare (considerando rilevante l'ordine)
    Chiedere all'utente un valore da cercare
    Visualizzi minimo e massimo del contenuto dell'array

Ricordarsi di modificare la taglia di vSize se le operazioni che la modificano vanno a buon fine.
*/
public class FullArrayUtil{
	public static void main(String args[]){
		int[] array = ArrayRandom(10); // creo un array di dimensione 10 contenente numeri random
	}
	
	public static int[] ArrayRandom(int dim){
		int[] a = new int[dim];
		for(int i=0; i<dim; i++)
			a[i] =1+ Math.random(); // guarda le slide per la rand
		return a;
	}
}

