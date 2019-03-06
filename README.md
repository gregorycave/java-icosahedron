# java-icosahedron
A basic Java program for a convex polyhedron with 20 equilateral triangles as faces

The class has the following features:

* A private instance variable, edge, of type double, that holds the edge length.
* A private static variable, count, of type int, that holds the number of Icosahedron objects that have been created.
* A constructor that takes one double argument which specifies the edge length.
* An instance method surface() which returns the surface area of the icosahedron (5*√3 edge²).
* An instance method volume() which returns the volume of the icosahedron (5*(3+√5)/12*edge³).
* An instance method toString() which returns a string with the edge length, surface area and volume.
