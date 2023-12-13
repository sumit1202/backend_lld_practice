package design_patterns.creational_design_patterns.prototype_registry.prototype;

public class Client {

    public static void main(String[] args) {

        //? Student Copy
        Student student = new Student();
        Student studentCopy=student.copy();

        if(student==studentCopy){
            System.out.println("Not a copy created.");
        }else{
            System.out.println("Yes, a copy created.");
        }
        
        //? Intelligent Student Copy
        Student student1 = new IntelligentStudent();
        Student studentCopy1=student1.copy();

        if(student1==studentCopy1){
            System.out.println("Not a copy created.");
        }else{
            System.out.println("Yes, a copy created.");
        }
    }
    
}
