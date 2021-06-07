public class Student 
{
    
        int rollno;
        String name;
        public static void main(String args[]) 
        {
            Student s1 = new Student(100,"Karan");
            Student s2 = new Student(500,"Arun");
            s1.display();
            s2.display();
        }
    
    static String college="abc";
    
    Student(int n, String s)
    {
        rollno=n;
        name=s;
    
    }
    void display()
    {
        System.out.println(name+" "+rollno+" "+college);
    }
    
}