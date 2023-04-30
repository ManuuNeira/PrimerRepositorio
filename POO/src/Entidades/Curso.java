/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Servicios.ServiceEstudiante;
import java.util.Arrays;

/**
 *
 * @author Manu
 */
public class Curso {
    private Estudiante Estudiantes[] = new Estudiante[0];
    private int numcurso;
    
    public Curso(){}
    public Curso(Estudiante tipo){
        ServiceEstudiante sV = new ServiceEstudiante();
        this.Estudiantes = Arrays.copyOf(this.Estudiantes, this.Estudiantes.length+1);
        this.Estudiantes[this.Estudiantes.length-1] = sV.CrearEstudiante(tipo.getNombre(), tipo.getNota());
        
    }
    public int cantidadEstudiantes(){
        return this.Estudiantes.length;
    }
    
    public Estudiante[] getEstudiantes() {
        return Estudiantes;
    }

    public int getNumcurso() {
        return numcurso;
    }

    public void setEstudiantes(Estudiante[] Estudiantes) {
        this.Estudiantes = Estudiantes;
    }

    public void setNumcurso(int numcurso) {
        this.numcurso = numcurso;
    }
    
}
