class Manager extends Staff {

    Manager(String Name, int ID, int Age, double Salary,String job,double bonus ) {
        super(Name, ID, Age, Salary);
        job = "Manager";
        bonus = 200;
    }  
}
