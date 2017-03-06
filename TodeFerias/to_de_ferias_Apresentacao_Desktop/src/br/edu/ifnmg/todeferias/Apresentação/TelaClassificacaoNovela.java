/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Apresentação;

import br.edu.ifnmg.todeferias.Aplicacao.Conta;
import br.edu.ifnmg.todeferias.Aplicacao.ContaNovela;
import br.edu.ifnmg.todeferias.Aplicacao.NovelaRepositorio;
import br.edu.ifnmg.todeferias.Persistencia.ContaNovelaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author cleiton rodrigues
 */
public class TelaClassificacaoNovela extends javax.swing.JInternalFrame {
    
    ContaNovela entidade = new ContaNovela();
    NovelaRepositorio dao;
    TelaListarNovelas listagem;
    Conta usuario;
    private boolean editar;
    public TelaClassificacaoNovela(Conta usuario, boolean editar) {
        initComponents();
        
        this.usuario=usuario;
        this.editar = editar;
        preencheCampos();
    /**
     * Creates new form TelaClassificacaoNovela
     */
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDiretor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bxClassificacao = new javax.swing.JComboBox<>();
        btnClassificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblNumCapitulo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("Nome:");

        lblNome.setText("Nome");

        jLabel2.setText("Diretor");

        lblDiretor.setText("Diretor");

        jLabel3.setText("N° de Capitulos");

        jLabel4.setText("Classificação");

        bxClassificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        bxClassificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxClassificacaoActionPerformed(evt);
            }
        });

        btnClassificar.setText("Classificar");
        btnClassificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassificarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblNumCapitulo.setText("N de Capitulo");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Tela de Classificação de Novelas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bxClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNumCapitulo)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(lblDiretor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btnClassificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel5)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblDiretor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblNumCapitulo))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bxClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClassificar)
                    .addComponent(btnCancelar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClassificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassificarActionPerformed
        ContaNovela contaNovela = new ContaNovela(usuario);
        ContaNovelaDAO dao = new ContaNovelaDAO();
    
        entidade.setClassificacao(bxClassificacao.getSelectedIndex()+1);
         entidade.setConta(usuario);
            
            
        if(editar){
            
            //contaFilme.setId(entidade.getId());
            //usuario.addFilme(contaFilme.getFilme());// teste
            dao.Salvar(entidade);
            JOptionPane.showMessageDialog(this, "Classificação alterada com Sucesso !");
        
            this.dispose();
        
        }else{
           usuario.addNovelas(contaNovela.getNovela());
            dao.Salvar(entidade);
        
            JOptionPane.showMessageDialog(this, "Classificado Com Sucesso !");
        
            this.dispose();
        }
            
            
           
    }//GEN-LAST:event_btnClassificarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void bxClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxClassificacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bxClassificacaoActionPerformed
    
    
    private void preencheCampos(){
 
        lblNome.setText( entidade.getNovela().getNome() );
        lblDiretor.setText(entidade.getNovela().getDiretor());
        lblNumCapitulo.setText( Integer.toString(entidade.getNovela().getQtdCap()));
        bxClassificacao.setSelectedIndex(entidade.getClassificacao()-1);
         
    }
    
    public ContaNovela getEntidade() {
        return entidade;
    }
    public void setEntidade(ContaNovela entidade) {
        this.entidade = entidade;
        preencheCampos();
    }
    
    public TelaListarNovelas getListagem() {
        return listagem;
    }

    public void setListagem(TelaListarNovelas listagem) {
        this.listagem = listagem;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnClassificar;
    private javax.swing.JComboBox<String> bxClassificacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblDiretor;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumCapitulo;
    // End of variables declaration//GEN-END:variables
}
