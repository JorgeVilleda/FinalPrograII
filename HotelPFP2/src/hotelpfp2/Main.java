
package hotelpfp2;


public class Main {

    
    public static void main(String[] args) {
        
        Clientes clientes = new Clientes("Juan", "Pérez", "10920110-8", 37298796);
        Reservas reservas = new Reservas("12345", "10/09/2024", "Reservado", clientes);

      
        reservas.mostrarInfo();
    }
    
}
