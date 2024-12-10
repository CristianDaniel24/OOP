package thread.ejerciciosCompletos.ejercicioNotion;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadService extends Thread {
    public static final String PATH = "src/thread/ejerciciosCompletos/ejercicioNotion/";

    private final String nameFile;
    private Map<Integer, List<Long>> numbers;
    private Map<Integer, List<Long>> cuadradosNums;
    private Map.Entry<Integer, Long> sumCuadrados;
    private Long sumTotalCuadrados;

    public ThreadService(String nameFile) {
        this.nameFile = nameFile;
        this.numbers = new LinkedHashMap<>();
        this.cuadradosNums = new LinkedHashMap<>();
    }

    @Override
    public void run() {
        try {
            List<String> lines = Files.readAllLines(Path.of(PATH.concat(nameFile)));

            numbers = IntStream.range(0, lines.size())
                    .boxed()
                    .collect(Collectors.toMap(
                            i -> i + 1,
                            i -> Arrays.stream(lines.get(i).split(","))
                                    .filter(line -> line.matches("^\\d")).map(Long::parseLong).toList()
                    ));

            cuadradosNums = numbers.entrySet().stream()
                    .collect(Collectors.toMap(
                            Map.Entry::getKey, entry -> entry.getValue().stream().map(n -> n * n).toList()
                    ));

            sumCuadrados = cuadradosNums.entrySet().stream()
                    .collect(Collectors.toMap(
                            Map.Entry::getKey, entry -> entry.getValue().stream().mapToLong(Long::longValue).sum()
                    ))
                    .entrySet().stream()
                    .max(Map.Entry.comparingByValue())
                    .orElseThrow(); //Lanza una excepcion si no hay valores

            sumTotal();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Long getSumTotalCuadrados() {
        return sumTotalCuadrados;
    }

    public String getNameFile() {
        return nameFile;
    }

    public Map.Entry<Integer, Long> getSumCuadrados() {
        return sumCuadrados;
    }

    public void sumTotal() {
        sumTotalCuadrados = cuadradosNums.values().stream()
                .flatMap(List::stream)
                .mapToLong(Long::longValue)
                .sum();
    }
}
