/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;

/**
 *
 * @author pedroromero
 */
public class Estudiante {
    private int Cedula;
    private int Edad;
    private int Creditos_Aprobados;
    private int Creditos_Disponibles;
    private int Matricula;
    private double promedio;
    private String Nombre;
    private String Email;
    private List Profesores;

    public int getCedula() {return Cedula;}
    public void setCedula(int Cedula) {this.Cedula = Cedula;}
    public int getEdad() {return Edad;}
    public void setEdad(int Edad) {this.Edad = Edad;}
    public int getCreditos_Aprobados() {return Creditos_Aprobados;}
    public void setCreditos_Aprobados(int Creditos_Aprobados)
    {this.Creditos_Aprobados = Creditos_Aprobados;}
    public int getCreditos_Disponibles() {return Creditos_Disponibles;}
    public void setCreditos_Disponibles(int Creditos_Disponibles) 
    {this.Creditos_Disponibles = Creditos_Disponibles;}
    public int getMatricula() {return Matricula;}
    public void setMatricula(int Matricula) {this.Matricula = Matricula;}
    public String getEmail() {return Email;}
    public void setEmail(String Email) {this.Email = Email;}
    public String getNombre() {return Nombre;}
    public void setNombre(String nombre) {this.Nombre = nombre;}
    public double getPromedio() {return promedio;}
    public void setPromedio(double promedio) {this.promedio = promedio;}
    public List getProfesores() {return Profesores;}
    public void setProfesores(List Profesores) {this.Profesores = Profesores;}
    
    public Estudiante(String Nombre, int Edad, double Promedio ){
        this.setNombre(Nombre);
        this.setEdad(Edad);
        this.setPromedio(Promedio);  
    }    
    public Estudiante(String Nombre, int Edad){
        this(Nombre, Edad, 0);
    }
    public Estudiante(String Nombre){
        this(Nombre,0,0);
    }
    public Estudiante(){
        this(null);
    }
    
    //Override
    public String toString(){
        return "Mi nombre es: "+this.getNombre()+"\n"+"Tengo: "+this.Edad
                +"años"+"\n"+"Mi P.A.P.A es: "+this.getPromedio();
    }
}
