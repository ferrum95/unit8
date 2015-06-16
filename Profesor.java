/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit8;

/**
 *
 * @author Alberto del Hierro
 */
public class Profesor extends Persona{

    public Profesor(String nombre, String nota)
    {
        super(nombre, nota);
    }
    
    @Override
    public boolean esProfesor() {
        return true;
    }
    
}
