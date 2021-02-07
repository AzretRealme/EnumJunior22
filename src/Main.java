import child.*;

import static parent.Rank.*;

public class Main {
    public static void main(String[] args){

            Developer[] developers = new Developer[]{new Developer(JUNIOR, "Karl", 27, 40000),
                    new Developer(MIDDLE, "Mark", 26, 42000),
                    new Developer(SENIOR, "Maddison", 28, 44000),
                    new Developer(TEAMLEAD, "Wayne", 30, 70000)};

        for (Developer develop : developers) {
            develop.writeCode();
            develop.goToDayOff();
            develop.goToVacation();
        }

        for (Developer develop : developers) {
           printDeveloperGrade(develop);

        }

    }
        public  static void printDeveloperGrade(Developer developer) {

            developer.getRank().printPhrase();

    }
}
