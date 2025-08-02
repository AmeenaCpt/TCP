package DSA1.Strings;
class CountAndSay {
    public static String countAndSay(int n) {
        if (n == 1) return "1";
        String prev = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= prev.length(); i++) {
            if (i < prev.length() && prev.charAt(i) == prev.charAt(i - 1)) {
                count++;
            } else {
                sb.append(count).append(prev.charAt(i - 1));
                count = 1;
            }
        }
        return sb.toString();
    }

    public static void testCountAndSay() {
        System.out.println(countAndSay(1));  // 1
        System.out.println(countAndSay(2));  // 11
        System.out.println(countAndSay(3));  // 21
        System.out.println(countAndSay(4));  // 1211
        System.out.println(countAndSay(5));  // 111221
    }

    public static void main(String[] args) {
        testCountAndSay();
    }
}
