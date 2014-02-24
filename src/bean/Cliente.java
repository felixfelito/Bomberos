package bean;
/*
 * @author JC
 */
public class Cliente {
    // Atributos
    private int codCliente, telefono;
    private String nombre, apellidos;
    private double saldo;
    // Constructores
    public Cliente(){
        
    }
    // Métodos
    public void mostrarDatos(){
        System.out.print(codCliente+"      ||      ");
        System.out.print(nombre+"      ||      ");
        System.out.print(apellidos+"      ||      ");
        System.out.print(telefono+"      ||      ");
        System.out.print(saldo+"      ||      ");
        System.out.println("");
    }
    public void ingresarCodCliente(int codCliente){
        this.codCliente=codCliente;
        System.out.println("Nuevo Código de cliente ingresado.");
    }
    public void ingresarNombreCliente(String nombre){
        this.nombre=nombre;
        System.out.println("Nuevo Nombre de cliente ingresado.");
    }
    public void ingresarApellidosCliente(String apellidos){
        this.apellidos=apellidos;
        System.out.println("Nuevos Apellidos de cliente ingresados.");
    }
    public void ingresarTlfCliente(int telefono){
        this.telefono=telefono;
        System.out.println("Nuevo Teléfono de cliente ingresado.");
    }
    public void ingresarSaldoCliente(double saldo){
        this.saldo=saldo;
        System.out.println("Nuevo Saldo de cliente ingresado.");
    }
}
