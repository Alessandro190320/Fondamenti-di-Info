/**
Esercizio 4

Argomento: gestione dinamica di un array, cicli

Leggere un numero arbitrario di interi da standard input e riportarli in uscita in ordine inverso di inserimento.
*/
import java.util.Scanner;
public class ArrayUtil2{
	public static void main(String args[]){
	
	Scanner console = new Scanner(System.in);
	int[] array = new int[4];
	int i=0;
		while(console.hasNextInt()){
			array[i] = console.nextInt();
			
			
			if(array.length-1 == i)
				array = resize(array, array.length+1);
			i++;
		}
		
		printArrayRevers(array);
		
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
	
	public static void printArray(int a[]){
		System.out.print("Stampa array ");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
	}
	
	public static void printArrayRevers(int a[]){
		System.out.print("Stampa array al contrario ");
		for(int i=a.length-2; i >= 0; i--) // meno due perche' non voglio avere la cella vuota che mi andrebbe a creare
			System.out.print(a[i] + " ");
	}

}
