/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class InstitucionEducativa {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    
    /*Crear los método necesarios*/
    public void establecerNombre(String c) {
        nombre = c;
    }
    
    public void establecerTipoInstitucion(String c) {
        tipoInstitucion = c;
    }
    
    public void establecerNumeroAlumnos(int c) {
        numeroAlumnos = c;      
    }
    
    public void establecerNumeroDocentes(int c) {
        numeroDocentes = c;
    }
    
    public void establecerNumeroSedes(int c) {
        numeroSedes = c;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }
    
    public int obtenerNumeroAlumnos () {
        return numeroAlumnos;
    }
    
    public int obtenerNumeroDocentes() {
        return numeroDocentes;        
    }
    
    public int obtenerNumeroSedes() {
        return numeroSedes;
    }
    
}
