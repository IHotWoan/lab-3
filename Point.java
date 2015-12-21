/**
 * Created by Felix on 12/16/2015.
 */
import java.lang.StringBuilder;
import java.lang.Math;

public class Point {

    private int xCoordinate;                                    //fields
    private int yCoordinate;


    public Point(){xCoordinate = 0; yCoordinate = 0;}           //constructors
    public Point(int x,int y){xCoordinate = x; yCoordinate = y;}

    //methods
    public String toString(){                                   //prints out coordinates
        StringBuilder str = new StringBuilder();
        str.append("(");
        str.append(xCoordinate);
        str.append(",");
        str.append(yCoordinate);
        str.append(")");
        return str.toString();
    }

    public int getX(){return xCoordinate;}                      //get x coordinate
    public int getY(){return yCoordinate;}                      //get y coordinate

    public void  setX(int x){xCoordinate = x;}                  //set new x coordinate
    public void  setY(int y){yCoordinate = y;}                  //set new y coordinate


    public boolean isEqualTo(Point p2){                         //compare coordinates p1/p2 etc
       if (getX() == p2.getX()){
           if(getY() == p2.getY()){
               return true;
           }
       }
      return false;
    }

    public double distanceTo(Point p2){                         // gives distance between point "a" and point "b"
        double xx2 = Math.pow(getX()-p2.getX(),2);
        double yy2 = Math.pow(getY()-p2.getY(),2);
        double distance = Math.sqrt(xx2+yy2);
        return distance;
    }

    public void move(int newX, int newY){                       //moves desired coordinate
       setX(xCoordinate + newX);
       setY(yCoordinate + newY);
    }

    public void moveToXY (int newX, int newY){                  //moves desired coordinate to and new one
        setX(newX);
        setY(newY);
    }
}
