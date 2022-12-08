package food_project;

import javax.swing.JOptionPane;
import java.util.HashMap;


//key = 1:1:1 = ลําดับเมนู:size(Normal=0,Big=1):จํานวนชาม;


public class DriverTest{
    public static void main(String[] args) throws Exception{

        int ch=0,ch2=0,mch=0,bowls=0;
        int budget=0;

        // ArrayList<String> menu = new ArrayList<String>();
        HashMap<Integer, String> nd = new HashMap<Integer, String>();
        Money money = new Money();

        budget = Integer.parseInt(JOptionPane.showInputDialog("Enter your budget"));
        money.setBath(budget);
        System.out.println("Your money now: "+money.getBath());
        
        while(mch != 5){
            try{
                mch = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Choose the Option you want to perform\n"+
                "1. Add an Order\n"+
                "2. Clear Order\n"+
                "3. Set new Budget\n"+
                "4. Show Order\n"+
                "5. Exit"));
                    switch(mch){
                        case 1:
                                
                                    try{
                                        ch = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                "----------------------------------------------------------------\n" +
                                                "                              Menu                              \n" +
                                                "----------------------------------------------------------------\n" +
                                                "1. Thin rice noodles\n" +
                                                "2. Big flat noodles\n" +  
                                                "3. Egg noodles\n" +    
                                                "4. Vermicelli noodles\n" +
                                                "----------------------------------------------------------------\n"));
                                        
                                        int m = (int) money.getBath();
                                        switch (ch) {
                                            case 1:
                                                if(m < 40){
                                                    JOptionPane.showMessageDialog(null, "Not enough money");
                                                    break;
                                                }else{
                                                    try{
                                                        ch2 = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                                                "1.Normal size\n" +
                                                                "2.Big size\n"));    
                                                        bowls = Integer.parseInt(JOptionPane.showInputDialog(null,"How many bowls of noodles do you want?"));                                                 
                                                        switch(ch2){
                                                            case 1:
                                                                nd.put(100+bowls, "Thin rice noodles Normal size");
                                                                money.remove(40*bowls);
                                                                JOptionPane.showMessageDialog(null, "Added Thin rice noodles Normal size "+bowls+" bowls");
                                                                break;
                                                            case 2:
                                                                nd.put(110+bowls, "Thin rice noodles Big size");
                                                                money.remove(50*bowls);
                                                                JOptionPane.showMessageDialog(null, "Added Thin rice noodles Big size "+bowls+" bowls");
                                                                break;
                                                        }
                                                    }catch (Exception e){
                                                        JOptionPane.showMessageDialog(null,e.getMessage());
                                                    }
                                                }
                                                System.out.println("Your money now: "+money.getBath());
                                                
