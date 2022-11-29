package org.araujo;

public abstract class Entry {

    private String description;

    public Entry(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract String getEntries();
}
