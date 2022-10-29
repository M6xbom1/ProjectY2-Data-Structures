package food_project;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashMap;

public class Test{
    public static void main(String[] args) throws Exception{

        int ch=0,ch2=0,mch=0,rm=0;
        String choice,choice2,mchoice,rmchoice;
        int budget=0;

        ArrayList<String> menu = new ArrayList<String>();
        HashMap<String, String> nd = new HashMap<String, String>();
        Money money = new Money();

        budget = Integer.parseInt(JOptionPane.showInputDialog("Enter your budget"));
        money.setBath(budget);
        money.getBath();
        
        while(mch != 6){
            try{
                mchoice = JOptionPane.showInputDialog(null,
                "Choose the Option you want to perform\n"+
                "1. Add an item\n"+
                "2. Clear Order\n"+
                "3. Update Budget\n"+
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
                                                "1. narrow rice noodles 40 bath\n " +
                                                "2. wide rice noodles 40 bath\n" +  
                                                "3. yellow Noodles 40 bath\n" +    
                                                "4. white rice noodles 40 bath\n" +
                                                "----------------------------------------------------------------\n");
                                        
                                        ch = Integer.parseInt(choice);
                                        int m = (int) money.getBath();
                                        switch (ch) {
                                            case 1:
                                                if(m < 40){
                                                    JOptionPane.showMessageDialog(null, "Not enough money please update your budget");
                                                }else{
                                                    nd.put("001", "narrow rice noodles");
                                                    money.remove(40);
                                                    JOptionPane.showMessageDialog(null, "Added narrow rice noodles 40 bath");
                                                }
                                                System.out.println(money.getBath());
                                                // try{
                                                //     choice2 = JOptionPane.showInputDialog(null, 
                                                //             "1.with soup\n" +
                                                //             "2.without soup\n");
                                                //     ch2 = Integer.parseInt(choice2);
                                                //     switch(ch2){
                                                //         case 1:
                                                //             nd.put("001", "narrow rice noodles with soup");
                                                //             break;
                                                //         case 2:
                                                //             nd.put("101", "narrow rice noodles without soup");
                                                //             break;
                                                //     }
                                                // }catch (Exception e){
                                                //     JOptionPane.showMessageDialog(null,e.getMessage());
                                                // }
                                                break;
                        
                        
                                            case 2:
                                                if(m < 40){
                                                    JOptionPane.showMessageDialog(null, "Not enough money please update your budget");
                                                }else{
                                                    nd.put("002", "wide rice noodles");
                                                    money.remove(40);
                                                    JOptionPane.showMessageDialog(null, "Added wide rice noodles 40 bath");
                                                }
                                                System.out.println(money.getBath());
                                                // try{
                                                //     choice2 = JOptionPane.showInputDialog(null, 
                                                //             "1.with soup\n" +
                                                //             "2.without soup\n");
                                                //     ch2 = Integer.parseInt(choice2);
                                                //     switch(ch2){
                                                //         case 1:
                                                //             nd.put("002", "wide rice noodles with soup");
                                                //             break;
                                                //         case 2:
                                                //             nd.put("102", "wide rice noodles without soup");
                                                //             break;
                                                //     }
                                                // }catch (Exception e){
                                                //     JOptionPane.showMessageDialog(null,e.getMessage());
                                                // }
                                                break;
                        
                        
                                            case 3:
                                                if(m < 40){
                                                    JOptionPane.showMessageDialog(null, "Not enough money please update your budget");
                                                }else{
                                                    nd.put("003", "yellow Noodles");
                                                    money.remove(40);
                                                    JOptionPane.showMessageDialog(null, "Added yellow Noodles 40 bath");
                                                }
                                                System.out.println(money.getBath());
                                                // try{
                                                //     choice2 = JOptionPane.showInputDialog(null, 
                                                //             "1.with soup\n" +
                                                //             "2.without soup\n");
                                                //     ch2 = Integer.parseInt(choice2);
                                                //     switch(ch2){
                                                //         case 1:
                                                //             nd.put("003", "yellow Noodles with soup");
                                                //             break;
                                                //         case 2:
                                                //             nd.put("103", "yellow Noodles without soup");
                                                //             break;
                                                //     }
                                                // }catch (Exception e){
                                                //     JOptionPane.showMessageDialog(null,e.getMessage());
                                                // }
                                                break;
                        
                        
                                            case 4:
                                                if(m < 40){
                                                    JOptionPane.showMessageDialog(null, "Not enough money please update your budget");
                                                }else{
                                                    nd.put("004", "white rice noodles");
                                                    money.remove(40);
                                                    JOptionPane.showMessageDialog(null, "Added white rice noodles 40 bath");
                                                }
                                                System.out.println(money.getBath());
                                                // try{
                                                //     choice2 = JOptionPane.showInputDialog(null, 
                                                //             "1.with soup\n" +
                                                //             "2.without soup\n");
                                                //     ch2 = Integer.parseInt(choice2);
                                                //     switch(ch2){
                                                //         case 1:
                                                //             nd.put("004", "white rice noodles with soup");
                                                //             break;
                                                //         case 2:
                                                //             nd.put("104", "white rice noodles without soup");
                                                //             break;
                                                //     }
                                                // }catch (Exception e){
                                                //     JOptionPane.showMessageDialog(null,e.getMessage());
                                                // }
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
                                break;
                        
                        case 3:
                                budget = Integer.parseInt(JOptionPane.showInputDialog("Enter your new budget"));
                                money.add(budget);
                                JOptionPane.showMessageDialog(null,"Your new budget is " + money.getBath());
                                break;

                        case 4:
                                for (String i: nd.keySet()) {
                                    String key = i.toString();
                                    String value = nd.get(i).toString();
                                    System.out.println("["+key+"]" + " " + value + " " + money.getBath());
                                    int a = budget - (int)money.getBath();
                                    System.out.println("Total " + a);
                                }
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
                                            "1. narrow rice noodles\n" +
                                            "2. wide rice noodles\n" +  
                                            "3. yellow Noodles\n" +    
                                            "4. white rice noodles\n" +
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
                                JOptionPane.showMessageDialog(null,"Enjot your food");
                                break;
                    }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
    }

    }

    public void getBudget(int budget){
        if(budget <= 0){
            JOptionPane.showMessageDialog(null,"Budget is not enough","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            
        }

        }
}


