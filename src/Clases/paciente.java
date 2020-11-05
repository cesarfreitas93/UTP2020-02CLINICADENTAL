package Clases;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class paciente {
    bdconexion con;// inicializa la variable conexion
    
    //Constructor de la clase paciente
    public paciente()
    {
        con = new bdconexion(); //instancia la clase bdconexion
    }
    
     //constructor explicito para agregar un nuevo registro a la base de datos
    
      public void nuevoPaciente(String idPaciente, String DNI, String nombres, String apellidos, String direccion, String departamento, String provincia,String Distrito, String telefono1, String telefono2, String edad)
    {
        try
        {
            PreparedStatement pstm=(PreparedStatement)
            con.getConnection().prepareStatement("insert into " + " paciente(idPaciente, dui, nombres, apellidos, direccion, departamento, provincia, Distrito, telefono1, telefono2, edad)" + "values (?,?,?,?,?,?,?,?,?,?,?)");
            
            pstm.setString(1, idPaciente);
            pstm.setString(2, DNI);
            pstm.setString(3, nombres);
            pstm.setString(4, apellidos);
            pstm.setString(5, direccion);
            pstm.setString(6, departamento);
            pstm.setString(8, Distrito);
            pstm.setString(9, Distrito);
            pstm.setString(10, telefono1);
            pstm.setString(11, telefono2);
            pstm.setString(12, edad);            
            
            pstm.execute();
            pstm.close();
        }
        catch(SQLException e)
        {
            System.out.print(e);
        }
    }
    
    
}
