class Employee extends Staff {

    Employee(String Name, int ID, int Age, double Salary, String job, double bonus) {
        super(Name, ID, Age, Salary);
        job = "Employee";
        bonus = 100;
    }
}
