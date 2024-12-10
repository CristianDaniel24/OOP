package thread.ejerciciosCompletos.ejercicio4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ThreadService extends Thread {
    public static final String PATH = "src/thread/ejerciciosCompletos/ejercicio4/";
    private final String nameFile;
    private List<Student> student;
    private Double average = 0.0;


    public ThreadService(String nameFile) {
        this.nameFile = nameFile;
        this.student = new LinkedList<>();
    }

    @Override
    public void run() {
        try {
            List<String> lines = Files.readAllLines(Path.of(PATH.concat(nameFile)));

            student = lines.stream()
                    .map(line -> {
                        String[] data = line.split(",");
                        return new Student(data[0], data[1], Double.parseDouble(data[2]), Double.parseDouble(data[3]), Double.parseDouble(data[4]));
                    }).collect(Collectors.toList());
            averageStudent();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Double getAverage() {
        return average;
    }

    public List<Student> getStudent() {
        return student;
    }


    public void averageStudent() {
        double totalPromedio = student.stream()
                .mapToDouble(Student::getPromedio).sum();
        average = totalPromedio / student.size();
    }
}
