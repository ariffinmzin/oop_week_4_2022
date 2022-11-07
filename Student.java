public class Student {

    public String name;
    public String course;
    public String matricNumber;

    public static void main(String[] args) {

        Student studentOne = new Student();
        Student studentTwo = new Student();

        studentOne.name = "Ahmad";
        studentOne.course = "BIP";
        studentOne.matricNumber = "A10000";
        
        studentTwo.name = "Abu";
        studentTwo.course = "BIP";
        studentTwo.matricNumber = "A20000";

    }
    
}
