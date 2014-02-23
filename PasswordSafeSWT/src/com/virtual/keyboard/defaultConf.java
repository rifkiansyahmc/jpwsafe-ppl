package com.virtual.keyboard;
import java.util.Hashtable;

public class defaultConf {
   
   public static Hashtable<String, keys> setKeyboard(Hashtable<String, keys> myKeyboard) {
      keys myKey = new keys();
      myKeyboard.put("B0101char",myKey.setKeys("ا","ذ"));
      myKeyboard.put("B0102char",myKey.setKeys("ب","1"));
      myKeyboard.put("B0103char",myKey.setKeys("x","2"));
      myKeyboard.put("B0104char",myKey.setKeys("x","3"));
      myKeyboard.put("B0105char",myKey.setKeys("x","4"));
      myKeyboard.put("B0106char",myKey.setKeys("x","5"));
      myKeyboard.put("B0107char",myKey.setKeys("x","6"));
      myKeyboard.put("B0108char",myKey.setKeys("x","7"));
      myKeyboard.put("B0109char",myKey.setKeys("x","8"));
      myKeyboard.put("B0110char",myKey.setKeys("x","9"));
      myKeyboard.put("B0111char",myKey.setKeys("x","0"));
      myKeyboard.put("B0112char",myKey.setKeys("x","-"));
      myKeyboard.put("B0201char",myKey.setKeys("x","ض"));
      myKeyboard.put("B0202char",myKey.setKeys("x","ص"));
      myKeyboard.put("B0203char",myKey.setKeys("x","ث"));
      myKeyboard.put("B0204char",myKey.setKeys("x","ق"));
      myKeyboard.put("B0205char",myKey.setKeys("x","�?"));
      myKeyboard.put("B0206char",myKey.setKeys("x","غ"));
      myKeyboard.put("B0207char",myKey.setKeys("x","ع"));
      myKeyboard.put("B0208char",myKey.setKeys("x","ه"));
      myKeyboard.put("B0209char",myKey.setKeys("x","خ"));
      myKeyboard.put("B0210char",myKey.setKeys("؛","ح"));
      myKeyboard.put("B0211char",myKey.setKeys("x","ج"));
      myKeyboard.put("B0212char",myKey.setKeys("x","د"));
      myKeyboard.put("B0301char",myKey.setKeys("x","ش"));
      myKeyboard.put("B0302char",myKey.setKeys("x","س"));
      myKeyboard.put("B0303char",myKey.setKeys("x","ي"));
      myKeyboard.put("B0304char",myKey.setKeys("x","ب"));
      myKeyboard.put("B0305char",myKey.setKeys("لأ","ل"));
      myKeyboard.put("B0306char",myKey.setKeys("أ","ا"));
      myKeyboard.put("B0307char",myKey.setKeys("ـ","ت"));
      myKeyboard.put("B0308char",myKey.setKeys("،","ن"));
      myKeyboard.put("B0309char",myKey.setKeys("/","م"));
      myKeyboard.put("B0310char",myKey.setKeys("x","ك"));
      myKeyboard.put("B0311char",myKey.setKeys("x","ط"));
      myKeyboard.put("B0312char",myKey.setKeys("x","-"));
      myKeyboard.put("B0401char",myKey.setKeys("x","ئ"));
      myKeyboard.put("B0402char",myKey.setKeys("x","ء"));
      myKeyboard.put("B0403char",myKey.setKeys("x","ؤ"));
      myKeyboard.put("B0404char",myKey.setKeys("x","ر"));
      myKeyboard.put("B0405char",myKey.setKeys("لآ","لا"));
      myKeyboard.put("B0406char",myKey.setKeys("آ","ى"));
      myKeyboard.put("B0407char",myKey.setKeys("x","ة"));
      myKeyboard.put("B0408char",myKey.setKeys(",","و"));
      myKeyboard.put("B0409char",myKey.setKeys(".","ز"));
      myKeyboard.put("B0410char",myKey.setKeys("؟","ظ"));
      myKeyboard.put("B0411char",myKey.setKeys("x","-"));
      myKeyboard.put("B0412char",myKey.setKeys("x","-"));
      myKeyboard.put("B0501char",myKey.setKeys("x","-"));
      myKeyboard.put("B0502char",myKey.setKeys("x","لآ"));
      myKeyboard.put("B0503char",myKey.setKeys("x","آ"));
      myKeyboard.put("B0504char",myKey.setKeys("x",","));
      myKeyboard.put("B0505char",myKey.setKeys("x","."));
      myKeyboard.put("B0506char",myKey.setKeys("x","؟"));
      myKeyboard.put("B0507char",myKey.setKeys("x","لأ"));
      myKeyboard.put("B0508char",myKey.setKeys("x","أ"));
      myKeyboard.put("B0509char",myKey.setKeys("x","ـ"));
      myKeyboard.put("B0510char",myKey.setKeys("x","،"));
      myKeyboard.put("B0511char",myKey.setKeys("x","/"));
      myKeyboard.put("B0512char",myKey.setKeys("x","؛"));
      return myKeyboard;
   }
   
   /**
    * This method initializes the Configuration-Hastable with default values
    * @return java.util.Hashtable
    */
   public static Hashtable<String, String> setDefault(Hashtable<String, String> myConf) {
      myConf.put("ButtonLine1","70");
      myConf.put("ButtonLine2","103");
      myConf.put("ButtonLine3","136");
      myConf.put("ButtonLine4","169");
      myConf.put("ButtonLine5","202");
      myConf.put("ButtonLine6","235");
      myConf.put("ButtonLineTO","25");
      myConf.put("WindowSizeX","640");
      myConf.put("WindowSizeY","300");
      myConf.put("ButtonSizeX","47");
      myConf.put("ButtonSizeY","26");
      myConf.put("SpaceButtonSizeX","365");
      myConf.put("SpaceButtonSizeY","24");
      myConf.put("CapsLockButtonSizeX","55");
      myConf.put("CapsLockButtonSizeY","24");
      myConf.put("TOButtonSizeX","20");
      myConf.put("TOButtonSizeY","26");
      myConf.put("Button01Start","15");
      myConf.put("Button02Start","65");
      myConf.put("Button03Start","115");
      myConf.put("Button04Start","165");
      myConf.put("Button05Start","215");
      myConf.put("Button06Start","265");
      myConf.put("Button07Start","315");
      myConf.put("Button08Start","365");
      myConf.put("Button09Start","415");
      myConf.put("Button10Start","465");
      myConf.put("Button11Start","515");
      myConf.put("Button12Start","565");
      myConf.put("SpaceButtonStart","136");
      myConf.put("CapsLockButtonStart","20");
      myConf.put("TOButtonStart","600");
      myConf.put("ButtonLineOffset","3");
      return myConf;
   }

}
