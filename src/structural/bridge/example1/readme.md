Here without bridge pattern if we simply had only the Shape
interface then we would have needed 6 classes in total for
example:

| Without Bridge pattern(Only with Shape Interface)|  With Bridge pattern(With Shape and Color Interfaces)|
|--------------------------------------------------|------------------------------------------------------|
|BlueCircle.java                                   | Blue.java                                                     |
|RedCircle.java                                    | Red.java                                                     |
|BlueSquare.java                                   | Circle.java                                                     |
|RedSquare.java                                    | Square.java                                                     |
|BlueTriangle.java                                 | Triangle.java                                                     |
|RedTriangle.java                                  |                                                      |
 
The difference in classes that are needed in both approaches
increase by a lot as Types of Shapes/Colors increases. 
 