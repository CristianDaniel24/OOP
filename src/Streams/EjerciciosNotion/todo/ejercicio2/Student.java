package Streams.EjerciciosNotion.todo.ejercicio2;

public class Student {
    private String name;
    private String subject;
    private Double notes;

    public Student(String name, String subject, Double notes) {
        this.name = name;
        this.subject = subject;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public double getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return "\nName: " + name + "\nNote: " + notes;
    }
}
