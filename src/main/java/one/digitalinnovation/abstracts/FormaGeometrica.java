package one.digitalinnovation.abstracts;

public abstract class FormaGeometrica { // abstract significa que é uma ideia de uma classe e não pode virar um objeto.
    public abstract String name();
    public abstract Double area();

    public String desenha(int x, int y){
        return "Desenhando as coordenadas X=$x e $y";
    }

}
