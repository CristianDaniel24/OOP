package thread.ejerciciosCompletos.ejercicio4;

public class Student {
    private final String name;
    private final String grado;
    private final Double nota1;
    private final Double nota2;
    private final Double nota3;

    public Student(String name, String grado, Double nota1, Double nota2, Double nota3) {
        this.name = name;
        this.grado = grado;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getName() {
        return name;
    }

    public String getGrado() {
        return grado;
    }

    public Double getNota1() {
        return nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public Double getPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }
}
