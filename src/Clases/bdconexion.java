
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class bdconexion {
    static Connection conn = null;
    static Statement st= null;
    static ResultSet rs =null;
    
    
    static String bd="clinica_dental_2020";
    static String user="root";
    static String pass="";
    static String url="jdbc:mysql://localhost:3306/"+bd;
    
    Connection conexion = null;
    
    public bdconexion() {
        try {
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection(url,user,pass);

                if (conexion!=null){
                    
                    System.out.println("Conexion exitosa");
                }

        } catch (SQLException e) {
      
                JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
         catch (ClassNotFoundException e) {
     
                JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public Connection getConnection(){
           return conexion;
        }
        public void desconectar() throws SQLException{        
        conexion.close();
        }
    
}
