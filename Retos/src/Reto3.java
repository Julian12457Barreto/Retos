import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args) {
        int edad;
        int opcion;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Digite Su Nombre");
        lectura.next();
        System.out.println("Digite su Edad");
        edad=lectura.nextInt();
        if(edad<18&&edad<100){
            System.out.println("Esta No Es una Edad Adecuada");
        }
        else if (edad>18){
            System.out.println("Usted Puede Jugar");
        }
        else{
            System.out.println("Usted No Puede Jugar");
        }
        System.out.println("Digite Una Opcion Numerica:");
        System.out.println("1.Cara");
        System.out.println("2.Sello");
        opcion=lectura.nextInt();
        if(opcion==1){
            System.out.println("Usted Gano el Juego.");
        }
        else if(opcion==2) {
            System.out.println("Usted Gano el Juego");
        }
        else{
            System.out.println("Digite una Opcion Valida.");
        }
        lectura.close();
    }
}