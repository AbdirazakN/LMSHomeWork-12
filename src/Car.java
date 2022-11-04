public class Car {
    private String company;
    private String name;
    private double speed;

    void setCompany(String company){
        this.company = company;
    }
    void setName(String name){
        this.name = name;
    }
    void setSpeed(double speed){
        this.speed = speed;
    }
    String getCompany(){
        return company;
    }
    String getName(){
        return name;
    }
    double getSpeed(){
        return speed;
    }

    public void info(){
        System.out.printf("""
                Company:   %s
                Name:      %s
                Speed:    %s
                
                """,company,name,speed);
    }
}
