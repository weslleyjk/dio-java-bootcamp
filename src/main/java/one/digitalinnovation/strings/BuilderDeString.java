package one.digitalinnovation.strings;

public class BuilderDeString {
    public static void main(String[] args) {
        var nome = "André";
        final var builder = new StringBuilder(nome); // adicionar strings na variavel nome
        System.out.println(builder.append("Luis"));

        final var reverse = builder.reverse(); // muda a variavel e deixa de trás pra frente

        System.out.println(reverse);

        final var insert = reverse.insert(0, "#").insert(reverse.length(), "#"); // insert é para inserir caracteres na string
    }
}
