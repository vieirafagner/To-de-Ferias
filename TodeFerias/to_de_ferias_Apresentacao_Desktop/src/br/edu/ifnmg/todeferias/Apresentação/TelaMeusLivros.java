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
import br.edu.ifnmg.todeferias.Persistencia.LivroDAO;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cleiton rodrigues
 */
public class TelaMeusLivros extends javax.swing.JInternalFrame {

   TelaClassificacaoLivro Classificar;
    LivroRepositorio dao = GerenciadorReferencias.getLivro();
    private Conta usuario;
    List<ContaLivro>lista;
    public TelaMeusLivros(Conta usuario) {
        initComponents();
        
        this.usuario = usuario;
        ContaLivroDAO  dao = new ContaLivroDAO();
        ContaLivro contaLivro = new ContaLivro(usuario);
        
         this.lista = dao.Buscar(contaLivro);
        LivroDAO daoLivro = new LivroDAO();
        //setar todos os filmes
        
        for(ContaLivro f :lista){
            //contaFilme.setFilme();   
            
            daoLivro.Abrir(f.getId()); // pega o filme
        }
        
        preencheTabela(lista);
    
    }
    private void preencheTabela(List<ContaLivro> lista){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Titulo");
        modelo.addColumn("classificacao");
        
        for(ContaLivro ct : lista){
            Vector linha = new Vector();
            linha.add(ct.getId());
            linha.add(ct.getLivro().getTitulo());
            linha.add(ct.getClassificacao());
            modelo.addRow(linha);
        }
        
        tblBusca.setModel(modelo);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBusca = new javax.swing.JTable();

        btnBuscar.setText("Buscar");

        tblBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Classificação"
            }
        ));
        tblBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBuscaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBusca);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBusca)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscaMouseClicked
        int selecionada = tblBusca.getSelectedRow();
        
        int id = Integer.parseInt( tblBusca.getModel().getValueAt(selecionada, 0).toString());
         if(usuario.getStatus()!=1){
            ClassificarLivro(id);
            this.dispose();
        }
    }//GEN-LAST:event_tblBuscaMouseClicked
    public void ClassificarLivro(int id){
        
        ContaLivro entidade;
        
        ContaLivroDAO daoContaLivro = new ContaLivroDAO();
        
        
        
        entidade = daoContaLivro.Abrir(id);
        
        
        Classificar = new TelaClassificacaoLivro(usuario,true);
        
        entidade.getLivro().setClassificacao(entidade.getClassificacao());
        Classificar.setEntidade(entidade);
        
        
        
        this.getParent().add(Classificar);
        Classificar.setVisible(true);
        this.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBusca;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}

