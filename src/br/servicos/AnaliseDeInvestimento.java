package br.servicos;

import br.problema2.Operacao;
import br.problema2.TipoOperacao;

/**
 * @author Vinícius Luis da Silva
 *         Pedro Henrique de Novais
 *         Sidnei Lanser
 *         Gabriel Salvador
 */
public class AnaliseDeInvestimento extends Servico {

    @Override
    public void executar(Operacao operacao) {
        if(operacao.getTipo() == TipoOperacao.ENTRADA) {
            System.out.println("Cliente: " + operacao.getConta().getCliente().toString() 
                                + " " + operacao.toString()
                                + " - Serviço de Análise de Investimento.");
        }
    }
    
}
