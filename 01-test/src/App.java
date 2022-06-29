class Vehiculo{
    String color = "blanco";
    String marca = "gato";
    int num_llantas = 4;
    int cilindraje = 1000;
    float capacidad_tanque = 20; // En litros
    boolean tiene_aire = false;
    private String placa;

    Vehiculo(String color, String marca, int cilindraje, float capacidad_tanque, boolean tiene_aire, String placa){
        this.color = color;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.capacidad_tanque = capacidad_tanque;
        this.tiene_aire = tiene_aire;
        this.placa = placa;
    }

    void avanzar(float velocidad){
        System.out.println("El vehiculo con placa " + this.placa + " esta avanzando a " + velocidad + "km/h");
    }

    void parar(){
        System.out.println("El vehiculo con placa " + this.placa + " se detuvo");
    }

    @Override
    public String toString(){
        return "Placa: " + this.placa + "\nMarca: " + this.marca + "\nCilindraje: " + this.cilindraje + "\n";
    }

    String getPlaca() {
        return this.placa;
    }

    void setPlaca(String nuevaPlaca) {
        this.placa = nuevaPlaca;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Vehiculo miCarrito = new Vehiculo("Azul","Ferrari",4000,40,true,"ABC123");
        miCarrito.avanzar(30);
        miCarrito.parar();
        System.out.println(miCarrito.toString());
    }
}
