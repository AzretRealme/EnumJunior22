import child.*;

import static parent.Rank.*;

public class Main {
    public static void main(String[] args){

            Developer[] developers = new Developer[]{new Developer("I am Junior Developer", JUNIOR),
                    new Developer("I am Middle Developer", MIDDLE),
                    new Developer("I am Senior Developer", SENIOR),
                    new Developer("I am Teamlead Developer", TEAMLEAD)};

        for (Developer develop : developers) {
            printDeveloperGrade(develop);

        }
    }
        public  static void printDeveloperGrade(Developer developer) {

            developer.getRank().printPhrase();

    }
}
