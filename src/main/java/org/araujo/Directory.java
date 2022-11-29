package org.araujo;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private List<Entry> entries = new ArrayList<>();

    public Directory(String description) {
        super(description);
    }

    public void addEntry(Entry entry) {
        this.entries.add(entry);
    }

    @Override
    public String getEntries() {
        String output = "";
        output = "d " + this.getDescription() + "\n";
        for (Entry entry : entries) {
            output += entry.getEntries();
        }
        return output;
    }
}
