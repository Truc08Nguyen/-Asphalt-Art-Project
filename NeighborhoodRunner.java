import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

  MuralPainter pandy = new MuralPainter();
    
    pandy.paintBackground("PowderBlue", 32);

  PuppyPainter capy = new PuppyPainter();

    System.out.println(capy.getMyPaint());

    capy.paintPuppy("black", "hotpink");
  
  }
}