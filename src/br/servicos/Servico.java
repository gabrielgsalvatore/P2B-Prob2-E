package br.servicos;

import br.observer.Observer;
import br.problema2.Operacao;

/**
 * @author Vinícius Luis da Silva
 *         Pedro Henrique de Novais
 *         Sidnei Lanser
 *         Gabriel Salvador
 */
public abstract class Servico implements Observer {

    public abstract void executar(Operacao operacao);
    
}
