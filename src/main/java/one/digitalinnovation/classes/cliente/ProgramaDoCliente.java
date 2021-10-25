package one.digitalinnovation.classes.cliente;

public class ProgramaDoCliente {
    public static void main(String[] args) {
        final var cliente = new Cliente(18);

        cliente.getIdade();
        cliente.getPeso();

        // System.out.println(cliente.relatorio()); // não consigo acessar o relatorio porque está em outro pacote
    }
}
