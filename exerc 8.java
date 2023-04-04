import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int veiculos, rodas, testeVeiculos = 0, testeRodas = 0;
		int carros = 0, motos = 1;
		
		System.out.print("Quantos veiculos tem no estacionamento: ");
		veiculos = teclado.nextInt();
		
		System.out.print("Quantas rodas tem no estacionamento: ");
		rodas = teclado.nextInt();
		
		while (testeRodas != rodas || testeVeiculos != veiculos){
		    carros++;
		    testeRodas = (carros * 4) + (motos * 2);
		    testeVeiculos = carros + motos;
		    
		    if (carros > veiculos){
		        carros = 1;
		        motos++;
		    }
		    if else (motos == rodas){
		        System.out.print("Digite o numero correto de veiculos e de rodas");
		        break;
		    }
		}
		if (testeRodas == rodas && testeVeiculos == veiculos){
		    System.out.printf("No estacionamento tem %d carros e %d motos", carros, motos);
		}
		
	}
}