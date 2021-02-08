package parent;

public enum Sphere {
    Java(" -Java"),
    Cplusplus(" -C++"),
    Python(" -Python"),
    JavaScript(" -JavaScript");


    String phrase;

    Sphere(String phrase) {
        this.phrase = phrase;
    }
    public void printPhrase(){
        System.out.println(this.phrase);
    }
}
