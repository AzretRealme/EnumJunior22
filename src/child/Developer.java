package child;

import parent.*;

public class Developer extends Employee {
    String oldPhrase;
    Rank rank;

    public Developer() {

    }

    public Developer(String oldPhrase, Rank rank) {
        this.oldPhrase = oldPhrase;
        this.rank = rank;

    }


    public void goToDayOff(){
        System.out.println("Разработчики, Отдохните от своих компьютеров! ");
    }

    public void printDeveloperGrade(){
        System.out.println(oldPhrase);
    }
}
