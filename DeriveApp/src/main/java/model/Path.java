package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Path {
    
    private String name;
    private double distance;
    private List<Location> points;
    private LocalDateTime dateCreated;
    
       public Path() {
        this.name = "NoPath";
        this.points = new ArrayList<>();
        this.distance = 0.0;
        this.dateCreated = LocalDateTime.now();
    }

    public Path(String name, double distance, List<Location> points, LocalDateTime dateCreated) {
        this.name = name;
        this.distance = distance;
        this.points = points;
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public List<Location> getPoints() {
        return points;
    }

    public void setPoints(List<Location> points) {
        this.points = points;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Path" + 
                "name: " + name + 
                ", distance: " + distance + 
                ", points: " + points + 
                ", dateCreated: " + dateCreated;
    }
 
       /**
        * TODO METHODOLOGY
        */
}
