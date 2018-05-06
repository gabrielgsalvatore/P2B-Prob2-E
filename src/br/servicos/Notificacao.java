package br.servicos;

import br.problema2.Operacao;

/**
 * @author Vinícius Luis da Silva
 *         Pedro Henrique de Novais
 *         Sidnei Lanser
 *         Gabriel Salvador
 */
public class Notificacao extends Servico {

    private String tipoContato;
    private String contato;
    
    public Notificacao(String tipoContato, String contato) {
        this.tipoContato = tipoContato;
        this.contato = contato;
    }
    
    @Override
    public void executar(Operacao operacao) {
        System.out.println("Cliente: " + operacao.getConta().getCliente().toString() 
                            + " " + operacao.toString()
                            + " - Serviço de Notificação via "
                            + this.tipoContato
                            + " para "
                            + this.contato);
    }
    
}
