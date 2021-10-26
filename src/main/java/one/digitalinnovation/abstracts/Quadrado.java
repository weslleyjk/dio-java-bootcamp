package one.digitalinnovation.abstracts;

public class Quadrado extends FormaGeometrica {
    private String name;
    private Double area;

    public Quadrado(final String name, final Double area){
        this.name=name;
        this.area=area;
    }

    @Override  // Eu usei a sobrescrita porque estou estendendo uma classe abstrata entao se não fizer isso dá erro
    public String name (){
        return name;
    }
    @Override
    public Double area(){
        return area;
    }
    @Override
    public String toString(){ //
        final StringBuilder builder = new StringBuilder()//
                .append("Quadrado [")//
                .append("nome=\"")//
                .append(name).append("\"")//
                .append(",area=")//
                .append(area)//
                .append("]");
        return builder.toString();
    }
}
