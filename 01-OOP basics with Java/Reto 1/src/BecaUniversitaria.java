public class BecaUniversitaria{

    double monto;
    double interes;
    int tiempo;

    BecaUniversitaria(){

        this.monto = 0;
        this.interes = 0;
        this.tiempo = 0;

    }

    BecaUniversitaria(int pTiempo, double pMonto, double pInteres){

        this.monto = pMonto;
        this.interes = pInteres;
        this.tiempo = pTiempo;

    }
    
    public double calcularInteresSimple(){

        double interesSimple = this.monto * this.interes / 100 * this.tiempo;
        interesSimple = Math.round(interesSimple);
        return interesSimple;

    }

    public double calcularInteresCompuesto(){

        double  interesCompuesto = this.monto * (Math.pow((1+this.interes/ 100),this.tiempo) -1);
        interesCompuesto = Math.round(interesCompuesto);
        return interesCompuesto;

    }

    public String compararInversion(int pTiempo, double pMonto, double pInteres){

        this.monto = pMonto;
        this.interes = pInteres;
        this.tiempo = pTiempo;

        return compararInversion();

    }

    public String compararInversion(){

        double diferencia = this.calcularInteresCompuesto() - this.calcularInteresSimple();
        if(diferencia != 0){
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        } else {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }

    }


    // public static void main(String[] args){

    //     BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
    //     System.out.println(becaUniversitaria.calcularInteresCompuesto());
    //     System.out.println(becaUniversitaria.calcularInteresSimple());
    //     System.out.println(becaUniversitaria.compararInversion(60,13000,1.4));
    // }

}


// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }
