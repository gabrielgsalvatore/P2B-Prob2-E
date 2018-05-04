package br.servicos;

import br.problema2.ContaCorrente;
import br.problema2.Operacao;

/**
 *
 * @author 104884
 */
public abstract class Servico {

    protected ContaCorrente conta;
    protected Operacao operacao;
    
    public Servico(ContaCorrente conta) {
        this.conta = conta;
    }
    
    public abstract void executar(Operacao operacao);
    
}
