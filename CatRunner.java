public class CatRunner {
    public static void main(String[] args){
        Cat cat1 = new Cat("Jimmy", 7, 13.4);
        cat1.introduce();
        cat1.printCatInfo();
         
        Cat cat2 = new Cat("George", 3, 1.9);
        cat2.printCatInfo();
        cat2.introduce();
    }
    
}