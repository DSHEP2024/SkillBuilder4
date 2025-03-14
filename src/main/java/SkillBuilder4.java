
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4 {

    // replace this line with your constants
    static Boolean notLetterT = false;

    public static String findTYPattern(String s) {
        notLetterT = false;
        String result = "";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'T' || s.charAt(i) == 't') {
                notLetterT = true;
            }
            if (notLetterT) {
                result += s.charAt(i);
                if (s.charAt(i) == 'Y' || s.charAt(i) == 'y') {
                    notLetterT = false;
                }
            }
        }
        if (result.contains("Y") || result.contains("y")) {
            return result;
        }
        return "";
    }
}
