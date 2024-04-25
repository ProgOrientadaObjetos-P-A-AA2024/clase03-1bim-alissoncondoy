package paquete2;
import paquete1.InstitucionEducativa;
public class Principal {
    public static void main(String[] args) {
        /*Un objeto de tipo InstitucionEducativa*/
        
        InstitucionEducativa i1 = new InstitucionEducativa();
        
        // System.out.printf("%s     ", i1.);
        String nombres = "Bernardo Valdivieso";
        String tipoInstitucion = "Publica";
        int numeroAlumnos = 24;
        int numeroDocentes = 4;
        int numeroSedes = 2;
        
        i1.establecerNombre(nombres);
        i1.establecerTipoInstitucion(tipoInstitucion);
        i1.establecerNumeroAlumnos(numeroAlumnos);
        i1.establecerNumeroDocentes(numeroDocentes);
        i1.establecerNumeroSedes(numeroSedes);
        
        System.out.printf("Nombre de la institucion: %s\nTipo de Institucion: %s\n"
        + "Numero de Alumnos: %d\nNumero de Docentes: %d\nNumero de Sedes: %d\n",
        i1.obtenerNombre(), i1.obtenerTipoInstitucion(), i1.obtenerNumeroAlumnos
        (), i1.obtenerNumeroDocentes(), i1.obtenerNumeroSedes());
    }
}
