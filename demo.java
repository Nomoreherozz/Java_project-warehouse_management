public class demo {
    public static void main(String[] args) {
        Staff s1 = new Staff("s1", 101, 11, 11.11);
        Staff s2 = new Staff("s2", 102, 12, 22.22);
        Staff s3 = new Staff("s3", 103, 12, 22.22);

        Staff s4 = new Staff("s2", 104, 12, 22.22);
    

        Staff l = new Staff(5);
        l.append(s1);
        l.append(s2);
        l.append(s3);
        l.append(s4);

        l.listShow();


        l.searchByID(104);

        l.deleteByID(104);

        l.listShow();
        l.searchByID(104);

    }
}
