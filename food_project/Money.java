package food_project;

public class Money {

    private int bath;

    public Money(int bath) {
        this.bath = bath;
    }

    public Money() {
        this(0);
    }

    public void setBath(int newBudget) throws Exception {
        if(newBudget < 0) {
            throw new Exception("Budget cannot be negative");
        } else {
            bath = newBudget;
        }
    }

    public Object getBath() {
        return bath;
    }

    public boolean isEmpty() {
        return bath <= 0;
    }

    public int add(int bath) {
        return this.bath += bath;
    }

    public void remove(int bath) {
        this.bath -= bath;
    }

}

