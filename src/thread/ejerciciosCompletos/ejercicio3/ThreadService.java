package thread.ejerciciosCompletos.ejercicio3;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ThreadService extends Thread {
    public static final String PATH = "src/thread/ejerciciosCompletos/ejercicio3/";
    private final String nameFile;
    private List<Employee> employee;
    private List<Employee> listMinors25;
    private List<Employee> listElderly30;

    public ThreadService(String nameFile) {
        this.listMinors25 = new LinkedList<>();
        this.listElderly30 = new LinkedList<>();
        this.employee = new LinkedList<>();
        this.nameFile = nameFile;
    }

    @Override
    public void run() {
        try {
            List<String> lines = Files.readAllLines(Path.of(PATH.concat(nameFile)));

            employee = lines.stream()
                    .map(line -> {
                        String[] data = line.split(",");
                        return new Employee(data[0].trim(), data[1].trim(), Integer.parseInt(data[2].trim()));
                    }).collect(Collectors.toList());
            minors25();
            elderly30();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void minors25() {
        listMinors25 = employee.stream()
                .filter(emplo -> emplo.edad() <= 25)
                .collect(Collectors.toList());
    }

    public void elderly30() {
        listElderly30 = employee.stream()
                .filter(emplo -> emplo.edad() >= 30)
                .collect(Collectors.toList());
    }

    public List<Employee> getListMinors25() {
        return listMinors25;
    }

    public List<Employee> getListElderly30() {
        return listElderly30;
    }

    public List<Employee> getEmployee() {
        return employee;
    }
}
