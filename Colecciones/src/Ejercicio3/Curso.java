package Ejercicio3;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor p) {
        // Quitar este curso del profesor actual si existía
        if (this.profesor != null && this.profesor != p) {
            this.profesor.eliminarCurso(this);
        }

        this.profesor = p;

        // Agregar este curso al nuevo profesor si no estaba
        if (p != null && !p.getCursos().contains(this)) {
            p.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Código: " + codigo + ", Nombre: " + nombre +
                ", Profesor: " + (profesor != null ? profesor.getNombre() : "Sin asignar"));
    }
}