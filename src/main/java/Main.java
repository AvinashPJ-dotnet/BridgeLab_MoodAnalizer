public class Main {

    public static void main(String[] args) {
//        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
//        String sadMood = moodAnalyzer.analyzeMood("i am in sad mood");
//        System.out.println(sadMood);
//        String happyMood = moodAnalyzer.analyzeMood("i am in happy mood");
//        System.out.println(happyMood);

        MoodAnalyzer moodAnalyzerOne = new MoodAnalyzer(null);
        String nullMood = moodAnalyzerOne.analyzeMoodAgain();
        System.out.println(nullMood);
    }
}
