public class School {
    private String region;
    private String name;
    private double ort;

    void setRegion(String region){
        this.region = region;
    }
    void setName(String name){
        this.name = name;
    }
    void setOrt(double ort){
        this.ort = ort;
    }
    String getRegion(){
        return region;
    }
    String getName(){
        return name;
    }
    double getOrt(){
        return ort;
    }

    public void info(){
        System.out.printf("""
                Region:   %s
                Name:      %s
                ORT:    %s
                
                """,region,name,ort);
    }
}
