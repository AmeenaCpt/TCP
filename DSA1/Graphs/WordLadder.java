package DSA1.Graphs;

import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                String word = queue.poll();
                char[] chars = word.toCharArray();

                for (int i = 0; i < chars.length; i++) {
                    char original = chars[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[i] = c;
                        String next = new String(chars);
                        if (next.equals(endWord)) return level + 1;
                        if (wordSet.remove(next)) queue.offer(next);
                    }
                    chars[i] = original;
                }
            }
            level++;
        }

        return 0;
    }

    public static void main(String[] args) {
        WordLadder obj = new WordLadder();
        List<String> wordList1 = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        List<String> wordList2 = Arrays.asList("hot", "dot", "dog", "lot", "log");

        System.out.println("Length 1: " + obj.ladderLength("hit", "cog", wordList1)); // 5
        System.out.println("Length 2: " + obj.ladderLength("hit", "cog", wordList2)); // 0
    }
}
