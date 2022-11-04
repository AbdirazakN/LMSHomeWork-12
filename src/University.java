public class University {
    private String country;
    private String name;
    private double rating;

    void setCountry(String country){
        this.country = country;
    }
    void setName(String name){
        this.name = name;
    }
    void setRating(double rating){
        this.rating = rating;
    }
    String getCountry(){
        return country;
    }
    String getName(){
        return name;
    }
    double getRating(){
        return rating;
    }
    public void info(){
        System.out.printf("""
                Country:   %s
                Name:      %s
                Rating:    %s
                
                """,country,name,rating);
    }
}
