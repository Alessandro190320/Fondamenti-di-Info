/**
Esercizio 7

Argomento: Lettura e scrittura di file, gestione delle eccezioni, "tokenizzazione" di stringhe

Scrivere un programma CapsCopier.java che

    Riceva dall'input standard due nomi di file di testo, uno in lettura e uno in scrittura
    Apra in lettura il primo file e ne legga il contenuto
    Crei e apra in scrittura il secondo file
    Copi nel secondo file il contenuto del primo, opportunamente modificato in modo che tutte le parole abbiano la prima lettera maiuscola e le seguenti minuscole

Provare il programma usando il file vispateresa.txt come file di input e creando (ad esempio) il file vispateresa2.txt in output.
Approfondimento: modificare il programma in modo che riconosca come due parole distinte anche quelle separate da un apostrofo. Ad esempio, se il file in lettura contiene le parole 

LA vispA teresa AVEA tra l'erBETTa

al termine dell'esecuzione il secondo file dovra` contenere il testo

La Vispa Teresa Avea Tra L'Erbetta

Suggerimento importante: studiare la documentazione di Scanner, e verificare che usando opportuni metodi è possibile usare un insieme di caratteri delimitatori diverso da quello di default.
*/
import java.util.*;
import java.io.*;

public class CapsCopier{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		String fIn;
		String fOut;
		
		System.out.println("inserisci il nome del file di input: ");
		fIn = console.next();
		System.out.println("inserisci il nome del file di output: ");
		fOut = console.next();
		
		
		try{
		
		}catch(IOException e){
			
		}
		
	}
}
