/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 *
 * @author reroes
 */
public class Estudiante extends Persona {

    private double matricula;
    // se crea un constuctor con los atributos heredados y se le añade el atributo propio de estudiante
    public Estudiante(String n, String a, int e, double mat) {
        //se llama los atibutos del constructor de persona
        super(n, a, e);
        setMatricula(mat);
    }
    // se sobre escribe sobre los metodos 
    @Override
    public void setNombre(String n) {
        nombre = n.toUpperCase();
    }

    public void setMatricula(double mat) {
        matricula = mat;
    }

    public double getMatricula() {
        return matricula;
    }

    
    // se sobre escribe metodo toString 
    @Override
    public String toString() {

        return String.format("%s - %f", super.toString(), getMatricula());
    }
}
