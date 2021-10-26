package one.digitalinnovation.finals;

public class CasualGamer extends Gamer {
    @Override
    public String keyboard(){
        return "simple keyboard";
    }
    /*@Override
    public String mouse(){ // não posso sobrescrever o mouse porque é final na classe Gamer.
        return super.mouse();
    }*/

    public String play(final String game){
        // game = "WOW";
        return "Jogando " + game;
    }
}
