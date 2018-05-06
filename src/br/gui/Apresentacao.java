package br.gui;

import br.problema2.Cliente;
import br.problema2.ClientePessoaFisica;
import br.problema2.ClientePessoaJuridica;
import br.problema2.ContaCorrente;
import br.servicos.AnaliseDeInvestimento;
import br.servicos.AnaliseFluxoDeCaixa;
import br.servicos.BaixaDeInvestimento;
import br.servicos.Notificacao;
import br.servicos.OfertaDeFinanciamento;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 * @author Vinícius Luis da Silva
 *         Pedro Henrique de Novais
 *         Sidnei Lanser
 *         Gabriel Salvador
 */
public class Apresentacao extends javax.swing.JFrame {

    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private MaskFormatter maskCPF;
    private MaskFormatter maskCNPJ;
    
    /**
     * Creates new form Apresentacao
     */
    public Apresentacao() {
        initComponents();
        this.setResizable(false);
        cb_destinatario.setVisible(false);
        lbl_destinatario.setVisible(false);
        tf_servidorJMS.setVisible(false);
        lbl_servidorJMS.setVisible(false);
        cb_tipoNotificacao.addItem("Whatts App");
        cb_tipoNotificacao.addItem("SMS");
        this.setLocationRelativeTo(null);
        this.setTitle("Banco FastMoney");
        try {
            maskCPF = new MaskFormatter("###.###.###-##");
            maskCNPJ = new MaskFormatter("####.####.##/####");
        } catch(Exception e) {}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        tf_nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cb_codigo = new javax.swing.JComboBox<>();
        tf_servidorJMS = new javax.swing.JTextField();
        lbl_servidorJMS = new javax.swing.JLabel();
        btn_cadastrarCliente = new javax.swing.JButton();
        tf_telFixo = new javax.swing.JFormattedTextField();
        tf_telCelular = new javax.swing.JFormattedTextField();
        tf_codigo = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cb_cliente = new javax.swing.JComboBox<>();
        tf_numero = new javax.swing.JSpinner();
        lbl = new javax.swing.JLabel();
        tf_agencia = new javax.swing.JSpinner();
        lbl1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ra_notificacoes = new javax.swing.JRadioButton();
        ra_fluxo = new javax.swing.JRadioButton();
        ra_baixa = new javax.swing.JRadioButton();
        cb_tipoNotificacao = new javax.swing.JComboBox<>();
        ra_oferta = new javax.swing.JRadioButton();
        ra_investimento = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        cb_operacao = new javax.swing.JComboBox<>();
        tf_quantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_destinatario = new javax.swing.JLabel();
        cb_destinatario = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cb_clienteServico = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("Telefone Fixo");

        jLabel3.setText("Telefone Celular");

        cb_codigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CPF", "CNPJ" }));
        cb_codigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cb_codigoFocusLost(evt);
            }
        });

        lbl_servidorJMS.setText("Servidor JMS");

        btn_cadastrarCliente.setText("Cadastrar");
        btn_cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarClienteActionPerformed(evt);
            }
        });

        try {
            tf_telFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tf_telCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tf_codigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_codigoFocusGained(evt);
            }
        });
        tf_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_codigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_servidorJMS, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_codigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_servidorJMS)
                    .addComponent(tf_nome)
                    .addComponent(tf_telFixo)
                    .addComponent(tf_telCelular)
                    .addComponent(tf_codigo))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(btn_cadastrarCliente)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tf_telFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tf_telCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_servidorJMS)
                    .addComponent(tf_servidorJMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cadastrarCliente)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastrar Cliente", jPanel1);

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel5.setText("Cliente");

        cb_cliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cb_clienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cb_clienteFocusLost(evt);
            }
        });

        lbl.setText("Número");

        lbl1.setText("Agencia");

        jButton1.setText("Cadastrar Conta");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ra_notificacoes.setText("Notificações de Operações");

        ra_fluxo.setText("Análise de Fluxo de Caixa");

        ra_baixa.setText("Baixa Automática de Investimento");

        ra_oferta.setText("Oferta de Financiamento");

        ra_investimento.setText("Análise de Investimento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ra_fluxo)
                            .addComponent(ra_baixa))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_cliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_numero)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_agencia))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ra_notificacoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_tipoNotificacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(173, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ra_oferta)
                            .addComponent(ra_investimento))))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_agencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ra_notificacoes)
                    .addComponent(cb_tipoNotificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ra_fluxo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ra_baixa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ra_oferta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ra_investimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastrar Conta", jPanel2);

        cb_operacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saque", "Depósito", "Transferencia" }));
        cb_operacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cb_operacaoFocusLost(evt);
            }
        });

        jLabel6.setText("Operação");

        jLabel7.setText("Quantidade");

        lbl_destinatario.setText("Destinatário");

        jButton2.setText("Executar Operação");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Conta Corrente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(lbl_destinatario)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_quantidade)
                            .addComponent(cb_destinatario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_operacao, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_clienteServico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(159, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(167, 167, 167)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cb_clienteServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_operacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_destinatario)
                    .addComponent(cb_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Serviços", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarClienteActionPerformed
        
        try {
            Cliente c;
        
            switch ((String) cb_codigo.getSelectedItem()) {
                case "CPF":
                    c = new ClientePessoaFisica(tf_nome.getText(), tf_telCelular.getText(), tf_telFixo.getText(), tf_codigo.getText());
                    break;
                case "CNPJ":
                    c = new ClientePessoaJuridica(tf_nome.getText(), tf_telCelular.getText(), tf_telFixo.getText(), tf_codigo.getText(), tf_servidorJMS.getText());
                    break;
                default:
                    throw new IllegalArgumentException();
            }

            this.clientes.add(c);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        this.tf_telCelular.setText("");
        this.tf_telFixo.setText("");
        this.tf_nome.setText("");
        this.tf_servidorJMS.setText("");
        this.tf_codigo.setText("");
        
    }//GEN-LAST:event_btn_cadastrarClienteActionPerformed

    private void tf_codigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_codigoFocusGained
        try {
            switch ((String) cb_codigo.getSelectedItem()) {
                case "CPF":
                    maskCNPJ.uninstall();
                    maskCPF.install(tf_codigo);
                    tf_servidorJMS.setVisible(false);
                    lbl_servidorJMS.setVisible(false);
                    break;
                case "CNPJ":
                    maskCPF.uninstall();
                    maskCNPJ.install(tf_codigo);
                    tf_servidorJMS.setVisible(true);
                    lbl_servidorJMS.setVisible(true);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } catch(Exception e) {
            
        }
    }//GEN-LAST:event_tf_codigoFocusGained

    private void tf_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_codigoActionPerformed

    private void cb_codigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cb_codigoFocusLost
        
    }//GEN-LAST:event_cb_codigoFocusLost

    private void cb_operacaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cb_operacaoFocusLost
        if(cb_operacao.getSelectedItem().equals("Transferencia")) {
            cb_destinatario.setVisible(true);
            lbl_destinatario.setVisible(true);
        } else {
            cb_destinatario.setVisible(false);
            lbl_destinatario.setVisible(false);
        }
    }//GEN-LAST:event_cb_operacaoFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        try {
            ContaCorrente aux;
            if(cb_clienteServico != null) {
                switch ((String) cb_operacao.getSelectedItem()) {
                    case "Saque":
                        aux = (ContaCorrente) cb_clienteServico.getSelectedItem();
                        aux.sacar(Double.parseDouble(this.tf_quantidade.getText()));
                        break;
                    case "Depósito":
                        aux = (ContaCorrente) cb_clienteServico.getSelectedItem();
                        aux.depositar(Double.parseDouble(this.tf_quantidade.getText()));
                        break;
                    case "Transferencia":
                        aux = (ContaCorrente) cb_clienteServico.getSelectedItem();
                        aux.transferir(Double.parseDouble(this.tf_quantidade.getText()), (ContaCorrente) cb_destinatario.getSelectedItem());
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        tf_quantidade.setText("");
        cb_clienteServico.setSelectedIndex(0);
        cb_destinatario.setSelectedIndex(0);
        cb_operacao.setSelectedIndex(0);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            if(cb_cliente.getSelectedItem() == null) {
                throw new IllegalArgumentException("Nenhum Cliente Selecionado!");
            }
            ContaCorrente cc = new ContaCorrente((Integer) tf_numero.getValue(), (Integer) tf_agencia.getValue());
            Cliente aux  = (Cliente) cb_cliente.getSelectedItem();
            cc.setCliente(aux);
            if(ra_baixa.isSelected()) {
                cc.addServico(new BaixaDeInvestimento());
            }
            if(ra_fluxo.isSelected()) {
                cc.addServico(new AnaliseFluxoDeCaixa());
            }
            if(ra_notificacoes.isSelected()) {
                String tipoContato = (String) cb_tipoNotificacao.getSelectedItem();
                String contato;
                if(tipoContato.equals("Servidor JMS")) {
                    ClientePessoaJuridica c = (ClientePessoaJuridica) cc.getCliente();
                    contato = c.getServidorJMS();
                } else {
                    contato = cc.getCliente().getTelCelular();
                }
                cc.addServico(new Notificacao(tipoContato, contato));
            }
            if(ra_investimento.isSelected()) {
                cc.addServico(new AnaliseDeInvestimento());
            }
            if(ra_oferta.isSelected()) {
                cc.addServico(new OfertaDeFinanciamento());
            }
            aux.addConta(cc);
            cb_clienteServico.addItem(cc);
            cb_destinatario.addItem(cc);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        this.tf_agencia.setValue(0);
        this.tf_numero.setValue(0);
        this.ra_baixa.setSelected(false);
        this.ra_fluxo.setSelected(false);
        this.ra_investimento.setSelected(false);
        this.ra_notificacoes.setSelected(false);
        this.ra_oferta.setSelected(false);
        this.cb_cliente.setSelectedIndex(0);
        this.cb_tipoNotificacao.setSelectedIndex(0);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb_clienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cb_clienteFocusLost
        Cliente aux = (Cliente) cb_cliente.getSelectedItem();
        if(aux instanceof ClientePessoaJuridica) {
            cb_tipoNotificacao.addItem("Servidor JMS");
        } else {
            cb_tipoNotificacao.removeItem("Servidor JMS");
        }
    }//GEN-LAST:event_cb_clienteFocusLost

    private void cb_clienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cb_clienteFocusGained

        cb_cliente.removeAllItems();
        for(Cliente c: this.clientes) {
            cb_cliente.addItem(c);
        }

    }//GEN-LAST:event_cb_clienteFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apresentacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrarCliente;
    private javax.swing.JComboBox<Cliente> cb_cliente;
    private javax.swing.JComboBox<ContaCorrente> cb_clienteServico;
    private javax.swing.JComboBox<String> cb_codigo;
    private javax.swing.JComboBox<ContaCorrente> cb_destinatario;
    private javax.swing.JComboBox<String> cb_operacao;
    private javax.swing.JComboBox<String> cb_tipoNotificacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl_destinatario;
    private javax.swing.JLabel lbl_servidorJMS;
    private javax.swing.JRadioButton ra_baixa;
    private javax.swing.JRadioButton ra_fluxo;
    private javax.swing.JRadioButton ra_investimento;
    private javax.swing.JRadioButton ra_notificacoes;
    private javax.swing.JRadioButton ra_oferta;
    private javax.swing.JSpinner tf_agencia;
    private javax.swing.JFormattedTextField tf_codigo;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JSpinner tf_numero;
    private javax.swing.JTextField tf_quantidade;
    private javax.swing.JTextField tf_servidorJMS;
    private javax.swing.JFormattedTextField tf_telCelular;
    private javax.swing.JFormattedTextField tf_telFixo;
    // End of variables declaration//GEN-END:variables
}
