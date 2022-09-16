public class NegativeTextAnalyzer extends KeywordAnalyzer {
    String[] keywords = {":(", "=(", ":|"};

    @Override
    public String[] getKeywords() {
        return keywords;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
