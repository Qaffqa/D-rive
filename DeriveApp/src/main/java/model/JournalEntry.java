package model;

import java.time.LocalDateTime;

/**
 *
 * @author daniel
 */

public class JournalEntry {
    
    private String title;
    private String content;
    private LocalDateTime dateCreated;
    private Location location;

    public JournalEntry() {
        this.title = "NoTitle";
        this.content = "NoContent";
        this.location = new Location();
    }
    
    public JournalEntry(String title, String content, LocalDateTime dateCreated, Location location) {
        this.title = title;
        this.content = content;
        this.dateCreated = dateCreated;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "JournalEntry{" +
               "title='" + title + '\'' +
               ", content='" + content + '\'' +
               ", dateCreated=" + dateCreated +
               ", location=" + location +
               '}';
    }
   /**
    * METHODOLOGY TODO
    */    
}
