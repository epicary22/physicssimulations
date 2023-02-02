# Raetsel's Vectors Plan

### This package's goal:  
Create vectors that can be interacted with through a command-line interface. While a proper GUI may come later, this will do, as I have to use PythonAnywhere,  
__List of objectives:__  
1. Do mathematics with vectors, with these functions:
  * Addition
  * Scalar multiplication
  * Dot product
  * Cross product
2. Find properties of vectors, like
  * Angle between two vectors
  * Magnitude
  * Directional vector (a^)
3. Any other mathematics between Scalars, Vectors, and Points.
9. Be able to store the points and vectors inside of Spaces, where they can be saved off to text files then interpreted back into Space objects.

Specifically, I want there to be a few object classes:  
  
### NDimensionalVector  
Interface for any Vector/Scalar of N dimensions.  
_N/A_  
  
### Scalar  
Named double value. Can do basic math with other Scalars.  
_N/A_  
  
### Vector2D  
Named pair of Scalars. Can do basic vector math, and interact with other Vectors.  
_Uses Scalar. Implements NDimensionalVector._  
  
### Vector3D  
A vector that can perform 3D operations, like the cross product.  
_Uses Scalar. Extends Vector2D?_  
  
### NDimensionalPoint
Interface for a point in N dimensions.
_N/A_
  
### Point2D  
A point in two dimensions. That's all, a pair of values.
_Extends NDimensionalPoint_
  
### Point3D  
A point in three dimensions.
_Extends NDimensionalPoint_
  
### NDimensionalSpace
A space with N dimensions.
_N/A_
  
### Space2D
A 2D plane. Can hold Point2Ds and Vector2Ds.
_Extends NDimensionalSpace_
  
### Space3D
A 3D space. Can hold Point3Ds and Vector3Ds.
_Extends NDimensionalSpace_
  
# Interface and Storage
### There must be some way to store the provided objects.
### I also need an interface with them, in the form of a terminal, or possibly even in a GUI.









## `Interface` NDimensionalVector

### Attributes
* `NDimensionalPoint startingPoint`
* `NDimensionalPoint endingPoint`
* `ArrayList<Scalar> values`
* `String name`

### Methods
* `NDimensionalPoint getStartingPoint()`
* `NDimensionalPoint getEndingPoint()`
* ``
