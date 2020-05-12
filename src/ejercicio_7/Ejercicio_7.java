/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7;

/**
 *
 * @author Maxi
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Materia ingles = new Materia(100, "Ingles", 2020);
        Materia matematicas = new Materia(200, "Matematicas", 2015);
        Materia laboratorio = new Materia(300, "Laboratorio", 2017);

        Alumno lopez = new Alumno(55, "Lopez", "Juan");
        Alumno martinez = new Alumno(1002, "Martinez", "Silvana");
        
        lopez.agregarMateria(ingles);
        lopez.agregarMateria(matematicas);
        lopez.agregarMateria(laboratorio);
        
        martinez.agregarMateria(ingles);
        martinez.agregarMateria(matematicas);
        martinez.agregarMateria(laboratorio);
        martinez.agregarMateria(laboratorio);
        
        martinez.agregarMateria(new Materia(200,"Matematicas",2015));
        martinez.agregarMateria(new Materia(200,"Matematicas",2015));
        martinez.cantidadMaterias();
        lopez.cantidadMaterias();

    }       


}




    
    

