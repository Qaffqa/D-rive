package model;

/**
 *
 * @author daniel
 */
public class RandomPoint {
    
    private Location location;
    private String description;
    
    public RandomPoint(Location location) {
        this.location = location;
        this.description = "Randomly generated point";
    }

    public RandomPoint(Location location, String description) {
        this.location = location;
        this.description = description;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RandomPoint"
                + "location: " + location + 
                ", description: " + description;
    }
    
    
}
