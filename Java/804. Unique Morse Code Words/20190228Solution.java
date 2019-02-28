//my answer

class 20190228Solution {
    private static String[] map = {
        ".-", "-...", "-.-.", "-..", ".", "..-.",
        "--.", "....", "..", ".---", "-.-", ".-..",
        "--", "-.", "---", ".--.", "--.-", ".-.",
        "...", "-", "..-", "...-", ".--", "-..-",
        "-.--", "--.."
    };
    
    public int uniqueMorseRepresentations(String[] words) {
        if (words == null) return 0;
        HashSet<String> set = new HashSet<String>();
        for (String s : words) {
            StringBuilder ss = new StringBuilder();
            for (char c : s.toCharArray()) {
                ss.append(map[c - 'a']);
            }
            set.add(ss.toString());
        }
        return set.size();
    }
}

// Set<String> res = new HashSet<>();