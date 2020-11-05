/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Carlos Jimenez Gomez
 */
public class ubigeo {
    
   private String _Codigo;
    private String _Distrito;
    private String _Distrito_Cod;
    private String _Provincia;
    private String _Provincia_Cod;
    private String _Departamento;
    private String _Departamento_Cod;

    public ubigeo() {
    }
    
     public ubigeo(String _Codigo, String _Distrito, String _Distrito_Cod, String _Provincia, String _Provincia_Cod, String _Departamento, String _Departamento_Cod) {
        this._Codigo = _Codigo;
        this._Distrito = _Distrito;
        this._Distrito_Cod = _Distrito_Cod;
        this._Provincia = _Provincia;
        this._Provincia_Cod = _Provincia_Cod;
        this._Departamento = _Departamento;
        this._Departamento_Cod = _Departamento_Cod;
    }
     
    public String getCodigo() {
        return _Codigo;
    }

    public void setCodigo(String _Codigo) {
        this._Codigo = _Codigo;
    }

    public String getDistrito() {
        return _Distrito;
    }

    public void setDistrito(String _Distrito) {
        this._Distrito = _Distrito;
    }

    public String getDistrito_Cod() {
        return _Distrito_Cod;
    }

    public void setDistrito_Cod(String _Distrito_Cod) {
        this._Distrito_Cod = _Distrito_Cod;
    }

    public String getProvincia() {
        return _Provincia;
    }

    public void setProvincia(String _Provincia) {
        this._Provincia = _Provincia;
    }

    public String getProvincia_Cod() {
        return _Provincia_Cod;
    }

    public void setProvincia_Cod(String _Provincia_Cod) {
        this._Provincia_Cod = _Provincia_Cod;
    }

    public String getDepartamento() {
        return _Departamento;
    }

    public void setDepartamento(String _Departamento) {
        this._Departamento = _Departamento;
    }

    public String getDepartamento_Cod() {
        return _Departamento_Cod;
    }

    public void setDepartamento_Cod(String _Departamento_Cod) {
        this._Departamento_Cod = _Departamento_Cod;
    } 
}
