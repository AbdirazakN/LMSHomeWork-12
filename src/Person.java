public class Person {
    private String nation;
    private String position;
    private int age;

    void setNation(String nation){
        this.nation = nation;
    }
    void setPosition(String position){
        this.position = position;
    }
    void setAge(int age){
        this.age = age;
    }
    String getNation(){
        return nation;
    }
    String getPosition(){
        return position;
    }
    int getAge (){
        return age;
    }

    public void info(){
        System.out.printf("""
                Nation:   %s
                Position:      %s
                age:    %s
                
                """,nation,position,age);
    }
}
