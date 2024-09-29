import org.code.neighborhood.*;

public class PuppyPainter extends MuralPainter{


  public void paintPuppy(String firstColor, String secColor){
    //starts at the begin position
    startPosition();
    //paint ears 
    paintEar(firstColor);

    //resets to the starting location
    while(canMove()){
      move();
    }
     turnLeft();
    
    while(canMove()){
      move();
    }
    turnAround();

    //starts at the begin position
    startPosition();
    //paint eyes
    paintEye(firstColor);

    //resets to the starting location
    while(canMove()){
      move();
    }
     turnRight();
    
    while(canMove()){
      move();
    }
    turnRight();

    //starts at the begin position
    startPosition();
    //paint nose and mouth
    paintMouth(firstColor, secColor);
}
  // start position method
  public void startPosition(){
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
  }

  // paint ears method
  public void paintEar(String firstColor){
    paintLine(firstColor, 3);
    turnRight();
    move();
    move();
    turnRight();
    move();
    turnLeft();
    paintLine(firstColor, 3);
    turnRight();
    move();
    paintLine(firstColor, 3);
    turnRight();
    paintLine(firstColor, 4);
    turnRight();
    paintLine(firstColor, 2);
    move();
    move();
    move();
    paintLine(firstColor, 2);
    turnLeft();
    move();
    turnRight();
    paintLine(firstColor, 6);
    turnRight();
    move();
    turnLeft();
    paintLine(firstColor, 2);
    turnLeft();
    move();
    turnRight();
    paintLine(firstColor, 3);
    turnRight();
    move();
    turnLeft();
    paintLine(firstColor, 1);
    turnRight();
    paintLine(firstColor, 5);
    turnRight();
    turnRight();
    move();
    turnLeft();
    paintLine(firstColor, 4);
    turnRight();
    move();
    paintLine(firstColor, 3);
  }

  // paint eyes method
  public void paintEye(String firstColor){
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    paintLine(firstColor, 2);
    turnLeft();
    paintLine(firstColor, 2);
    turnLeft();
    paintLine(firstColor, 2);
    turnLeft();
    paintLine(firstColor, 1);
    turnLeft();
    paintLine(firstColor, 2);
    turnAround();
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paintLine(firstColor, 2);
    turnRight();
    paintLine(firstColor, 2);
    turnRight();
    paintLine(firstColor, 2);
    turnRight();
    paintLine(firstColor, 1);
    turnRight();
    paintLine(firstColor, 2);
    turnAround();
  }

  //paint nose and mouth method
  public void paintMouth(String firstColor, String secColor){
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    paintLine(firstColor, 4);
    turnLeft();
    move();
    turnRight();
    paintLine(firstColor, 3);
    turnLeft();
    move();
    paintLine(firstColor, 1);
    turnRight();
    move();
    turnLeft();
    paintLine(firstColor, 3);
    paintLine(secColor, 4);
    paintLine(firstColor, 3);
    turnRight();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    paintLine(firstColor, 4);
    turnRight();
    move();
    move();
    paintLine(firstColor, 3);
    turnLeft();
    move();
    paintLine(firstColor, 1);
    turnAround();
    move();
    move();
    move();
    turnRight();
    move();
    paintLine(firstColor, 1);
    paintLine(secColor, 2);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine(secColor, 3);
    paintLine(firstColor, 2);
    turnAround();
    turnRight();
    move();
    paintLine(firstColor, 1);
    turnAround();
    move();
    move();
    paintLine(firstColor, 3);
    turnAround();
    move();
    move();
    turnLeft();
    move();
    paintLine(firstColor, 2);
    paintLine(secColor, 3);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine(secColor, 2);
    paintLine(firstColor, 1);
    turnAround();
    move();
    turnLeft();
    move();
    paintLine(firstColor, 1);
    turnLeft();
    move();
    paintLine(firstColor, 1);
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    move();
    paintLine(firstColor, 2);
    turnLeft();
    move();
    move();
    move();
    turnLeft();
    move();
    paintLine(firstColor, 1);
    turnRight();
    move();
    turnLeft();
    paintLine(firstColor, 3);
    turnRight();
    move();
    turnLeft();
    paintLine(firstColor, 4);
  }
}
