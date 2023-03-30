
import java.util.Scanner;
    
public class main {
    public static void main (String[] args) {
       
        System.out.println("Ingrese un numero");
        Scanner read =new Scanner(System.in);
        int melon;
        melon = read.nextInt();
        if ((melon%2 == 0 )&& (melon>2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
