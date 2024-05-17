import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    private String nombre;
    Scanner leer = new Scanner(System.in);
    private int edad;
    private float notas;
    private List<Alumno> listAlumnos;
    

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno()
    {
        
        this.nombre = nombre;
        this.edad = edad;
        this.notas = notas;
        this.listAlumnos = new ArrayList<>();
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    //Metodo para listar a los alumnos y los promedios
    
    public void calcularPromedio(){
        
        int i = 0;
        float suma = 0;
        float promedio = 0;
        System.out.println("ingrese la cantidad de notas:");
        int n = leer.nextInt();
        System.out.println("ingrese las notas a promediar despues:");
        notas = leer.nextFloat();
        while (i <= n){
            
            suma = suma + notas;
            promedio = suma / n;
            
            i++;
        }
        
    }
}
