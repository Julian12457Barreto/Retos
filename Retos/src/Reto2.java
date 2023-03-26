import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        String nombre;
        String doctor;
        String vacuna;
        String eps;
        int peso;
        int meses;
        double dosis;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Digite el Nombre del Bebe");
        nombre=lectura.next();
        System.out.println("Digite Cuantos Meses Tiene el Bebe");
        meses=lectura.nextInt();
        System.out.println("Digite el Peso del Bebe");
        peso=lectura.nextInt();
        System.out.println("Digite el Nombre del Medico");
        doctor=lectura.next();
        System.out.println("Digite el Nombre de La Vacuna");
        vacuna=lectura.next();
        System.out.println("Digite el Nombre de Su EPS");
        eps=lectura.next();
        dosis=peso+15/meses*15*10;
        System.out.println("El Nombre del Bebe es:\n"+nombre);
        System.out.println("Los Meses del Bebe son:\n"+meses);
        System.out.println("El Peso del Bebe es:\n"+peso);
        System.out.println("El Nombre del Medico es:\n"+doctor);
        System.out.println("El Nombre de la Vacuna es:\n"+vacuna);
        System.out.println("El Nombre de su EPS es:\n"+eps);
        System.out.println("La Dosis de La Vacuna que se debe Aplicar al Bebe es:\n"+dosis);
        lectura.close();
    }
}