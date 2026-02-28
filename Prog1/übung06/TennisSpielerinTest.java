package übung06;

public class TennisSpielerinTest {
	
	public static void main(String[] args) {	
		TennisSpielerin a1	= new TennisSpielerin();
		a1.setName("Graf");
		a1.setAge(18);
		System.out.println(a1.getName() + ", " + a1.getAge());
		
		TennisSpielerin a2	= new TennisSpielerin();
		a2.setName("Williams");
		a2.setAge(36);
		System.out.println(a2.getName() + ", " + a2.getAge());
		
		TennisSpielerin a3	= new TennisSpielerin();
		a3.setName("Navratilova");
		a3.setAge(45);
		System.out.println(a3.getName() + ", " + a3.getAge());
		
		TennisSpielerin b1	= new TennisSpielerin("Graf", 18);
		System.out.println(b1.getName() + ", " + b1.getAge());
			
		TennisSpielerin b2	= new TennisSpielerin("Williams",36);
		System.out.println(b2.getName() + ", " + b2.getAge());
			
		TennisSpielerin b3	= new TennisSpielerin("Navratilova", 45);
		System.out.println(b3.getName() + ", " + b3.getAge());
		
		TennisSpielerin c1	= new TennisSpielerin("Graf", 18, 22);
		form(c1.getName(),c1.getAge(),c1.getStartNum());
				
		TennisSpielerin c2	= new TennisSpielerin("Williams",36, 44);
		form(c2.getName(),c2.getAge(),c2.getStartNum());
		
		TennisSpielerin c3	= new TennisSpielerin("Navratilova", 45, 77);
		form(c3.getName(),c3.getAge(),c3.getStartNum());
		System.out.println("");
		System.out.println(String.format("Name: %-12s Alter: %-4d Startnummer: %d", c1.getName(), c1.getAge(), c1.getStartNum()));
		System.out.println(String.format("Name: %-12s Alter: %-4d Startnummer: %d", c2.getName(), c2.getAge(), c2.getStartNum()));
		System.out.println(String.format("Name: %-12s Alter: %-4d Startnummer: %d", c3.getName(), c3.getAge(), c3.getStartNum()));	
		
		}
		
	public static void form(String a,int b,int c) {	
		System.out.println("Name: " + a + " Alter: " + b + " Startnummer: " + c);
		
	}
}
