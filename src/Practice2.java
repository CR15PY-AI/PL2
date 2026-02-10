import java.util.*;
public class Practice2 {
    public static void main(String[] args) {
        //retainCommon();
        //containsAll();
        //deduplicateWords();
        CaseInsensitiveUniqueWords();
    }

    public static void uniqueInteger() {
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5);
        HashSet<Integer> uniq = new HashSet<>(nums);
        System.out.println(uniq);
    }

    public static void isAllowed() {
        HashSet<String> allowedName = new HashSet<>(Arrays.asList("name1", "name2", "name3", "name4", "name5", "name6", "name7", "name8", "name9"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Write name to check");
        String name = sc.nextLine();
        boolean res = false;
        for (String i : allowedName) {
            if (allowedName.contains(i)) {
                res = true;
            }
        }
        System.out.println(res);
    }

    public static void SizeAndEmptiness() {
        HashSet<Integer> numbs = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(numbs.size());
        numbs.clear();
        System.out.println(numbs.isEmpty());
    }

    public static void removeElements() {
        HashSet<String> names = new HashSet<>(Arrays.asList("name1", "name2", "name3", "name4", "name5"));
        names.remove("name1");
        System.out.println(names);
    }

    public static void bulkAdd() {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        set1.addAll(set2);
        System.out.println(set1);
    }

    public static void bulkRemove() {
        HashSet<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        HashSet<Integer> setB = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10));
        for (int i : setB) {
            if (setA.contains(i)) {
                setA.remove(i);
            }
        }
        System.out.println(setA);
    }

    public static void retainCommon() {
        HashSet<Integer> setX = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        HashSet<Integer> setY = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9));
        setX.retainAll(setY);
        System.out.println(setX);
    }

    public static void containsAll() {
        HashSet<Integer> setV = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        HashSet<Integer> setU = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9));
        boolean a = setV.containsAll(setU);
        if (a == true) {
            System.out.println("True, Ура бл");
        } else {
            System.out.println("False");
        }
        System.out.println(a);
    }

    public static void deduplicateWords() {
        String sentence = "word1 word2 word3 word4 word5 word5 word5";
        HashSet<String> duplicatedWords = new HashSet<>(Arrays.asList(sentence.split("\\s+")));
        System.out.println(duplicatedWords);
    }

    public static void CaseInsensitiveUniqueWords() {
        String[] words = {"APPLE", "APPLe", "APPle", "APple", "Apple", "apple"};
        HashSet<String> uniqueLower = new HashSet<>();

        for (String word : words) {
            uniqueLower.add(word.toLowerCase());
        }
        System.out.println(uniqueLower);
    }

    public static void basicOffer() {
        ArrayDeque<Integer> queue = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(queue.peek());
        System.out.println(queue.peekFirst());
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    public static void stackBehavior() {
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
    public static void addFirstLast() {
        ArrayDeque<String> aaa = new ArrayDeque<>();
        aaa.addFirst("1");
        aaa.addFirst("2");
    }
    public static void offerFirstLast() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        boolean ok1 = deque.offerFirst(100);
        boolean ok2 = deque.offerLast(200);
        System.out.println(ok1);
        System.out.println(ok2);
        System.out.println(deque);
    }
    public static void peekVariants() {
        ArrayDeque<String> deque = new ArrayDeque<>(Arrays.asList("X", "Y", "Z"));
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
    }
    public static void pollVariants() {
        ArrayDeque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        while (!deque.isEmpty()) {
            System.out.println(deque.poll());
        }
    }
    public static void RemoveFirstLast() {
        ArrayDeque<String> deque = new ArrayDeque<>(Arrays.asList("a", "b", "c", "b", "a"));
        boolean removed1 = deque.removeFirstOccurrence("b");
        boolean removed2 = deque.removeLastOccurrence("a");
        System.out.println(deque);

    }
    public static void isEmptyAndSize() {
        ArrayDeque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(deque.size());
        System.out.println(deque.isEmpty());
    }
    public static void clearDeque(){
        ArrayDeque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5));
        deque.clear();
        System.out.println(deque.peek());
        System.out.println(deque.isEmpty());
    }
    public static void task20PalindromeCheck(String input) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();
            if (Character.toLowerCase(first) != Character.toLowerCase(last)) {
                isPalindrome = false;
                break;
            }



        }
        System.out.println(isPalindrome);
    }
}

