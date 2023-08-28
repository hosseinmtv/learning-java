package human;

public class Employee extends Human {
    int salary;
    int workTime;

    public void working (){
        workTime+=1;
    }

    Employee() {

    }

    Employee(int salary,int age,String name) {
        super(name, age);
        this.salary = salary;
    }

}
