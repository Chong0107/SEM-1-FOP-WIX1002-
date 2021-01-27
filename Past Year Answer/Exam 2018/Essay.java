public class Essay extends GradeActivity{
    private final int grammar;
    private final int spelling;
    private final int length;
    private final int content;

    public Essay(int grammar, int spelling, int length, int content) {
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
        score = grammar + spelling + length + content;
    }

    @Override
    public String toString() {
        return "\nEssay score:" +
                "\nGrammar: " + grammar +
                "\nSpelling: " + spelling +
                "\nLength: " + length +
                "\nContent: " + content +
                super.toString();
    }
}
