import child.*;

import static parent.Rank.*;

public class Main {
    public static void main(String[] args){

            Developer[] developers = new Developer[]{new Developer("I am Junior Developer", JUNIOR),
                    new Developer("I am Senior Developer", SENIOR),
                    new Developer("I am Middle Developer", MIDDLE),
                    new Developer("I am Teamlead Developer", TEAMLEAD)};
            printDeveloperGrade(developers);
        }
        public  static void printDeveloperGrade(Developer[] developers) {

            for (Developer java : developers) {

                switch (java.getRank()) {
                    case JUNIOR:
                        System.out.println("I am Junior developer");
                        break;
                    case SENIOR:
                        System.out.println("I am Senior developer");
                        break;
                    case MIDDLE:
                        System.out.println("I am Middle developer");
                        break;
                    case TEAMLEAD:
                        System.out.println("I am Teamlead developer");
                        break;
                    default:
                        System.out.println("THE END");
                        break;
                }
            }

    }
}
