/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter_presence;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leonardo
 */
public class Marcar_Presença2 extends javax.swing.JFrame {
       ArrayList <TURMA> ListaDep;
       String modo; 
     public void LoadTableDep (){
        
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nº aluno","Nome","Disciplina","Faltas"},0);
           
            for (int i = 0 ; i < ListaDep.size();i++){
               modelo.addRow(new Object[]{ListaDep.get(i).getCodigo(),ListaDep.get(i).getNome(),ListaDep.get(i).getDisciplina(),ListaDep.get(i).getFaltas()}) ;
             }
        
        tabela_EISC.setModel(modelo);
            tabela_EISC.getColumnModel().getColumn(0).setPreferredWidth(200);
            tabela_EISC.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabela_EISC.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabela_EISC.getColumnModel().getColumn(3).setPreferredWidth(100);
     }
     
    public Marcar_Presença2() {
        initComponents();
        setLocationRelativeTo(null);
        ListaDep = new ArrayList();
        modo = "Navegar";
        ManipulaInterface();
    }
    
    public void ManipulaInterface(){
      switch(modo){
          case "Navegar":
            turma_Salvar.setEnabled(false);
            turma_cancelar.setEnabled(false);
            turma_Naluno.setEnabled(false);
            turma_nome.setEnabled(false);
            turma_disciplina.setEnabled(false);
            turma_Novo.setEnabled(true);
            Editar.setEnabled(false);
            turma_Excluir.setEnabled(false);
            turma_MarcaFalta.setEnabled(false);
            turma_faltas.setEnabled(false);
            break;
              
          case "Novo":
            turma_Salvar.setEnabled(true);
            turma_cancelar.setEnabled(true);
            turma_Naluno.setEnabled(true);
            turma_nome.setEnabled(true);
            turma_disciplina.setEnabled(true);
            turma_Novo.setEnabled(false);
            Editar.setEnabled(false);
            turma_Excluir.setEnabled(false);
            turma_MarcaFalta.setEnabled(false);
            turma_faltas.setEnabled(false);
              break;
              
          case "Editar":
            turma_Salvar.setEnabled(true);
            turma_cancelar.setEnabled(true);
            turma_Naluno.setEnabled(true);
            turma_nome.setEnabled(true);
            turma_disciplina.setEnabled(true);
            turma_Novo.setEnabled(true);
            Editar.setEnabled(false);
            turma_Excluir.setEnabled(false);
            turma_MarcaFalta.setEnabled(false);
            turma_faltas.setEnabled(false); 
             
                 break;
              
          case "Excluir":
            turma_Salvar.setEnabled(false);
            turma_cancelar.setEnabled(false);
            turma_Naluno.setEnabled(false);
            turma_nome.setEnabled(false);
            turma_disciplina.setEnabled(false);
            turma_Novo.setEnabled(true);
            Editar.setEnabled(false);
            turma_Excluir.setEnabled(false);
            turma_MarcaFalta.setEnabled(false);
            turma_faltas.setEnabled(false);
                
                   break;
                
          case "Selecao":
            turma_Salvar.setEnabled(false);
            turma_cancelar.setEnabled(false);
            turma_Naluno.setEnabled(false);
            turma_nome.setEnabled(false);
            turma_disciplina.setEnabled(false);
            turma_Novo.setEnabled(true);
            Editar.setEnabled(true);
            turma_Excluir.setEnabled(true);
            turma_MarcaFalta.setEnabled(true);
            turma_faltas.setEnabled(false);      
                   break;
                
          case "Faltas":
            turma_Salvar.setEnabled(false);
            turma_cancelar.setEnabled(false);
            turma_Naluno.setEnabled(false);
            turma_nome.setEnabled(false);
            turma_disciplina.setEnabled(false);
            turma_Novo.setEnabled(false);
            Editar.setEnabled(false);
            turma_Excluir.setEnabled(false);
            turma_MarcaFalta.setEnabled(true);
            turma_faltas.setEnabled(false);          
                    break;
                
          default : System.out.println("Modo inválido");    
      }
      
             }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_EISC = new javax.swing.JTable();
        CriarTurma = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        turma_nome = new javax.swing.JTextField();
        turma_disciplina = new javax.swing.JTextField();
        turma_Naluno = new javax.swing.JTextField();
        turma_Salvar = new javax.swing.JButton();
        turma_cancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        turma_faltas = new javax.swing.JTextField();
        turma_Novo = new javax.swing.JButton();
        turma_Excluir = new javax.swing.JButton();
        turma_MarcaFalta = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabela_EISC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nº aluno", "Nome", "Disciplina", "Faltas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_EISC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_EISCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_EISC);
        if (tabela_EISC.getColumnModel().getColumnCount() > 0) {
            tabela_EISC.getColumnModel().getColumn(0).setPreferredWidth(80);
            tabela_EISC.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabela_EISC.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabela_EISC.getColumnModel().getColumn(3).setPreferredWidth(80);
        }

        CriarTurma.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Criar Turma", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setText("Nome:");

        jLabel2.setText("Nº aluno:");

        jLabel3.setText("Disciplina:");

        turma_Salvar.setText("Salvar");
        turma_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turma_SalvarActionPerformed(evt);
            }
        });

        turma_cancelar.setText("Cancelar");
        turma_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turma_cancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("Faltas:");

        turma_faltas.setText("0");
        turma_faltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turma_faltasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CriarTurmaLayout = new javax.swing.GroupLayout(CriarTurma);
        CriarTurma.setLayout(CriarTurmaLayout);
        CriarTurmaLayout.setHorizontalGroup(
            CriarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CriarTurmaLayout.createSequentialGroup()
                .addGroup(CriarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CriarTurmaLayout.createSequentialGroup()
                        .addGroup(CriarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CriarTurmaLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(CriarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CriarTurmaLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(8, 8, 8))))
                            .addGroup(CriarTurmaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(CriarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))))
                        .addGap(10, 10, 10)
                        .addGroup(CriarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(turma_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(turma_disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(turma_Naluno, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(turma_faltas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CriarTurmaLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(turma_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(turma_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        CriarTurmaLayout.setVerticalGroup(
            CriarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CriarTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CriarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(turma_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CriarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turma_Naluno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CriarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turma_disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CriarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turma_faltas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(CriarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turma_Salvar)
                    .addComponent(turma_cancelar))
                .addGap(23, 23, 23))
        );

        turma_Novo.setText("Novo");
        turma_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turma_NovoActionPerformed(evt);
            }
        });

        turma_Excluir.setText("Excluir");
        turma_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turma_ExcluirActionPerformed(evt);
            }
        });

        turma_MarcaFalta.setText("Marcar Faltas");
        turma_MarcaFalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turma_MarcaFaltaActionPerformed(evt);
            }
        });

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(turma_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(turma_MarcaFalta, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(turma_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addComponent(CriarTurma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turma_MarcaFalta)
                    .addComponent(turma_Novo)
                    .addComponent(turma_Excluir)
                    .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CriarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DIREITO", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        modo = "Editar";
        ManipulaInterface();
    }//GEN-LAST:event_EditarActionPerformed

    private void turma_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turma_ExcluirActionPerformed
        int index = tabela_EISC.getSelectedRow();
        if (index >= 0 && index < ListaDep.size()){
            ListaDep.remove(index);
        }
        LoadTableDep();
        modo = "Navegar";
        ManipulaInterface();
    }//GEN-LAST:event_turma_ExcluirActionPerformed

    private void turma_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turma_NovoActionPerformed
        turma_Naluno.setText("");
        turma_nome.setText("");
        turma_disciplina.setText("");
        turma_faltas.setText("0");
        modo = "Novo";
        ManipulaInterface();

    }//GEN-LAST:event_turma_NovoActionPerformed

    private void turma_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turma_cancelarActionPerformed
        turma_Naluno.setText("");
        turma_nome.setText("");
        turma_disciplina.setText("");
        turma_faltas.setText("");
        modo = "Navegar";
        ManipulaInterface();

    }//GEN-LAST:event_turma_cancelarActionPerformed
    private void turma_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turma_SalvarActionPerformed
        int cod  = Integer.parseInt(turma_Naluno.getText());
        int fal  = Integer.parseInt(turma_faltas.getText());
        if (modo.equals("Novo")){
            TURMA T = new TURMA(cod, turma_nome.getText(),turma_disciplina.getText(),fal);
            ListaDep.add(T);
        }else if (modo.equals("Editar") || modo.equals("Faltas")){
            int index = tabela_EISC.getSelectedRow();
            ListaDep.get(index).setCodigo(cod);
            ListaDep.get(index).setNome(turma_nome.getText());
            ListaDep.get(index).setDisciplina(turma_disciplina.getText());
            ListaDep.get(index).setFaltas(fal);  
        }
        LoadTableDep();
        modo = "Navegar";
        ManipulaInterface();
        turma_Naluno.setText("");
        turma_nome.setText("");
        turma_disciplina.setText("");
        turma_faltas.setText("");
    }//GEN-LAST:event_turma_SalvarActionPerformed

    private void tabela_EISCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_EISCMouseClicked
        int index = tabela_EISC.getSelectedRow();
        if (index >= 0 && index < ListaDep.size()){
            TURMA T = ListaDep.get(index);
            turma_nome.setText(T.getNome());
            turma_Naluno.setText(String.valueOf(T.getCodigo()));
            turma_disciplina.setText(T.getDisciplina());
            turma_faltas.setText(String.valueOf(T.getFaltas()));
            modo = "Selecao";
            ManipulaInterface();
        }
    }//GEN-LAST:event_tabela_EISCMouseClicked

    private void turma_MarcaFaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turma_MarcaFaltaActionPerformed
        int fal  = Integer.parseInt(turma_faltas.getText());
        modo = "Faltas";
        int index = tabela_EISC.getSelectedRow();
        ListaDep.get(index).setFaltas(++fal);
        ManipulaInterface();
       
       LoadTableDep();
      // modo = "Navegar";
       //ManipulaInterface();
    }//GEN-LAST:event_turma_MarcaFaltaActionPerformed

    private void turma_faltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turma_faltasActionPerformed
  
    }//GEN-LAST:event_turma_faltasActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Marcar_Presença2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Marcar_Presença2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Marcar_Presença2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Marcar_Presença2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Marcar_Presença2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CriarTurma;
    private javax.swing.JButton Editar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabela_EISC;
    private javax.swing.JButton turma_Excluir;
    private javax.swing.JButton turma_MarcaFalta;
    private javax.swing.JTextField turma_Naluno;
    private javax.swing.JButton turma_Novo;
    private javax.swing.JButton turma_Salvar;
    private javax.swing.JButton turma_cancelar;
    private javax.swing.JTextField turma_disciplina;
    private javax.swing.JTextField turma_faltas;
    private javax.swing.JTextField turma_nome;
    // End of variables declaration//GEN-END:variables
}
