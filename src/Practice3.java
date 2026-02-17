import java.util.*;
public class Practice3 {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
        task21();
        task22();
    }

    static void task1() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Aida", 85);
        map.put("Azat", 92);
        map.put("Dana", 77);
        System.out.println(map);
        System.out.println(map.size());
    }

    static void task2() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Aida", 85);
        map.put("Azat", 92);
        map.put("Dana", 77);

        System.out.println(map.get("Aida"));
        System.out.println(map.get("Mira"));
        System.out.println(map.containsKey("Mira"));
    }

    static void task3() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Aida", 85);
        map.put("Azat", 92);
        map.put("Dana", 77);

        Integer old = map.put("Dana", 80);
        System.out.println(old);
        System.out.println(map);
    }

    static void task4() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Aida", 85);
        map.put("Azat", 92);
        map.put("Dana", 77);

        map.remove("Azat");
        System.out.println(map.remove("NonExisting"));
    }

    static void task5() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Aida", 85);
        map.put("Azat", 92);
        map.put("Dana", 77);

        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map.isEmpty());
    }

    static void task6() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Aida", 85);
        map.put("Azat", 92);
        map.put("Dana", 77);

        System.out.println(map.getOrDefault("Mira", -1));
        System.out.println(map.getOrDefault("Aida", -1));
        System.out.println(map.getOrDefault("NonExisting", -1));
    }

    static void task7() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Aida", 85);
        map.put("Azat", 92);
        map.put("Dana", 77);

        map.putIfAbsent("Aida", 90);
        map.putIfAbsent("Mira", 88);
        System.out.println(map);
    }

    static void task8() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Aida", 85);
        map.put("Azat", 92);
        map.put("Dana", 77);

        boolean ok = map.replace("Aida", 85, 86);
        System.out.println(ok);
        System.out.println(map);

        map.replace("Aida", 91);
        System.out.println(map);

        map.replace("NonExisting", 100);
        System.out.println(map);
    }

    static void task9() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Aida", 85);
        map.put("Azat", 92);
        map.put("Dana", 77);

        for (String key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        for (Integer val : map.values()) {
            System.out.print(val + " ");
        }
        System.out.println();

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey() + "=" + e.getValue() + " ");
        }
        System.out.println();
    }

    static void task10() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Aida", 85);
        map.put("Azat", 92);
        map.put("Dana", 77);
        map.put("Mira", 65);

        int count = 0;
        for (int score : map.values()) {
            if (score >= 80) count++;
        }
        System.out.println(count);
    }

    static void task11() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Aida", 85);
        map.put("Azat", 92);
        map.put("Dana", 77);
        map.put("Mira", 88);

        int max = Integer.MIN_VALUE;
        String name = "";

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                name = e.getKey();
            }
        }
        System.out.println(max + " " + name);
    }

    static void task12() {
        String text = "Java is fun and Java is powerful and fun";
        String[] words = text.toLowerCase().split("\\s+");

        Map<String, Integer> count = new HashMap<>();
        for (String w : words) {
            count.put(w, count.getOrDefault(w, 0) + 1);
        }
        System.out.println(count);
    }

    static void task13() {
        String s = "Mississippi";
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        char most = ' ';
        int max = 0;
        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                most = e.getKey();
            }
        }
        System.out.println(most + " " + max);
    }

    static void task14() {
        String[] words = {"hi", "book", "java", "sun", "loop", "map"};
        Map<Integer, List<String>> groups = new HashMap<>();

        for (String w : words) {
            int len = w.length();
            groups.computeIfAbsent(len, k -> new ArrayList<>()).add(w);
        }
        System.out.println(groups);
    }

    static void task15() {
        String s = "swiss";
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq.get(c) == 1) {
                System.out.println(c + " " + i);
                return;
            }
        }
        System.out.println("None");
    }

    static void task16() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                System.out.println(map.get(need) + " " + i);
                return;
            }
            map.put(nums[i], i);
        }
        System.out.println("Not found");
    }

    static void task17() {
        String[] arr = {"apple", "banana", "apple", "orange", "banana", "kiwi"};
        Map<String, Integer> freq = new HashMap<>();

        for (String item : arr) {
            freq.put(item, freq.getOrDefault(item, 0) + 1);
        }

        System.out.println(freq);

        for (Map.Entry<String, Integer> e : freq.entrySet()) {
            if (e.getValue() == 1) {
                System.out.print(e.getKey() + " ");
            }
        }
        System.out.println();

        for (Map.Entry<String, Integer> e : freq.entrySet()) {
            if (e.getValue() > 1) {
                System.out.print(e.getKey() + " ");
            }
        }
        System.out.println();
    }

    static void task18() {
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("a", 10);
        m1.put("b", 20);

        Map<String, Integer> m2 = new HashMap<>();
        m2.put("b", 20);
        m2.put("a", 10);

        System.out.println(m1.equals(m2));
    }

    static void task19() {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Aida", 85);
        scores.put("Azat", 45);
        scores.put("Dana", 30);
        scores.put("Mira", 72);

        Iterator<Map.Entry<String, Integer>> it = scores.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            if (entry.getValue() < 60) {
                it.remove();
            }
        }
        System.out.println(scores);
    }

    static void task20() {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Aida", 40);
        scores.put("Azat", 35);
        scores.put("Dana", 50);

        Map<String, Integer> add = new HashMap<>();
        add.put("Azat", 10);
        add.put("Dana", 45);

        for (Map.Entry<String, Integer> e : add.entrySet()) {
            scores.merge(e.getKey(), e.getValue(), Integer::sum);
        }
        System.out.println(scores);
    }

    static void task21() {
        Map<Integer, List<String>> map = new HashMap<>();

        map.computeIfAbsent(85, k -> new ArrayList<>()).add("Aida");
        map.computeIfAbsent(85, k -> new ArrayList<>()).add("Dana");
        map.computeIfAbsent(92, k -> new ArrayList<>()).add("Azat");
        map.computeIfAbsent(77, k -> new ArrayList<>()).add("Mira");

        System.out.println(map);
    }

    static void task22() {
        String text = "apple banana apple orange banana apple kiwi banana";
        String[] words = text.split(" ");

        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int k = Math.min(2, list.size());
        for (int i = 0; i < k; i++) {
            System.out.print(list.get(i).getKey() + " ");
        }
        System.out.println();
    }
}