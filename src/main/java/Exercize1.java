import java.util.HashMap;

public class Exercize1 {
    public static Map<Character, Integer> main(String[] args) {
        public Map<Character, Integer> countDuplicateCharacters(String str) {
            Map<Character, Integer> result = new HashMap<>();
            for (int i = 0; i<str.length(); i++){
                char ch = str.charAt(i);
                result.compute(ch, (k, v) -> (v == null) ? l : ++v);
            }
            return result;
        }
    }
}
