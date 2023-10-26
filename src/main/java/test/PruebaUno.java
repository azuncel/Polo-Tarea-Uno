package test;

import modelo.Estudiante;

public class PruebaUno {
    public static void main(String[] args) {
        Estudiante estudianteUno = new Estudiante("Polo","Sauria",34,
                986532,"Programación" );
        System.out.println(estudianteUno.getNombre());
        System.out.println(estudianteUno.toString());
        System.out.println();
        estudianteUno.setApellido("Saurio");
        System.out.println(estudianteUno.toString());
        System.out.println();

    }
}
