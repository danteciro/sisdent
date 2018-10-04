package mr_tooth.utilitarios;
import java.sql.*;
import javax.swing.*;


/**
 *
 * @author Pedro
 */
public class ConectaBanco extends Parametros {
    //Banco de dados localhost
	
    final private String driver = getProperty(Constantes.DRIVER_BASE_DATOS); // MySQL JDBC driver
    final private String url =  getProperty(Constantes.URL_BASE_DATOS);
    final private String username = getProperty(Constantes.USUARIO_BASE_DATOS);;
    final private String password = getProperty(Constantes.PASSWORD_BASE_DATOS);;

    //Banco de dados dominio pedroh.com.br
    /**
    final private String driver = "com.mysql.jdbc.Driver"; // MySQL JDBC driver
    final private String mydatabase = "pedroh03";
    final private String ip = "mysql.pedroh.com.br";
    final private String port = "3306";
    final private String url = "jdbc:mysql://" + ip + ":" + port + "/" + mydatabase;
    final private String username = "pedroh03";
    final private String password = "PedroH2009";
     */

    private Connection conn;
    public Statement stmt;
    public PreparedStatement pstmt;
    public ResultSet rs;


    public boolean OpenDB(){

        boolean result = true;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            //JOptionPane.showMessageDialog(null,"Conectou :D");
            System.out.println("Conectou :D");
        }
        catch(ClassNotFoundException Driver){
             JOptionPane.showMessageDialog(null,"Driver não localizado: "+Driver);
             result = false;
        }
        catch(SQLException Fonte){
            JOptionPane.showMessageDialog(null,"Erro na conexão: "+Fonte);
            result = false;
        }
        return result;
    }

    public void CloseDB(){

        boolean result = true;
        try{
            conn.close();
            //JOptionPane.showMessageDialog(null,"Desconectou :D");
             System.out.println("Desconectou :D");
        }
        catch(SQLException Fechar){
            JOptionPane.showMessageDialog(null,"Não foi possivél fechar a conexão: "+Fechar);
            result = false;
        }
    }

    public void QuerySQL(String sql){
        try{           
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs   = stmt.executeQuery(sql);
        }
        catch(SQLException erroSQL){
             JOptionPane.showMessageDialog(null,"O comando SQL não funcionou: "+erroSQL+",  SQL passado: "+sql);
        }
    }
}