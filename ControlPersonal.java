/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit8;

import java.util.ArrayList;

/**
 *
 * @author Alberto del Hierro
 */
public class ControlPersonal {
    /* Perdona la cutrez del main pero se me ha borrado ya 3 veces por culpa 
    de los commits (tonto yo que no lo guardo)
    *  y estoy aqui que me va a explotar la cabeza
    **/
    private static ArrayList<Persona> personas;
    
    public ControlPersonal()
    {
        personas = new ArrayList<>();
    }
    public static void main(String[] args)
    {
        Asignatura a1 = new Asignatura("Entornos");
        Asignatura a2 = new Asignatura("Bases de datos");
        Asignatura a3 = new Asignatura("Programacion");
        
        Persona p1 = new Profesor("Rosa","2132134");
        Persona al1 = new Alumno("Alberto", "4882743");
    }
    
    public void anyadirPersonas(Persona p)
    {
        personas.add(p);
    }
    
    public void ordenar()
    {
        personas.sort(null);
    }
    
    public void mostrarListado()
    {
        for (Persona persona : personas) {
            persona.mostrarListadoAsignaturasNota();
        }
    }
}

