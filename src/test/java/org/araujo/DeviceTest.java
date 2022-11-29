package org.araujo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeviceTest {

    @Test
    void mustReturnRootContent() {

        Directory tmp = new Directory("tmp");

        Directory var = new Directory("var");
        Directory www = new Directory("www");
        File html = new File("index.html", 4);
        File css = new File("style.css", 5);
        www.addEntry(html);
        www.addEntry(css);
        var.addEntry(www);

        Directory root = new Directory("/");
        root.addEntry(tmp);
        root.addEntry(var);

        assertEquals("d /\n" +
                "d tmp\n" +
                "d var\n" +
                "d www\n" +
                "f index.html\t\t4 KB\n" +
                "f style.css\t\t5 KB\n", root.getEntries());
    }

    @Test
    void mustReturnNoRootDefined() {
        try {
            Device device = new Device();
            device.getRoot();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Raiz não definida", e.getMessage());
        }
    }
}