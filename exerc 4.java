public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        System.out.println("Este programa irá calcular a taxa de juros de um valor aplicadol por 'X' meses aplicados\n");

        System.out.println("Digite o Capital aplicado: ");
        float capital = tc.nextFloat();

        System.out.println("Digite a quantidade de meses aplicados: ");
        float meses = tc.nextFloat();

        for (int i = 0; i < meses; i++) {
            float result = (float) (capital * 0.1);
            capital = capital + result;
        }
        System.out.println(String.format("%.2f", capital));
        tc.close();
    }