package Ejercicio3;

import java.util.ArrayList;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public ArrayList<Curso> getCursos() { return cursos; }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            c.setProfesor(this);
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println(nombre + " no dicta cursos.");
            return;
        }
        System.out.println("Cursos de " + nombre + ":");
        for (Curso c : cursos) {
            System.out.println("- " + c.getCodigo() + " : " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Especialidad: " + especialidad +
                ", Cantidad de cursos: " + cursos.size());
    }

    @Override
    public String toString() {
        return nombre + " (" + especialidad + ")";
    }
}