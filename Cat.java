package homework2;

public class Cat {
    
    private String name;
    private int appetite;
    private boolean full = false;

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void getFull(){
        if (full) {
            print(name + " сыт.");
        } else {
            print(name + " голоден.");
        }
    }

    public Cat(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = full;
    }


    public void eat (int food) {
        if (!full && appetite <= food) {
            this.full = true;
            print(name + " наелся.");
        } else {
            print(name + " не смог поесть");
        }
    }



    public void print(String str) {
        System.out.println(str);
    }
}
