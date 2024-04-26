// Write a Java program to create a class called Circle with a private instance variable radius. 
// Provide public getter and setter methods to access and modify the radius variable.
//  However,provide two methods called calculateArea() and calculatePerimeter() that return the
// calculated area and perimeter based on the current radius value.


class circle{
    public double radius;

    public circle(double radius) {
        this.radius = radius;
    }


    public double getRadius(){
        return radius;

    }
    public void setRadius(double radius){
        this.radius=radius;   

}

public double calculateArea(){
    return (22/7)*(radius*radius);
}
public double calculatePerimeter(){
    return 2*(22/7)*radius;
}
}



class lpu{
    public static void main(String[] args) {
        circle cir=new circle(1);
        System.out.println("Area "+cir.calculateArea());
        System.out.println("perimeter "+cir.calculatePerimeter());

        
    }
}