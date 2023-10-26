package modelo;

public class Estudiante extends Persona {
    private int matricula;
    private String materia;
    public Estudiante(String nombre, String apellido, int edad, int matricula, String materia){
        super(nombre, apellido, edad);
        this.matricula = matricula;
        this.materia = materia;
    }

    public int getMatricula(){
        return matricula;
    }

    public String getMateria() {
        return materia;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Estudiante{" +
                "matricula=" + matricula +
                ", materia='" + materia + '\'' +
                '}';
    }
}
