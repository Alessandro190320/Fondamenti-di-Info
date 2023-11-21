/**
Esercizio 1

Argomento:  array, cicli

Realizzare una classe MyFirstArray che contenga un metodo main in cui venga creato un array di interi di dimensione 10. Inizializzare ciascuna posizione dell'array 
con il valore dell'indice corrispondente (ad esempio, a[2]=2);

Parte a)

Stampare a video la lunghezza dell'array.

Stampare a video il contenuto di ciascuna cella a partire dalla cella in posizione 0 fino ad arrivare all'ultima.

Stampare a video il contenuto di ciascuna cella a partire dalla cella in ultima posizione fino ad arrivare alla prima.

Parte b)

Realizzare un metodo ausiliario statico con firma

public static void incrementAll(int[] a)

che prenda come parametro esplicito un array di interi e che lo modifichi al suo interno incrementando il valore di ogni posizione di una unita'. Il tipo di dati restituito dal metodo e' void.

Dopo aver invocato il metodo dal main, passando come parametro l'array creato precedentemente , stampare a video il contenuto di ciascuna cella dell'array a partire dalla cella in posizione 0. Il contenuto e' stato modificato?

Parte c)

Creare nel main una variabile int e assegnarle un valore.

Realizzare un metodo ausiliario statico con firma

public static void incrementVar(int value)

che prenda come parametro esplicito una variabile intera e che la modifichi al suo interno incrementando il valore di una unita'. Il tipo di dati restituito dal metodo e' void.

Stampare a video il contenuto della variabile prima e dopo l'invocazione dal main del metodo incrementVar() a cui venga passato come parametro la variabile precedentemente creata. Il contenuto e' stato modificato?
*/
public class MyFirstArray{
	public static void main(String args[]){
		int[] n = new int[10];
		
		//A 
		
		// assegna ad ogni cella il valore del suo indice
		for(int i = 0; i < n.length; i++)
			n[i] = i;
		 
		// lunghezza array
		System.out.println("dimensione dell'array "+ n.length); // leggo la dimensione dell'array direttamente dalla costante dell' oggetto
		
		// stampa array
		System.out.print("array: ");
		for(int i = 0; i<n.length; i++)
			System.out.print(" " + n[i]);
		
		// stampa al contrario
		System.out.print("\narray revers: ");
		for(int i = n.length -1; i>0; i-- )
			System.out.print(" " + n[i]);
		
		//B
		incrementAll(n);
		System.out.print("\narray incrementato: ");
		for(int i = 0; i<n.length; i++)
			System.out.print(" " + n[i]);
			
		//C
		int a = 0;
		System.out.println("\nvariabile a " + a);
		increment(a);
		System.out.print("variabile a dopo la funzione " + a);
		
		
		
	}
	
	public static void incrementAll(int[] a){
		for(int i = 0; i<a.length; i++)
			a[i] ++;
	}
	
	public static void increment(int value){
		value++;
	}
}