                                                break;
                        
                        
                                            case 2:
                                                if(m < 40){
                                                    JOptionPane.showMessageDialog(null, "Not enough money");
                                                    break;
                                                }else{
                                                    try{
                                                        ch2 = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                                                "1.Normal size\n" +
                                                                "2.Big size\n"));    
                                                        bowls = Integer.parseInt(JOptionPane.showInputDialog(null,"How many bowls of noodles do you want?"));                                                 
                                                        switch(ch2){
                                                            case 1:
                                                                nd.put(200+bowls, "Big flat noodles Normal size");
                                                                money.remove(40*bowls);
                                                                JOptionPane.showMessageDialog(null, "Added Big flat noodles Normal size "+bowls+" bowls");
                                                                break;
                                                            case 2:
                                                                nd.put(210+bowls, "Big flat noodles Big size");
                                                                money.remove(50*bowls);
                                                                JOptionPane.showMessageDialog(null, "Added Big flat noodles Big size "+bowls+" bowls");
                                                                break;
                                                        }
                                                    }catch (Exception e){
                                                        JOptionPane.showMessageDialog(null,e.getMessage());
                                                    }
                                                }
                                                System.out.println("Your money now: "+money.getBath());
                                                
                                                break;
                        
                        
                                            case 3:
                                                if(m < 40){
                                                    JOptionPane.showMessageDialog(null, "Not enough money");
                                                    break;
                                                }else{
                                                    try{
                                                        ch2 = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                                                "1.Normal size\n" +
                                                                "2.Big size\n"));    
                                                        bowls = Integer.parseInt(JOptionPane.showInputDialog(null,"How many bowls of noodles do you want?"));                                                 
                                                        switch(ch2){
                                                            case 1:
                                                                nd.put(300+bowls, "Egg noodles Normal size");
                                                                money.remove(40*bowls);
                                                                JOptionPane.showMessageDialog(null, "Added Egg noodles Normal size "+bowls+" bowls");
                                                                break;
                                                            case 2:
                                                                nd.put(310+bowls, "Egg noodles Big size");
                                                                money.remove(50*bowls);
                                                                JOptionPane.showMessageDialog(null, "Added Egg noodles Big size "+bowls+" bowls");
                                                                break;
                                                        }
                                                    }catch (Exception e){
                                                        JOptionPane.showMessageDialog(null,e.getMessage());
                                                    }
                                                }
                                                System.out.println("Your money now: "+money.getBath());
                                                
                                                break;
                        
                        
                                            case 4:
                                                if(m < 40){
                                                    JOptionPane.showMessageDialog(null, "Not enough money");
                                                    break;
                                                }else{
                                                    try{
                                                        ch2 = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                                                "1.Normal size\n" +
                                                                "2.Big size\n"));    
                                                        bowls = Integer.parseInt(JOptionPane.showInputDialog(null,"How many bowls of noodles do you want?"));                                                 
                                                        switch(ch2){
                                                            case 1:
                                                                nd.put(400+bowls, "Vermicelli noodles Normal size");
                                                                money.remove(40*bowls);
                                                                JOptionPane.showMessageDialog(null, "Added Vermicelli noodles Normal size "+bowls+" bowls");
                                                                break;
                                                            case 2:
                                                                nd.put(410+bowls, "Vermicelli noodles Big size");
                                                                money.remove(50*bowls);
                                                                JOptionPane.showMessageDialog(null, "Added Vermicelli noodles Big size "+bowls+" bowls");
                                                                break;
                                                        }
                                                    }catch (Exception e){
                                                        JOptionPane.showMessageDialog(null,e.getMessage());
                                                    }
                                                }
                                                System.out.println("Your money now: "+money.getBath());
                                                
                                                break;
                                                
                                            case 5:
                                                break;

                                            default:
                                                JOptionPane.showMessageDialog(null,"Invalid choice","Error",JOptionPane.ERROR_MESSAGE);
                                                break;
                                        }   
                                    }catch(Exception e){
                                        JOptionPane.showMessageDialog(null,e.getMessage());
                                    }
                                
                                break;
                        case 2:
                                
                                nd.clear();
                                money.setBath(budget);
                                JOptionPane.showMessageDialog(null,"All items are removed and your money is back to your budget");
                                System.out.println(money.getBath());
                                break;
                        
                        case 3:
                                
                                budget = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your budget"));
                                money.setBath(budget);
                                JOptionPane.showMessageDialog(null,"Your new budget is " + money.getBath());
                                nd.clear();
                                break;

                        case 4:
                                
                                // int a = budget - (int)money.getBath(); //TOTAL PRICE
                                // JOptionPane.showMessageDialog(null,"******************************************************************\n"+
                                // "                                        Order\n"+
                                // nd.entrySet()+"\n"+
                                // "                  Total price:              "+a+" Bath\n"+
                                // "                  Your budget:           "+budget+" Bath\n"+
                                // "                  Your money now:    "+money.getBath()+" Bath\n"+
                                // "------------------------------------------------------------------------------\n"+
                                // "                  Thank you for using our service\n"+
                                // "******************************************************************");
                                System.out.println("\n");
                                System.out.println("******************************************************************");
                                System.out.println("                               Order\n");
                                
 
                                for (Integer i: nd.keySet()) {
                                    String key = i.toString();
                                    String value = nd.get(i).toString();
                                    System.out.println("["+key+"]" + " " + value + " " + key.substring(2) + " bowls");
                                }

                                int a = budget - (int)money.getBath(); //TOTAL PRICE
                                    System.out.println("------------------------------------------------------------------");
                                    System.out.println("Total price: " + a);
                                    System.out.println("Your budget: " + budget);
                                    System.out.println("Your money: " + money.getBath());
                                    System.out.println("------------------------------------------------------------------");
                                    System.out.println("Thank you for using our service");
                                    System.out.println("******************************************************************");
                                
                                break;
                        case 5:
                                JOptionPane.showMessageDialog(null,"Enjoy your food");
                                break;

                        default:
                                JOptionPane.showMessageDialog(null,"Invalid choice","Error",JOptionPane.ERROR_MESSAGE);
                                break;
                    }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
    }

    }
}


