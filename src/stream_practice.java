import java.util.*;
import java.util.stream.*;
public class stream_practice {
    static class Student {
        String name;
        String group;
        double gpa;
        public Student(String name, String group, double gpa) {
            this.name = name;
            this.group = group;
            this.gpa = gpa;
        }
        public String getGroup() {
            return group;
        }
        public double getGpa() {
            return gpa;
        }
        public String toString() {
            return name + "(" + gpa + ")";
        }
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> words = Arrays.asList("abc", "def", "wdqwd", "dqwdgr", "grgegre", "FDDDDD", "dddd", "owhefowehfpouw");
        List<Student> students = Arrays.asList(
                new Student("Azamat", "A1", 3.8),
                new Student("AZAMAT", "A2", 3.2),
                new Student("DONALD TRuMP", "B1", 3.9),
                new Student("CHARLIE KIRK", "B2", 2.9),
                new Student("AaAaAaAa", "C1", 3.6),
                new Student("Aza", "C2", 4.0)
        );
        System.out.println(task1(numbers));
        System.out.println(task2(words));
        System.out.println(task3(words));
        System.out.println(task4(words));
        System.out.println(task5(numbers));
        System.out.println(task6(numbers));
        System.out.println(task7(words));
        System.out.println(task8(students));
        System.out.println(task9(students));
        System.out.println(task10(students));
        System.out.println(task11(students));

    }

    public static List<Integer> task1 (List<Integer> list) {
        return list.stream()
                .filter(n -> n % 2 == 0)
                .toList();
    }
    public static List<String> task2 (List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .toList();
    }
    public static List<String> task3 (List<String> list) {
        return list.stream()
                .filter(s -> s.startsWith("a"))
                .toList();
    }
    public static List<String> task4 (List<String> list) {
        return list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
    }
    public static String task5(List<Integer> list) {

        int min = list.stream()
                .min(Integer::compareTo)
                .orElseThrow();;

        int max = list.stream()
                .max(Integer::compareTo)
                .orElseThrow();;

        return "Min: " + min + ", Max: " + max;
    }
    public static List<Integer> task6 (List<Integer> list) {
        return list.stream()
                .distinct()
                .toList();
    }
    public static String task7 (List<String> list) {
        return list.stream()
                .collect(Collectors.joining(", "));
    }
    public static Map<String, List<Student>> task8(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getGroup));
    }
    public static double task9(List<Student> students) {
        return students.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0);
    }
    public static List<Student> task10(List<Student> students) {
        return students.stream()
                .filter(s -> s.getGpa() > 3.5)
                .limit(3)
                .toList();
    }
    public static int task11(List<Student> students) {
        return (int) students.stream()
                .filter(s -> s.getGpa() > 3.5)
                .count();
    }
}

