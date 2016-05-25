/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import classes.DadoInvalidoException;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import principal.FormFluxoCaixa;
import principal.FormDentista;

/**
 *
 * @author Vanessa Macena
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbPacientes = new javax.swing.JButton();
        jbAgenda = new javax.swing.JButton();
        jbFuncionarios = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ImgPrincipal = new javax.swing.JLabel();
        btnListarDentista = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        CadastroFuncionario = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        JLogoff = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clinica Odontológia");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setAutoscrolls(true);
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 300));
        jPanel1.setLayout(null);

        jbPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone_paciente1 (1).png"))); // NOI18N
        jbPacientes.setToolTipText("Pacientes");
        jbPacientes.setName(""); // NOI18N
        jbPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPacientesActionPerformed(evt);
            }
        });
        jPanel1.add(jbPacientes);
        jbPacientes.setBounds(30, 30, 110, 110);

        jbAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/agenda.png"))); // NOI18N
        jbAgenda.setText("jButton2");
        jbAgenda.setToolTipText("Agenda");
        jbAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgendaActionPerformed(evt);
            }
        });
        jPanel1.add(jbAgenda);
        jbAgenda.setBounds(680, 30, 110, 110);

        jbFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icones_funcionarios.png"))); // NOI18N
        jbFuncionarios.setToolTipText("Funcionários");
        jbFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFuncionariosActionPerformed(evt);
            }
        });
        jPanel1.add(jbFuncionarios);
        jbFuncionarios.setBounds(190, 30, 120, 110);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fluxo-de-caixa3.png"))); // NOI18N
        jButton4.setToolTipText("Fluxo de caixa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(840, 30, 110, 110);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ImgPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/telaPrincipal_1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImgPrincipal)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImgPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 180, 1240, 560);

        btnListarDentista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DENTISTA.png"))); // NOI18N
        btnListarDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDentistaActionPerformed(evt);
            }
        });
        jPanel1.add(btnListarDentista);
        btnListarDentista.setBounds(360, 30, 110, 110);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Gerenciar Dentistas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(360, 140, 110, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Gerenciar Paciente");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 140, 110, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Gerenciar Funcionário");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 140, 130, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Agenda");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(720, 140, 60, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Controle de gastos");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(840, 140, 110, 15);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(520, 30, 110, 110);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fluxo-de-caixa3.png"))); // NOI18N
        jButton5.setToolTipText("Fluxo de caixa");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(840, 30, 110, 110);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Agendamento");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(530, 140, 90, 15);

        jMenu2.setText("Cadastro");

        jMenuItem1.setText("Pacientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        CadastroFuncionario.setText("Funcionários");
        CadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroFuncionarioActionPerformed(evt);
            }
        });
        jMenu2.add(CadastroFuncionario);

        jMenuItem3.setText("Dentistas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Financeiro");

        jMenuItem2.setText("Fluxo Caixa");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Buscar");

        jMenuItem4.setText("Paciente");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem6.setText("Funcionario");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem5.setText("Dentista");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        JLogoff.setText("Logoff");
        JLogoff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLogoffMouseClicked(evt);
            }
        });
        jMenuBar1.add(JLogoff);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPacientesActionPerformed
        try {
            principal.FormPaciente f = new principal.FormPaciente();
            f.setVisible(true);
        } catch (DadoInvalidoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbPacientesActionPerformed

    private void jbFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFuncionariosActionPerformed
        try {
            principal.FormFuncionario ff = new principal.FormFuncionario();
            ff.setVisible(true);
            ff.setLocationRelativeTo(null);
        } catch (DadoInvalidoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbFuncionariosActionPerformed

    private void jbAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgendaActionPerformed
        principal.Agenda a = new principal.Agenda();
        a.setVisible(true);
        a.setLocationRelativeTo(null);


    }//GEN-LAST:event_jbAgendaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        FormFluxoCaixa f = new FormFluxoCaixa();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void CadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroFuncionarioActionPerformed
        // TODO add your handling code here:
        principal.CadastroFuncionario f = new principal.CadastroFuncionario();
        f.setVisible(true);
    }//GEN-LAST:event_CadastroFuncionarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        principal.CadastroPaciente p = new principal.CadastroPaciente();
        p.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        principal.CadastroDentista d = new principal.CadastroDentista();
        d.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        FormFluxoCaixa f = new FormFluxoCaixa();
        f.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void JLogoffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLogoffMouseClicked
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_JLogoffMouseClicked

    private void btnListarDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDentistaActionPerformed
        try {
            FormDentista fd = new FormDentista();
            fd.setVisible(true);
        } catch (DadoInvalidoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListarDentistaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            FormPaciente fp = new FormPaciente();
            fp.setVisible(true);
        } catch (DadoInvalidoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            FormDentista fd = new FormDentista();
            fd.setVisible(true);

        } catch (DadoInvalidoException ex) {
            Logger.getLogger(Principal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {
            FormFuncionario ff = new FormFuncionario();
            ff.setVisible(true);
        } catch (DadoInvalidoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            AgendamentoGui a = new AgendamentoGui();
            a.setVisible(true);
            a.setSize(900, 700);
            a.setLocationRelativeTo(null);
        } catch (DadoInvalidoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadastroFuncionario;
    private javax.swing.JLabel ImgPrincipal;
    private javax.swing.JMenu JLogoff;
    private javax.swing.JButton btnListarDentista;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbAgenda;
    private javax.swing.JButton jbFuncionarios;
    private javax.swing.JButton jbPacientes;
    // End of variables declaration//GEN-END:variables
}
