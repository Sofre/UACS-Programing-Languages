import java.util.Arrays;
import java.util.List;

public class ProfanityChecker {
    private static final List<String> PROFANITIES = Arrays.asList(
            "damn", "hell", "shit", "fuck", "bitch",
            "ass", "crap", "dick", "piss", "slut",
            "cunt", "twat", "bastard", "motherfucker", "whore"
    );

    public static boolean containsProfanity(String name) {
        if (name == null || name.isEmpty()) {
            return false;
        }


        String lowerCaseName = name.toLowerCase();

        for (String profanity : PROFANITIES) {
            if (lowerCaseName.contains(profanity)) {
                return true;
            }
        }
        return false;
    }


    }

