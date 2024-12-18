package model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author daniel
 */
public class PathRules {
    public static final List<String> INSTRUCTIONS_URBAN = Arrays.asList(
            "Turn left",
            "Turn right",
            "Keep going straight",
            "Turn around and go left",
            "Turn around and go right",
            "Go norht",
            "Go south",
            "Go east",
            "Go west",
            "Follow the wind's direction",
            "Turn left in the second street to the left",
            "Turn left in the second street to the right",
            "Turn right in the second street to the left",
            "Turn right in the second street to the right",
            "Turn left in the third street to the left",
            "Turn left in the third street to the right",
            "Turn right in the third street to the left",
            "Turn right in the third street to the right");
    
    public static final List<String> INSTRUCTIONS_RURAL = Arrays.asList(
            "Turn left",
            "Turn right",
            "Keep going straight",
            "Turn around and go left",
            "Turn around and go right",
            "Go norht",
            "Go south",
            "Go east",
            "Go west",
            "Follow the wind's direction",            
            "Follow the trail to the left.",
            "Climb the hill to your right.",
            "Cross the stream and continue straight.",
            "Follow the direction of the nearest tree.",
            "Head towards the tallest hill in sight.",
            "Look for a small animal path and follow it.",
            "Turn back and take the first fork to your left.",
            "Follow the sound of running water.",
            "Walk towards the clearing ahead.",
            "Head in the direction of the sunrise.",
            "Turn left at the first boulder you see.",
            "Look for a fallen tree and use it as a bridge.",
            "Take the narrow path between the bushes.",
            "Go towards the nearest field of wildflowers.",
            "Walk along the edge of the forest.",
            "Turn right when you see a large rock formation.",
            "Follow the animal tracks leading west.",
            "Circle around the small hill to your left.",
            "Walk towards the tallest tree in sight.",
            "Head towards the area with the densest foliage."
    );

    // Método para obtener una instrucción aleatoria según el contexto
    public static String getRandomInstruction(String context) {
        Random random = new Random();
        if ("urban".equalsIgnoreCase(context)) {
            return INSTRUCTIONS_URBAN.get(random.nextInt(INSTRUCTIONS_URBAN.size()));
        } else if ("rural".equalsIgnoreCase(context)) {
            return INSTRUCTIONS_RURAL.get(random.nextInt(INSTRUCTIONS_RURAL.size()));
        }
        return "Invalid context. Please specify 'urban' or 'rural'.";
    }
}
