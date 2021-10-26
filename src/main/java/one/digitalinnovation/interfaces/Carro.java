package one.digitalinnovation.interfaces;

public interface Carro { //criei uma classe carro em formato interface
    String marca(); // em interface não precisa declarar o Public String como normalmente é
    //porque o public interface já identifica

    default void ligar(){
        System.out.println("Ligando o carro!");
    }

    Double valor();

    default String codigoRenavan(){
        return  "@#$#@1523";
    }
}
