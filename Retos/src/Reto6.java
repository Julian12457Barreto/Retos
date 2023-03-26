import java.util.Scanner;
public class Reto6 {
    public static void main(String[] args) {
        String palabra;
        int i;
        Scanner lectura=new Scanner(System.in);
        i=0;
        while(i<1){
            System.out.println("A Continuacion Usted Tendra Pistas Sobre Un Animal A Descubrir:");
                System.out.println("Este Animal tiene algunos Colores del Arcoiris");
                System.out.println("Algunos Niños Creen en este Animal");
                System.out.println("Es Muy Parecido a Un Caballo");
                System.out.println("Algunos Piensan que cumple deseos y tiene un Cuerno");
                System.out.println("¿Que Animal crees que es?");
                palabra=lectura.next();
                if(palabra=="Unicornio"){
                    System.out.println("Felicitaciones Ganaste el Juego");
                }
                else{
                    System.out.println("Palabra Incorrecta, Intentalo Nuevamente");
                }
        }i++;
        lectura.close();
    }
}