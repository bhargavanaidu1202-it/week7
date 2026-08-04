public class Employee extends Person {
    double salary;
    int yearOfJoin;
    String insNo;
    void setSalary(double salary){
        this.salary=salary;
    }
    void setYear(int y){
        yearOfJoin=y;
    }
    void setNo(String num){
        insNo=num;
    }
    void display(){
        System.out.println("name"+name);
        System.out.println("salary"+salary);
        System.out.println("Joining year"+yearOfJoin);
        System.out.println("inst no"+insNo);
    }
}
