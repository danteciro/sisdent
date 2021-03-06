package mr_tooth.cadastro;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import mr_tooth.utilitarios.ConectaBanco;
/**
 *
 * @author Pedro
 */
public class CadastroConvenio extends javax.swing.JFrame {
    ConectaBanco con_convenio;
    /** Creates new form CadastroUsuario */
    public CadastroConvenio() {
        initComponents();
        con_convenio = new ConectaBanco();
        con_convenio.OpenDB();
        con_convenio.QuerySQL("SELECT * FROM convenios");

        try{
            con_convenio.rs.first();
            txtCodigo.setText(con_convenio.rs.getString("cod_convenio"));
            txtNome.setText(con_convenio.rs.getString("nome_con"));
            txtCnpj.setText(con_convenio.rs.getString("cnpj_con"));
            txtEndereco.setText(con_convenio.rs.getString("endereco_con"));
            txtNumero.setText(con_convenio.rs.getString("numero_con"));
            txtCidade.setText(con_convenio.rs.getString("cidade_con"));
            txtEstado.setText(con_convenio.rs.getString("estado_con"));
            txtTelefone.setText(con_convenio.rs.getString("telefone_con"));
            txtEmail.setText(con_convenio.rs.getString("email_con"));
        }
        catch(SQLException erroSQL){
             JOptionPane.showMessageDialog(null,"Nenhum convenio cadastrado","Convenios", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void AtualizaRs(){
        try{
            con_convenio.rs = con_convenio.stmt.executeQuery("SELECT * FROM convenios");
            con_convenio.rs.first();
            txtCodigo.setText(con_convenio.rs.getString("cod_convenio"));
            txtNome.setText(con_convenio.rs.getString("nome_con"));
            txtCnpj.setText(con_convenio.rs.getString("cnpj_con"));
            txtEndereco.setText(con_convenio.rs.getString("endereco_con"));
            txtNumero.setText(con_convenio.rs.getString("numero_con"));
            txtCidade.setText(con_convenio.rs.getString("cidade_con"));
            txtEstado.setText(con_convenio.rs.getString("estado_con"));
            txtTelefone.setText(con_convenio.rs.getString("telefone_con"));
            txtEmail.setText(con_convenio.rs.getString("email_con"));
        }
        catch(SQLException erroSQL){
             JOptionPane.showMessageDialog(null,"Não foi possível atualizar os registros", "Erro!", JOptionPane.ERROR_MESSAGE);
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

        lblNome = new javax.swing.JLabel();
        lblCnpj = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnProximo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        lblPesquisa = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblNumero = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Convenios");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("usuarios"); // NOI18N
        setResizable(false);

        lblNome.setText("*Nome: ");

        lblCnpj.setText("*CNPJ:");

        lblEndereco.setText("Endereço:");

        lblCidade.setText("Cidade:");

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_tooth/icones/Hospital 2 Check.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblCodigo.setText("Código:");

        txtCodigo.setEditable(false);

        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_tooth/icones/Proximo_16x16.png"))); // NOI18N
        btnProximo.setText("Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_tooth/icones/Anterior_16x16.png"))); // NOI18N
        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_tooth/icones/Hospital 2 Add.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_tooth/icones/Hospital 2 Rating.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_tooth/icones/Hospital 2 Delete.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_tooth/icones/Ultimo_16x16.png"))); // NOI18N
        btnUltimo.setText("Último");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_tooth/icones/Primeiro_16x16.png"))); // NOI18N
        btnPrimeiro.setText("Primeiro");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        lblPesquisa.setText("Pesquisa :");

        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_tooth/icones/Hospital 2 Search.png"))); // NOI18N
        btnPesquisa.setText("Pesquisar");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        lblNumero.setText("Nº:");

        lblEstado.setText("Estado:");

        lblTelefone.setText("*Telefone:");

        lblEmail.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(btnProximo, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblCnpj)
                            .addComponent(lblEndereco)
                            .addComponent(lblCidade)
                            .addComponent(lblCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEstado)
                                    .addComponent(lblNumero))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                            .addComponent(txtCnpj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblPesquisa)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefone)
                            .addComponent(lblEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisa)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCnpj)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(lblNumero)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(lblEstado)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnProximo, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCidade, txtCnpj, txtCodigo, txtEmail, txtEndereco, txtNome, txtTelefone});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEstado, txtNumero});

        getAccessibleContext().setAccessibleName("usuarios");

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-628)/2, (screenSize.height-555)/2, 628, 555);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try{
            String nome  = txtNome.getText();
            String cnpj  = txtCnpj.getText();
            String end   = txtEndereco.getText();
            String num   = txtNumero.getText();
            String cid   = txtCidade.getText();
            String est   = txtEstado.getText();
            String tel   = txtTelefone.getText();
            String email = txtEmail.getText();

            //Verifica no banco de dados se já existe algum convenio cadastrando com esse CNPJ
            String ConvenioCNPJ = "SELECT * FROM convenios WHERE cnpj_con = '"+cnpj+"'";
            con_convenio.QuerySQL(ConvenioCNPJ);

            if(nome.length() < 3){
                JOptionPane.showMessageDialog(null,"Por favor, digite o nome do convenio!","Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else if(cnpj.equals("")){
                JOptionPane.showMessageDialog(null,"Por favor, digite o CNPJ do convenio!","Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else if(con_convenio.rs.next()){
                JOptionPane.showMessageDialog(null,"Já existe um convenio cadastrado com este CNPJ!","Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else if(tel.equals("")){
                JOptionPane.showMessageDialog(null,"Por favor, digite um telefone para contato","Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else if(tel.length() < 14){
                JOptionPane.showMessageDialog(null,"Por favor, digite o telefone coretamente! \n Ex: (11) 2910-8055","Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else{
                //Inseri os dados no banco
                String ConvenioInsert = "INSERT INTO convenios () VALUES (NULL,'"+nome+"','"+cnpj+"','"+end+"','"+num+"','"+cid+"','"+est+"','"+tel+"','"+email+"')";
                con_convenio.stmt.execute(ConvenioInsert);
                JOptionPane.showMessageDialog(null,"Convenio cadastrado com sucesso!","Cadastrado!", JOptionPane.INFORMATION_MESSAGE);
                //Atualiza ResultSet
                AtualizaRs();
            }
        }
        catch(SQLException erroSQL){
             JOptionPane.showMessageDialog(null,"Não foi possível cadastrar o convenio!", "Erro!", JOptionPane.ERROR_MESSAGE);
             //Atualiza ResultSet
             AtualizaRs();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        try{
            con_convenio.rs.next();
            txtCodigo.setText(con_convenio.rs.getString("cod_convenio"));
            txtNome.setText(con_convenio.rs.getString("nome_con"));
            txtCnpj.setText(con_convenio.rs.getString("cnpj_con"));
            txtEndereco.setText(con_convenio.rs.getString("endereco_con"));
            txtNumero.setText(con_convenio.rs.getString("numero_con"));
            txtCidade.setText(con_convenio.rs.getString("cidade_con"));
            txtEstado.setText(con_convenio.rs.getString("estado_con"));
            txtTelefone.setText(con_convenio.rs.getString("telefone_con"));
            txtEmail.setText(con_convenio.rs.getString("email_con"));
        }
        catch(SQLException erroSQL){
             JOptionPane.showMessageDialog(null,"Ops! este é o último registro!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        try{
            con_convenio.rs.previous();
            txtCodigo.setText(con_convenio.rs.getString("cod_convenio"));
            txtNome.setText(con_convenio.rs.getString("nome_con"));
            txtCnpj.setText(con_convenio.rs.getString("cnpj_con"));
            txtEndereco.setText(con_convenio.rs.getString("endereco_con"));
            txtNumero.setText(con_convenio.rs.getString("numero_con"));
            txtCidade.setText(con_convenio.rs.getString("cidade_con"));
            txtEstado.setText(con_convenio.rs.getString("estado_con"));
            txtTelefone.setText(con_convenio.rs.getString("telefone_con"));
            txtEmail.setText(con_convenio.rs.getString("email_con"));
        }
        catch(SQLException erroSQL){
             JOptionPane.showMessageDialog(null,"Ops! este é o primeiro registro!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
            txtCodigo.setText("");
            txtNome.setText("");
            txtCnpj.setText("");
            txtEndereco.setText("");
            txtNumero.setText("");
            txtCidade.setText("");
            txtEstado.setText("");
            txtTelefone.setText("");
            txtEmail.setText("");
            txtNome.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try{
            String cod   = txtCodigo.getText();
            String nome  = txtNome.getText();
            String cnpj  = txtCnpj.getText();
            String end   = txtEndereco.getText();
            String num   = txtNumero.getText();
            String cid   = txtCidade.getText();
            String est   = txtEstado.getText();
            String tel   = txtTelefone.getText();
            String email = txtEmail.getText();

            //Verifica no banco de dados se já existe algum usuário usando o login desejado
            //String UsuarioLogin = "SELECT * FROM usuarios WHERE login_us = '"+usuario+"'";
            //con_usuario.QuerySQL(UsuarioLogin);

            if(nome.length() < 3){
                JOptionPane.showMessageDialog(null,"Por favor, digite o nome do convenio!","Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else if(cnpj.equals("")){
                JOptionPane.showMessageDialog(null,"Por favor, digite o CNPJ do convenio!","Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else if(tel.equals("")){
                JOptionPane.showMessageDialog(null,"Por favor, digite um telefone para contato","Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else if(tel.length() < 14){
                JOptionPane.showMessageDialog(null,"Por favor, digite o telefone coretamente! \n Ex: (11) 2910-8055","Atenção", JOptionPane.WARNING_MESSAGE);
            }
            else{
                //Atualiza os dados no banco
                String ConvenioUpdate = "UPDATE convenios SET nome_con = '"+nome+"', cnpj_con = '"+cnpj+"', endereco_con = '"+end+"', numero_con = '"+num+"', cidade_con = '"+cid+"', " +
                                        "estado_con = '"+est+"', telefone_con = '"+tel+"', email_con = '"+email+"' WHERE cod_convenio = "+cod;
                con_convenio.stmt.executeUpdate(ConvenioUpdate);
                JOptionPane.showMessageDialog(null,"Convenio atualizado com sucesso!","Atualização!", JOptionPane.INFORMATION_MESSAGE);
                //Atualiza ResultSet
                AtualizaRs();
            }
        }
        catch(SQLException erroSQL){
             JOptionPane.showMessageDialog(null,"Não foi possível atualizar os dados do convenio!", "Erro!", JOptionPane.ERROR_MESSAGE);
             //Atualiza ResultSet
             AtualizaRs();
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String CodigoConvenio = txtCodigo.getText();
        try{
            //Busca no banco de dados o código do usuário selecionado para ser excluido
            String ConvenioSelecionado = "SELECT * FROM convenios WHERE cod_convenio = '"+CodigoConvenio+"'";
            con_convenio.QuerySQL(ConvenioSelecionado);
            con_convenio.rs.next();

            //Mensagem de confirmação
            String MsgConfirmacao = "Deseja realmente excluir o convenio: "+con_convenio.rs.getString("nome_con")+" ?";
            int OpcaoEscolhida = JOptionPane.showConfirmDialog(null, MsgConfirmacao, "Excluir", JOptionPane.YES_NO_OPTION);

            if(OpcaoEscolhida == JOptionPane.YES_OPTION){
                //Excluindo o convenio após a confirmação positiva
                String ExcluirConvenio = "DELETE FROM convenios WHERE cod_convenio = '"+CodigoConvenio+"'";
                int ExcluirSucesso  = con_convenio.stmt.executeUpdate(ExcluirConvenio);

                if(ExcluirSucesso == 1){
                    JOptionPane.showMessageDialog(null,"Convenio excluido com sucesso!","Excluir!", JOptionPane.INFORMATION_MESSAGE);
                    //Atualiza ResultSet
                    AtualizaRs();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Não foi possível excluir o convenio!", "Erro!", JOptionPane.ERROR_MESSAGE);
                    //Atualiza ResultSet
                    AtualizaRs();
                }
            }
            else{
                //Atualiza ResultSet
                AtualizaRs();
                return;
            }
        }
        catch(Exception erroSQL){
             JOptionPane.showMessageDialog(null,"Erro ao excluir", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        try{
            con_convenio.rs.last();
            txtCodigo.setText(con_convenio.rs.getString("cod_convenio"));
            txtNome.setText(con_convenio.rs.getString("nome_con"));
            txtCnpj.setText(con_convenio.rs.getString("cnpj_con"));
            txtEndereco.setText(con_convenio.rs.getString("endereco_con"));
            txtNumero.setText(con_convenio.rs.getString("numero_con"));
            txtCidade.setText(con_convenio.rs.getString("cidade_con"));
            txtEstado.setText(con_convenio.rs.getString("estado_con"));
            txtTelefone.setText(con_convenio.rs.getString("telefone_con"));
            txtEmail.setText(con_convenio.rs.getString("email_con"));
        }
        catch(SQLException erroSQL){
             JOptionPane.showMessageDialog(null,"Ops! este é o último registro!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        try{
            con_convenio.rs.first();
            txtCodigo.setText(con_convenio.rs.getString("cod_convenio"));
            txtNome.setText(con_convenio.rs.getString("nome_con"));
            txtCnpj.setText(con_convenio.rs.getString("cnpj_con"));
            txtEndereco.setText(con_convenio.rs.getString("endereco_con"));
            txtNumero.setText(con_convenio.rs.getString("numero_con"));
            txtCidade.setText(con_convenio.rs.getString("cidade_con"));
            txtEstado.setText(con_convenio.rs.getString("estado_con"));
            txtTelefone.setText(con_convenio.rs.getString("telefone_con"));
            txtEmail.setText(con_convenio.rs.getString("email_con"));
        }
        catch(SQLException erroSQL){
             JOptionPane.showMessageDialog(null,"Ops! este é o primeiro registro!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        //con_usuario.CloseDB();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        try{
            con_convenio.rs.first();
            String Igual = "nao";
            int TamanhoPesquisa = txtPesquisa.getText().length();

            while(Igual == "nao"){
                String Pesquisado = con_convenio.rs.getString("nome_con").substring(0,(TamanhoPesquisa));
                if(Pesquisado.equals(txtPesquisa.getText())){
                    Igual = "sim";
                }
                else{
                    con_convenio.rs.next();
                }
            }
            //Mostra os dados pesquisados
            txtCodigo.setText(con_convenio.rs.getString("cod_convenio"));
            txtNome.setText(con_convenio.rs.getString("nome_con"));
            txtCnpj.setText(con_convenio.rs.getString("cnpj_con"));
            txtEndereco.setText(con_convenio.rs.getString("endereco_con"));
            txtNumero.setText(con_convenio.rs.getString("numero_con"));
            txtCidade.setText(con_convenio.rs.getString("cidade_con"));
            txtEstado.setText(con_convenio.rs.getString("estado_con"));
            txtTelefone.setText(con_convenio.rs.getString("telefone_con"));
            txtEmail.setText(con_convenio.rs.getString("email_con"));
        }
        catch(Exception erroPesquisa){
            JOptionPane.showMessageDialog(null,"Não foi possivel localizar este convenio", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroConvenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    
}

