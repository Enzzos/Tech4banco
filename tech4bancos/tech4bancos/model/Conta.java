package model;

import javax.swing.border.EmptyBorder;

public class Conta {
    private String titular;
    private int numeroConta;
    private Double saldo;

    public Conta(String titular, int numeroConta, Double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(Double deposito){
        saldo += deposito;
    }

    public void sacar(Double saque){
        saldo -= saque;
    }

    public void transferir(String nome, Double transferencia){
        if(transferencia > saldo) {
            System.out.println("Saldo insuficiente!");
        }
        else{
            saldo -= transferencia;
            System.out.printf("Foi transferido R$%.2f para a conta de %s", transferencia, nome);
        }
    }


    //encapsulamento
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void limpa(){
        
    }
}
