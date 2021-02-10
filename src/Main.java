import child.*;
import parent.Rank;
import parent.Sphere;
import java.lang.Enum;

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

        for (Rank s : Rank.values()) {
            System.out.println(s);
            s.printPhrase();
        }
        for(Sphere s2 : Sphere.values()){
            System.out.println(s2);
            s2.printPhrase();
        }

    }
        public  static void printDeveloperGrade(Developer developer) {

            developer.getRank().printPhrase();
            developer.getSphere().printPhrase();

    }
}
