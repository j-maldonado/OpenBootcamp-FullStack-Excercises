public class Main {
    public static void main(String[] args) {
        //Ejercicio 1 - If

        int numerif = 2;

        if (numerif<0){
            System.out.println("Numero negativo");
        } else if (numerif==0) {
            System.out.println("Numero es igual a 0");
        } else if (numerif>0) {
            System.out.println("Numero positivo");
        }

        //Ejercicio 2 - While
        int numeroWhile = 0;

        while (numeroWhile<3) {
            numeroWhile=numeroWhile + 1;
            System.out.println(numeroWhile);
        }

        //Ejercicio 3  - Do While
        int numeroDoWhile = 0;

        do{
            System.out.println(numeroDoWhile);
            numeroDoWhile=numeroDoWhile + 1;
        }
        while (numeroDoWhile<0);

        //Ejercicio 4  - For

        for(int numeroFor =0; numeroFor <=3; numeroFor ++){
            System.out.println(numeroFor);
        }

        //Ejercicio 5 - Switch

        var Estacion = "Otonio";

        switch (Estacion){
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otonio":
                System.out.println("Es Otonio");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("No estoy en ninguna estacion");
        }

    }
}