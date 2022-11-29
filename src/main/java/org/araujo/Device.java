package org.araujo;

public class Device {

    private Entry root;

    public void setRoot(Entry root) {
        this.root = root;
    }

    public String getRoot() {
        if (this.root == null) {
            throw new NullPointerException("Raiz não definida");
        }
        return this.root.getEntries();
    }
}
