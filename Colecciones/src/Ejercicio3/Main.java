package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN Buenos Aires");

        // 1. Crear 3 profesores y 5 cursos
        Profesor prof1 = new Profesor("P001", "Juan Pérez", "Matemática");
        Profesor prof2 = new Profesor("P002", "Ana Gómez", "Programación");
        Profesor prof3 = new Profesor("P003", "Luis Fernández", "Física");

        Curso c1 = new Curso("C001", "Álgebra");
        Curso c2 = new Curso("C002", "Cálculo");
        Curso c3 = new Curso("C003", "Java");
        Curso c4 = new Curso("C004", "Física I");
        Curso c5 = new Curso("C005", "Bases de Datos");

        // 2. Agregar profesores y cursos a la universidad
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3. Asignar profesores a cursos
        uni.asignarProfesorACurso("C001", "P001");
        uni.asignarProfesorACurso("C002", "P001");
        uni.asignarProfesorACurso("C003", "P002");
        uni.asignarProfesorACurso("C004", "P003");
        uni.asignarProfesorACurso("C005", "P002");

        // 4. Listar cursos con profesor y profesores con sus cursos
        uni.listarCursos();
        uni.listarProfesores();

        // 5. Cambiar el profesor de un curso
        System.out.println("\n=== Cambiar profesor de Java a Ana Gómez ===");
        uni.asignarProfesorACurso("C003", "P003");
        uni.listarCursos();
        uni.listarProfesores();

        // 6. Remover un curso
        System.out.println("\n=== Remover curso C002 ===");
        uni.eliminarCurso("C002");
        uni.listarCursos();
        uni.listarProfesores();

        // 7. Remover un profesor
        System.out.println("\n=== Remover profesor Ana Gómez ===");
        uni.eliminarProfesor("P002");
        uni.listarCursos();
        uni.listarProfesores();

        // 8. Reporte: cantidad de cursos por profesor
        System.out.println("\n=== Reporte: cantidad de cursos por profesor ===");
        for (Profesor p : new Profesor[]{prof1, prof2, prof3}) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " curso(s)");
        }
    }
}