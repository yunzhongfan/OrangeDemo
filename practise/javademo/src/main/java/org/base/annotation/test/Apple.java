package org.base.annotation.test;


import org.base.annotation.FruitColor;
import org.base.annotation.FruitColor.Color;
import org.base.annotation.FruitName;
import org.base.annotation.FruitProvider;
import org.base.annotation.IsValidString;
import org.junit.Test;





/**
 * 
 * https://www.cnblogs.com/softidea/p/5709397.html
 * @author nbc
 *
 */
public class Apple {
	
	    @FruitName
	    private String appleName;
	    
	    @FruitColor(fruitColor=Color.RED)
	    private String appleColor;
	    
	    @FruitProvider(id=1,name="陕西红富士集团",address="陕西省西安市延安路89号红富士大厦")
	    private  String  address;
	    
	    @IsValidString
	    private  String  str;
	    
	    public void setAppleColor(String appleColor) {
	        this.appleColor = appleColor;
	    }
	    public String getAppleColor() {
	        return appleColor;
	    }
	    
	    
	    public void setAppleName(String appleName) {
	        this.appleName = appleName;
	    }
	    public String getAppleName() {
	        return appleName;
	    }
	    
	    public void displayName(){
	        System.out.println("水果的名字是：苹果");
	    }
	    
	    @Test
	    public  void mainTest() {
	    	 System.out.println(appleName+appleColor);
		}

}
