class Student{ //Class
    String name;
    Integer age;
    String id;
    Integer batch;

    public void printstudentinfo(){
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Age : " + this.age);
        System.out.println("Student Id : " + this.id);
        System.out.println("Student Batch : " + this.batch);
    }
} 

//You can create multiple classes

public class Classroom{
    public static void main(String args[]){
        Student student1 = new Student(); //Object
        student1.name = "Salman";
        student1.age = 22;
        student1.id = "212-115-010";
        student1.batch = 54;
        

        student1.printstudentinfo();
    }
}