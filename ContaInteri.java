/**
Esercizio 2

Argomento: gestione delle eccezioni; uso della terminazione di input; reindirizzamento in input e output

Scrivere un programma eseguibile ContaInteri.java che legga da standard input un numero arbitrario di dati e restituisca a standard output il numero di dati letti che sono valori interi. Utilizzare il metodo nextInt() di Scanner per leggere i dati inseriti. Se il dato inserito e' un intero dovra' essere incrementata una variabile contatore precedentemente definita. Nel caso in cui non si inserisca un intero il metodo lancera' l'eccezione InputMismatchException che dovra' essere catturata e gestita. In particolare, al verificarsi dell'eccezione non si dovra' incrementare il contatore ma si dovra' liberare il flusso d'ingresso standard dal dato non valido.

Dopo aver realizzato il programma testarlo con inserimento da tastiera.

Dopo aver visto a lezione il reindirizzamento, testare il programma reindirizzando in input il file contaInteri.txt . Provare poi in entrambi i modi ma reindirizzando l'output nel file numeroInteri.txt. Verificare che il contenuto del file sia corretto con il comando "more numeroInteri.txt" su riga di comando del terminale, oppure aprendo il file numeroInteri.txt con un editor. 

per eseguirlo con il file : java ContaInteri < containteri.txt
*/
import java.util.*;

public class ContaInteri{
	public static void main(String args[]){
		int cnt = 0;
		Scanner console = new Scanner(System.in);
		
		System.out.print("inserisci numeri interi ");
		while(console.hasNext()){
			try{
				console.nextInt();
				cnt++;
			}catch(InputMismatchException e){
				System.out.println("il valore inserito non e' valido");
				console.nextLine(); // pulisco il buffer di lettura
			}
		}
		System.out.println("i numeri interi inseriti sono "+ cnt);
	}
}
