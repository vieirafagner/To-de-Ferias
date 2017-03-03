/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Apresentação;

import br.edu.ifnmg.todeferias.Aplicacao.Anime;
import br.edu.ifnmg.todeferias.Aplicacao.AnimeRepositorio;
import br.edu.ifnmg.todeferias.Aplicacao.Conta;
import br.edu.ifnmg.todeferias.Aplicacao.ContaAnime;
import br.edu.ifnmg.todeferias.Persistencia.ContaAnimeDAO;
import javax.swing.JOptionPane;
/**
 *
 * @author fagner
 */
public class TelaClassificacaoAnime extends javax.swing.JInternalFrame {

     ContaAnime entidade = new ContaAnime();
    AnimeRepositorio dao;
    TelaListarAnimes listagem;
    private Conta usuario;
    private boolean editar;
    public TelaClassificacaoAnime(Conta usuario,boolean editar) {
        initComponents();
        
        this.usuario = usuario;
        this.editar=editar;
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
        lblnome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDuracao = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblQtd_temp = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblSinopse = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bxClassificacao = new javax.swing.JComboBox<>();
        btnClassificar = new javax.swing.JButton();
        brnCancelar = new javax.swing.JButton();

        jLabel1.setText("Nome");

        lblnome.setText("Nome");

        jLabel2.setText("Duração do Episódio");

        lblDuracao.setText("Duracao");

        jLabel4.setText("Quantidade de Temporadas");

        lblQtd_temp.setText("qtd_Temp");

        jLabel6.setText("Sinopse");

        lblSinopse.setText("Sinopse");

        jLabel8.setText("Classificação");

        bxClassificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        btnClassificar.setText("Classificar");
        btnClassificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassificarActionPerformed(evt);
            }
        });

        brnCancelar.setText("Cancelar");
        brnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblnome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSinopse))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bxClassificacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClassificar)
                                .addGap(18, 18, 18)
                                .addComponent(brnCancelar))
                            .addComponent(lblQtd_temp))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblnome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblDuracao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblQtd_temp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblSinopse))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(bxClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClassificar)
                    .addComponent(brnCancelar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClassificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassificarActionPerformed
        ContaAnime contaAnime = new ContaAnime(usuario);
            ContaAnimeDAO dao = new ContaAnimeDAO();
            //contaFilme.setClassificacao(bxClassificacao.getSelectedIndex()+1);
            entidade.setClassificacao(bxClassificacao.getSelectedIndex()+1);
            entidade.setConta(usuario);
            
            
        if(editar){
            
            
            dao.Salvar(entidade);
            JOptionPane.showMessageDialog(this, "Classificação alterada com Sucesso !");
        
            this.dispose();
        
        }else{
           usuario.addAnime(contaAnime.getAnime());// teste
    
            
        
            //System.out.println(bxClassificacao.getSelectedIndex()+1);
        
            dao.Salvar(entidade);
        
            JOptionPane.showMessageDialog(this, "Classificado Com Sucesso !");
        
            this.dispose();
            
            
        }
    }//GEN-LAST:event_btnClassificarActionPerformed

    private void brnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnCancelarActionPerformed
       this.dispose();
    }//GEN-LAST:event_brnCancelarActionPerformed

    private void preencheCampos(){
 
        lblnome.setText( entidade.getAnime().getNome() );
        lblDuracao.setText( Integer.toString(entidade.getAnime().getDuracao_ep()));
        lblQtd_temp.setText( Integer.toString(entidade.getAnime().getQtd_temp()));
        lblSinopse.setText(entidade.getAnime().getSinopse());
        bxClassificacao.setSelectedIndex(entidade.getClassificacao()-1);
               
         
    }
    public ContaAnime getEntidade() {
        return entidade;
    }
    public void setEntidade(ContaAnime entidade) {
        this.entidade = entidade;
        preencheCampos();
    }
    
    public TelaListarAnimes getListagem() {
        return listagem;
    }

    public void setListagem(TelaListarAnimes listagem) {
        this.listagem = listagem;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnCancelar;
    private javax.swing.JButton btnClassificar;
    private javax.swing.JComboBox<String> bxClassificacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblDuracao;
    private javax.swing.JLabel lblQtd_temp;
    private javax.swing.JLabel lblSinopse;
    private javax.swing.JLabel lblnome;
    // End of variables declaration//GEN-END:variables
}
