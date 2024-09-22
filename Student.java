public class Student {
    private String name;
    private String year;
    private int numberofAps;
    private double gpa;
    private double height;
    private double weight;

    public Student(String studentName, String studentYear, int studentNumberofAps, double studentGpa, double studentHeight, 
    double studentWeight){
        name = studentName;
        year = studentYear;
        numberofAps = studentNumberofAps;
        gpa =studentGpa;
        height = studentHeight;
        weight = studentWeight;
        
    }
    public void information(){
        System.out.println("Name:" + name);
        System.out.println("Number of AP classes taken this year: " + numberofAps);
        System.out.println("Current GPA: " + gpa);
        System.out.println("Height in inches: " + height + " inches");
        System.out.println("Weight in pounds: " + weight + " pounds");
    }
    public void intro(){
        if (year =="junior" || year == "senior"){
            System.out.println("Hello my name is " + name + " and I am an upperclassmen");
        } else {
            System.out.println("Hello my name is " + name + " and I am an underclassmen");
        }
    }


    
}
