package one.digitalinnovation.finals;

public class Programa {
    public static void main(String[] args) {
        final HardcoreGamer hardcoreGamer = new HardcoreGamer();
        final Gamer gamer = new Gamer();
        final CasualGamer casualGamer = new CasualGamer();
        final var game = "PUBG";

        // game = "Wow"; como foi declarado "final" a variavel, não é possivel mudar, por isso o codigo tá comentado.

        System.out.println(casualGamer.play(game)); // vai mostrar jogando pubg
    }
}
