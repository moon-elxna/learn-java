package übung07;

public class PunktTest {
      public static void main (String[] args){
    	  	Punkt p2 = new Punkt(2,2);
    	  	Punkt p3 = new Punkt(7,-1);
    	  	//Sp3 = null;
    	  	System.out.println(String.format("Punkt p%s(%s,%s)", 2, p2.getX(), p2.getY()));
    	  	System.out.println(String.format("Punkt p%s(%s,%s)", 3, p3.getX(), p3.getY()));
    	  	System.out.println("---");
    	  	 	
    	  	p2.verschiebe(5, -3);
    	  	System.out.println(String.format("Punkt p%s(%s,%s)", 2, p2.getX(), p2.getY()));
    	  	System.out.println(String.format("Punkt p%s(%s,%s)", 3, p3.getX(), p3.getY()));
    	  	System.out.println("---");
    	  	
    	  	p3.verschiebe(-2, 6);
    	  	System.out.println(String.format("Punkt p%s(%s,%s)", 2, p2.getX(), p2.getY()));
    	  	System.out.println(String.format("Punkt p%s(%s,%s)", 3, p3.getX(), p3.getY()));
    	  	System.out.println("---");
    	  	System.out.println("---");
    	  	
    	  	Punkt p1 = new Punkt(1,-2);
    	  	System.out.println(String.format("Punkt p%s(%s,%s)", 1, p1.getX(), p1.getY()));
    	  	System.out.println("---");
    	  	
    	  	p1.verschiebeInnerhalb(5, -5);
    	  	System.out.println(String.format("Punkt p%s(%s,%s)", 1, p1.getX(), p1.getY()));
    	  	System.out.println("---");
    	  	
    	  	p1 = new Punkt(1,-2);
    	  	p1.verschiebeInnerhalb(5, -9);
    	  	System.out.println(String.format("Punkt p%s(%s,%s)", 1, p1.getX(), p1.getY()));
    	  	System.out.println("---");
     }
}
