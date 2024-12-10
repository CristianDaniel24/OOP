package Streams.EjerciciosNotion.todo.ejercicio3;

public class Student {
    private String name;
    private String subject;
    private Double qualification;

    public Student(String name, String subject, Double qualification) {
        this.name = name;
        this.subject = subject;
        this.qualification = qualification;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public double getQualification() {
        return qualification;
    }
}
