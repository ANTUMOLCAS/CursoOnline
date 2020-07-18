/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import DaoImp.DaoImpCursos;
import Class.Cursos;
import DaoImp.DaoImpEstudiantes;
import Class.Estudiantes;

/**
 *
 * @author Antum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //----------CURSO-------------------------------  
        //DaoImpCursos daoimpCursos = new DaoImpCursos();
        //daoimpCursos.newCursos(new Cursos(1, "PROGRAMACION I"));
        //daoimpCursos.newCursos(new Cursos(2, "PROGRAMACION II"));
        //daoimpCursos.newCursos(new Cursos(3, "PROGRAMACION III"));
        
        //ACTUALIZAR CURSOS
        //daoimpCursos.actualizarCursos(new Cursos(3, "MATEMATICAS"));
        
        //ELIMINAR CURSOS
        //daoimpCursos.eliminarCursos(3);
    
        //for (Cursos c : daoimpCursos.listarCursos()) {
        //    System.out.println(c);
        //}
        
        
        //------------ESTUDIANTES-----------------------
        
        DaoImpEstudiantes daoImpEstudiantes = new DaoImpEstudiantes();
        //daoImpEstudiantes.nuevosEstudiantes(new Estudiantes(1, "EDUARDO DAVID","OLVERA CASTRO","edvidolcas@gmail.com"));
        //daoImpEstudiantes.nuevosEstudiantes(new Estudiantes(2, "KELVIN","MATAMOROS","kelvin36@gmail.com"));
        //daoImpEstudiantes.nuevosEstudiantes(new Estudiantes(3, "BRYAN","LEON","bryanleon100@gmail.com"));
        
        //ACTUALIZAR
        daoImpEstudiantes.actualizarEstudiantes(new Estudiantes(3, "dd", "dd", "dd"));
        
        //ELIMINAR
        //daoImpEstudiantes.eliminarEstudiantes(3);
        
        for (Estudiantes e : daoImpEstudiantes.listarEstudiantes()){
            System.out.println(e);
                }
    
    }
}
    

