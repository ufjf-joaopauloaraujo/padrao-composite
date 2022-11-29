package org.araujo;

public class File extends Entry {

    private int size;

    public File(String description, int size) {
        super(description);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String getEntries() {
        return "f " + this.getDescription() + "\t\t" + this.size + " KB" + "\n";
    }
}
