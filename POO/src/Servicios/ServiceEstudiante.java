/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Estudiante;

/**
 *
 * @author Manu
 */
public class ServiceEstudiante {
    public ServiceEstudiante(){}
    
    public Estudiante CrearEstudiante(String name,double nota){
        return new Estudiante(name,nota);
    }
}
