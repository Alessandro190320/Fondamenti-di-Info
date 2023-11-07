/**
* Progettare il programma TwoNumbers che chieda all'utente di inserire due numeri reali e ne visualizzi (senza usare la classe Math):
*
*    •    la somma
*    •    il prodotto
*    •    il valore medio
*    •    il valore massimo
*    •    il valore minimo
*    •    il valore assoluto della differenza
*/
import java.util.Scanner;
public class TwoNumbers{
	public static void main(String args[]){
		double n1,n2,somma,prodotto,max,min,abs;
		Scanner console = new Scanner(System.in);
		
		System.out.print("inserisci il primo numero ");
		n1 = console.nextDouble();
		
		System.out.print("inserici il secondo numero ");
		n2 = console.nextDouble();
		console.close();
		
		somma = n1 + n2;
		prodotto = n1 * n2;
		
		// max & min
		if(n1 > n2 ){
			max = n1;
			min = n2;
		}else if( n1 == n2){
			max = n1;
			min = n1;
		}	
		else{
			max = n2;
			min = n1;
		}
		
		//abs 
		if ( (n1 - n2) < 0 )
			abs = (n1-n2) * -1; // cambio di segno
		else 
			abs = n1-n2;
		
		System.out.print("somma = " + somma + " prodotto " + prodotto + " max " + max + " min " + min + " abs " + abs ); 
		
	}
}

