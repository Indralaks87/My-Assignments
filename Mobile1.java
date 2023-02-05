package week1.Assignment;


public class Mobile1 {
	
      public void makeCall() {
    	  
    	  String mobileModel= "oppo";
    	  float mobileWeight= 150f;
    	  System.out.println("The Mobile model is" + mobileModel);
    	  System.out.println("The Mobile weight is"+ mobileWeight);
      }

      public void sendMsg() {
    	  
    	  boolean isFullCharged= true;
    	  int mobileCost= 10000;
    	  System.out.println("Is my mobile full charged" + isFullCharged); 
	      System.out.println("Mobile cost is" +  mobileCost);	
      }
	      
	  public static void main(String[] args) {
		
          Mobile1 obj =new Mobile1();
          obj.makeCall();
          obj.sendMsg();
          System.out.println("This is my mobile");
          
          
	}

}
