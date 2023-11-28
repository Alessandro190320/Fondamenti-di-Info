/**Esercizio 4
Argomento: lettura da file per righe

Scrivere un programma Leggi1.java che legga il file input.txt  una riga alla volta e stampi a video il contenuto. Si ricordano qui sotto i passi fondamentali per leggere da file:

Utilizzare try-with-resources e non preoccuparsi di chiudere le risorse

try(FileReader r = new FileReader(); Scanner scan = new Scanner(r)){

   Si usa lo scanner con i suoi metodi hasNext, next, nextInt, nextDouble,    
   nextLine a seconda delle esigenze

}
catch(SomeException e){
   gestisco le eccezioni
}*/
import java.util.*;
import java.io.*; // IOException 

public class Leggi1{
	public static void main(String args[]){
		try(FileReader r = new FileReader("input.txt"); Scanner scan = new Scanner(r)){
			while(scan.hasNext())
				System.out.println(scan.nextLine());
		}catch(IOException e){
			System.out.println("problemi di apertura file");
		}
	}
}
