package oop.canvas;

import java.util.ArrayList;

public class Module {

    public String name;
    public ArrayList<File> files;

    public Module(String name) {
        this.name = name;
        files = new ArrayList<>();
    }

    public Module(String name, ArrayList<File> files) {
        this.name = name;
        this.files = files;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeFile(File file) {
        files.removeIf(p->p.name.equalsIgnoreCase(file.name) && p.size == file.size);
    }

    public String toString() {
        return name + "\n" + "Files:\n" + files;

    }
}
