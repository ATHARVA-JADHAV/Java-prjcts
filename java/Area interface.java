import java.util.*;
interface shapeArea{
    void areaSquare(int side);
    void areaTriangle(int height,base);
    void areaCircle(int r);
}

class Area implements shapeArea{
    public void areaSquare(int side){
        System.out.println("area of square:"+side*side);
    }
    public void areaTriangle(int height,int base){
        System.out.println("area of triangle:"+ 0.5 *height*base);
    }
    public void areaCircle(int r){
        System.out.println("area of circle:"+3.14*r*r);
    }
}
class Interfaces{
    public static void main(String args[]){
    Area a=new Area();
    a.areaSquare(10);
    a.areaTriangle(10,10);
    a.areaCircle(10);
    }

}