package paquete5;

public class Ejecutor2 {
    public static void main(String[] args) {
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        int numeroCreditos=5;
        double costoCredito=30.00;
        
        EstudianteDistancia estDistancia = new EstudianteDistancia(nombre,
                apellido, identificacion, edad, numeroCreditos, costoCredito);
        
        estDistancia.establecerCostoAsignatura(50.5);
        estDistancia.establecerNumeroAsginaturas(5);
        estDistancia.calcularMatriculaDistancia();
        
        System.out.println(estDistancia);
    }
}
