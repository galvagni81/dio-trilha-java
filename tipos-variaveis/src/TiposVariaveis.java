public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        double salarioMinimo = 2500; // tipo "double", nome "salarioMinimo", valor 2.500.

        System.out.println("Salário mínimo: " + salarioMinimo);
        String texto = "Texto original não alterado.";

        imprimirTexto(texto);
        System.out.println("Texto após chamada do método: " + texto);
    }

    public static void imprimirTexto (String texto){
        System.out.println("Texto original: " + texto);
        texto = "Novo texto.";
        System.out.println("Texto ajustado: " + texto);
    }
}
