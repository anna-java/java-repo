package homework;

public class ToSentenceCase {

    public String toSentenceCase(String sentence) {

        String newSentence = sentence.trim().toLowerCase();
        String firstLetterInUpperCase = newSentence.substring(0, 1).toUpperCase();

        newSentence = newSentence.replaceFirst(newSentence.substring(0, 1), firstLetterInUpperCase);

        return newSentence;
    }
}
