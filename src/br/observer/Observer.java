package br.observer;

import br.problema2.Operacao;

/**
 * @author Vinícius Luis da Silva
 *         Pedro Henrique de Novais
 *         Sidnei Lanser
 *         Gabriel Salvador
 */
public interface Observer {

    public void executar(Operacao operacao);
    
}
