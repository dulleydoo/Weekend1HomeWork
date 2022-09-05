# Weekend1HomeWorkNotes

What goes in a SOURCE file? 
public class Dog{

}
_________________________________
what goes in a CLASS?
public class Dog {
  void bark() {
  
  }

}
_________________________________
What goes in a method?
public class Dog {
  void bark() {
  statement1;
  statement2;
  
  }

}
_________________________________
-IN JAVA EVERYTHING GOES IN CLASS
-Think about the objects that will be created from the class type.
things the object knows called instances, things the object does called methods. 
intances variables(state) of a song are title and artist. (Knows)
methods(behavior) setTitle() setArtist() play(). (Does)
_________________________________
What is the difference between a class and an object?
A class is not an object (but its used to construct them)

-Each statement must end in a semicolon
-a single line comment begins with 2 slashes
-varaibles are declared with a name and a type
-classes and methods must be defined with a pair of curly braces,
_________________________________
LOOPS
while loop 
public static void main (String[] args) {
  int x = 1;
  System.out.println("Before the Loop");
  while (x < 4) {
    System.out.println("In the Loop")
    System.out.println("Value of x is " + x);
      x = x + 1;
    }
    System.out.println("This is after the loop");

  }
}




for loop
do-while loop
_________________________________
Math.random() is a built in code that picks a random numner
whateverthevariablename.length counts the number of words/numbers in an array
_________________________________
Inheritance
1
Square          Circle        Triangle        Amoeba
rotate()        rotate()      rotate()        rotate()
playSound()     playSound()   playSound()     playSound()

All four have those to variables in common

2
Shape
rotate()
playSound()

3 
all 4 subclasses to the new shape class is called inheretance

                        Shape
                        rotate()
                        playSound()
        /         |              |          \
      /           |              |            \
     /            |              |             \
    /             |              |              \
  /               |              |               \
Square          Circle        Triangle        Amoeba
rotate()        rotate()      rotate()        rotate()
playSound()     playSound()   playSound()     playSound()
