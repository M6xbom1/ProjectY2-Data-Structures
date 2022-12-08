package food_project;

public interface MoneyADT {

    public void setBath(int newBudget) throws Exception;

    public Object getBath();

    public boolean isEmpty();

    public int add(int bath);

    public void remove(int bath);

}
