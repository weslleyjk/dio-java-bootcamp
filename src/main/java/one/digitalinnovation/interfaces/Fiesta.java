package one.digitalinnovation.interfaces;

public class Fiesta implements Carro, Veiculo{

    @Override
    public String marca(){
        return "Ford";
    }
    @Override
    public String registro(){
        return "12345678TRGD20";
    }
    @Override
    public void ligar() {
        Carro.super.ligar();
        Veiculo.super.ligar();
    }
    @Override
    public Double valor(){
        return null;
    }
}
