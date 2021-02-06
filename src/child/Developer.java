package child;

import parent.*;

public class Developer extends Employee {
    String phrase;

    public Developer(String phrase, Rank rank) {
        super(phrase, rank);
    }


//    public void writeCode(){
//       // super.Work();
//        System.out.println(" Developers - good made games.  " + " -WriteCode.  ---" + getName() +  ", РАНГ РАЗРАБОТЧИКА: " + getGrades() +
//                ", ЗАРПЛАТА: " + getSalary() + ", ВОЗРАСТ: " + getAge());
//    }
//
//    public void goToVacation(){
//        System.out.println("Developers say:  I am going to bootcamp! ");
//    }

    public void goToDayOff(){
        System.out.println("Разработчики, Отдохните от своих компьютеров! ");
    }
    public void printDeveloperGrade(){
        System.out.println(phrase);
    }
}
