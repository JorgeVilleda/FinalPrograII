/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelpfp2;

public class Reservas {
    
    private String noReserva;
    private String fecha; 
    private String estado; 
    private Clientes clientes;  // Asociación o Agregación

    public Reservas(String no_Reserva, String fecha, String estado, Clientes clientes) {
        this.noReserva = no_Reserva;
        this.fecha = fecha; 
        this.estado = estado; 
        this.clientes = clientes;
    }

    
    public void mostrarInfo() {
        System.out.println("Reserva: " + noReserva + " del cliente: " + clientes.getNombre() + " Estado: " + estado + " para la fecha " + fecha);
    }
}
 
