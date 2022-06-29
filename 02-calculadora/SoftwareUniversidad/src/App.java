class Persona{
    String nombre;
    String apellido;
    private String identificacion;
    private String correoe;

    Persona(String nombre, String apellido, String identificacion, String correoe) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.correoe = correoe;
    }

    void ingresar() {

    }

    void prestarLibro(){

    }

}

class Profesor extends Persona{

    Profesor(String nombre, String apellido, String identificacion, String correoe, String facultad, String numOficina, double salario) {
        super(nombre, apellido, identificacion, correoe);
        this.facultad = facultad;
        this.numOficina = numOficina;
        this.salario = salario;
    }

    String facultad;
    String numOficina;
    double salario;

    void subirNotas(){

    }
    
    void consultarNotas(){

    }

}

class Estudiante extends Persona{
    String carrera;
    String codigo;
    double promedio;
    String facultad;

    Estudiante(String nombre, String apellido, String identificacion, String correoe, String carrera, String codigo, double promedio, String facultad){
        super(nombre, apellido, identificacion, correoe);
        this.carrera = carrera;
        this.codigo = codigo;
        this.promedio = promedio;
        this.facultad = facultad;
    }

    void presentar_examen(){

    }

    void matricularse(){

    }

}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    Profesor profe = new Profesor( "Dario", "Lopez", "1234", "profe@utp.com", "ingenieria", "ab22", 500000);
    
}
