class Student1{
    int rollno;
    String name;

static String college="abc";
Student1(int n,String s){
    rollno=n;
    name=s;

}
void display(){
    System.out.println(name+" "+rollno+" "+college);
}
}
class Test{
    public static void main(String args[]){
    Student1 s1=new Student1(100,"Karan");
    Student1 s2=new Student1(500,"Arun");
    s1.display();
    s2.display();
}
}