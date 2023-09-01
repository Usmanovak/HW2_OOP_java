package homework2;

public class Program {

    public static void main(String[] args) {
        
        Cat cat1 = new Cat("Мартин", 9, false);
        Cat cat2 = new Cat("Лёва", 1, false);

        Plate plate = new Plate(10);

        plate.info();
        cat1.eat(plate.getFood());
        cat1.getFull();
        plate.setFood(plate.getFood() - cat1.getAppetite());
        plate.info();
 

        plate.addFood(5);
        plate.info();


        cat2.eat(plate.getFood());
        cat2.getFull();
        plate.setFood(plate.getFood() - cat2.getAppetite());

        plate.info();
        plate.addFood(5);
    }
    
}
