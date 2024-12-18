package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Represents an algorithmic path consisting of randomly generated instructions.
 * This path is not tied to a map and follows abstract navigation rules.
 */
public class AlgorithmicPath {

    private List<String> instructions;
    private String environment; // "urban" or "rural"

    /**
     * Default constructor initializing an empty path with a default environment.
     */
    public AlgorithmicPath() {
        this.environment = "urban"; // Default environment
        this.instructions = new ArrayList<>();
        generatePath(56); // Generate a default path with 5 instructions
    }

    /**
     * Constructor that allows specifying the environment and number of instructions.
     *
     * @param environment The environment type ("urban" or "rural").
     * @param instructionCount The number of instructions to generate.
     */
    public AlgorithmicPath(String environment, int instructionCount) {
        this.environment = environment;
        this.instructions = new ArrayList<>();
        generatePath(instructionCount);
    }

    /**
     * Generates a random path based on the environment and number of instructions.
     *
     * @param instructionCount The number of instructions to generate.
     */
    public void generatePath(int instructionCount) {
        List<String> sourceInstructions = getSourceInstructions();
        Random random = new Random();
        this.instructions.clear();

        for (int i = 0; i < instructionCount; i++) {
            String randomInstruction = sourceInstructions.get(random.nextInt(sourceInstructions.size()));
            this.instructions.add(randomInstruction);
        }
    }

    /**
     * Retrieves the source instructions based on the environment.
     *
     * @return A list of instructions for the specified environment.
     */
    private List<String> getSourceInstructions() {
        if ("rural".equalsIgnoreCase(environment)) {
            return PathRules.INSTRUCTIONS_RURAL;
        } else {
            return PathRules.INSTRUCTIONS_URBAN;
        }
    }

    /**
     * Returns the list of instructions for this path.
     *
     * @return The list of instructions.
     */
    public List<String> getInstructions() {
        return instructions;
    }

    /**
     * Sets the environment and regenerates the path.
     *
     * @param environment The new environment ("urban" or "rural").
     * @param instructionCount The number of instructions to regenerate.
     */
    public void setEnvironment(String environment, int instructionCount) {
        this.environment = environment;
        generatePath(instructionCount);
    }

    /**
     * Returns the environment type for this path.
     *
     * @return The environment type.
     */
    public String getEnvironment() {
        return environment;
    }

    @Override
    public String toString() {
        return "AlgorithmicPath{" +
                "environment='" + environment + '\'' +
                ", instructions=" + instructions +
                '}';
    }
}
