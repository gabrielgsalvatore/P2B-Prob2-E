package br.problema2;


import br.observer.Observable;
import br.servicos.Servico;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * Esta classe oferece as funcionalidades básicas para atender ao Problema 2.
 */

/**
 *
 * @author marcel
 */
public class ContaCorrente implements Observable {
    private int numero;
    private int agencia;
    private Cliente cliente;
    private double saldo = 0;
    private List<Operacao> operacoes = new ArrayList();
    private List<Servico> servicos = new ArrayList<Servico>();

    public ContaCorrente(int numero, int agencia) {
        this.setNumero(numero);
        this.setAgencia(agencia);
    }

    @Override
    public void addServico(Servico novo) {
        this.servicos.add(novo);
    }
    
    @Override
    public void removeServico(Servico servico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void executarServicos(Operacao operacao) {
        for(Servico servico: this.servicos) {
            servico.executar(operacao);
        }
    }
    
    public String getChave(){
        return String.valueOf(agencia)+"-"+String.valueOf(numero);
    }
    
    public void sacar(double valor){
        if (valor > this.getSaldo()){
            throw new IllegalArgumentException("Saldo insuficiente para o saque");
        }
        Operacao oper = new Operacao(valor,this.getSaldo(),TipoOperacao.SAIDA,new Date(),this);
        operacoes.add(oper);
        this.saldo -= valor;
        this.executarServicos(oper);
    }
    
    public void depositar(double valor){
        Operacao oper = new Operacao(valor,this.getSaldo(),TipoOperacao.ENTRADA,new Date(),this);
        operacoes.add(oper);
        this.saldo += valor;
        this.executarServicos(oper);
    }    
    
    public void transferir(double valor, ContaCorrente destino){
        if (valor > this.getSaldo()){
            throw new IllegalArgumentException("Saldo insuficiente para transferência");
        }        
        destino.receberTransferencia(valor, this);
        Operacao oper = new OperacaoTransferencia(valor,this.getSaldo(),TipoOperacao.SAIDA,new Date(),this,destino);
        operacoes.add(oper);
        this.saldo -= valor;
        this.executarServicos(oper);
    }   
    
    private void receberTransferencia(double valor, ContaCorrente origem){    
        Operacao oper = new OperacaoTransferencia(valor,this.getSaldo(),TipoOperacao.ENTRADA,new Date(),this,origem);
        operacoes.add(oper);
        this.saldo += valor;        
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    @Override
    public String toString(){
        return this.getChave();
    }
    
}
