import java.util.Scanner;
public class Reto8 {
    public static void main(String[] args) {
        int sistema;
        String jugador;
        int i;
        int usuario;
        Scanner lectura=new Scanner(System.in);
        sistema=(int)(Math.random()*6)+1;
        System.out.println("Digite el Nombre del Jugador:");
        jugador=lectura.nextLine();
        System.out.println("Digite el Numero en el Cual Cayo Su Dado");
        usuario=lectura.nextInt();
        i=1;
        while(i<=1){
            if (usuario==1&&sistema==2){
                System.out.println("El Numero Mayor de Dado Corresponde al Sistema, Lo Sentimos Jugador"+jugador);
            }
            else if (usuario==2&&sistema==1){
                System.out.println("El Numero Mayor de Dado Corresponde al Jugador"+jugador+"Felicidades");
            }
            else if(usuario==3&&sistema==4){
                System.out.println("El Numero Mayor de Dado Corresponde al Sistema, Lo Sentimos Jugador"+jugador);
            }
            else if (usuario==4&&sistema==3){
                System.out.println("El Numero Mayor de Dado Corresponde al Jugador"+jugador+"Felicidades");
            }
            else if (usuario==5&&sistema==6){
                System.out.println("El Numero Mayor de Dado Corresponde al Sistema, Lo Sentimos Jugador"+jugador);
            }
            else if (usuario==6&&sistema==5) {
                System.out.println("El Numero Mayor de Dado Corresponde al Jugador"+jugador+"Felicidades");
            }
            else{
                System.out.println("Es un Empate");
            }i++;
            System.out.println("Sus Vidas despues de Jugar son:"+i);
        }
        lectura.close();
    }
}