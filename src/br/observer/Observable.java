package br.observer;

import br.problema2.Operacao;
import br.servicos.Servico;

/**
 * @author Vinícius Luis da Silva
 *         Pedro Henrique de Novais
 *         Sidnei Lanser
 *         Gabriel Salvador
 */
public interface Observable {
    
    public void addServico(Servico servico);
    public void removeServico(Servico servico);
    public void executarServicos(Operacao operacao);
    
}
