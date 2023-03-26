import java.util.Scanner;
public class Reto5 {
    public static void main(String[] args) {
        int opcion;
        int sistema;
        int vidas;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Digite Su Nombre");
        lectura.nextLine();
        System.out.println("Digite su Edad");
        lectura.nextInt();
        System.out.println("Digite Una Opcion Numerica:");
        System.out.println("1.Piedra");
        System.out.println("2.Papel");
        System.out.println("3.Tijeras");
        opcion=lectura.nextInt();
        sistema=(int)(Math.random()*3)+1;
        vidas=1;
        while(vidas<=1){
        if(opcion==sistema){
            System.out.println("Es un Empate con la Maquina");
        }
        else if(opcion==2&&sistema==1){
            System.out.println("Papel Vence a Piedra.");
            System.out.println("Usted Gano el Juego");
        }
        else if(opcion==3&&sistema==2){
            System.out.println("Tijera Vence a Papel");
            System.out.println("Usted Gano el Juego");
        }
        else if(opcion==1&&sistema==3){
            System.out.println("Piedra Vence a Tijera.");
            System.out.println("Usted Gano el Juego");
        }vidas++;
        System.out.println("Sus Vidas depues de Jugar Son:"+vidas);
        }
        lectura.close();
    }
}