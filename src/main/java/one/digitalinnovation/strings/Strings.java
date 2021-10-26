package one.digitalinnovation.strings;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        var nome = "Andre";
        var sobrenome = "Gomes";
        final var nomeCompleto = nome + sobrenome;

        System.out.println(nome);
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Nome completo do cliente: "+ nomeCompleto);
        var string = new String ("Minha String");

        System.out.println("Char na posição: " + string.charAt(5));
        System.out.println("Quantidade=" +string.length());
        System.out.println("Sem Trim ["+string+"]");
        System.out.println("Com Trim ["+string.trim()+"]");
        System.out.println("Lower" + string.toLowerCase());
        System.out.println("Upper" + string.toUpperCase());
        System.out.println();



    }
}
