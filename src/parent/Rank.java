package parent;


public enum Rank {
    JUNIOR(" -I am Junior Developer "),
    MIDDLE(" -I am Middle Developer "),
    SENIOR(" -I am Senior Developer "),
    TEAMLEAD(" -I am Teamlead Developer ");

    String phrase;

    Rank(String phrase) {
        this.phrase = phrase;
    }

    public void printPhrase(){
        System.out.println(this.phrase);
        //return 0;
    }
}
