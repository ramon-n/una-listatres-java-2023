    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a = 0.00, b = 0.00, c = 0.00;

        System.out.println("Digite o primeiro número:");
        a = teclado.nextDouble();
		
        System.out.println("Digite o segundo número:");
        b = teclado.nextDouble();
		
        System.out.println("Digite o terceiro número:");
        c = teclado.nextDouble();

        double mediaAritmetica = (a + b + c) / 3;
        System.out.println("Média Aritmética: " + mediaAritmetica);
		
        double mediaGeometrica = Math.pow(a * b * c, 1.0 / 3);
        System.out.println("Média Geométrica: " + mediaGeometrica);
		
        double mediaHarmonica = 3 / (1 / a + 1 / b + 1 / c);
        System.out.println("Média Harmônica: " + mediaHarmonica);

        teclado.close();
    }
}