class Student {
    String name;
    int age;

    void dispStdDetails(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class OOPS1 {
    public static void main(String[] args) {
         Student s = new Student();
        s.name = "Rais";
        s.age = 30;
        s.dispStdDetails();
    }
}
