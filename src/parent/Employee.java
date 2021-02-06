package parent;

public abstract class Employee {

    private Rank rank;


    public Employee() {

    }

    public Employee(Rank rank) {
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

//    public void Work(){
//        System.out.println(" Emloyee - awesome writing.  ---" + getName() + ", ЗАРПЛАТА: " + getSalary() + ", ВОЗРАСТ: " + getAge());
//    }
//
//    public void goToVacation(){
//        System.out.println(" parent.Employee say: I am going to Sochi ");
//    }

    abstract public void goToDayOff();
    public abstract void printDeveloperGrade();

}
