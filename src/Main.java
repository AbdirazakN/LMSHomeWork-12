import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //University, School, Car жана Person деген класс тузунуз
        //Алардын свойстваларын ойлоп табыныз
        //Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
        //Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
        //Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз

        University university1 = new University();
        university1.setCountry("USA");
        university1.setName("MIT");
        university1.setRating(4.99);

        University university2 = new University();
        university2.setCountry("Kyrgyzstan");
        university2.setName("AUCA");
        university2.setRating(4.41);

        University university3 = new University();
        university3.setCountry("Kazakhstan");
        university3.setName("Akhmet Yasavi");
        university3.setRating(4.50);
        University[] universities = {university1, university2, university3};


        School school1 = new School();
        school1.setRegion("Talas");
        school1.setName("Manas orto mektebi");
        school1.setOrt(115.20);

        School school2 = new School();
        school2.setRegion("Naryn");
        school2.setName("N%3 orto mektebi");
        school2.setOrt(120.50);

        School school3 = new School();
        school3.setRegion("Osh");
        school3.setName("Nookat litseyi");
        school3.setOrt(123.20);

        School[] schools = {school1,school2,school3};


        Car car1 = new Car();
        car1.setCompany("Tesla");
        car1.setName("Tesla motors");
        car1.setSpeed(320.20);

        Car car2 = new Car();
        car2.setCompany("Toyota");
        car2.setName("Toyota Camry");
        car2.setSpeed(260.90);

        Car car3 = new Car();
        car3.setCompany("BMW");
        car3.setName("BMW i820");
        car3.setSpeed(280.75);

        Car[] cars = {car1,car2,car3};


        Person person1 = new Person();
        person1.setNation("Kyrgyz");
        person1.setPosition("Student");
        person1.setAge(20);

        Person person2 = new Person();
        person2.setNation("Russian");
        person2.setPosition("married");
        person2.setAge(30);

        Person person3 = new Person();
        person3.setNation("American");
        person3.setPosition("unmarried");
        person3.setAge(28);

        Person[] people = {person1,person2,person3};

        System.out.println("Class University~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
        univerMassiv(universities);
        System.out.println("Class School~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
        schoolMassiv(schools);
        System.out.println("Class Car~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
        carMassiv(cars);
        System.out.println("Class Person~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
        personMassiv(people);

    }
    public static void univerMassiv(University[] universities) {
        for (University university : universities) {
            university.info();
        }
    }
    public static void schoolMassiv(School[] schools) {
        for (School school : schools) {
            school.info();
        }
    }
    public static void carMassiv(Car[] cars) {
        for (Car car : cars) {
            car.info();
        }
    }
    public static void personMassiv(Person[] people) {
        for (Person person : people) {
            person.info();
        }
    }
}