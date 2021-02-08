import child.*;
import parent.Sphere;

import static parent.Rank.*;

public class Main {
    public static void main(String[] args){

            Developer[] developers = new Developer[]{new Developer(JUNIOR, Sphere.Java, "Karl", 27, 40000),
                    new Developer(MIDDLE, Sphere.Cplusplus, "Mark", 26, 42000),
                    new Developer(SENIOR, Sphere.Python, "Maddison", 28, 44000),
                    new Developer(TEAMLEAD, Sphere.JavaScript,  "Wayne", 30, 70000)};

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
            developer.getSphere().printPhrase();

    }
}
