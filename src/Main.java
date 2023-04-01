import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("orange", "banana", "lemon", "orange", "apple"));
        task1(nums);
        System.out.println();
        task2(nums);
        System.out.println();
        task3(words);
        System.out.println();
        task4(words);
    }

    public static void task1(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 !=0) {
                System.out.println(num);
            }
        }
    }
    public static void task2(List<Integer> nums) {
        Collections.sort(nums);
        Set<Integer> noDublicate = new HashSet<>();
        for (Integer num : nums) {
            if (!noDublicate.contains(num)) {
                if (num % 2 == 0) {
                    System.out.println(num);
                    noDublicate.add(num);
                }
            }
        }
    }

    public static void task3(List<String> words) {
        Set<String> word = new HashSet<>(words);
        System.out.println(word);
    }

    public static void task4(List<String> words) {
        Map<String,Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
    }
    }