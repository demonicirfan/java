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

