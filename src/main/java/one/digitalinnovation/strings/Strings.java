package one.digitalinnovation.strings;
import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        var nome = "Weslley";
        var sobrenome = "Félix";
        final var nomeCompleto = nome + sobrenome;

        System.out.println(nome);
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Nome completo do cliente: "+ nomeCompleto);
        var string = new String ("Minha String");

        System.out.println("Char na posição: " + string.charAt(5)); // mostrar posicao de caractere determinada string
        System.out.println("Quantidade=" +string.length()); // ver tamanho da string
        System.out.println("Sem Trim ["+string+"]");
        System.out.println("Com Trim ["+string.trim()+"]"); // cortar espaços
        System.out.println("Lower" + string.toLowerCase()); // deixar tudo em minusculo
        System.out.println("Upper" + string.toUpperCase()); //deixar tudo em maiusculo
        System.out.println("Contém M? " +string.contains("M")); // serve para ver se existe a letra M na string
        System.out.println("Contém X? " +string.contains("X"));
        System.out.println("Replace" + string.replace("n", "$")); //troca um caractere pelo outro, nesse caso trocou o n pelo $
        System.out.println("Equals?"+ string.equals("Minha string")); // para fazer comparação, se for igual ele vai retornar true e se for falso false.
        System.out.println("EqualsIgnoreCase?" + string.equalsIgnoreCase("Minha string")); //
        System.out.println("Substring (1,6) =" + string.substring(1,6)); //pede os caracteres do 1 ao 6




    }
}
