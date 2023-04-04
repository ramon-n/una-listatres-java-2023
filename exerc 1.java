package divisaomedia;

import java.util.Scanner;

public class DivisaoMedia {

    public static void main(String[] args) {
        //variaveis
        Scanner tc = new Scanner(System.in);
        double num1, num2, media;

        System.out.print("Informe o primeiro numero: ");
        num1 = tc.nextDouble();

        System.out.print("Informe o segundo numero: ");
        num2 = tc.nextDouble();

        media = (num1 + num2) / 2;

        System.out.println("A media é "+String.format("%.2f", media));

    }
}
