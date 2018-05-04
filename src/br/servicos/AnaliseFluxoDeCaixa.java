package br.servicos;

import br.problema2.ContaCorrente;
import br.problema2.Operacao;

/**
 *
 * @author 104884
 */
public class AnaliseFluxoDeCaixa extends Servico {

    public AnaliseFluxoDeCaixa(ContaCorrente conta) {
        super(conta);
    }

    @Override
    public void executar(Operacao operacao) {
        System.out.println(operacao.toString());
    }
    
}
