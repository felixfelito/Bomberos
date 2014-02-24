package gestion;
import bean.Cliente;
import java.util.Scanner;
/*
 * @author JC
 */
public class GestionArrayClientes {
    // Atributos
    private Cliente arryn[] = new Cliente[5];
    // Constructores
    public GestionArrayClientes(){
        
    }
    // Métodos
    // Procedimiento para crear un nuevo objeto Cliente
    public void nuevoCliente(Cliente c1){
    // Recorre el array de objetos
        for (int i = 0; i < arryn.length; i++) {
    // Al encontrar un hueco...
            if(arryn[i]==null){
    // Guarda en dicho hueco la ruta al objeto Cliente
                arryn[i]=c1;
                System.out.println("Nuevo cliente insertado.");
                i=5;
            }
        }
    }
    // Procedimiento para eliminar un objeto Cliente
    public void borrarCliente(int codCliente){
    // Comprueba que exista el objeto Cliente
        if(arryn[codCliente-1]!=null){
            Scanner key = new Scanner(System.in);
            String optione;
            do{
                arryn[codCliente-1].mostrarDatos();
                System.out.println("¿Desea eliminar este registro?");
                System.out.print("s/n: ");
                optione=key.next();
    // Comprueba que el usuario haya introducido una opción válida
                if(!optione.equalsIgnoreCase("s") && !optione.equalsIgnoreCase("n")){
                    System.out.println("Opción no válida.");
                }
            }while(!optione.equalsIgnoreCase("s") && !optione.equalsIgnoreCase("n"));
    // Actúa según la opción elegida
            if(optione.equalsIgnoreCase("s")){
                arryn[codCliente-1]=null;
                System.out.println("El cliente ha sido eliminado.");
            }else{
                System.out.println("No se eliminó ningún registro.");
            }
        }else{
            System.out.println("El cliente solicitado no existe.");
        }
    }
    public void buscarCliente(int codCliente){
    // Actúa dependiendo de si existe el objeto Cliente o no...
        if((codCliente-1)>= arryn.length || arryn[codCliente-1]==null){
            System.out.println("El cliente solicitado no existe.");
        }else{
            arryn[codCliente-1].mostrarDatos();
        }
    }
    public void modCliente(int codClienteInit){
    // Comprueba que exista el objeto Cliente
        if(arryn[codClienteInit-1]!=null){
    // Crea un juego de objetos y variables propio
            Scanner key = new Scanner(System.in);
            int path=0, codCliente;
    // Visual del interfaz en ingreso de opción del usuario
            System.out.println("¿Qué desea modificar?");
            System.out.println("1. Código de cliente");
            System.out.println("2. Nombre de cliente");
            System.out.println("3. Apellidos de cliente");
            System.out.println("4. Teléfono de cliente");
            System.out.println("5. Saldo de cliente");
            path=key.nextInt();
    // Actúa según la opción elegida
            switch(path){
                case 1:
                    do{
                        System.out.print("Introduzca nuevo Código de cliente: ");
                        codCliente=key.nextInt();
                        if(arryn[codCliente-1]!=null){
                            System.out.println("Ese código de cliente ya está ocupado.");
                        }
                    }while(arryn[codCliente-1]!=null);
    // Método de ingreso de Código nuevo de cliente
                    arryn[codClienteInit-1].ingresarCodCliente(codCliente);
                break;
                case 2:
                    System.out.print("Introduzca nuevo Nombre de cliente: ");
                    arryn[codClienteInit-1].ingresarNombreCliente(key.next());
                break;
                case 3:
                    System.out.print("Introduzca nuevos Apellidos de cliente: ");
                    arryn[codClienteInit-1].ingresarApellidosCliente(key.next());
                break;
                case 4:
                    System.out.print("Introduzca nuevo Teléfono de cliente: ");
                    arryn[codClienteInit-1].ingresarTlfCliente(key.nextInt());
                break;
                case 5:
                    System.out.print("Saldo de cliente: ");
                    arryn[codClienteInit-1].ingresarSaldoCliente(key.nextDouble());
                break;
            }
            System.out.println("");
        }else{
            System.out.println("El cliente solicitado no existe.");
        }
    }
    public void listarClientes(){
    // Visual del interfaz
        System.out.print("Código Cliente         ||      ");
        System.out.print("Nombre Cliente         ||      ");
        System.out.print("Apellidos Cliente      ||      ");
        System.out.print("Teléfono Cliente       ||      ");
        System.out.println("Saldo Cliente        ||      ");
    // Recorrido del array
        for (int i = 0; i < arryn.length; i++) {
            if(arryn[i]!=null){
                arryn[i].mostrarDatos();
            }            
        }
    }
}
