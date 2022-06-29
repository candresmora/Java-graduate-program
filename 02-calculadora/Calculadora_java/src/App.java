import java.util.Scanner;

class Calculadora{

    double numero1;
    double numero2;
    double resultado;
    String operacion;

    Calculadora(double n1, double n2){
        this.numero1 = n1;
        this.numero2 = n2;
    }

    void sumar(){
        this.operacion = "Suma";
        this.resultado = this.numero1 + this.numero2;
    }

    void restar(){
        this.operacion = "Resta";
        this.resultado = this.numero1 - this.numero2;
    }

    void multiplicar(){
        this.operacion = "Multiplicacion";
        this.resultado = this.numero1 * this.numero2;
    }

    void dividir(){
        this.operacion = "Division";
        this.resultado = this.numero1 / this.numero2;
    }

    void mostarResultado(){
        System.out.println("El resultado de la " + this.operacion + " es: " + this.resultado);
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Calculadora en Java\n");
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        double numero1 = lector.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        double numero2 = lector.nextDouble();

        lector.close();

        Calculadora miCalculadora = new Calculadora(numero1, numero2);
        
        miCalculadora.sumar();
        miCalculadora.mostarResultado();
        miCalculadora.restar();
        miCalculadora.mostarResultado();
        miCalculadora.multiplicar();
        miCalculadora.mostarResultado();
        miCalculadora.dividir();
        miCalculadora.mostarResultado();


    }
}
