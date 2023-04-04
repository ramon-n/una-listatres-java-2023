import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    double n1, n2;
	    
		System.out.print("Digite o primeiro numero do logaritimo: ");
		n1 = teclado.nextDouble();
		
		System.out.print("Digite o numero base do logaritimo: ");
		n2 = teclado.nextDouble();
		
		System.out.print(Math.log(n1)/Math.log(n2));
	}
}