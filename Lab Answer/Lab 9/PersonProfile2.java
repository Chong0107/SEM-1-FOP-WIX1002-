public class PersonProfile2 {
    protected String name, gender, dateOfBirth;

    public PersonProfile2() {

    }
    public PersonProfile2(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Gender: "+this.gender);
        System.out.println("Date of birth: "+this.dateOfBirth);
    }
}
