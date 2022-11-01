package food_project;

import javax.swing.JOptionPane;
import java.util.HashMap;
// import java.util.ArrayList;

public class Test{
    public static void main(String[] args) throws Exception{

        int ch=0,ch2=0,mch=0,rm=0;
        String choice,choice2,mchoice,rmchoice;
        int budget=0;

        // ArrayList<String> menu = new ArrayList<String>();
        HashMap<String, String> nd = new HashMap<String, String>();
        Money money = new Money();

        budget = Integer.parseInt(JOptionPane.showInputDialog("Enter your budget"));
        money.setBath(budget);
        System.out.println("Your money now: "+money.getBath());
        
        while(mch != 6){
            try{
                mchoice = JOptionPane.showInputDialog(null,
                "Choose the Option you want to perform\n"+
                "1. Add an item\n"+
                "2. Clear Order\n"+
                "3. New Budget\n"+
                "4. Show All Item\n"+
                "5. Remove item\n"+
                "6. Exit");
                
                mch = Integer.parseInt(mchoice);
                    switch(mch){
                        case 1:
                                
                                    try{
                                        choice = JOptionPane.showInputDialog(null,
                                                "----------------------------------------------------------------\n" +
                                                "                              Menu                              \n" +
                                                "----------------------------------------------------------------\n" +
                                                "1. Narrow rice noodles\n " +
                                                "2. Wide rice noodles\n" +  
                                                "3. Yellow Noodles\n" +    
                                                "4. White rice noodles\n" +
                                                "----------------------------------------------------------------\n");
                                        
                                        ch = Integer.parseInt(choice);
                                        int m = (int) money.getBath();
                                        switch (ch) {
                                            case 1:
                                                if(m < 40){
                                                    JOptionPane.showMessageDialog(null, "Not enough money please update your budget");
                                                    break;
                                                }else{
                                                    try{
                                                        choice2 = JOptionPane.showInputDialog(null, 
                                                                "1.Normal size\n" +
                                                                "2.Big size\n");
                                                        ch2 = Integer.parseInt(choice2);
                                                        switch(ch2){
                                                            case 1:
                                                                nd.put("001", "Narrow rice noodles Normal size :40 bath");
                                                                money.remove(40);
                                                                JOptionPane.showMessageDialog(null, "Added narrow rice noodles Normal size 40 bath");
                                                                break;
                                                            case 2:
                                                                nd.put("101", "Narrow rice noodles Big size :50 bath");
                                                                money.remove(50);
                                                                JOptionPane.showMessageDialog(null, "Added narrow rice noodles Big size 50 bath");
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
                                                        choice2 = JOptionPane.showInputDialog(null, 
                                                                "1.Normal size\n" +
                                                                "2.Big size\n");
                                                        ch2 = Integer.parseInt(choice2);
                                                        switch(ch2){
                                                            case 1:
                                                                nd.put("002", "Wide rice noodles Normal size :40 bath");
                                                                money.remove(40);
                                                                JOptionPane.showMessageDialog(null, "Added Wide rice noodles Normal size 40 bath");
                                                                break;
                                                            case 2:
                                                                nd.put("102", "Wide rice noodles Big size :50 bath");
                                                                money.remove(50);
                                                                JOptionPane.showMessageDialog(null, "Added Wide rice noodles Big size 50 bath");
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
                                                        choice2 = JOptionPane.showInputDialog(null, 
                                                                "1.Normal size\n" +
                                                                "2.Big size\n");
                                                        ch2 = Integer.parseInt(choice2);
                                                        switch(ch2){
                                                            case 1:
                                                                nd.put("003", "Yellow Noodles Normal size :40 bath");
                                                                money.remove(40);
                                                                JOptionPane.showMessageDialog(null, "Added Yellow Noodles Normal size 40 bath");
                                                                break;
                                                            case 2:
                                                                nd.put("103", "Yellow Noodles Big size :50 bath");
                                                                money.remove(50);
                                                                JOptionPane.showMessageDialog(null, "Added Yellow Noodles Big size 50 bath");
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
                                                        choice2 = JOptionPane.showInputDialog(null, 
                                                                "1.Normal size\n" +
                                                                "2.Big size\n");
                                                        ch2 = Integer.parseInt(choice2);
                                                        switch(ch2){
                                                            case 1:
                                                                nd.put("004", "White rice noodles Normal size :40 bath");
                                                                money.remove(40);
                                                                JOptionPane.showMessageDialog(null, "Added Yellow Noodles Normal size 40 bath");
                                                                break;
                                                            case 2:
                                                                nd.put("104", "White rice noodles Big size :50 bath");
                                                                money.remove(50);
                                                                JOptionPane.showMessageDialog(null, "Added Yellow Noodles Big size 50 bath");
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
                                JOptionPane.showMessageDialog(null,"All items are removed");
                                System.out.println(money.getBath());
                                break;
                        
                        case 3:
                                budget = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your budget"));
                                money.setBath(budget);
                                //int nbudget = Integer.parseInt(JOptionPane.showInputDialog("Enter your new budget"));
                                //budget = money.add(nbudget);
                                JOptionPane.showMessageDialog(null,"Your new budget is " + money.getBath());
                                nd.clear();
                                break;

                        case 4:
                                for (String i: nd.keySet()) {
                                    String key = i.toString();
                                    String value = nd.get(i).toString();
                                    System.out.println("["+key+"]" + " " + value);
                                }
                                int a = budget - (int)money.getBath(); //TOTAL PRICE
                                    System.out.println("Total: " + a);
                                    System.out.println("Your budget: " + budget);
                                    System.out.println("Your money: " + money.getBath());
                                // for (String i : nd.values()) {
                                //     System.out.println(i);
                                // }
                                break;

                        case 5:
                                try{
                                    rmchoice = JOptionPane.showInputDialog(null,
                                            "----------------------------------------------------------------\n" +
                                            "                     Order you want to remove          \n" +
                                            "----------------------------------------------------------------\n" +
                                            "1. Narrow rice noodles Normal size\n" +
                                            "2. Wide rice noodles Normal size\n" +  
                                            "3. Yellow Noodles Normal size\n" +    
                                            "4. White rice noodles Normal size\n" +
                                            "5. Narrow rice noodles Big size\n" +
                                            "6. Wide rice noodles Big size\n" +
                                            "7. Yellow Noodles Big size\n" +
                                            "8. White rice noodles Big size\n" +
                                            "9. Back\n" +
                                            "----------------------------------------------------------------\n");
                                        
                                    rm = Integer.parseInt(rmchoice);
                                    switch (rm) {
                                        case 1:
                                            nd.remove("001");
                                            money.add(40);
                                            break;
                                        case 2:
                                            nd.remove("002");
                                            money.add(40);
                                            break;
                                        case 3:
                                            nd.remove("003");
                                            money.add(40);
                                            break;
                                        case 4:
                                            nd.remove("004");
                                            money.add(40);
                                            break;
                                        case 5:
                                            nd.remove("101");
                                            money.add(50);
                                            break;
                                        case 6:
                                            nd.remove("102");
                                            money.add(50);
                                            break;
                                        case 7:
                                            nd.remove("103");
                                            money.add(50);
                                            break;
                                        case 8:
                                            nd.remove("104");
                                            money.add(50);
                                            break;
                                        case 9:
                                            break;

                                        default:
                                            JOptionPane.showMessageDialog(null,"Invalid choice","Error",JOptionPane.ERROR_MESSAGE);
                                            break;
                                    }   
                                }catch(Exception e){
                                    JOptionPane.showMessageDialog(null,e.getMessage());
                                }
                                break;  

                        case 6:
                                JOptionPane.showMessageDialog(null,"Enjoy your food");
                                break;
                    }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
    }

    }
}


