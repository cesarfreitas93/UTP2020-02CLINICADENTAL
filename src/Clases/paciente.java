
package Clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class paciente {
    bdconexion con;// inicializa la variable conexion
    
    //Constructor de la clase paciente
    public paciente()
    {
        con = new bdconexion(); //instancia la clase bdconexion
    }
    
     //constructor explicito para agregar un nuevo registro a la base de datos
    
      public void nuevoPaciente(String idPaciente, String DNI, String nombres, String apellidos, String direccion, String ubigeo, String telefono1, String telefono2, String edad)
    {
        try
        {
            PreparedStatement pstm=(PreparedStatement)
            con.getConnection().prepareStatement("insert into " + " paciente(idPaciente, dui, nombres, apellidos, direccion, ubigeo, telefono1, telefono2, edad)" + "values (?,?,?,?,?,?,?,?,?)");
            
            pstm.setString(1, idPaciente);
            pstm.setString(2, DNI);
            pstm.setString(3, nombres);
            pstm.setString(4, apellidos);
            pstm.setString(5, direccion);
            pstm.setString(6, ubigeo);
            pstm.setString(7, telefono1);
            pstm.setString(8, telefono2);
            pstm.setString(9, edad);            
            
            pstm.execute();
            pstm.close();
        }
        catch(SQLException e)
        {
            System.out.print(e);
        }
    }
      
      //Codigo para obtener los datos de la tabla
      
      public Object[][]getDatos()
    {
        int registros=0;
        //obtener la cantidad de registros que hay en la tabla pacientes
        try
        {
            PreparedStatement pstm=(PreparedStatement)
            con.getConnection().prepareStatement("SELECT count(1) as total FROM paciente");//cuenta el total de registros de la tabla pacientes
            ResultSet res=pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }
        catch(SQLException e)
        {
         System.out.println(e);   
        }
        
        Object[][] data=new String [registros][9];
        
        //realizamos la consulta sql y llenamos los datos del Object
        
        try
        {
            PreparedStatement pstm=(PreparedStatement)
            con.getConnection().prepareStatement("SELECT * FROM paciente ORDER BY IdPaciente");
            ResultSet res=pstm.executeQuery();
            
            int i=0;
            
            while (res.next())
            {
                String estIdPaciente = res.getString("IdPaciente");
                String estDNI = res.getString("DNI");
                String estNombres = res.getString("nombres");
                String estApellidos = res.getString("apellidos");
                String estDireccion = res.getString("direccion");
                String estUbig = res.getString("ubigeo");
               
                String estTelefono1 = res.getString("telefono1");
                String estTelefono2 = res.getString("telefono2");
                String estFechaNac = res.getString("edad");                               
                
                data [i][0]=estIdPaciente;
                data [i][1]=estDNI;
                data [i][2]=estNombres;
                data [i][3]=estApellidos;
                data [i][4]=estDireccion;
                data [i][5]=estUbig;
               
                data [i][6]=estTelefono1;
                data [i][7]=estTelefono2;
                data [i][8]=estFechaNac;
                                             
                i++;//retorna el ciclo hasta finalizar
                
            }
            
            res.close();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return data;
    }
      
      
      
      
          public Object[][]getDatos2Pacientes()
    {
        int registros=0;
        //obtener la cantidad de registros que hay en la tabla pacientes
        try
        {
            PreparedStatement pstm=(PreparedStatement)
            con.getConnection().prepareStatement("SELECT count(1) as total FROM paciente");//cuenta el total de registros de la tabla pacientes
            ResultSet res=pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }
        catch(SQLException e)
        {
         System.out.println(e);   
        }
        
        Object[][] data=new String [registros][3];
        
        //realizamos la consulta sql y llenamos los datos del Object
        
        try
        {
            PreparedStatement pstm=(PreparedStatement)
            con.getConnection().prepareStatement("SELECT IdPaciente, nombres, apellidos FROM paciente ORDER BY IdPaciente");
            ResultSet res=pstm.executeQuery();
            
            int i=0;
            
            while (res.next())
            {
                String estIdPaciente = res.getString("IdPaciente");                
                String estNombres = res.getString("nombres")+" "+res.getString("apellidos");
                                              
                
                data [i][0]=estIdPaciente;                
                data [i][1]=estNombres;
  
                i++;//retorna el ciclo hasta finalizar
                
            }
            
            res.close();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return data;
    }
          
          //METODO QUE PERMITE ELIMINAR UN REGISTRO DE LA TABLA PACIENTE
    public void eliminarPaciente(String codigo)
    {
        try
        {
            int rows_update=0;
            PreparedStatement pstm=con.conexion.prepareStatement("DELETE paciente.* FROM paciente WHERE IdPaciente='"+codigo+"'");
            rows_update=pstm.executeUpdate();
            
            if (rows_update==1)
            {
                JOptionPane.showMessageDialog(null,"Registro eliminado exitosamente");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"No se pudo eliminar el registro, verifique datos");
                con.desconectar();
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error "+e.getMessage());            
        }
    } 
    
     //METODO PARA ACTUALIZAR/MODIFICAR REGISTROS DE LA TABLA PACIENTE
    public void modificarPaciente(String idpac, String dni, String nom, String ape, String dir, String ubig, String tel1, String tel2, String edad)
    {
        try
        {
            PreparedStatement pstm=(PreparedStatement)
            con.getConnection().prepareStatement("UPDATE paciente SET DNI='"+dni+"' , nombres='"+nom+"', apellidos='"+ape+"', direccion='"+dir+"', ubigeo='"+ubig+"', telefono1='"+tel1+"', telefono2='"+tel2+"', edad='"+edad+"' WHERE IdPaciente='"+idpac+"'");
            pstm.executeUpdate();
            pstm.close();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
}