public class StudentRunner {
    public static void main(String[] args){
       Student student1 =  new Student("Jack", "junior", 4, 3.8, 68.4, 121.5);
       student1.intro();
       student1.information();

       Student student2 = new Student("Tom", "sophomore", 2, 3.4, 65, 118);
       student2.information();
       student2.intro();
    }
}


