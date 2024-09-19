/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelpfp2;

public class Clientes {
    private String nombre; 
    private String apellido; 
    private String nit; 
    private int celular; 
    
    public Clientes(String nombre, String apellido, String nit, int celular){ 
        this.nombre = nombre; 
        this.apellido = apellido; 
        this.nit = nit; 
        this.celular  = celular; 
    }
    
    public String getNombre(){ 
        return nombre; 
    }
    public String getApellido(){ 
        return apellido; 
    }
    public String getnit(){ 
        return nit; 
    }
    public int getCelular(){ 
        return celular;
    }

    public String getClientes() {
        return null;
         
    }
}
