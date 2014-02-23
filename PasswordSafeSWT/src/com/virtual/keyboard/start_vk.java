package com.virtual.keyboard;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Hashtable;


public class start_vk {

   public static Hashtable<String, String> myConf = new Hashtable<String, String>();
   public static Hashtable<String, keys>   myKeys = new Hashtable<String, keys>();
   public String kata; 
   public int isi;
   
   public void showVK(Button btn, Text txt) {
		
		btn.addSelectionListener (new SelectionAdapter () {
			public void widgetSelected (SelectionEvent e) {
				myConf = defaultConf.setDefault(myConf);
	            myKeys = defaultConf.setKeyboard(myKeys);
	            readConf();
	            vk_gui thisClass = new vk_gui();
	            thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            thisClass.setVisible(true);
	            kata = thisClass.getString();
	            System.out.print("kata"+kata);
	            
	            do{
	            	kata = thisClass.getString();
	            }while (thisClass.isi != 1);
	            
				if (kata != null) {
					txt.setText(kata);
				}
			}
		});
	}

   /**
    * This method initializes the Virtual Keyboard
    *
    * @return void
    */
   private static void readConf() {
                                                                                    // Setting keyboard
      BufferedReader conf = null;
      try {
         conf = new BufferedReader(new InputStreamReader(new FileInputStream("conf" + File.separator + "keyboard.conf"),"UTF-8"));
         String confLine;
         while((confLine = conf.readLine()) != null) {
            keys keyItem = new keys();
            if(confLine.length() > 0) {                                             // contains crashes if empty line is parsed
               if(!confLine.substring(0,1).contains("#")) {                         // Ignore Comments
                  if(!confLine.contains("=") || !confLine.contains("\",,\"")) {     // Make shure right syntax
                     System.err.println("Incompatible config line: " + confLine);
                  } else {                                                          // Get ParamName and Param
                     int spacePos   = confLine.indexOf("=");
                     int seperator  = confLine.indexOf("\",,\"");
                     int firstGFPos = confLine.indexOf("\"");
                     int lastGFPos  = confLine.lastIndexOf("\"");
                     //System.out.println(confLine + " sP: " + spacePos + " se: " + seperator + " fG: " + firstGFPos + " lG: " + lastGFPos);
                     keyItem.setLowerCase(confLine.substring(firstGFPos + 1, seperator));
                     keyItem.setUpperCase(confLine.substring(seperator + 4, lastGFPos));
                     myKeys.put(confLine.substring(0,spacePos).trim(),keyItem);
                  }
               }
            }
         }
      } catch(IOException e) {
         System.err.println("Error reading config file:\n" + e);
      }

                                                                                    // Setting window configuration
      conf = null;
      try {
         conf = new BufferedReader(new InputStreamReader(new FileInputStream("conf" + File.separator + "window.conf"),"UTF-8"));
         String confLine;
         while((confLine = conf.readLine()) != null) {
            confParameter confItem = new confParameter();
            if(confLine.length() > 0) {                                             // conatins crashes if empty line is parsed
               if(!confLine.substring(0,1).contains("#")) {                         // Ignore Comments
                  if(confLine.contains("=")) {                                      // Make shure right syntax
                     int spacePos   = confLine.indexOf("=");
                     int firstGFPos = confLine.indexOf("\"");
                     int lastGFPos  = confLine.lastIndexOf("\"");
                     confItem.setName(confLine.substring(0,spacePos).trim());
                     confItem.setParam(confLine.substring(firstGFPos + 1, lastGFPos));
                     myConf.put(confItem.getName(),confItem.getParam());
                  } else {
                     System.err.println("Incompatible config line: " + confLine);
                  }
               }
            }
         }
      } catch(IOException e) {
         System.err.println("Error reading config file:\n" + e);
      }
   }


}