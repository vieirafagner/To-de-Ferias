/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.todeferias.Apresentação;

import br.edu.ifnmg.todeferias.Aplicacao.Conta;
import br.edu.ifnmg.todeferias.Aplicacao.ContaNovela;
import br.edu.ifnmg.todeferias.Aplicacao.Novela;
import br.edu.ifnmg.todeferias.Aplicacao.NovelaRepositorio;
import br.edu.ifnmg.todeferias.Persistencia.ContaNovelaDAO;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fagner
 */
public class TelaListarNovelas extends javax.swing.JInternalFrame {

    NovelaRepositorio dao = GerenciadorReferencias.getNovela();
    TelaCadastrarNovela editar;
    Conta usuario;
    TelaClassificacaoNovela Classificar;
    public TelaListarNovelas(Conta usuario) {
        initComponents();
        List<Novela> busca = dao.Buscar(null);
        this.usuario=usuario;
        preencheTabela(busca);
    }

    
    
     private void preencheTabela(List<Novela> lista){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nome");
        
        for(Novela n : lista){
            Vector linha = new Vector();
            linha.add(n.getId());
            linha.add(n.getNome());
            modelo.addRow(linha);
        }
        
        tblBusca.setModel(modelo);
    }
     
     public void buscar(String nome){
        Novela filtro = new Novela(0,0,0,null,nome);
        
        List<Novela> busca = dao.Buscar(filtro);
        
        preencheTabela(busca);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        txtBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBusca = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBuscaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBusca);

        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         buscar( txtBusca.getText() );
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscaMouseClicked
        int selecionada = tblBusca.getSelectedRow();
        
        int id = Integer.parseInt( tblBusca.getModel().getValueAt(selecionada, 0).toString() );
        
        if (usuario.getStatus()!= 1)
        {
         ClassificarNovela(id);
         this.dispose();
        }
        else
        {
          editarNovela(id);
          this.dispose();
        }

    }//GEN-LAST:event_tblBuscaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void editarNovela(int id){
        Novela entidade;
        
        entidade = dao.Abrir(id);
        
        editar = new TelaCadastrarNovela();
        
        editar.setEntidade(entidade);
        
        editar.setListagem(this);
        
        this.getParent().add(editar);
        editar.setVisible(true);
        this.setVisible(true);
    }
    
    public void ClassificarNovela(int id){
        ContaNovela entidade;
        
        ContaNovelaDAO daoNovela = new ContaNovelaDAO();
        
        entidade = daoNovela.Abrir(id);
        
        Classificar = new TelaClassificacaoNovela(usuario,false);
        
        Classificar.setEntidade(entidade);
        
        //Classificar.setListagem(this);
        
        this.getParent().add(Classificar);
        Classificar.setVisible(true);
        this.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBusca;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
