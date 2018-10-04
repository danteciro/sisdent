package mr_tooth.financeiro;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import mr_tooth.utilitarios.CalendarComboBox;
import mr_tooth.utilitarios.ConectaBanco;

/**
 *
 * @author pedroh
 */
public class CadastraCheque extends javax.swing.JFrame {
    ConectaBanco con_cheq;
    /** Creates new form CadastraCheque */
    public CadastraCheque() {
        initComponents();
        //Inicia a classe ConectaBanco
        con_cheq = new ConectaBanco();
        con_cheq.OpenDB();

        //Carrega os dados do banco nos Combox
        this.CarregarCbPaciente();
    }

    public void CarregarCbPaciente(){
        //Adiciona os pacientes cadastrados no cbPaciente
        con_cheq.QuerySQL("SELECT cod_paciente,nome_pac FROM pacientes");
        try{
            while(con_cheq.rs.next()){
                cbPaciente.addItem(con_cheq.rs.getString("nome_pac"));
            }
        }
        catch(Exception erroPaciente){
            JOptionPane.showMessageDialog(null,"Erro ao carregar os pacientes cadastrados !", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblPaciente = new javax.swing.JLabel();
        cbPaciente = new javax.swing.JComboBox();
        lblTitular = new javax.swing.JLabel();
        txtTitular = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblBanco = new javax.swing.JLabel();
        txtBanco = new javax.swing.JTextField();
        lblAgencia = new javax.swing.JLabel();
        txtAgencia = new javax.swing.JTextField();
        lblDtCompensacao = new javax.swing.JLabel();
        cbData = new CalendarComboBox(true);
        txtCodigo = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblConta = new javax.swing.JLabel();
        txtConta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastramento de Cheque");

        lblCodigo.setText("Código :");

        lblPaciente.setText("Nome do Paciente :");

        cbPaciente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o paciente" }));
        cbPaciente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbPacienteFocusLost(evt);
            }
        });

        lblTitular.setText("Nome do Titular :");

        lblValor.setText("Valor :");

        lblBanco.setText("Banco :");

        lblAgencia.setText("Agência :");

        lblDtCompensacao.setFont(new java.awt.Font("Segoe UI", 0, 12));
        lblDtCompensacao.setText("Data Compensação :");

        cbData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbDataFocusLost(evt);
            }
        });

        txtCodigo.setEditable(false);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_tooth/icones/Medical Invoice Flat Check.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_tooth/icones/Medical Invoice Flat Stop.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblConta.setText("Conta :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addGap(90, 90, 90)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPaciente)
                                    .addComponent(lblTitular)
                                    .addComponent(lblValor)
                                    .addComponent(lblAgencia))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbPaciente, 0, 484, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblBanco)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtBanco, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                                    .addComponent(txtTitular, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cbData, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtAgencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(lblConta)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtConta, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))
                    .addComponent(lblDtCompensacao)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(lblPaciente)
                    .addComponent(cbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitular)
                    .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBanco)
                    .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgencia)
                    .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConta)
                    .addComponent(txtConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDtCompensacao)
                    .addComponent(cbData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-651)/2, (screenSize.height-445)/2, 651, 445);
    }// </editor-fold>//GEN-END:initComponents

    private void cbPacienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbPacienteFocusLost

}//GEN-LAST:event_cbPacienteFocusLost

    private void cbDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbDataFocusLost

}//GEN-LAST:event_cbDataFocusLost

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try{
            String nome_titular = txtTitular.getText();
            String valor = txtValor.getText();
            String banco = txtBanco.getText();
            String agencia = txtAgencia.getText();
            String conta = txtConta.getText();

            if(nome_titular.equals("")){
                JOptionPane.showMessageDialog(null,"Por favor, digite o nome do titular do cheque!","Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else if(valor.equals("")){
                JOptionPane.showMessageDialog(null,"Por favor, digite o valor do cheque!","Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else if(banco.equals("")){
                JOptionPane.showMessageDialog(null,"Por favor, digite o nome banco!","Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else if(agencia.equals("")){
                JOptionPane.showMessageDialog(null,"Por favor, digite o número da agência!","Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else if(conta.equals("")){
                JOptionPane.showMessageDialog(null,"Por favor, digite o número da conta!","Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else{
                //Inseri os dados no banco
                String ChequeInsert = "INSERT INTO cheques () VALUES (NULL,'"+cbPaciente.getSelectedItem()+"','"+nome_titular+"','"+valor+"','"+banco+"','"+agencia+"','"+conta+"','"+((CalendarComboBox) cbData).getText()+"',NULL)";
                con_cheq.stmt.execute(ChequeInsert);
                JOptionPane.showMessageDialog(null,"Cheque cadastrado com sucesso!","Cadastrado!", JOptionPane.INFORMATION_MESSAGE);
            }
            con_cheq.CloseDB();
        }
        catch(Exception erroSQL){
             JOptionPane.showMessageDialog(null,"Não foi possível cadastrar o cheque!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraCheque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbData;
    private javax.swing.JComboBox cbPaciente;
    private javax.swing.JLabel lblAgencia;
    private javax.swing.JLabel lblBanco;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblConta;
    private javax.swing.JLabel lblDtCompensacao;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblTitular;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtConta;
    private javax.swing.JTextField txtTitular;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

}
