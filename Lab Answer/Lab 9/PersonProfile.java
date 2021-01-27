public class PersonProfile {
    protected String name, gender, dateOfBirth;

    public PersonProfile() {

    }
    public PersonProfile(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public void display(){
        System.out.println("The name of the student is "+this.name);
        System.out.println("The gender of the student is "+this.gender);
        System.out.println("The date of birth for the student is "+this.dateOfBirth);
    }
}
