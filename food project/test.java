import javax.swing.JOptionPane;
import java.util.HashMap;

public class test{
    public static void main(String[] args) throws Exception{

        int ch = 0,ch2 = 0,mch = 0;
        String choice,choice2,mchoice,budget;
        HashMap<String, String> nd = new HashMap<String, String>();

        budget = JOptionPane.showInputDialog("Enter your budget");
        while(mch != 5){
            try{
                mchoice = JOptionPane.showInputDialog(null,
                "Choose the Option you want to perform\n"+
                "1. Add an item\n"+
                "2. Remove an item\n"+
                "3. Update Budget\n"+
                "4. Show All Item\n"+
                "5. Exit");
                
                mch = Integer.parseInt(mchoice);
                    switch(mch){
                        case 1:
                                while(ch != 5){
                                    try{
                                        choice = JOptionPane.showInputDialog(null,
                                                "----------------------------------------------------------------\n" +
                                                "                              Menu                              \n" +
                                                "----------------------------------------------------------------\n" +
                                                "1. narrow rice noodles\n" + //เส้นเล็ก
                                                "2. wide rice noodles\n" +   //เส้นใหญ่
                                                "3. yellow Noodles\n" +      //เส้นหมี่เหลือง
                                                "4. white rice noodles\n" +  //เส้นหมี่ขาว
                                                "5. Back\n" +
                                                "----------------------------------------------------------------\n");
                                        
                                        ch = Integer.parseInt(choice);
                                        switch (ch) {
                                            case 1:
                                                try{
                                                    choice2 = JOptionPane.showInputDialog(null, 
                                                            "1.with soup\n" +
                                                            "2.without soup\n");
                                                    ch2 = Integer.parseInt(choice2);
                                                    switch(ch2){
                                                        case 1:
                                                            nd.put("001", "narrow rice noodles with soup");
                                                            break;
                                                        case 2:
                                                            nd.put("101", "narrow rice noodles without soup");
                                                            break;
                                                    }
                                                }catch (Exception e){
                                                    JOptionPane.showMessageDialog(null,e.getMessage());
                                                }
                                                break;
                        
                        
                                            case 2:
                                                try{
                                                    choice2 = JOptionPane.showInputDialog(null, 
                                                            "1.with soup\n" +
                                                            "2.without soup\n");
                                                    ch2 = Integer.parseInt(choice2);
                                                    switch(ch2){
                                                        case 1:
                                                            nd.put("002", "wide rice noodles with soup");
                                                            break;
                                                        case 2:
                                                            nd.put("102", "wide rice noodles without soup");
                                                            break;
                                                    }
                                                }catch (Exception e){
                                                    JOptionPane.showMessageDialog(null,e.getMessage());
                                                }
                                                break;
                        
                        
                                            case 3:
                                                try{
                                                    choice2 = JOptionPane.showInputDialog(null, 
                                                            "1.with soup\n" +
                                                            "2.without soup\n");
                                                    ch2 = Integer.parseInt(choice2);
                                                    switch(ch2){
                                                        case 1:
                                                            nd.put("003", "yellow Noodles with soup");
                                                            break;
                                                        case 2:
                                                            nd.put("103", "yellow Noodles without soup");
                                                            break;
                                                    }
                                                }catch (Exception e){
                                                    JOptionPane.showMessageDialog(null,e.getMessage());
                                                }
                                                break;
                        
                        
                                            case 4:
                                                try{
                                                    choice2 = JOptionPane.showInputDialog(null, 
                                                            "1.with soup\n" +
                                                            "2.without soup\n");
                                                    ch2 = Integer.parseInt(choice2);
                                                    switch(ch2){
                                                        case 1:
                                                            nd.put("004", "white rice noodles with soup");
                                                            break;
                                                        case 2:
                                                            nd.put("104", "white rice noodles without soup");
                                                            break;
                                                    }
                                                }catch (Exception e){
                                                    JOptionPane.showMessageDialog(null,e.getMessage());
                                                }
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
                                }
                                break;
                        case 2:
                                nd.clear();
                                JOptionPane.showMessageDialog(null,"All items are removed");
                                break;
                        
                        case 3:
                                budget = JOptionPane.showInputDialog("Enter your budget");
                                JOptionPane.showMessageDialog(null,"Budget is updated");
                                break;

                        case 4:
                                for (String i : nd.values()) {
                                    JOptionPane.showMessageDialog(null,i);
                                }
                                break;

                        case 5:
                                JOptionPane.showMessageDialog(null,"Program is terminated");
                                break;
                    }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
    }
        
    }
}

