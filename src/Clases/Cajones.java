/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author t3ch
 */
public class Cajones {
   DB base= new DB(); //instanciamos a la clade de conexión de nuestra base de datos
    public static Connection conexion;  //hacemos la conexión a la base de datos con ayuda de nuestra clase
    int Numero,Estado;  //declaramos unas cuantas variables que ocupamos
    
    public Cajones(){
        this.Numero=0;
        this.Estado=0;
    }
    
    public Cajones(int Numero){   //este método recibe como parametro el número de cajón y te retorna todos los datos asociados
        conexion = base.GetConnection();
        PreparedStatement select;
        try {
            select = conexion.prepareStatement("select * from cajon where Numero= ?");
            select.setInt(1, Numero);
            boolean consulta = select.execute();
            if(consulta){
                ResultSet resultado =  select.getResultSet();
                if(resultado.next()){
                    this.Numero= resultado.getInt(1);
                    this.Estado=resultado.getInt(2);
                  
                }
                resultado.close();
            }
            conexion.close();
        } catch (SQLException ex) {
            System.err.println("Ocurrió un error: "+ex.getMessage().toString());
        }
    }
    
    public Cajones(int Numero, int Estado){  //el constructor
        this.Numero=Numero;
        this.Estado=Estado;
    }

    public int getNumero() {   //los get and set
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }
    
        public boolean actualizar(){  //aqui actualizamos los datos para el cajón actual, osea el enviado en constructor
        conexion=base.GetConnection();
        if(conexion!=null){
        try{
            String peticion= "update cajon set Numero=?,Estado=?  where Numero='";
            PreparedStatement actualizar= conexion.prepareStatement(peticion+this.Numero+"'");
            actualizar.setInt(1,this.Numero);
            actualizar.setInt(2,0);
            actualizar.executeUpdate();
            conexion.close();
           // JOptionPane.showMessageDialog(null,"Registro Actualizado","Éxito al actualizar",1);
            return true;
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al actualizar: "+ex.getMessage(),"error",1);
            return false;
        }}
        else{
            JOptionPane.showMessageDialog(null,"error al conectar","error",1);
            return false;
        }
    }
    
         public boolean actualizar2(){
        conexion=base.GetConnection();
        if(conexion!=null){
        try{
            String peticion= "update cajon set Numero=?,Estado=?  where Numero='";
            PreparedStatement actualizar= conexion.prepareStatement(peticion+this.Numero+"'");
            actualizar.setInt(1,this.Numero);
            actualizar.setInt(2,1);
            actualizar.executeUpdate();
            conexion.close();
           // JOptionPane.showMessageDialog(null,"Registro Actualizado","Éxito al actualizar",1);
            return true;
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al actualizar: "+ex.getMessage(),"error",1);
            return false;
        }}
        else{
            JOptionPane.showMessageDialog(null,"error al conectar","error",1);
            return false;
        }
    }
    
    public  List<Cajones> getCajones(){   //obtenemos todos los registros de nuestra tabla en forma de lista.
        List<Cajones> listaCajones = new ArrayList<Cajones>();
        conexion = base.GetConnection();
        try{
            String consulta = "select Numero from cajon";
            PreparedStatement select = conexion.prepareStatement(consulta);
            boolean r = select.execute();
            if(r){
                ResultSet result = select.getResultSet();
                while(result.next()){
                    Cajones caj = new Cajones(result.getInt(1));
                    System.out.println(caj);
                    listaCajones.add(caj);
                }
                result.close();
            }
            conexion.close();
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        return listaCajones;
    }
    
    
}
