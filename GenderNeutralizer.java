//1.12
import java.util.*;

public class GenderNeutralizer {
    public static void main(String[] args) {
        String paragraph = "The woman and her son met the husband at the park.";

        Map<String, String> genderMap = new HashMap<>();
        genderMap.put("woman", "person");
        genderMap.put("man", "person");
        genderMap.put("husband", "spouse");
        genderMap.put("wife", "spouse");
        genderMap.put("son", "child");
        genderMap.put("daughter", "child");

        for (String genderWord : genderMap.keySet()) {
            paragraph = paragraph.replaceAll("\\b" + genderWord + "\\b", genderMap.get(genderWord));
        }

        System.out.println("Neutral Paragraph:\n" + paragraph);
    }
}
