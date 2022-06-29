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
        System.out.println("La persona con nombre " + this.nombre + " ha ingresado");
    }

    void prestarLibro(){
        System.out.println("La persona con nombre  nombre " + this.nombre + " ha solicitado el prestamo de un libro");
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
        System.out.println("El profesor" + super.nombre + " subio las notas");
    }
    
    void consultarNotas(){
        System.out.println("El profesor ha consultado las notas");
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
        System.out.println("El estudiante ha presentado un examen");
    }

    void matricularse(){
        System.out.println("El estudiante " + super.nombre + " se ha matriculado");
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    Profesor profe = new Profesor( "Dario", "Lopez", "1234", "profe@utp.com", "ingenieria", "ab22", 500000);
    
    Estudiante tripulante = new Estudiante("Juliana", "Martinez", "45469846", "juli@utp.edu.co", "Ingnieria sistemas", "utp12312", 4.2, "Ingenieria");

}
