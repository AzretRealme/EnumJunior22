package parent;

public enum Rank {
    JUNIOR(" I am Junior Developer "),
    MIDDLE(" I am Senior Developer "),

    SENIOR(" I am Middle Developer "),

    TEAMLEAD(" I am Teamlead Developer ");

    String phrase;

    Rank(String phrase) {
        this.phrase = phrase;
    }
    public void printPhrase(){
        System.out.println(this.phrase);
    }
}
