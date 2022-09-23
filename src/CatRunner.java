public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Pieman", 3, 4.5);
        Cat cat2 = new Cat("Applesauce", 5, 6.6);


        cat1.printCatInfo();
        cat1.introduce();

        cat2.printCatInfo();
        cat2.introduce();

    }
}
