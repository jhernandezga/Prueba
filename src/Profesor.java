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
public class Profesor {
    private int Cedula;
    private int Edad;
    private String Nombre;
    private String Email;
    private List Cursos;
    private String Especialidad;

    public int getCedula() {return Cedula;}
    public void setCedula(int Cedula) {this.Cedula = Cedula;}
    public int getEdad() {return Edad;}
    public void setEdad(int Edad) {this.Edad = Edad;}
    public String getNombre() {return Nombre;}
    public void setNombre(String Nombre) {this.Nombre = Nombre;}
    public String getEmail() {return Email;}
    public void setEmail(String Email) {this.Email = Email;}
    public List getCursos() {return Cursos;}
    public void setCursos(List Cursos) {this.Cursos = Cursos;}
    public String getEspecialidad() {return Especialidad;}
    public void setEspecialidad(String Especialidad) {this.Especialidad = Especialidad;}
    
    public Profesor(String Nombre, int Edad, int Cedula,String Especialidad,
            List Cursos,String Email){
        this.setNombre(Nombre);
        this.setEdad(Edad);
        this.setCedula(Cedula);
        this.setCursos(Cursos);
        this.setEspecialidad(Especialidad);
        this.setEmail(Email);
    }
    
    public Profesor (String Nombre, int Edad, int Cedula,String Especialidad,
            List Cursos){
        this(Nombre, Edad, Cedula, Especialidad, Cursos, "@unal.edu.co");
    }
    public Profesor (String Nombre, int Edad, int Cedula,String Especialidad){
        this(Nombre, Edad, Cedula, Especialidad, null);
    }
    public Profesor (String Nombre, int Edad, int Cedula){
        this(Nombre, Edad, Cedula,null);
    }
     public Profesor (String Nombre, int Edad){
        this(Nombre, Edad,0);
    }
     public Profesor (String Nombre){
        this(Nombre,0);
    }
     public Profesor (){
        this(null);
    }
     public String toString(){
        return "Mi nombre es: "+this.getNombre()+"\n"+"Tengo: "+this.Edad
                +"años"+"\n"+"Mi Especialidad es: "+this.getEspecialidad();
    }
}
