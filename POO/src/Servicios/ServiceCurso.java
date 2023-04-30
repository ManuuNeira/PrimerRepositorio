/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Curso;
import Entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Manu
 */
public class ServiceCurso {
    public ServiceCurso(){}
    
    public Curso CrearCurso(){
        ServiceEstudiante svE = new ServiceEstudiante();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese Nombre");
        
        String name  = leer.next();
        
        Curso primerCurso = new Curso(svE.CrearEstudiante(name, 0));
        
        
        
        
        
        
        
        
        
        
        
        return primerCurso;
    }
    
    
    
    
    
    
}
