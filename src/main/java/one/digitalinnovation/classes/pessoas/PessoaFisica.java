package one.digitalinnovation.classes.pessoas;

public class PessoaFisica extends Pessoa { // estou herdando mas estou no mesmo pacote por isso pega
    public PessoaFisica(final Integer idade, final Float peso){
        super(idade, peso);
    }
}
