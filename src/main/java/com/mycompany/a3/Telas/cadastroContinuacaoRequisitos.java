package com.mycompany.a3.Telas;

import com.mycompany.a3.Main.Requisito;
import com.mycompany.a3.Main.Servidor;

public class cadastroContinuacaoRequisitos extends javax.swing.JFrame {
    
    int IDProjeto = 0;
    
    int PaginaPresente = 0;
    
    Requisito[] Requisitos = null;
    
    String Operacao;
    
    boolean Permissao;
    
    /**
     * Creates new form cadastroContinuacaoRequisitos
     */
    public cadastroContinuacaoRequisitos(int idProjeto, boolean permissao) {
        initComponents();
        
        IDProjeto = idProjeto;
        
        Permissao = permissao;
        
        Requisitos = Servidor.GetRequisitos(idProjeto);
        
        if (Requisitos == null)
        {
            this.dispose();
            return;
        }
        MudarPagina(0);
        
        var ccr = this;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ccr.setVisible(true);
            }
        });
    }

    private void MudarPagina (int pagina)
    {
        ResetarUI();
        
        PaginaPresente = pagina;
        
        Requisito reqAtual = Requisitos[pagina];
        
        ContadorPagina.setText(Integer.toString(pagina) + "/" + Integer.toString(Requisitos.length));
        
        Nome.setText(reqAtual.Nome);
        EsforcoHoras.setText(reqAtual.EstimativaEsforcoHoras);
        Modulo.setText(reqAtual.Modulo);
        Funcionalidade.setText(reqAtual.Funcionalidades);
        UltAlt.setText("Em " + reqAtual.DataUltModificacao + " por " + reqAtual.AutorUltModificacao + ".");
        Criacao.setText("Em " + reqAtual.Data_criacao + " por " + reqAtual.Autor + ".");
        Versao.setText(reqAtual.Versao);
        Complexidade.setText(reqAtual.Complexidade);
        Prioridade.setText(reqAtual.Prioridade);
        Estado.setText(reqAtual.Estado);
        Fase.setText(reqAtual.Fase);
        Descricao.setText(reqAtual.Descricao);
    }
    
    private void ResetarUI ()
    {
        Criacao.setVisible(true);
        UltAlt.setVisible(true);
        TextoCriacao.setVisible(true);
        TextoUltAlt.setVisible(true);
        Anterior.setVisible(true);
        Proximo.setVisible(true);
        NovoRequisito.setVisible(true);
        ContadorPagina.setVisible(true);
        Salvar.setVisible(false);
        Cancelar.setVisible(false);
        Deletar.setVisible(Permissao);
        
        
        Nome.setEditable(false);
        EsforcoHoras.setEditable(false);
        Modulo.setEditable(false);
        Funcionalidade.setEditable(false);
        Criacao.setEditable(false);
        Versao.setEditable(false);
        Complexidade.setEditable(false);
        Prioridade.setEditable(false);
        Estado.setEditable(false);
        Fase.setEditable(false);
        Descricao.setEditable(false);
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEsforcoEstimado = new javax.swing.JLabel();
        EsforcoHoras = new javax.swing.JTextField();
        labelModulo = new javax.swing.JLabel();
        Modulo = new javax.swing.JTextField();
        labelFuncionalidade = new javax.swing.JLabel();
        Funcionalidade = new javax.swing.JTextField();
        TextoUltAlt = new javax.swing.JLabel();
        UltAlt = new javax.swing.JFormattedTextField();
        TextoCriacao = new javax.swing.JLabel();
        labelVersao = new javax.swing.JLabel();
        Versao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Complexidade = new javax.swing.JTextField();
        Salvar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Anterior = new javax.swing.JButton();
        Proximo = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        NovoRequisito = new javax.swing.JButton();
        Criacao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Prioridade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Estado = new javax.swing.JTextField();
        TextoFase = new javax.swing.JLabel();
        Fase = new javax.swing.JTextField();
        TextoDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descricao = new javax.swing.JTextPane();
        ContadorPagina = new javax.swing.JLabel();
        Deletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelEsforcoEstimado.setText("Esforço Estimado em Horas");

        EsforcoHoras.setEditable(false);

        labelModulo.setText("Módulo");

        Modulo.setEditable(false);

        labelFuncionalidade.setText("Funcionalidade");

        Funcionalidade.setEditable(false);

        TextoUltAlt.setText("Última alteração");

        UltAlt.setEditable(false);

        TextoCriacao.setText("Criação");

        labelVersao.setText("Versão");

        Versao.setEditable(false);

        jLabel1.setText("Complexidade");

        Complexidade.setEditable(false);

        Salvar.setText("Salvar");
        Salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalvarMouseClicked(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Anterior.setText("Anterior");
        Anterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnteriorMouseClicked(evt);
            }
        });

        Proximo.setText("Proximo");
        Proximo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProximoMouseClicked(evt);
            }
        });

        Editar.setText("Editar");
        Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditarMouseClicked(evt);
            }
        });

        NovoRequisito.setText("Novo requisito");
        NovoRequisito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NovoRequisitoMouseClicked(evt);
            }
        });

        Criacao.setEditable(false);

        jLabel2.setText("Nome");

        Nome.setEditable(false);

        jLabel3.setText("Prioridade");

        Prioridade.setEditable(false);

        jLabel4.setText("Estado");

        Estado.setEditable(false);

        TextoFase.setText("Fase");

        Fase.setEditable(false);

        TextoDescricao.setText("Descrição");

        jScrollPane1.setViewportView(Descricao);

        ContadorPagina.setText("1/10");

        Deletar.setText("Deletar");
        Deletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeletarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Anterior)
                    .addComponent(Salvar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(Editar)
                        .addGap(75, 75, 75)
                        .addComponent(Proximo))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(NovoRequisito)
                                .addGap(53, 53, 53)
                                .addComponent(Cancelar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ContadorPagina)
                                .addGap(100, 100, 100)
                                .addComponent(Deletar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Nome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Complexidade, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelVersao)
                        .addGap(18, 18, 18)
                        .addComponent(Versao, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextoCriacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Criacao))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextoUltAlt)
                        .addGap(18, 18, 18)
                        .addComponent(UltAlt))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelFuncionalidade)
                        .addGap(18, 18, 18)
                        .addComponent(Funcionalidade))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelEsforcoEstimado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EsforcoHoras))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelModulo)
                        .addGap(18, 18, 18)
                        .addComponent(Modulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Prioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextoFase)
                        .addGap(18, 18, 18)
                        .addComponent(Fase))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextoDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEsforcoEstimado)
                    .addComponent(EsforcoHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModulo)
                    .addComponent(Modulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFuncionalidade)
                    .addComponent(Funcionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoUltAlt)
                    .addComponent(UltAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoCriacao)
                    .addComponent(Criacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVersao)
                    .addComponent(Versao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Complexidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Prioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoFase)
                    .addComponent(Fase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoDescricao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(ContadorPagina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Deletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Anterior)
                    .addComponent(Proximo)
                    .addComponent(Editar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salvar)
                    .addComponent(Cancelar)
                    .addComponent(NovoRequisito))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        MudarPagina(PaginaPresente);
    }//GEN-LAST:event_CancelarActionPerformed

    private void ProximoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProximoMouseClicked
        if (PaginaPresente + 1 < Requisitos.length) MudarPagina(PaginaPresente + 1);
    }//GEN-LAST:event_ProximoMouseClicked

    private void AnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnteriorMouseClicked
        if (PaginaPresente - 1 >= 0)MudarPagina(PaginaPresente - 1);
    }//GEN-LAST:event_AnteriorMouseClicked

    private void EditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarMouseClicked
        Operacao = "EDIT";
        
        Anterior.setVisible(false);
        Proximo.setVisible(false);
        NovoRequisito.setVisible(false);
        Editar.setVisible(false);
        Salvar.setVisible(true);
        Cancelar.setVisible(true);
        
        Nome.setEditable(true);
        EsforcoHoras.setEditable(true);
        Modulo.setEditable(true);
        Funcionalidade.setEditable(true);
        Criacao.setEditable(true);
        Versao.setEditable(true);
        Complexidade.setEditable(true);
        Prioridade.setEditable(true);
        Estado.setEditable(true);
        Fase.setEditable(true);
        Descricao.setEditable(true);
    }//GEN-LAST:event_EditarMouseClicked

    private void SalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalvarMouseClicked
        if (Operacao == "EDIT")
        {
            Servidor.EditarRequisito(Requisitos[PaginaPresente].ID, Nome.getText(),
                Modulo.getText(), Funcionalidade.getText(), Versao.getText(),
                Prioridade.getText(), Complexidade.getText(), EsforcoHoras.getText(),
                Estado.getText(), Fase.getText(), Descricao.getText());
        
            new cadastroContinuacaoRequisitos(IDProjeto, Permissao);
            this.dispose();
        }
        else if (Operacao == "CRIAR")
        {
            Servidor.CriarRequisito(Nome.getText(), Modulo.getText(),
                    Funcionalidade.getText(), Versao.getText(),
                    Prioridade.getText(), Complexidade.getText(),
                    EsforcoHoras.getText(), Estado.getText(), Fase.getText(),
                    Descricao.getText());
            
            new cadastroContinuacaoRequisitos(IDProjeto, Permissao);
            this.dispose();
        }
    }//GEN-LAST:event_SalvarMouseClicked

    private void NovoRequisitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NovoRequisitoMouseClicked
        Operacao = "CRIAR";
        
        Anterior.setVisible(false);
        Proximo.setVisible(false);
        NovoRequisito.setVisible(false);
        Editar.setVisible(false);
        ContadorPagina.setVisible(false);
        Salvar.setVisible(true);
        Cancelar.setVisible(true);
        
        Nome.setEditable(true);
        EsforcoHoras.setEditable(true);
        Modulo.setEditable(true);
        Funcionalidade.setEditable(true);
        Criacao.setEditable(true);
        Versao.setEditable(true);
        Complexidade.setEditable(true);
        Prioridade.setEditable(true);
        Estado.setEditable(true);
        Fase.setEditable(true);
        Descricao.setEditable(true);
        
        Nome.setText("");
        EsforcoHoras.setText("");
        Modulo.setText("");
        Funcionalidade.setText("");
        Criacao.setText("");
        Versao.setText("");
        Complexidade.setText("");
        Prioridade.setText("");
        Estado.setText("");
        Fase.setText("");
        Descricao.setText("");
        UltAlt.setText("");
        Criacao.setText("");
    }//GEN-LAST:event_NovoRequisitoMouseClicked

    private void DeletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletarMouseClicked
        Servidor.RemoverRequisito(Requisitos[PaginaPresente].ID);
        
        new cadastroContinuacaoRequisitos(IDProjeto, Permissao);
        this.dispose();
    }//GEN-LAST:event_DeletarMouseClicked

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
            java.util.logging.Logger.getLogger(cadastroContinuacaoRequisitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroContinuacaoRequisitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroContinuacaoRequisitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroContinuacaoRequisitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Complexidade;
    private javax.swing.JLabel ContadorPagina;
    private javax.swing.JTextField Criacao;
    private javax.swing.JButton Deletar;
    private javax.swing.JTextPane Descricao;
    private javax.swing.JButton Editar;
    private javax.swing.JTextField EsforcoHoras;
    private javax.swing.JTextField Estado;
    private javax.swing.JTextField Fase;
    private javax.swing.JTextField Funcionalidade;
    private javax.swing.JTextField Modulo;
    private javax.swing.JTextField Nome;
    private javax.swing.JButton NovoRequisito;
    private javax.swing.JTextField Prioridade;
    private javax.swing.JButton Proximo;
    private javax.swing.JButton Salvar;
    private javax.swing.JLabel TextoCriacao;
    private javax.swing.JLabel TextoDescricao;
    private javax.swing.JLabel TextoFase;
    private javax.swing.JLabel TextoUltAlt;
    private javax.swing.JFormattedTextField UltAlt;
    private javax.swing.JTextField Versao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEsforcoEstimado;
    private javax.swing.JLabel labelFuncionalidade;
    private javax.swing.JLabel labelModulo;
    private javax.swing.JLabel labelVersao;
    // End of variables declaration//GEN-END:variables
}
