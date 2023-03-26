import java.util.Scanner;
public class Reto7 {
    public static void main(String[] args) {
        String apellido;
        String correo;
        String nombre;
        int documento;
        int usuario;
        int telefono;
        String contraseña;
        Scanner lectura=new Scanner(System.in);
        int i=0;
        while (i<1){
                System.out.println("Desea Registrar un Nuevo Usuario");
                System.out.println("1.Si");
                System.out.println("2.No.");
                usuario=lectura.nextInt();
                if (usuario==1) {
                System.out.println("Digite sus Nombres");
                nombre=lectura.next();
                System.out.println("Digite sus Apellidos");
                apellido=lectura.next();
                System.out.println("Digite su E-mail");
                correo=lectura.next();
                System.out.println("Digite su Documento");
                documento=lectura.nextInt();
                System.out.println("Digite su Telefono");
                telefono=lectura.nextInt();
                System.out.println("Cree su Contraseña Solamente con Caracteres Alfabeticos");
                lectura.next();
            }
            if(usuario==2){
                System.out.println("Gracias por Utilizar Nuestro Servicio.");
            }
            }i++;
        lectura.close();
    }
}
