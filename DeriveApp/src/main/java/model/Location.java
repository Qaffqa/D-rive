package model;

/**
 *
 * @author daniel
 */
public class Location {
    
    private double latitude;
    private double longitude;
    private String description;

    public Location() {
        this.latitude = 0;
        this.longitude = 0;
        this.description = "NoDescription";
    }
    
    public Location(double latitude, double longitude, String description) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.description = description;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Location{" +
               "latitude=" + latitude +
               ", longitude=" + longitude +
               ", description='" + description + '\'' +
               '}';
    }
}
