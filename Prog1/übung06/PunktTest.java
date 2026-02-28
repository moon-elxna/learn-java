package übung06;

public class PunktTest {
      public static void main (String[] args){
          Punkt p1 = new Punkt();
          p1.setX(1); p1.setY(2);

          /* x- und y-Koordinaten von p1 auf 
          Konsole ausgeben, aber in einer Zeile und durch Komma getrennt */
          System.out.println("x = " + p1.getX() + ", y = " + p1.getY());
          p1.verschiebe(2,2);
          System.out.println("x = " + p1.getX()); //Ausgabe: 3
          System.out.println("y = " + p1.getY()); //Ausgabe: 4

          //Verschieben p1 um den Vektor (1,-3)
          p1.verschiebe(1, (-3));
          
          //x- und y-Koordinaten von p1 ausgeben
          System.out.println("x = " + p1.getX() + ", y = " + p1.getY());
          
          //zweiten Punkt p2 = (3,5)
          Punkt p2 = new Punkt();
          p2.setX(3); p2.setY(5);

          //Verschieben p2 um den Vektor (0,0)
          p2.verschiebe(0, 0);

          //x- und y-Koordinaten von p2 ausgeben
          System.out.println("x = " + p2.getX() + ", y = " + p2.getY());

          //dritten Punkt p3 = (2,4)
          Punkt p3 = new Punkt();
          p3.setX(2); p3.setY(4);
     }
}
