import java.util.ArrayList;
import java.util.Scanner;

class Question {
    private String questionText;
    private String[] options;
    private int correctAnswer;

    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}

class Quiz {
    private ArrayList<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz Application!");
        System.out.println("------------------------------");

        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            System.out.println("Question " + (i + 1) + ": " + question.getQuestionText());
            String[] options = question.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }

            System.out.print("Enter your choice (1-" + options.length + "): ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == question.getCorrectAnswer()) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong. The correct answer is: "
                        + question.getOptions()[question.getCorrectAnswer() - 1] + "\n");
            }
        }

        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + " / " + questions.size());
        scanner.close();
    }
}

public class QuizApplication {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        quiz.addQuestion(new Question("What is the capital of India?",
                new String[] { "Mumbai", "Delhi", "Kolkata", "Chennai" }, 2));
        quiz.addQuestion(new Question("Who is known as the Father of the Indian Constitution?",
                new String[] { "Mahatma Gandhi", "B. R. Ambedkar", "Jawaharlal Nehru", "Sardar Patel" }, 2));
        quiz.addQuestion(new Question("Which Indian city is also known as the Silicon Valley of India?",
                new String[] { "Hyderabad", "Pune", "Bangalore", "Chennai" }, 3));
        quiz.addQuestion(new Question("Who was the first President of India?",
                new String[] { "Dr. Rajendra Prasad", "Sarvepalli Radhakrishnan", "Zakir Hussain", "V. V. Giri" }, 1));
        quiz.addQuestion(new Question("What is the national animal of India?",
                new String[] { "Lion", "Tiger", "Elephant", "Peacock" }, 2));
        quiz.addQuestion(new Question("Which Indian state is the largest by area?",
                new String[] { "Maharashtra", "Rajasthan", "Uttar Pradesh", "Madhya Pradesh" }, 2));
        quiz.addQuestion(new Question("Which Indian river is the longest?",
                new String[] { "Ganga", "Brahmaputra", "Godavari", "Yamuna" }, 1));
        quiz.addQuestion(new Question("Who was the first Indian woman to go to space?",
                new String[] { "Kalpana Chawla", "Sunita Williams", "Ritu Karidhal", "Kiran Bedi" }, 1));
        quiz.addQuestion(new Question("What is the national flower of India?",
                new String[] { "Rose", "Lotus", "Sunflower", "Marigold" }, 2));
        quiz.addQuestion(new Question("Who wrote the national anthem of India?", new String[] { "Rabindranath Tagore",
                "Bankim Chandra Chatterjee", "Subhash Chandra Bose", "Sarojini Naidu" }, 1));
        quiz.addQuestion(new Question("Which sport is known as the national game of India?",
                new String[] { "Cricket", "Hockey", "Football", "Kabaddi" }, 2));
        quiz.addQuestion(
                new Question("What is the currency of India?", new String[] { "Dollar", "Rupee", "Euro", "Pound" }, 2));
        quiz.addQuestion(new Question("Who was the first Prime Minister of India?",
                new String[] { "Jawaharlal Nehru", "Indira Gandhi", "Lal Bahadur Shastri", "Rajiv Gandhi" }, 1));
        quiz.addQuestion(new Question("What is the national bird of India?",
                new String[] { "Sparrow", "Crow", "Peacock", "Eagle" }, 3));
        quiz.addQuestion(new Question("Which state is known as the Spice Garden of India?",
                new String[] { "Kerala", "Tamil Nadu", "Karnataka", "Andhra Pradesh" }, 1));
        quiz.addQuestion(new Question("Who is known as the Missile Man of India?",
                new String[] { "Vikram Sarabhai", "A. P. J. Abdul Kalam", "Homi Bhabha", "C. V. Raman" }, 2));
        quiz.addQuestion(new Question("Which dance form is famous in Kerala?",
                new String[] { "Bharatanatyam", "Kathak", "Kathakali", "Manipuri" }, 3));
        quiz.addQuestion(new Question("What is the national tree of India?",
                new String[] { "Neem", "Peepal", "Banyan", "Mango" }, 3));
        quiz.addQuestion(new Question("Which Indian scientist won the Nobel Prize in Physics?",
                new String[] { "C. V. Raman", "Homi Bhabha", "Jagadish Chandra Bose", "Satyendra Nath Bose" }, 1));
        quiz.addQuestion(new Question("What is the official language of India?",
                new String[] { "English", "Hindi", "Sanskrit", "Tamil" }, 2));

        quiz.start();
    }
}
