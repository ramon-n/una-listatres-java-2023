import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    int segundos, horas, minutos;
	    
		System.out.print("Digite um numero inteiro de segundos: ");
		segundos = teclado.nextInt();
		
		horas = segundos / 3600;
		segundos = segundos % 3600;
		
		minutos = segundos / 60;
		segundos = segundos % 60;
		
		System.out.printf("Horas: %d%nMinutos: %d%nSegundos: %d", horas, minutos, segundos);
		teclado.close();
	}
}