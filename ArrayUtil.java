/**Esercizio 3
Realizzare la classe ArrayUtil che contiene al suo interno il metodo resize visto in classe, con l'aggiunta della possibilita' che il valore del parametro esplicito newLength sia minore di quella dell'array. In questo caso restituire un array con lo stesso contenuto (fino alla nuova dimensione) e troncato alla dimensione indicata.

Realizzare una versione di resize che ridimensiona un array di int e una che ridimensiona un array di double. Il nome del metodo puo' rimanere invariato. Questa proprieta' si chiama "sovraccarico" overloading. Il compilatore e' in grado di distinguere tra le due in base al tipo di parametro passato.
*/
public class ArrayUtil{
	public static void main(String args[]){
	
		double[] array = { 1,2,3};
		
		array = resize(array, Integer.valueOf(args[0]));
		
		printArray(array);
		
			
	}
	
	// resize double array
	public static double[] resize(double[] a, int NewLength){
		// resize
		double[] NewArray = new double[NewLength];
		
		if(a.length > NewArray.length) // se il nuovo e' piu' piccolo del vecchio
			for(int i=0; i<NewArray.length; i++)
				NewArray[i] = a[i];
		else if(a.length < NewArray.length) // se il nuovo e' maggiore del vecchio
			for(int i=0; i<a.length; i++)
				NewArray[i] = a[i];
		else // se sono uguali
			return a;
				 
		return NewArray;
	}
	
	// resize int array
	public static int[] resize(int[] a, int NewLength){
		// resize
		int[] NewArray = new int[NewLength];
		
		if(a.length > NewArray.length) // se il nuovo e' piu' piccolo del vecchio
			for(int i=0; i<NewArray.length; i++)
				NewArray[i] = a[i];
		else if(a.length < NewArray.length) // se il nuovo e' maggiore del vecchio
			for(int i=0; i<a.length; i++)
				NewArray[i] = a[i];
		else // se sono uguali
			return a;
				 
		return NewArray;
	}
	
	public static void printArray(double a[]){
		System.out.print("Stampa array ");
		for(int i=0; i<a.length; i++)
			System.out.println(a[i] + " ");
	}
	
	
	public static void printArray(int a[]){
		System.out.print("Stampa array ");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
	}
	
	
}
