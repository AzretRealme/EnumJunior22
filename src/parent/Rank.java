package parent;

public enum Rank {
    JUNIOR(" I am Junior Developer - Java "),
    MIDDLE(" I am Senior Developer - C++ "),

    SENIOR(" I am Middle Developer - Python "),

    TEAMLEAD(" I am Teamlead Developer - JavaScript ");

    String phrase;

    Rank() {

    }

    Rank(String phrase) {
        this.phrase = phrase;
    }
    public void printPhrase(){
        System.out.println(this.phrase);
    }
}
