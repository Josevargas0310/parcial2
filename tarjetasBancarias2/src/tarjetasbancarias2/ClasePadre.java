
package tarjetasbancarias2;
import java.util.Scanner;
public class ClasePadre {
    static Scanner scanner = new Scanner (System.in);
  
    //atributos 
  public final int limiteCredito;  //
  public String nombreTarjetas;   //
  public int interesesCredito;   //
  public int interesMensual;    //
  public int noTarjetas;       //
  
  public final int limiteDebito;  //
  
//constructor

    public ClasePadre() {
        this.limiteCredito = 10000;
        this.limiteDebito = 5000;
    }

    
    //metodos 
    public void mostrarNombreCredito(){
       System.out.print("Ingrese el nombre del propietario de la tarjetas \n");
       String nombreTarjetas = scanner.nextLine();
        System.out.print("\n NOMBRE TARJETA DE LA TARJETA "+nombreTarjetas);
       
    }
    
    public void mostrarNoTarjeta(){
         System.out.print("\n ingrese el numero de su tarjeta \n");
         int noTarjetas = scanner.nextInt();
         System.out.print("\n No. TARJETA    "+noTarjetas);
    }
    
    public void mostrarLimiteCredito(){
        System.out.print("\n El limite de su numero de tarjeta es de: Q"+limiteCredito);
    }
    public void mostrarLimiteDebito(){
        System.out.print("\n El limite de su numero de tarjeta es de: Q"+limiteDebito);
    }
    
    
    public void mostrararTasaDeintereses(){
        System.out.print("ingrese la tasa de interes que le estan cobrando");
        int interesesCredito = scanner.nextInt();
        interesesCredito=interesesCredito*100;
        int interesMensual = interesesCredito/365;
        interesMensual=interesMensual*30;
        System.out.print("El interes mensual es de: "+interesMensual);
        
    }
    
  
  
    
  
 
}
