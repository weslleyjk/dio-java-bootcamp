package one.digitalinnovation.finals;

public class Gamer {

    public String keyboard(){
        return "Keyboard Gamer!";
    }

    public final String mouse(){ // quem herdar a classe gamer não vai poder sobrescrever o final mouse
        return "Mouse Gamer!";
    }

}
