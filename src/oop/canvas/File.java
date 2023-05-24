package oop.canvas;

public class File {

    public String name;
    public double size;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public void openFile() {
        System.out.println("Opening " + name );
    }

    public String toString() {
        return "File{" +
                 name + " | " +
                 size + " mb" +
                '}';
    }
}
