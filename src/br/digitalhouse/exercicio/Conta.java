package br.digitalhouse.exercicio;

public class Conta {
    private int numeroConta;
    private float saldoConta;
    private String titular;

    //Construção especifico
    public Conta (float novoSaldoConta){
        saldoConta = novoSaldoConta;
    }
    //Get
    public int getNumeroConta (){
        return numeroConta;
    }

    //Set
    public void Conta (int NovoNumeroConta){
        numeroConta = NovoNumeroConta;
    }

    public void deposito(Float quantiaDinheiroDeposito){


    }
    public void saque(float quantiaDinheiroSaque){
        System.out.println("");
    }
}
