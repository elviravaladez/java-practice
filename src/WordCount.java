public class WordCount {
    //TODO: Find the number of words in a given sentence
    public static int wordCount1(String sentence) {
        if(sentence == null || sentence.isEmpty()) {
            System.out.println(0);
            return 0;
        }

        sentence = sentence.trim();

        String[] words = sentence.split(" ");

        System.out.println(words.length);
        return words.length;
    }

    public static void main(String[] args) {
        wordCount1("");
        wordCount1("This sentence has five words.");
        wordCount1(" Hello everyone!");
    }
}
