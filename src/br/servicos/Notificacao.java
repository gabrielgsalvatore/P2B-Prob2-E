package br.servicos;

import br.problema2.ClientePessoaJuridica;
import br.problema2.ContaCorrente;
import br.problema2.Operacao;
import br.util.TipoNotificacao;

/**
 *
 * @author 104884
 */
public class Notificacao extends Servico {

    private String tipo;
    
    public Notificacao(ContaCorrente conta, String tipo) {
        super(conta);
        this.tipo = tipo;
    }
    
    @Override
    public void executar(Operacao operacao) {
        
        System.out.println(operacao.toString());
        if(this.tipo.equals("Servidor JMS")) {
            ClientePessoaJuridica aux = (ClientePessoaJuridica) super.conta.getCliente();
            System.out.println(aux.getServidorJMS());
        }
    }
    
}
