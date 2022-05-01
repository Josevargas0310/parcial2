
package tarjetasbancarias2;
import java.util.Scanner;

public class TarjetasBancarias2 {
static Scanner scanner = new Scanner (System.in);
    
    public static void main(String[] args) {
        int seguir;
        ClaseHija obj = new ClaseHija(); 
       
         do{
        System.out.println("Bienvenido a sus sistema de banco donde podra gestionar sus tarjetas de debito o credito"
                + "a continuacion se le presenta dos opciones escoja la opcion deseada \n"
                + "1. Tarjeta de Credito\n"
                + "2. Tarjeta de Debito\n");
        int opcion=scanner.nextInt();
        
        if (opcion ==1){
            obj.mostrarNombreCredito();
            obj.mostrarNoTarjeta();
            System.out.println("\nBienvenido. ¿Que es lo que desea saber de su tarjeta de Credito?"
                    + "\n1. Tasa de interes\n"
                    + "2. Limite de Credito\n"
                    + "3. Saldo Actual\n"
                    + "4. Realizar una Compra\n"
                    + "5. Realizar Pago de la Tarjeta\n");
            int opcion1=scanner.nextInt();
            
            switch(opcion1){
                case 1:
                    obj.mostrararTasaDeintereses();
                    break;
                case 2:
                    obj.mostrarLimiteCredito();
                    break;
                case 3:
                    obj.mostrarSaldoActualCredito();
                    break;
                case 4:
                    obj.mostrarCompra();
                    break;
                case 5:
                    obj.mostrarPago();
                    break;
            }
        }
        else{
            obj.mostrarNombreCredito();
            obj.mostrarNoTarjeta();
            System.out.println("\nBienvenido. ¿Que es lo que desea saber de su tarjeta de Debito?"
                    + "\n1. Saldo disponible en su tarjeta\n"
                    + "2. saldo Actual \n"
                    + "3. Depositar en su tarjeta\n"
                    + "4. Realizar una Compra\n");
            int opcion1=scanner.nextInt();
            
            switch(opcion1){
                case 1:
                    obj.mostrarLimiteDebito();
                    break;
                case 2:
                    obj.mostrarSaldoActualDebito();
                    break;
                case 3:
                    obj.mostrarDeposito();
                    break;
                case 4: 
                    obj.mostrarCompraDebito();
                    break;
                 
                    
                    
            }
        }
        System.out.println("\nSi desea Seguir Realizando alguna operacio ingrese el digito 1, de lo contrario ingrese cualquier otro digito");
        seguir=scanner.nextInt();
        
        }while(seguir==1);
       
    }
    
}
