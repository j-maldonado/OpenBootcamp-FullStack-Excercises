public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println(miCoche.puertas);
    }
}

class Coche{
   public int puertas = 4;

   public void agregarPuerta() {
       this.puertas++;
   }
}