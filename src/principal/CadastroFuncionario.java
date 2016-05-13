/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Vanessa Macena
 */
public class CadastroFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFuncionario
     */
    public CadastroFuncionario() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfCodFuncionario = new javax.swing.JTextField();
        tfCpfFuncionario = new javax.swing.JTextField();
        tfRgFuncionario = new javax.swing.JTextField();
        tfNomeFuncionario = new javax.swing.JTextField();
        tfEnderecoFuncionario = new javax.swing.JTextField();
        tfFuncaoFuncionario = new javax.swing.JTextField();
        tfDataNascimentoFuncionario = new javax.swing.JFormattedTextField();
        jbOkFuncionario = new javax.swing.JButton();
        btCancelarFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icones_funcionarios.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(26, 11, 100, 111);

        jLabel2.setText("Cadastro de funcionario");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(136, 91, 123, 14);

        jLabel3.setText("Codigo");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 140, 40, 30);

        jLabel4.setText("CPF");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 200, 30, 30);

        jLabel5.setText("RG");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 240, 30, 30);

        jLabel6.setText("Nome");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(250, 140, 50, 30);

        jLabel7.setText("Data de nascimento");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(250, 240, 110, 30);

        jLabel8.setText("Endereço");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(250, 190, 60, 30);

        jLabel9.setText("Função");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 280, 40, 30);
        jPanel1.add(tfCodFuncionario);
        tfCodFuncionario.setBounds(90, 140, 40, 30);
        jPanel1.add(tfCpfFuncionario);
        tfCpfFuncionario.setBounds(90, 196, 150, 30);
        jPanel1.add(tfRgFuncionario);
        tfRgFuncionario.setBounds(90, 240, 150, 30);
        jPanel1.add(tfNomeFuncionario);
        tfNomeFuncionario.setBounds(310, 140, 400, 30);
        jPanel1.add(tfEnderecoFuncionario);
        tfEnderecoFuncionario.setBounds(310, 190, 400, 30);
        jPanel1.add(tfFuncaoFuncionario);
        tfFuncaoFuncionario.setBounds(90, 280, 150, 30);

        try {
            tfDataNascimentoFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(tfDataNascimentoFuncionario);
        tfDataNascimentoFuncionario.setBounds(380, 240, 130, 30);

        jbOkFuncionario.setText("Ok");
        jPanel1.add(jbOkFuncionario);
        jbOkFuncionario.setBounds(220, 350, 80, 30);

        btCancelarFuncionario.setText("Cancelar");
        jPanel1.add(btCancelarFuncionario);
        btCancelarFuncionario.setBounds(340, 350, 80, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbOkFuncionario;
    private javax.swing.JTextField tfCodFuncionario;
    private javax.swing.JTextField tfCpfFuncionario;
    private javax.swing.JFormattedTextField tfDataNascimentoFuncionario;
    private javax.swing.JTextField tfEnderecoFuncionario;
    private javax.swing.JTextField tfFuncaoFuncionario;
    private javax.swing.JTextField tfNomeFuncionario;
    private javax.swing.JTextField tfRgFuncionario;
    // End of variables declaration//GEN-END:variables
}
