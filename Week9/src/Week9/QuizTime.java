package Week9;

import java.util.Scanner;

public class QuizTime {

    static class Question {
        private String questionText;
        private String correctAnswer;

        public Question(String questionText, String correctAnswer) {
            this.questionText = questionText;
            this.correctAnswer = correctAnswer;
        }

        public String getQuestionText() {
            return questionText;
        }

        public boolean isCorrect(String userAnswer) {
            return correctAnswer.equalsIgnoreCase(userAnswer.trim());
        }
    }

    static class Quiz {
        private Question[] questions;
        private int count;

        public Quiz() {
            questions = new Question[25];
            count = 0;
        }

        public void add(Question q) {
            if (count < questions.length) {
                questions[count++] = q;
            } else {
                System.out.println("Quiz is full.");
            }
        }

        public void giveQuiz() {
            Scanner scanner = new Scanner(System.in);
            int score = 0;

            for (int i = 0; i < count; i++) {
                System.out.println("Q" + (i + 1) + ": " + questions[i].getQuestionText());
                String userAnswer = scanner.nextLine();
                if (questions[i].isCorrect(userAnswer)) {
                    score++;
                }
            }

            System.out.println("\nQuiz Complete!");
            System.out.println("Score: " + score + " out of " + count);
            scanner.close();
        }
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        quiz.add(new Question("What is the highest mountain in Nepal?", "Mount Everest"));
        quiz.add(new Question("What is the currency of Nepal?", "Rupee"));
        quiz.add(new Question("What is the national flower of Nepal?", "Rhododendron"));
        quiz.add(new Question("Which is the only living goddess in Nepal?", "Kumari"));
        quiz.add(new Question("What is the name of Nepal’s flag shape?", "Double pennon"));
        quiz.add(new Question("In which month does Nepal celebrate Dashain?", "Ashwin"));
        quiz.add(new Question("What is the longest river in Nepal?", "Ghaghara"));
        quiz.add(new Question("Which ancient city is known as the City of Devotees?", "Bhaktapur"));
        quiz.add(new Question("What is the official language of Nepal?", "Nepali"));
        quiz.add(new Question("Who is considered the Light of Asia born in Nepal?", "Buddha"));

        quiz.giveQuiz();
    }
}