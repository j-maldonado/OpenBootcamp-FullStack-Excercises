public class Main {

    public static void main(String args[]) {

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.nombre = "Joan";
        cliente.edad = 31;
        cliente.cel = 45679056;
        cliente.credito = 423.5;
        System.out.println("Hola! Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi número de celular es " + cliente.cel
                + ". Mi crédito disponible es $" + cliente.credito + " dólares.");


        trabajador.nombre = "Jose";
        trabajador.edad = 45;
        trabajador.cel = 22345343;
        trabajador.salario = 898.33;
        System.out.println("Hola. Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi número de celular es " + trabajador.cel
                + ". Mi salario es de $" + trabajador.salario + " dólares.");
    }
}


class Persona {
    String nombre;
    int edad;
    int cel;
}


class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}