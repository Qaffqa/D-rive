package test;

import model.AlgorithmicPath;

public class AlgorithmicPathTest {
    public static void main(String[] args) {
        // Test 1: Default constructor
        AlgorithmicPath defaultPath = new AlgorithmicPath();
        System.out.println("Default Path:");
        System.out.println(defaultPath);

        // Test 2: Urban path with 10 instructions
        AlgorithmicPath urbanPath = new AlgorithmicPath("urban", 10);
        System.out.println("\nUrban Path with 10 instructions:");
        System.out.println(urbanPath);

        // Test 3: Rural path with 7 instructions
        AlgorithmicPath ruralPath = new AlgorithmicPath("rural", 7);
        System.out.println("\nRural Path with 7 instructions:");
        System.out.println(ruralPath);

        // Test 4: Regenerate path with new environment
        ruralPath.setEnvironment("urban", 5);
        System.out.println("\nRural Path changed to Urban with 5 new instructions:");
        System.out.println(ruralPath);
    }
}
