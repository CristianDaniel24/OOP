package thread.ejerciciosCompletos.ejercicio1;

import java.util.List;

public class ThreadClassEjercicio1 extends Thread {
    private List<String> names;
    private List<String> namesFinal;

    ThreadClassEjercicio1(List<String> names) {
        this.names = names;
    }

    public List<String> getNamesFinal() {
        return namesFinal;
    }

    @Override
    public void run() {
        namesFinal = names.stream()
                .map(String::toUpperCase)
                .sorted()
                .toList();
    }
}
