package one.digitalinnovation.strings;

public class StringFormat {
    public static void main(String[] args) {
        var nome = "Weslley";
        var sobrenome  = "Félix";
        final var nomeCompleto = nome + sobrenome;

        System.out.println(nome);
        System.out.println("Nome do cliente : " + nome);
        System.out.println("Nome completo do cliente : " + nomeCompleto);
        final var mensagem = String.format("O cliente %s possui sobre %s", nome, sobrenome);
        System.out.println(mensagem);
        System.out.println(String.format("numero %.2f", 1.2375d));
    }
}
