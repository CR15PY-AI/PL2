import java.util.*;

public class Practice1 {
    public  static void mergeUniqueBooks() {
        ArrayList<String> books1 = new ArrayList<>(List.of("1", "2", "3", "4", "5", "6", "7", "8", "9"));
        ArrayList<String> books2 = new ArrayList<>(List.of("5", "11", "23", "68", "4", "6", "7", "1000", "9"));
        ArrayList<String> result = new ArrayList<>();

        for (String book : books1) {
            if (!books1.contains(book)) {
                result.add(book);
            }
        }
        for (String book : books2) {
            if (!books2.contains(book)) {
                result.add(book);
            }
        }
        System.out.println(result);
    }
    public static void findLongestMovie() {
        ArrayList<String> movies = new ArrayList<>(List.of("Побег из Шоушенка", "Крёстный отец", "Тёмный рыцарь", "Крёстный отец 2"));
        String longest = movies.get(0);
        for (String movie : movies) {
            if (movie.length() > longest.length()) {
                longest = movie;
            }
        }
        System.out.println(longest);
    }
    public static void countPizza() {
        ArrayList<String> food = new ArrayList<>(List.of("Pizza", "Манты", "Самсы", "Кебаб"));
        int count = 0;
        for (String item : food) {
            if (food.equals("Pizza")) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void removeBananas() {
        ArrayList<String> fruits = new ArrayList<>(List.of("яблоко", "Banana", "Banana", "апельсин", "Banana"));
        fruits.removeIf(fruit -> fruits.equals("Banana"));
        System.out.println(fruits);
    }
    public static void replaceColors() {
        ArrayList<String> colors = new ArrayList<>(List.of("Красный", "Зеленый", "СЕРО-БУРО-МАЛИНОВЫЙ"));

        for (int i = 0; i < colors.size(); i++) {
            colors.set(i, "Black");
        }

        System.out.println(colors);
    }
    public static void checkSublist() {
        ArrayList<String> sports = new ArrayList<>(List.of("Футбол", "Теннис", "Шахматы", "еще что то"));
        ArrayList<String> sub = new ArrayList<>(List.of("Шахматы", "Теннис"));
        System.out.println(sports.containsAll(sub));
    }
    public static void findIndexes() {
        ArrayList<String> flowers = new ArrayList<>(List.of("Роза", "Тюльпаны", "Роза", "Сирень"));
        System.out.println(flowers.indexOf("Роза"));
        System.out.println(flowers.lastIndexOf("Роза"));
    }
    public static void removeDuplicateAnimals() {
        ArrayList<String> animals = new ArrayList<>(List.of("Cat", "Dog", "Cat"));
        ArrayList<String> unique = new ArrayList<>();

        for (String a : animals) {
            if (!unique.contains(a)) {
                unique.add(a);
            }
        }
        System.out.println(unique);
    }
    public static void ArrayListToArray() {
        ArrayList<String> cities = new ArrayList<>(List.of("Тбилиси", "Москва", "Ростов"));
        String[] array = cities.toArray(new String[0]);
        System.out.println(Arrays.toString(array));
    }
    public static void ArrayToList() {
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        System.out.println(list);
    }
    public static void commonElements() {
        ArrayList<String> a = new ArrayList<>(List.of("USA", "France"));
        ArrayList<String> b = new ArrayList<>(List.of("France", "Germany"));
        ArrayList<String> common = new ArrayList<>();

        for (String c : a) {
            if (b.contains(c)) {
                common.add(c);
            }
        }
        System.out.println(common);
    }
    public static void removeEvenLength() {
        ArrayList<String> names = new ArrayList<>(List.of("АЗАМАТ", "АЗА", "АААААЗАМАТ", "ЗАМ"));
        names.removeIf(name -> name.length() % 2 == 0);
        System.out.println(names);
    }
    public static void shortestSong() {
        ArrayList<String> songs = new ArrayList<>(List.of("песня1", "песня222", "еще что то"));
        String shortest = songs.get(0);

        for (String s : songs) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }
        System.out.println(shortest);
    }
    public static void replaceVowels() {
        ArrayList<String> words = new ArrayList<>(List.of("azaadaaaaafhegrherg", "geuyrgeuirhglirg", "AJWLHDBAWdblwebflwbfliwfbAW"));

        for (int i = 0; i < words.size(); i++) {
            words.set(i, words.get(i).replaceAll("[AEIOUaeiou]", "*"));
        }
        System.out.println(words);
    }
    public static void partitionArrayList() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4));
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int n : numbers) {
            if (n % 2 == 0){
                even.add(n);}
            else {
                odd.add(n);
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
    public static void rotateDays() {
        ArrayList<String> days = new ArrayList<>(List.of("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
        Collections.rotate(days, 2);
        System.out.println(days);
    }
    public static void removeNulls() {
        ArrayList<String> students = new ArrayList<>(Arrays.asList("wwww", null, "wewewew", "dqwdq wdq wdqwdqw"));
        students.removeIf(s -> s == null);
        System.out.println(students);
    }
    public static void secondLongestMovie() {
        ArrayList<String> movies = new ArrayList<>(List.of("Я","Уже","Устал", "Придумывать", "Названия", "Фильмов"));
        movies.sort((a, b) -> b.length() - a.length());
        System.out.println(movies.get(1));
    }
    public static void replaceWithLengths() {
        ArrayList<String> fruits = new ArrayList<>(List.of("AAAAAAAAAA", "KAAAAAA"));
        ArrayList<Integer> lengths = new ArrayList<>();

        for (String f : fruits) {
            lengths.add(f.length());
        }
        System.out.println(lengths);
    }
    public static void nestedArrayList() {
        ArrayList<ArrayList<String>> departments = new ArrayList<>();
        departments.add(new ArrayList<>(List.of("4е34е34", "34е34е34е")));
        departments.add(new ArrayList<>(List.of("АВАВАААААААА", "уупупупуп")));
        System.out.println(departments);
    }

}