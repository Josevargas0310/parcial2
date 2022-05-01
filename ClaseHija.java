
package tarjetasbancarias;

import java.util.Scanner;
public class ClaseHija extends clasePadre{
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
     public ClaseHija(int limiteCredito, String nombreTarjetas, int interesesCredito, int interesMensual, int noTarjetas, int limiteDebito){
         super(limiteCredito, limiteDebito);
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
         if(deposito<=saldoActualDebito){
            saldoActualDebito=deposito+saldoActualDebito;
            System.out.println("su deposito se realizo con exito, su saldo actual es de: "+saldoActualDebito);
         }

     }
     
     public void mostrarCompraDebito(){
         System.out.println("ingrese el monto de la compra que desea realizar");
         compraDebito = scanner.nextInt();
         if (compraDebito <= saldoActualDebito){
             saldoActualDebito=saldoActualDebito-compraDebito;
             System.out.println("su compra se realizo con exito, su saldo actual es de: "+saldoActualDebito);
         }
     }
}
