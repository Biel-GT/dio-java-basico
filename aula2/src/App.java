public class App {
    public static void main(String[] args) throws Exception {
        int numero1 = 5, numero2 = 10;

        int soma = somar(numero1, numero2);

        System.out.println(soma);

        String primeiroNome = "Gabriel", segundoNome = "Teixeira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static int somar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
