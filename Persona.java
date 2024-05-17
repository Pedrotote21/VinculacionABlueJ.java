import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class Persona {

    // Atributos de la clase Persona
    private String nombre;
    private int edad;
    private char genero;
    private String direccion;

    // Constructor de la clase Persona
    public Persona(String nombre, int edad, char genero, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
    }

    // Métodos para acceder y modificar los atributos

    // Método para obtener el nombre de la persona
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre de la persona
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener la edad de la persona
    public int getEdad() {
        return edad;
    }

    // Método para establecer la edad de la persona
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para obtener el género de la persona
    public char getGenero() {
        return genero;
    }

    // Método para establecer el género de la persona
    public void setGenero(char genero) {
        this.genero = genero;
    }

    // Método para obtener la dirección de la persona
    public String getDireccion() {
        return direccion;
    }

    // Método para establecer la dirección de la persona
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método para imprimir información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Dirección: " + direccion);
    }
    
    //Listar las personas por edad y años
    public static void main(String[] args){
        
        ArrayList<Persona> listPersonas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        boolean agregarOtraPersona = true;
        while (agregarOtraPersona){
            
            System.out.println("Ingrese el nombre de la persona:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la edad de la persona:");
            int edad = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el género de la persona (M/F):");
            char genero = scanner.nextLine().charAt(0);

            System.out.println("Ingrese la dirección de la persona:");
            String direccion = scanner.nextLine();
            
            Persona nuevaPersona = new Persona(nombre, edad, genero, direccion);
            listPersonas.add(nuevaPersona);
            
            System.out.println("Desea ingresar a alguna otra persona(s\n)");
            String respuesta = scanner.nextLine();
            agregarOtraPersona = respuesta.equalsIgnoreCase("s");
            
        }
        
        scanner.close();
        //Mostrar los datos de todas las personas ingresadas a la lista
        System.out.println("Lista de personas:");
        
        for (Persona persona : listPersonas) {
            persona.mostrarInformacion();
            System.out.println(); // Salto de línea entre cada persona
        }
    }
}
