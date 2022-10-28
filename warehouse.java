class warehouse {
    String ID;
    int capacity;
    String security;
    String fire;
    String light;
    double temp;
    double humidity;
    
    void Print() {
        System.out.println("Infor of warehouse:\n ID:" + ID +
                "\n capacity(in ton):" + capacity +
                "\n security:" + security +
                "\n Fire safety system:" + fire+
                "\n lighting:"+light+
                "\n Temperature(in Celcius):"+temp+
                "\n Humidity:"+humidity+"\n");
    }
}