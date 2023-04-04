public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        System.out.println("Esse programa irá calcular o novo valor do produto acrescido 10% ao seu valor inicial.\n");
        
        System.out.println("Informe o Valor do produto:");
        float produto = tc.nextFloat();
        
        float novoValor = (float) (produto * 0.10);
        System.out.println("O novo valor do produto é: "+String.format("%.2f", novoValor+produto));
        tc.close();
    }