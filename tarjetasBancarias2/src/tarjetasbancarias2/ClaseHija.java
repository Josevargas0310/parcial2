
package tarjetasbancarias2;

import java.util.Scanner;
public class ClaseHija extends ClasePadre {
      static Scanner scanner = new Scanner (System.in);
     
     //atributos 
     double saldoActual = 10000;
     int compra; 
     int pago;
    
     
     double saldoActualDebito = 5000;
     int deposito;
     int compraDebito;
     int calculoDeSaldo;
     
     //constructor
     public ClaseHija(){
        
     }

     public void mostrarSaldoActualCredito(){
         System.out.println("su saldo actual es de: Q"+saldoActual);
     }
     public void mostrarSaldoActualDebito(){
          System.out.println("su saldo actual es de: Q"+saldoActualDebito);
     }
    
     public void mostrarCompra(){
         System.out.println("ingrese el monto de la compra que desea realizar");
         compra = scanner.nextInt();
         if (compra <= saldoActual){
             saldoActual=saldoActual-compra;
             System.out.println("su compra se realizo con exito, su saldo actual es de: "+saldoActual);
         }
     }
     
     public void mostrarPago(){
         System.out.println("ingrese el monto del pago que desea realizar");
         pago= scanner.nextInt();
         if (pago<= saldoActual){
             saldoActual=pago+saldoActual;
              System.out.println("su pago se realizo con exito, su saldo actual es de: "+saldoActual);
         }
         else{
              System.out.println("la cifra es mas de la cantidad a pagar, porfavor revise su monto");
         }
                 
     } 
     
     public void mostrarDeposito(){
         System.out.println("ingrese el monto del deposito que desea realizar");
         deposito= scanner.nextInt();
            saldoActualDebito=deposito+saldoActualDebito;
            System.out.println("su deposito se realizo con exito, su saldo actual es de: "+saldoActualDebito);
     }
     
     public void mostrarCompraDebito(){
         System.out.println("ingrese el monto de la compra que desea realizar");
         compraDebito = scanner.nextInt();
         if (compraDebito <= saldoActualDebito){
             saldoActualDebito=saldoActualDebito-compraDebito;
             System.out.println("su compra se realizo con exito, su saldo actual es de: "+saldoActualDebito);
         }
         else{
             System.out.println("Su capital es insuficiente para reaizar esta compra. Porfavor Verifique el monto de su tarjeta");
         }
     }

    
}
