package Streams.practice.practice3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> txtMovies = Files.readAllLines(Paths.get("src/Streams/practice/practice3/Movie"));

        List<Movies> movies = txtMovies.stream()
                .map(moviess -> {
                    String[] data = moviess.split(", ");
                    return new Movies(data[0], data[1], Double.parseDouble(data[2]));
                })
                .toList();

        Map<String, Double> mapMovies = movies.stream()
                .collect(Collectors.groupingBy(Movies::getTitle, Collectors.averagingDouble(Movies::getRating)));

        mapMovies.forEach((title, average) -> {
            System.out.println("\nTitle: " + title + "\nAverage: " + average);
        });

        System.out.println("\nTop 3 of Movies are:");
        mapMovies.entrySet().stream()
                .sorted((m1, m2) -> Double.compare(m2.getValue(), m1.getValue()))
                .limit(3)
                .forEach(entry -> {
                    System.out.println("\nTitle: " + entry.getKey() + "\nAverage: " + entry.getValue());
                });
        /*
        mapMovies.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(3)
                .forEach(values -> {
                    System.out.println("\nTitle: " + values.getKey() + "\nAverage: " + values.getValue());
                });

         */
    }
}
