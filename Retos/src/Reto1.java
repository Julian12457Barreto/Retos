import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        double kelvin;
        double kelvin1;
        int opcion;
        int farenheit1;
        int farenheit;
        Scanner lectura=new Scanner(System.in);
        farenheit=350*9/5+32;
        kelvin=350+273.15;
        farenheit1=350*9/5+32+100;
        kelvin1=350+273.15+100;
        System.out.println("Digite la Opcion Numerica con La Temperatura que quiere Precalentar el Horno");
        System.out.println("1.Farenheit.");
        System.out.println("2.Kelvin.");
        opcion=lectura.nextInt();
        if (opcion==1) {
            System.out.println("La Temperatura para Precalentar el Horno en Grados Farenheit es:\n"+farenheit+"\nY La Temperatura Correcta del Horno en Grados Farenheit es:\n"+farenheit1);
        }
        else if (opcion==2) {
            System.out.println("La Temperatura Para Precalentar el Horno en Grados Kelvin es:\n"+kelvin+"\nY La Temperatura Correcta del Horno en Grados Kelvin es:\n"+kelvin1);
        }
        else{
            System.out.println("Esta Temperatura no es Valida");
        }
        lectura.close();
    }

}
