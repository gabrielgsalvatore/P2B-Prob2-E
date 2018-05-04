/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.servicos;

import br.problema2.ContaCorrente;
import br.problema2.Operacao;

/**
 *
 * @author 104884
 */
public class BaixaDeInvestimento extends Servico {

    public BaixaDeInvestimento(ContaCorrente conta) {
        super(conta);
    }

    @Override
    public void executar(Operacao operacao) {
        System.out.println(operacao.toString());
    }
    
}
