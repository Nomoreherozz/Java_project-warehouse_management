class Staff implements List {
    private String name;
    private int id;
    private int age;
    private double salary;
    private Staff staffs[];
    private int size = 0;

    Staff(String Name, int ID, int Age, double Salary) {
        name = Name;
        id = ID;
        age = Age;
        salary = Salary;
    }

    Staff(int length) {
        staffs = new Staff[length];
    }

    public void append(Staff staff) {
        assert staff != null;
        staffs[size++] = staff;
    }

    public void deleteByID(int ID) {
        for(int i = 0; i < size; i++) {
            if(staffs[i].id == ID) {
                staffs[i] = null;
                for(int j = 0; j < size-i; j++) {
                    staffs[i+j] = staffs[i+j+1];
                    size -= 1;
                }
            }
        }
    }
    
    public void showInfo() {
        System.out.print(   "Name: " + name + 
                            "\nAge: " + age + "\nID: " + id +
                            "\nSalary: " + salary +"$");
    }
    
    public void searchByID(int ID) {
        // try {
        //     String isExist = "NOT FOUND";
        //     for(int i = 0; i < size; i++) {
        //         if(staffs[i].id != ID) {
        //         }
        //         else {
        //             isExist = "FOUND";
        //         }
        //     }
        //     System.out.println(isExist);
        // }
        // catch(NullPointerException ex) {}
            String isExist = "NOT FOUND";
            for(int i = 0; i < size; i++) {
                if(staffs[i].id != ID || staffs[i] == null) {
                }
                else {
                    isExist = "FOUND";
                }
            }
        System.out.println(isExist);
    }

    void listShow() {
        try {
            for(int i = 0; i < size; i++) {
                System.out.println(staffs[i].id);
            }   
        }
        // for(int i = 0; i < size; i++) {
        //     System.out.println(staffs[i].id);
        // }
        catch(NullPointerException ex) {

        }   
    }

    }
}
