import java.util.Scanner;
public class SalarioFamilia {

	public static void main(String[] args) {
		// HorasMes, ValorHora, nfilhos
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Este Programa calculará o salário bruto mais o salário familia com acrésimo de R$59,82 por filho menor de 14 anos");
		System.out.println("Qual o valor da hora trabalhada?");
		double valorHora = scanner.nextDouble();
		
		System.out.println("Qantas horas foram trabalhadas no Mês?");
		double horasMes = scanner.nextDouble();
		
		System.out.println("Qaual o numero de filhos menor de 14 anos");
		int nfilhos = scanner.nextInt();
		
		double salario = (valorHora*horasMes)+(59.82*nfilhos);
		
		
		System.out.println("O valor do salário é "+ salario);

	}

}