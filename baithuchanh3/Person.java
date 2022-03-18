package baithuchanh3;

public class Person {
    private static int idCount = 1;
    private int id;
    private String name;
    private int yearOfBirth = -1;
    enum Gender {
        Male,
        Female 
    }
    private Gender gender;
    public Person () {
        this.id = idCount;
        idCount++;
    } 

    public int getId () {
        return id;
    }
    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public int getYearOfBirth () {
        return yearOfBirth;
    }
    public void setYearOfBirth (int year) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = year;
        }
    }
    public Gender getGender () {
        return gender;
    }
    public void setGender (Gender gender) {
        this.gender = gender;
    }
    
    public void display () {
        System.out.println("Dinh danh: " + this.getId());
        System.out.println("Ho va ten: " + this.getName());
        System.out.println("Nam sinh: " + this.getYearOfBirth());
        System.out.println("Gioi tinh: " + this.getGender());
    }
}
