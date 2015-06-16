/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Alberto del Hierro
 */
public abstract class Persona {
    protected String nombre;
    protected String dni;
    protected ArrayList<Asignatura> asignaturas;
    
    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
        asignaturas = new ArrayList<>();
    }
    
    public void anyadirAsignatura(Asignatura a)
    {
        asignaturas.add(a);
    }
    
    public abstract boolean esProfesor();
    
    
    public void mostrarListadoAsignaturasNota()
    {
        System.out.println(nombre);
        for (Asignatura asignatura : asignaturas) {
            System.out.println(asignatura.getNombre());
            System.out.println(asignatura.getNota());
        }
    }
    
    public String getDni()
    {
        return dni;
    }
    
    public void setDni(String dni)
    {
        this.dni = dni;
    }
    
    public ArrayList<Asignatura> getAsignaturas()
    {
        return asignaturas;
    }
    
    public void ordenarPorAsignaturas()
    {
        /*  No me funciona y no he conseguido averiguar porque.
        Collections.sort(asignaturas, new Comparator() {
	@Override
	public String compare(Asignatura a1, Asignatura a2) {
            
		return new String(a1.getNombre()).compareTo(new String(a2.getNombre()));
	}
        });
        */
    }
    
    public void ordenarPorNota()
    {
        /*
        Collections.sort(asignaturas, new Comparator() {
	@Override
	public double compare(Asignatura a1, Asignatura a2) {
            
		return new double(a1.getNota()).compareTo(new String(a2.getNota()));
	}
        });
        */
    }
}
