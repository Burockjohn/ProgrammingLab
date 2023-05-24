package oop.canvas;

public class Quiz {

    public String topic;
    public int numberOfQuestions;
    public double totalPoints;

    public Quiz(String topic, int numberOfQuestions, double totalPoints) {
        this.topic = topic;
        this.numberOfQuestions = numberOfQuestions;
        this.totalPoints = totalPoints;
    }

    public void takeQuiz() {
        System.out.println("Taking the " + topic + " quiz");
    }

    public String toString() {
        return "Quiz | " + topic +
                " quiz with " +
                numberOfQuestions + " questions for a total of " +
                totalPoints + " total points";

    }
}
