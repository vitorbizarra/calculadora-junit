public class CalculadoraTestes {
    public static void main(String[] args) throws Exception {

        Calculadora calc = new Calculadora();

        // Cenário de testes 1: Soma de dois valores
        int soma = calc.somar(3, 7);
        System.out.println(soma);

        soma = calc.somar(3, 0);
        System.out.println(soma);
    }
}
