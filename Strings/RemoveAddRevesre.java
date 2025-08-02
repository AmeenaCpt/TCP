package Strings;
public class RemoveAddRevesre {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abab");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean isDuplicate = false;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    s.deleteCharAt(i);  
                    i = -1;             
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                continue; 
            }
        }
        s.reverse();
        System.out.println(s.toString());
    }
}
