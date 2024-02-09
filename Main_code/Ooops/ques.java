// Create a Java program to model a simple car rental system. The system should allow users to rent a car and display the details of rented cars.

// Your task is to implement a Car class with the following specifications:

// The Car class should have private instance variables for color, model, year, and rentalStatus.
// It should have a constructor that initializes color, model, and year when a new Car object is created, and sets rentalStatus to false initially.
// Implement getter methods to retrieve the values of the instance variables.

 class car {
    public String color;
    public String model;
    public int age;
    public int year;

    public car(String color,String model,int age, int year){
        this.color=color;
        this.model=model;
        this.age=age;
        this.year=year;

    }
}

    class details{
        public static void main(String a[]){
            car c=new car("red "," bmw ",6,1999);
            System.out.println("color : "+c.color+" model: "+c.model+" age: "+c.age+" year: "+c.age);
        }
    }


    

