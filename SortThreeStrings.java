/**
* Argomento: decisioni, confronto tra stringhe
* 
* Progettare il programma SortThreeStrings che
*    •    chieda all'utente di inserire tre stringhe (una per riga)
*    •    visualizzi le stringhe in ordine lessicografico crescente (una per riga)
*/
import java.util.Scanner;
public class SortThreeStrings{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		String s1,s2,s3,ord1,ord2,ord3;
		
		System.out.print("inserisci una stringa ");
		s1 = console.next();
		
		System.out.print("inserisci una stringa ");
		s2 = console.next();
		
		System.out.print("inserisci una stringa ");
		s3 = console.next();
		
		if ( s1.compareTo(s2) < 0){ 
			if(s1.compareTo(s3) <0 ){
				System.out.println(s1);
				if(s2.compareTo(s3) < 0){
					System.out.println(s2);
					System.out.println(s3);
				}else{
					System.out.println(s3 + "\n" + s2 );
				}	
			}else if(s3.compareTo(s2) <0){
				System.out.println(s3);
				if(s1.compareTo(s2) <0);
					System.out.println(s2 + "\n" + s3 );
			}
			else{
				System.out.println(s2 + "prova");
				if(s1.compareTo(s3) <0);
					System.out.println(s1 + "\n" + s3);
			}
			
		} // vuol dire che s2 viene prima di s1
		else if( s2.compareTo(s3) < 0){
			System.out.println(s2);
			if(s1.compareTo(s3) <0);
					System.out.println(s3 + "\n" + s1);
			}
		else{
			System.out.println(s3);
			if(s1.compareTo(s2) <0);
					System.out.println(s2 + "\n" + s1 );
		}	
	}
}
