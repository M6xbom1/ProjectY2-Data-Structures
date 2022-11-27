package food_project;

import javax.swing.JOptionPane;


//key = 1:1:1 = ลําดับเมนู:size(Normal=0,Big=1):จํานวนชาม;
public class DriverTest{
    public static void main(String[] args) throws Exception{

        int ch=0,ch2=0,mch=0,rm=0,bowls=0;
        int budget=0;
        int count=0;

        // ArrayList<String> menu = new ArrayList<String>();
        MyHashMap<Integer, String> nd = new MyHashMap<Integer, String>();
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
                                                "1. Narrow rice noodles\n " +
                                                "2. Wide rice noodles\n" +  
                                                "3. Yellow Noodles\n" +    
                                                "4. White rice noodles\n" +
                                                "----------------------------------------------------------------\n"));
                                        
                                        int m = (int) money.getBath();
                                        switch (ch) {
                                            case 1:
                                                if(m < 40){
                                                    JOptionPane.showMessageDialog(null, "Not enough money please update your budget");
                                                    break;
                                                }else{
                                                    try{
                                                        ch2 = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                                                "1.Normal size\n" +
                                                                "2.Big size\n"));    
                                                        bowls = Integer.parseInt(JOptionPane.showInputDialog(null,"How many bowls of noodles do you want?"));                                                 
                                                        switch(ch2){
                                                            case 1:
                                                                for(int i=0;bowls>i;i++){
                                                                    nd.put(101+i, "Narrow rice noodles Normal size");
                                                                    count++;
                                                                }
                                                                money.remove(40*bowls);
                                                                JOptionPane.showMessageDialog(null, "Added narrow rice noodles Normal size "+bowls+" bowls");
                                                                break;
                                                            case 2:
                                                                for(int i=0;bowls>i;i++){
                                                                    nd.put(111+i, "Narrow rice noodles Big size");
                                                                    count++;
                                                                }
                                                                money.remove(50*bowls);
                                                                JOptionPane.showMessageDialog(null, "Added narrow rice noodles Big size "+bowls+" bowls");
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
                                                    JOptionPane.showMessageDialog(null, "Not enough money please update your budget");
                                                    break;
                                                }else{
                                                    try{
                                                        ch2 = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                                                "1.Normal size\n" +
                                                                "2.Big size\n"));    
                                                        bowls = Integer.parseInt(JOptionPane.showInputDialog(null,"How many bowls of noodles do you want?"));                                                 
                                                        switch(ch2){
                                                            case 1:
                                                                for(int i=0;bowls>i;i++){
                                                                    nd.put(201+i, "Wide rice noodles Normal size");
                                                                    count++;
                                                                }
                                                                money.remove(40*bowls);
                                                                JOptionPane.showMessageDialog(null, "Added Wide rice noodles Normal size "+bowls+" bowls");
                                                                break;
                                                            case 2:
                                                                for(int i=0;bowls>i;i++){
                                                                    nd.put(211+i, "Wide rice noodles Big size");
                                                                    count++;
                                                                }
                                                                money.remove(50*bowls);
                                                                JOptionPane.showMessageDialog(null, "Added Wide rice noodles Big size "+bowls+" bowls");
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
                                                    JOptionPane.showMessageDialog(null, "Not enough money please update your budget");
                                                    break;
                                                }else{
                                                    try{
                                                        ch2 = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                                                "1.Normal size\n" +
                                                                "2.Big size\n"));    
                                                        bowls = Integer.parseInt(JOptionPane.showInputDialog(null,"How many bowls of noodles do you want?"));                                                 
                                                        switch(ch2){
                                                            case 1:
                                                                for(int i=0;bowls>i;i++){
                                                                    nd.put(301+i, "Yellow Noodles Normal size");
                                                                    count++;
                                                                }
                                                                money.remove(40*bowls);
                                                                JOptionPane.showMessageDialog(null, "Added Yellow Noodles Normal size "+bowls+" bowls");
                                                                break;
                                                            case 2:
                                                                for(int i=0;bowls>i;i++){
                                                                    nd.put(311+i, "Yellow Noodles Big size");
                                                                    count++;
                                                                }
                                                                money.remove(50*bowls);
                                                                JOptionPane.showMessageDialog(null, "Added Yellow Noodles Big size "+bowls+" bowls");
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
                                                    JOptionPane.showMessageDialog(null, "Not enough money please update your budget");
                                                    break;
                                                }else{
                                                    try{
                                                        ch2 = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                                                "1.Normal size\n" +
                                                                "2.Big size\n"));    
                                                        bowls = Integer.parseInt(JOptionPane.showInputDialog(null,"How many bowls of noodles do you want?"));                                                 
                                                        switch(ch2){
                                                            case 1:
                                                                for(int i=0;bowls>i;i++){
                                                                    nd.put(401+i, "White rice noodles Normal size");
                                                                    count++;
                                                                }
                                                                money.remove(40*bowls);
                                                                JOptionPane.showMessageDialog(null, "Added White rice noodles Normal size "+bowls+" bowls");
                                                                break;
                                                            case 2:
                                                                for(int i=0;bowls>i;i++){
                                                                    nd.put(411+i, "White rice noodles Big size");
                                                                    count++;
                                                                }
                                                                money.remove(50*bowls);
                                                                JOptionPane.showMessageDialog(null, "Added White rice noodles Big size "+bowls+" bowls");
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
                                count = 0;
                                nd.clear();
                                money.setBath(budget);
                                JOptionPane.showMessageDialog(null,"All items are removed and your money is back to your budget");
                                System.out.println(money.getBath());
                                break;
                        
                        case 3:
                                count = 0;
                                budget = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your budget"));
                                money.setBath(budget);
                                //int nbudget = Integer.parseInt(JOptionPane.showInputDialog("Enter your new budget"));
                                //budget = money.add(nbudget);
                                JOptionPane.showMessageDialog(null,"Your new budget is " + money.getBath());
                                nd.clear();
                                break;

                        case 4:
                                System.out.println("******************************************************************");
                                System.out.println("                               Order");

                                for (String i : nd.values()) {
                                    System.out.println(i);
                                }

                                int a = budget - (int)money.getBath(); //TOTAL PRICE
                                    System.out.println("------------------------------------------------------------------");
                                    System.out.println("Total item: "+nd.size());
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
                    }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
    }

    }
}


