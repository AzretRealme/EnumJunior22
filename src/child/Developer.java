package child;

import parent.*;

public class Developer extends Employee {

    public Developer(Rank rank, Sphere sphere, String name, int age, double salary) {
        super(rank, sphere, name, age, salary);
    }

    public void writeCode(){

        System.out.println(" Developers - good made games.  " + " -WriteCode.  ---" + getName() +
                ", ЗАРПЛАТА: " + getSalary() + ", ВОЗРАСТ: " + getAge());
    }

    public void goToDayOff(){
        System.out.println("Разработчики, Отдохните от своих компьютеров! ");
    }

    public void goToVacation(){
        System.out.println("Developers say:  I am going to bootcamp! ");
    }

    public void printDeveloperGrade(){
        System.out.println(getRank() + " " + getSphere());
    }
}
