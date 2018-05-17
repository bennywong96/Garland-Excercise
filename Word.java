public class Word implements Comparable<Word> {
    String word;
    int garlandLength;
    String repeatingUnit;
    String repeatedUnit;

    public int getGarland(){
        return garlandLength;
    }

    @Override
    public int compareTo(Word abc) {
        int comp = 0;
        if (garlandLength < abc.getGarland()) {
            comp = -1;
        }
        else if (garlandLength > abc.getGarland()) {
            comp = 1;
        }
        return comp;
    }

}
