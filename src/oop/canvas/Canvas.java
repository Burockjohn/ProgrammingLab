package oop.canvas;

import java.util.ArrayList;

public class Canvas {

    public String topic;
    public ArrayList<Quiz> quizzes;
    public ArrayList<Module> modules;

    public Canvas(String topic) {
        this.topic = topic;
        quizzes = new ArrayList<>();
        modules = new ArrayList<>();
    }

    public Canvas(String topic, ArrayList<Quiz> quizzes, ArrayList<Module> modules) {
        this.topic = topic;
        this.quizzes = quizzes;
        this.modules = modules;
    }

    public String toString() {
        return topic + " course\n" + "Quizzes:\n" + quizzes + "\nModules:\n" +modules;
    }
}
