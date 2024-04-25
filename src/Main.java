import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Importamos la clase scanner para pedir datos al usuario
        Scanner s = new Scanner(System.in);

        // Le pedimos al usuario la contraseña
        System.out.println("Ingresa la contraseña");
        String password = s.next();

        // Comenzamos a validar la contraseña

        // 1. Debe tener al menos 8 caracteres.
        int caracteresMinimos = 8;
        if(password.length() < caracteresMinimos){
            System.out.println("La contraseña debe contener al menos 8 caracteres");
            // Usamos system.exit para finalizar el programa en caso de que la validacion sea verdadera porque no se ha cumplido
            System.exit(0);
        }

        // 2. Debe contener al menos una letra mayúscula y una letra minúscula y 3. Debe contener al menos un número.
        boolean contieneLetraNumero = password.matches("[a-zA-z0-9]+");
        if(!contieneLetraNumero){
            System.out.println("La contraseña debe contener al menos una letra mayúscula, una letra minúscula y un número");
            System.exit(0);
        }

        // Si lo anterior fue valido, mostramos al usuario que la contraseña es válida
        System.out.println("Contraseña válida");
    }
}