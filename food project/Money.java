public class Money {
    private int bath;

    public Money() {
        bath = 0; 
    }

    public void setBath(int newBudget) throws Exception {
        if(newBudget < 0) {
            throw new Exception("Budget cannot be negative");
        } else {
            bath = newBudget;
        }
    }

    public int getBath() {
        return bath;
    }

    public boolean isEmpty() {
        return bath == 0;
    }

    public void add(Double bath) {
        this.bath += bath;
    }

    public void remove(Double bath) {
        this.bath -= bath;
    }

}

