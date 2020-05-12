/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7;
import java.util.HashSet;

/**
 *
 * @author Maxi
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;

    HashSet<Materia> materia1 = new HashSet<Materia>();
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;

    }

    public void agregarMateria(Materia m) {

        if (materia1.add(m)) { 
            System.out.println("Agregado con exito");
        } else {

            System.out.println("No se ha podido agregar cliente, clave repetida");
        }
    }

    public void cantidadMaterias() {
        int i=0;
        for (Materia materia : materia1) {
            System.out.println(materia.getNombre());
            i++;
        }System.out.println(apellido+" tiene :"+i+" materias anotadas");
    }
    
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}





    

