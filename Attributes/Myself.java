public class Myself {
    String firstname = "Salman"; //Attribute
    String lastname = "Ahmed"; //Attribute
    int age = 22; //Attribute
  
    public static void main(String[] args) {
        Myself attribute = new Myself();
        System.out.println("Name : " + attribute.firstname + " " + attribute.lastname);
        System.out.println("Age : " + attribute.age);
    }
}