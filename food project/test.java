import javax.swing.JOptionPane;
import java.util.HashMap;

public class test{
    public static void main(String[] args) throws Exception{

        int ch=0,ch2=0,mch=0,rm=0;
        String choice,choice2,mchoice,rmchoice;
        int budget;
        HashMap<String, String> nd = new HashMap<String, String>();

        budget = Integer.parseInt(JOptionPane.showInputDialog("Enter your budget"));
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
                                                "1. narrow rice noodles\n" +
                                                "2. wide rice noodles\n" +  
                                                "3. yellow Noodles\n" +    
                                                "4. white rice noodles\n" +
                                                "----------------------------------------------------------------\n");
                                        
                                        ch = Integer.parseInt(choice);
                                        switch (ch) {
                                            case 1:
                                                nd.put("001", "narrow rice noodles");
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
                                                nd.put("002", "wide rice noodles");
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
                                                nd.put("003", "yellow Noodles");
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
                                                nd.put("004", "white rice noodles");
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
                                JOptionPane.showMessageDialog(null,"All items are removed");
                                break;
                        
                        case 3:
                                budget = Integer.parseInt(JOptionPane.showInputDialog("Enter your budget"));
                                //budget
                                JOptionPane.showMessageDialog(null,"Budget is updated");
                                break;

                        case 4:
                                for (String i: nd.keySet()) {
                                    String key = i.toString();
                                    String value = nd.get(i).toString();
                                    System.out.println("["+key+"]" + " " + value);
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
                                            break;
                                        case 2:
                                            nd.remove("002");
                                            break;
                                        case 3:
                                            nd.remove("003");
                                            break;
                                        case 4:
                                            nd.remove("004");
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


