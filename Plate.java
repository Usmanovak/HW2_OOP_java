package homework2;

import javax.management.RuntimeErrorException;

public class Plate {
    
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food < 0) {
            System.out.println("В тарелке недостаточно еды.");
        } else {
            this.food = food;
        }
    }


    public Plate(int food) {
        if (food > 10 || food < 0){
            throw new RuntimeErrorException(null, "Положите от 0 до 10 единиц еды.");
        } else {
        this.food = food;
        } 
    } 

    public void addFood(int value) {
        if (food + value > 10){
            System.out.println("Тарелка переполнена.");
        } else {
            this.food = food + value;
            System.out.println("Добавили еду в тарелку.");
        }
    }

    public void info(){
        System.out.println("В тарелке сейчас: " + food + " единиц еды.");
    }

}
