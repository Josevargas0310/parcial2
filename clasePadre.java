
package tarjetasbancarias;

import java.util.Scanner;

public class clasePadre {
  static Scanner scanner = new Scanner (System.in);
  
    //atributos 
  public final int limiteCredito;  //
  public String nombreTarjetas;   //
  public int interesesCredito;   //
  public int interesMensual;    //
  public int noTarjetas;       //
  
  public final int limiteDebito;  //
  
//constructor

    public clasePadre(int limiteCredito, int limiteDebito) {
        this.limiteCredito = 10000;
        this.limiteDebito = 5000;
    }
    
    //metodos 
    public void mostrarNombreCredito(){
       System.out.print("ingrese el nombre del propietario de la tarjetas");
       String nombreTarjetas = scanner.nextLine();
       System.out.print("NOMBRE TARJETA DE LA TARJETA "+nombreTarjetas);
       
    }
    
    public int mostrarNoTarjeta(){
         System.out.print("ingrese el numero de su tarjeta");
         int noTarjetas = scanner.nextInt();
         System.out.print("No. TARJETA");
         return noTarjetas;
    }
    
    
    public int mostrararTasaDeintereses(){
        System.out.print("ingrese la tasa de interes que le estan cobrando");
        int interesesCredito = scanner.nextInt();
        int interesMensual = (interesesCredito/365)*30;
        System.out.print("El interes mensual es de: ");
        return interesMensual;
    }
    
    
  
    
  
  
}
