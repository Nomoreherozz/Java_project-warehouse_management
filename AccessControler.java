public class AccessControler {
    public static void main(String[] args){
        Manager m1 = new Manager("m1", 101, 34, 2000, "manager", 200);
        
        Employee e1 = new Employee("e1", 111, 30, 1000, "emplyee", 100);
        Employee e2 = new Employee("e2", 112, 30, 1000, "emplyee", 100);
        Staff managerlist = new Staff(5);
        Staff employeelist = new Staff(5);

        managerlist.append(m1);
        employeelist.append(e1);
        employeelist.append(e2);
        
        employeelist.listShow();
        employeelist.deleteByID(111);
        System.out.println();
        employeelist.listShow();
    }
}
