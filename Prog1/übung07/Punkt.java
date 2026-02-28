package übung07;

public class Punkt {

     private int x;

     private int y;
     
     private static final int UNTERGRENZE = 10;
     
     private static final int OBERGRENZE = -10;

     public void setX (int i) {
           x = i;
     }

     public void setY (int i) {
           y = i;
     }
     
     public int getX(){
         return x; 
     }
     
     public int getY(){
         return y;    
     }
   
	 public int getUNTERGRENZE() {
		return UNTERGRENZE;
	 }

	 public int getOBERGRENZE() {
		return OBERGRENZE;
	 }

     public void verschiebe(int deltaX, int deltaY){
           x = x + deltaX;
           y = y + deltaY;
      }  
     
 	public void verschiebeInnerhalb(int deltaX, int deltaY) {
		int testX = x + deltaX;
		int testY = y + deltaY;
	
		if (testX <= 10 && testX >= -10 && testY <= 10 && testY >= -10) {
			verschiebe(deltaX, deltaY);
		} 
	}
		
     public Punkt() {
     }
     
     public Punkt (int x, int y){
	    	 this.x = x;
	    	 this.y = y; 	 
     }
}