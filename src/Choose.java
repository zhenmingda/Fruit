/**
 * 
 */
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.LinkedList;

import javax.swing.*;
/**
 * @author chendanlan
 *
 */
public class Choose {
	final static LinkedList<String> list = new LinkedList<String>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame testFrame =  new JFrame();
		testFrame.setSize(500,150);
		testFrame.setTitle("Fruit");
		
		// TODO Auto-generated method stub
		testFrame.getContentPane().setLayout(new FlowLayout());
		
		JButton button1 =  new JButton("Submit");
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				JFrame testFrame2 = new JFrame("Fruit you have chosen");
				testFrame2.setSize(200,150);
				testFrame2.getContentPane().setLayout(new java.awt.FlowLayout());
				JLabel text1 =  new JLabel("you have chosen");
				testFrame2.getContentPane().add(text1);
				String display = "";
				for (int i = 0; i < list.size(); i++) {
				     display += list.get(i) + " ";
				    }

				TextField text2 = new TextField(display);
				testFrame2.add(text2);
				testFrame2.setVisible(true);
				   }
				  });
				
		
		final JCheckBox check1 =  new JCheckBox("Apple");
        final JCheckBox check2 =  new JCheckBox("Banana");
        final JCheckBox check3 =  new JCheckBox("Pear");
        final JCheckBox check4 =  new JCheckBox("Peach");
        final JCheckBox check5 =  new JCheckBox("Pineapple");
        final JCheckBox check6 =  new JCheckBox("Orange");
        
        testFrame.getContentPane().add(check1);
        testFrame.getContentPane().add(check2);
        testFrame.getContentPane().add(check3);
        testFrame.getContentPane().add(check4);
        testFrame.getContentPane().add(check5);
        testFrame.getContentPane().add(check6);
        testFrame.getContentPane().add(button1);
        
        
        check1.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {  
                if(check1.isSelected())
            	list.add("Apple");
                else list.remove("Apple");
            }  
        }); 
        
        check2.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {  
            	if(check2.isSelected())
            	list.add("Banana");
            	else list.remove("Banana");
            }  
        }); 
        
        check3.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {  
            	if(check3.isSelected())
            	list.add("Pear");
            	else list.remove("Pear");
            }  
        }); 
        
        check4.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {  
                
                if(check4.isSelected())
                	list.add("Peach");
                	else list.remove("Peach");
            }  
        }); 
        
        check5.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {  
            	if(check5.isSelected())
                	list.add("Pineapple");
                	else list.remove("Pineapple");
            }  
        }); 
        
        check6.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {  
            	if(check6.isSelected())
                	list.add("Orange");
                	else list.remove("Orange");
            }  
        }); 
        
        
        
        testFrame.setVisible(true);
	}

}
