package br.servicos;

import br.problema2.Operacao;

/**
 * @author Vinícius Luis da Silva
 *         Pedro Henrique de Novais
 *         Sidnei Lanser
 *         Gabriel Salvador
 */
public class AnaliseFluxoDeCaixa extends Servico {

    @Override
    public void executar(Operacao operacao) {
        System.out.println("Cliente: " + operacao.getConta().getCliente().toString() 
                            + " " + operacao.toString()
                            + " - Serviço de Análise de Fluxo de Caixa.");
    }
    
}
