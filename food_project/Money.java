package food_project;

public class Money implements MoneyADT {
    
    private int bath;

    public Money(int bath) {
        this.bath = bath;
    }

    public Money() {
        this(0);
    }

    @Override
    public void setBath(int newBudget) throws Exception {
        if(newBudget < 0) {
            throw new Exception("Budget cannot be negative");
        } else {
            bath = newBudget;
        }
    }

    @Override
    public Object getBath() {
        return bath;
    }

    @Override
    public boolean isEmpty() {
        return bath <= 0;
    }

    @Override
    public int add(int bath) {
        return this.bath += bath;
    }

    @Override
    public void remove(int bath) {
        this.bath -= bath;
    }
    
}

