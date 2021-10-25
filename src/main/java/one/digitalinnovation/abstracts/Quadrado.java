package one.digitalinnovation.abstracts;

public class Quadrado extends FormaGeometrica {
    private String name;
    private Double area;

    public Quadrado(final String name, final Double area){
        this.name=name;
        this.area=area;
    }

    @Override  // Eu usei a sobrescrita porque estou extendendo uma classe abstrata entao se não fizer isso dá erro
    public String name (){
        return name;
    }
    @Override
    public Double area(){
        return area;
    }
    @Override
    public String toString(){ //
        final StringBuilder builder = "Quadrado: [" + "name="" + name + """ area + area +];
        return builder.toString();
    }
}
