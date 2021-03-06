/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Apresentação;

import br.edu.ifnmg.todeferias.Aplicacao.Conta;
import br.edu.ifnmg.todeferias.Aplicacao.ContaLivro;
import br.edu.ifnmg.todeferias.Aplicacao.LivroRepositorio;
import br.edu.ifnmg.todeferias.Persistencia.ContaLivroDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author cleiton rodrigues
 */
public class TelaClassificacaoLivro extends javax.swing.JInternalFrame {
     ContaLivro entidade = new ContaLivro();
    LivroRepositorio dao;
    TelaListarLivros listagem;
     Conta usuario;
     private boolean editar;
    public TelaClassificacaoLivro(Conta usuario, boolean editar) {//editar se for verdadeiro chama o UPDATE caso falso so lista e classifica pela primeira vez
        initComponents();
        this.usuario = usuario;
        this.editar = editar;
        
        
        preencheCampos();
    /**
     * Creates new form TelaClassificacaoLivro
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
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNumPagina = new javax.swing.JLabel();
        bxClassificacao = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnClassificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblResumo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtComentario = new javax.swing.JTextField();

        jLabel1.setText("Título");

        lblTitulo.setText("Titulo");

        jLabel2.setText("Autor");

        lblAutor.setText("Autor");

        jLabel3.setText("N° de Páginas");

        lblNumPagina.setText("NdePagina");

        bxClassificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        bxClassificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxClassificacaoActionPerformed(evt);
            }
        });

        jLabel4.setText("Classificação");

        btnClassificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/todeferias/imagens/star.png"))); // NOI18N
        btnClassificar.setText("Classificar");
        btnClassificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassificarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/todeferias/imagens/iconClose.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Resumo");

        lblResumo.setText("Resumo");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Tela de Classificação de Livros");

        jLabel7.setText("Adicionar comentário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bxClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 253, Short.MAX_VALUE))
                            .addComponent(lblResumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumPagina)
                            .addComponent(lblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClassificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtComentario)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTitulo))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblAutor))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblNumPagina))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblResumo))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bxClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClassificar)
                    .addComponent(btnCancelar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bxClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxClassificacaoActionPerformed
       
    }//GEN-LAST:event_bxClassificacaoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnClassificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassificarActionPerformed
        ContaLivro contaLivro = new ContaLivro(usuario);
            ContaLivroDAO dao = new ContaLivroDAO();
            //contaFilme.setClassificacao(bxClassificacao.getSelectedIndex()+1);
            entidade.setClassificacao(bxClassificacao.getSelectedIndex()+1);
            entidade.setComentario(txtComentario.getText());
            entidade.setConta(usuario);
            
            
        if(editar){
            
            //contaFilme.setId(entidade.getId());
            //usuario.addFilme(contaFilme.getFilme());// teste
            dao.Salvar(entidade);
            JOptionPane.showMessageDialog(this, "Classificação alterada com Sucesso !");
        
            this.dispose();
        
        }else{
           usuario.addLivros(contaLivro.getLivro());// teste
    
            
        
            //System.out.println(bxClassificacao.getSelectedIndex()+1);
        
            dao.Salvar(entidade);
        
            JOptionPane.showMessageDialog(this, "Classificado Com Sucesso !");
        
            this.dispose();
        }    
    }//GEN-LAST:event_btnClassificarActionPerformed
    
    private void preencheCampos(){
 
        lblTitulo.setText(entidade.getLivro().getTitulo());
        lblAutor.setText(entidade.getLivro().getAutor());
        lblNumPagina.setText( Integer.toString(entidade.getLivro().getQtd_pag()));
        lblResumo.setText(entidade.getLivro().getResumo()); 
        bxClassificacao.setSelectedIndex(entidade.getClassificacao()-1);
        txtComentario.setText(entidade.getComentario());
    }
    
     public ContaLivro getEntidade() {
        return entidade;
     }
     
    public void setEntidade(ContaLivro entidade) {
        this.entidade = entidade;
        preencheCampos();
    }
    
    public TelaListarLivros getListagem() {
        return listagem;
    }

    public void setListagem(TelaListarLivros listagem) {
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblNumPagina;
    private javax.swing.JLabel lblResumo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtComentario;
    // End of variables declaration//GEN-END:variables
  }
