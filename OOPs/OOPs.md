# OOPs In Java

 We will learn about object-oreinted programming here, if you know the concepts of oops then it will be easy for you to apply them in any language like c++, java, c#, pyhton etc. But here will will learn about oops in java. For this you should know the basics of java like variables, operators, conditional statements, loops.

## Principle of Object-oriented Programming

- **Abstraction**
- **Encapsulation**
- **Inheritance**
- **Polymorphism**

### Abstraction

   Abstraction is hiding the inner details of something and only showing the required features. Like in a mobile device we only see what is shown to us the required fetures and not the interanl circuitry, the same thing we follow in programming.

### Encapsulation

   Like the above example of the mobile phone, the inner circuitry is encapsulated inside a box (the body of mobile) we say that it is enclosed in a capsule. We acheive the same thing in programming through encapsulation.

### Inheritance

   Inheritence is like we have an already engineered product like a mobile phone and then we do some changes and presnet it as a new one with some added fetures, whatever the engieering we have doen we do not have to do it again.

### Polymorphism
  
  Polymorphism is generalization of theings like we have cars from toyota, suzuki, BMW they all come other one name car. Its easy to handel so many things under one name. So you dont have to learn driving for each companies car separetly. Same generalization is used in programming.

## **Difference Between Class and Object**

 Anything in the world can be defined in terms of its properites and behaviour. An arichitect will make a house map an outline and then many houses will be made from it. The design is a class and then object or houses are constructed out of it. Design is on paper and houses are real. We can make as many hosues as we want form a design.

```java
    class Television
    {
        private int channel;
        private int volume;
        public void changeChannel(){
            // --- code ---
        }
        public void changeVolume(){
            // --- code ---
        }
    }

    class Test
    {
        private static void main()
        {
            Television t = new Television();
            t.changeChannel(10);
        }
    }
```

### **How to write the classes**

  Imagine we are making a program that can calculate mensuration and mesurements related to circle square and rectangeles etc.

  We will make classes of different shapes and then use them in over program.

  Lets make a class for a rectangle.
  
  ``` java
  class Rectangle
  {
     //properties
      public int length;
      public int bredth;

     //methods
      public int area(/* inputs*/  ){
          // ---- code -----
      }
      public int peremeter(/* inputs*/  ){
          // ---- code -----
      }

  }
  ```

  Class for a cylinder

 ```java
 class Cylinder
 {
     //properties
    public double radius;
    public double height;

     //methods
    public double lidArea(){
        //code
    }

    public double surfaceArea(){
        //code
    }

    public double volume(){
        //code
    }
 }
```

## Data Hiding

In out daily life we find many engineered product like cars, mobiles etc. There is one thing common among that, if you press a button on your mobile for increasing volume that operation happens inside the circuitry in case of mobile and car both nothing is seen by the user everything is happening behind the eyes.
In same way if we want to use some class in a program the data of the class is hidden only the methods are shown which we use to perform various operations. These methods use that hidden data to perform tasks.

```java
private int length;
private int breadth;
```

But we can only get these properties inside the class where they are declared then how to use them inside other classes. For that we use ```getProperty``` and ```setProperty``` methods.

```java
    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }

    public void setLength(int l) {
        if (l >= 0)
            length = l;
        else
            length = 0;
    }
    public void setBreadth(int b) {
        if (b >= 0)
            breadth = b;
        else
            breadth = 0;
    }
```

Now use these methods inside some other class to get and set the properties.

## Types of Properties

- **Read & Writable** => The property where we have both get and set method that type of property can be modified as well as used.
- **Read Only**  => The property which have only get method which will be used to read that property.
- **Write Only**  => The property which have only set method which can be modified using set method but can not be used.

```java

 private int A; //read & write

 public int setA( a = 4){
     return A = a;
 }

 public int getA(){
     return A ;
 }

private int B; // read only

public int getB(){
    return B;
}

private int C; //write only

public int setC( c = 5){
    returnC = c; 
}
// C may be used by some other method that is why we need to modify its value sometimes
```

## Constructors

We want some methods which should initialize the properties at the time of construction of an object. Constructor is a method of a class which is automatically called whenever an object is created. Every class will have a default constructor assosciated with it which will be provided by java compiler. If we difine out own then the default one is removed.

- Constructor will have the name same as class name. 
- A construcotr will not have a return type.
- Constucotr can be private of public.

```java

class Rectangle
{
    private int length;
    private int breadth;

    public Rectangle() //Non Parametrized Constructor
    {
        length = 1;
        breadth = 1;
    }

    public Rectangle(int l, int b)  //Parametrized Constructor
    {
        length = l;
        breadth = b;
    }
}

static void main(...){
    Rectangel r = new Rectangle();//first constructor will be called l and b will be set to 1

    Rectangele R = new Rectangel (10, 5); //second constructor will be called and l - 10 b = 5
}
```

> Note: There are two types of constructors Parametrized Constructor and Non Parametrized Constructor.
