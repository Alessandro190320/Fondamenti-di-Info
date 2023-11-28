/**
E1.2
Test interruttore

// Metodo di accesso della variabile di esemplare interruttore
public boolean getStatusInterruttore();

//Metodo di accesso alla variabile statica lampadina
public boolean isBulbOn();

//Modificatore: cambia lo stato dell'interruttore 
//(e della lampadina!)
public void changeStatus();

//Stampa lo stato dell'interruttore: up/down a seconda 
// che status sia true o false

public String printStatus();
*/
import java.util.*;

public class TestInterruttore{
	public static void main(String args[]){
		Interruttore x = new Interruttore();
		Interruttore y = new Interruttore();
		Scanner console = new Scanner(System.in);
		int n = -1;
		
		// controllo che l'interruttore sia stato inzializzato a false
		System.out.println("stato interruttore x " + x.getStatusInterruttore());
		System.out.println("stato interruttore y " + y.getStatusInterruttore());
		System.out.println("stato lampadina " + y.isBulbOn());
		
		do{
			try{
				System.out.print("inserisci un numero [0,2] --> ");
				n = console.nextInt();
				if(n == 1){
					// cambio lo stato dell'interruttore
					x.changeStatus();
				}else if(n == 2){
					// cambio lo stato dell'interruttore
					y.changeStatus();
				}
			}catch(InputMismatchException e){
				System.out.println("il dato inserito non e' valido");
			}		
		}while(n != 0);
		
		// chiudo lo scanner
		console.close();
		
		
		// controllo lo stato
		System.out.println("stato interruttore x " + x.getStatusInterruttore());
		System.out.println("stato interruttore y " + y.getStatusInterruttore());
		System.out.println("stato lampadina " + y.isBulbOn());
		
		System.out.println(y.printStatus());
	}
}
