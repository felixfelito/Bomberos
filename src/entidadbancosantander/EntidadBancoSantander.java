package entidadbancosantander;
import bean.Cliente;
import gestion.GestionArrayClientes;
import java.util.Scanner;
/*
 * @author JC
 */
public class EntidadBancoSantander {
    public static void main(String[] args) {
        // Objetos
        Scanner tecla = new Scanner(System.in);
        GestionArrayClientes trans = new GestionArrayClientes();
        Cliente c1;
        // Variables
        int codCliente, path=0;
        String data;
        char loop;
        // Inicio ejecución
        System.out.println("Banco Santander");
        do{
            do{
                System.out.println("Seleccione operación:");
                System.out.println("1 - Insertar");
                System.out.println("2 - Eliminar");
                System.out.println("3 - Buscar");
                System.out.println("4 - Modificar");
                System.out.println("5 - Listar Todos");
                System.out.println("6 - SALIR");
                data=tecla.next();
                if(data.matches("[1-6]+")){
                    path=Integer.parseInt(data);
                }else{
                    System.out.println("Opción no válida.");
                }
            }while(path<1 || path>5);
            switch(path){
                case 1:
        // Creación de nuevo objeto Cliente
                    c1=new Cliente();
                    System.out.println("INSERTAR");
                    System.out.println("-------------------");
                    System.out.println("Introduzca datos:");
                    do{
                        System.out.print("Código de cliente: ");
                        data=tecla.next();
                        if(data.matches("[0-9]+")){
                            c1.ingresarCodCliente(Integer.parseInt(data));
                        }else{
                            System.out.println("Opción no válida.");
                        }
                    }while(data.equals("0") || !data.matches("[0-9]+"));
                    System.out.println("");
                    System.out.print("Nombre de cliente: ");
                    c1.ingresarNombreCliente(tecla.next());
                    System.out.println("");
                    System.out.print("Apellidos de cliente: ");
                    c1.ingresarApellidosCliente(tecla.next());
                    System.out.println("");
                    do{
                        System.out.print("Teléfono de cliente: ");
                        data=tecla.next();
                        if(data.matches("[0-9]+")){
                            c1.ingresarTlfCliente(Integer.parseInt(data));
                        }else{
                            System.out.println("Opción no válida.");
                        }
                    }while(!data.matches("[0-9]+"));
                    System.out.println("");
                    do{
                        System.out.print("Saldo de cliente: ");
                        data=tecla.next();
                        if(data.matches("[0-9]+")){
                            c1.ingresarSaldoCliente(Double.parseDouble(data));
                        }else{
                            System.out.println("Opción no válida.");
                        }
                    }while(!data.matches("[0-9]+"));
                    System.out.println("");
                    // Método de archivado de nuevo objeto Cliente
                    trans.nuevoCliente(c1);
                break;
                case 2:
                    System.out.println("ELIMINAR");
                    System.out.println("-------------------");
                    do{
                        System.out.println("Introduzca código de cliente:");
                        data=tecla.next();
                        codCliente=0;
                        if(data.matches("[0-9]+")){
                            codCliente=Integer.parseInt(data);
                        }else{
                            System.out.println("Opción no válida.");
                        }
                    }while(!data.matches("[0-9]+"));
                    trans.borrarCliente(codCliente);
                break;
                case 3:
                    System.out.println("BUSCAR");
                    System.out.println("-------------------");
                    do{
                        System.out.println("Introduzca código de cliente:");
                        data=tecla.next();
                        codCliente=0;
                        if(data.matches("[0-9]+")){
                            codCliente=Integer.parseInt(data);
                        }else{
                            System.out.println("Opción no válida.");
                        }
                    }while(codCliente==0);
                    trans.buscarCliente(codCliente);
                break;
                case 4:
                    System.out.println("MODIFICAR");
                    System.out.println("-------------------");
                    do{
                        System.out.println("Introduzca código de cliente:");
                        data=tecla.next();
                        codCliente=0;
                        if(data.matches("[0-9]+")){
                            codCliente=Integer.parseInt(data);
                        }else{
                            System.out.println("Opción no válida.");
                        }
                    }while(codCliente==0);
                    trans.modCliente(codCliente);                    
                break;
                case 5:
                    System.out.println("LISTAR TODOS");
                    System.out.println("-------------------");
                    trans.listarClientes();
                break;
                case 6:
                    loop='n';
                break;
            }
            do{
                System.out.println("¿Desea realizar otra operación?");
                System.out.print("s/n: ");
                loop=tecla.next().charAt(0);
                if(loop!='s' && loop!='n'){
                    System.out.println("Opción no válida.");
                }
            }while(loop!='s' && loop!='n');
            System.out.println("");
        }while(loop!='n');
    }
}