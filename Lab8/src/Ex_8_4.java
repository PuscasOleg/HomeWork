

import java.awt.*;
//Create a class Rectangle with attributes length and width, each of which
//defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set and get
//methods for both length and width. The set methods should verify that length and width are each
//floating-point numbers larger than 0.0 and less than 20.0. Write a program to test class Rectangle.

class FindParametresRectangle{

    private float length;
    private float width;

    FindParametresRectangle() {
        length = 1;
        width = 1;
    }
    FindParametresRectangle(float length, float width) {
        setLength(length);
        setWidth(width);
    }


    public void setLength(float length) {
        if(length > 0.0 && length < 20.0) {
            this.length = length;
        }
    }

    public void setWidth(float width) {
        if (width > 0.0 && width <= 20){
            this.width = width;
        }
    }

    public float getLength() {
        return length;
    }
    public float getWidth() {
        return width;
    }

    public float getPerimeter() {
        return ((length + width) * 2);
    }

    public float getArea() {
        return (length * width);
    }





}





public class Ex_8_4 {
    public static void main(String[] args) {
        FindParametresRectangle FirstRectangle = new FindParametresRectangle();

        FirstRectangle.setLength(4);
        FirstRectangle.setWidth(13);

        System.out.println("Length = " +"["+ FirstRectangle.getLength() +"]"+ "; Width = " +"["+ FirstRectangle.getWidth()+"]");
        System.out.println("Perimeter = " +"["+ FirstRectangle.getPerimeter()+"]");
        System.out.println("Area = "+"[" + FirstRectangle.getArea()+"]");
    }
}
