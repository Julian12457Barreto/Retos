import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {
        int opcion;
        int edad;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Digite Su Nombre");
        lectura.nextLine();
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
        System.out.println("1.Piedra");
        System.out.println("2.Papel");
        System.out.println("3.Tijeras");
        opcion=lectura.nextInt();
        if(opcion==1){
            System.out.println("Piedra Vence a Tijera.");
            System.out.println("Usted Gano el Juego");
        }
        else if(opcion==2){
            System.out.println("Papel Vence a Piedra.");
            System.out.println("Usted Gano el Juego");
        }
        else if(opcion==3){
            System.out.println("Tijera Vence a Papel");
            System.out.println("Usted Gano el Juego");
        }
        else{
            System.out.println("Es un Empate con la Maquina");
        }
        lectura.close();
    }
}
