import java.util.*;

public class Main {
    public static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

    public static final List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

    public static void taskOne(List<Integer> number) {
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) % 2 != 0) {
                System.out.println(number.get(i));
            }
        }
    }

    public static void taskTwo(List<Integer> number) {
        Collections.sort(number);
        int minNum = Integer.MIN_VALUE;
        for (int num : number) {
            if (num % 2 == 0 && num != minNum) {
                System.out.println(num);
                minNum = num;
            }
        }
    }

    public static void taskThree() {
        Set<String> words = new HashSet(strings);
        System.out.println(words);
    }

    public static void taskFour(List<String> strings) {
        Map<String, Integer> doubleStrings = new HashMap<>();
        for (String string : strings) {
            if (!doubleStrings.containsKey(string)) {
                doubleStrings.put(string, 1);
            } else {
                doubleStrings.put(string, doubleStrings.get(string) + 1);
            }
        }
        System.out.println(doubleStrings.values());
    }

    public static void main(String[] args) {
        System.out.println("Задача номер 1: ");
        taskOne(nums);
        System.out.println("Задача номер 2: ");
        taskTwo(nums);
        System.out.println("Задача номер 3: ");
        taskThree();
        System.out.println("Задача номер 4: ");
        taskFour(strings);
    }
}