import java.io.*;
import java.text.SimpleDanteFormat;
import java.text.SimpleDateFormat;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner les = new  Scanner (System.in);

    System.out.println(" Digite su numero de factura: ");
    int Num = les.nextInt();
    System.out.println(" Su numero de factura es: ");
    
    Calendar calendar = Calendar.getInstance();
    Date Fecha = calendar.getTime();
    SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
    String fecha = sdf.format(new Date());
    System.out.println("Fecha: ");

    System.out.println(" Digite el precio del Producto: ");
    double prod = les.nextInt();
    System.out.println(" El precio del producto es: ");
  }
}