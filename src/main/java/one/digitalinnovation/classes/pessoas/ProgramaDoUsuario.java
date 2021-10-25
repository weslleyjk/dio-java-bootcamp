package one.digitalinnovation.classes.pessoas;

import one.digitalinnovation.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {
    public static void main(String[] args) {
        final var batman = new SuperUsuario("batman", "123456844");

        batman.getLogin();

        // batman.getSenha(); // ERRO

        // String nomeDoCliente = batman.nome; // ERRO // só é publico para quem ta no mesmo pacote.
    }
}
