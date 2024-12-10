package HackerRankPractica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        studentList.sort((o1, o2) -> {
            if (o1.getCgpa() != o2.getCgpa()) {
                return Double.compare(o2.getCgpa(), o1.getCgpa());
            } else if (o1.getFname().equals(o2.getFname())) {
                return o1.getFname().compareTo(o2.getFname());
            } else {
                return Integer.compare(o1.getId(), o2.getId());
            }
        });
        for (Student student : studentList) {
            System.out.println(student.getFname());
        }
    }
}
