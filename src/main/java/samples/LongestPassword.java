package samples;

public class LongestPassword {
    public static void main(String[] args) {
        System.out.println(solution("a!#"));
    }

    public static int solution(String S) {
        String[] stringArray = S.split(" ");
        int longest = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() % 2 != 0) {
                int counter = 0;
                char[] charArray = stringArray[i].toCharArray();
                for (int j = 0; j < charArray.length; j++) {
                    if (Character.isDigit(charArray[j])) {
                        counter++;
                    } else if (!Character.isAlphabetic(charArray[j])) {
                        counter = 0;
                        break;
                    }
                }
                if (counter % 2 != 0) {
                    longest = Math.max(longest, stringArray[i].length());
                }
            }
        }


        return longest == 0 ? -1 : longest;
    }
}
