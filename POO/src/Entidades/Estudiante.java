/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Manu
 */
public class Estudiante {
    private String Nombre;
    private double nota;
    private int curso;

    public Estudiante(String Nombre, double nota, int curso) {
        this.Nombre = Nombre;
        this.nota = nota;
        this.curso = curso;
    }

    public Estudiante(String Nombre, double nota) {
        this.Nombre = Nombre;
        this.nota = nota;
    }
    
    
    public Estudiante(){}

    public String getNombre() {
        return Nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
    
}
