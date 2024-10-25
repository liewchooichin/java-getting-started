package com.a02.app.shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class AppShape {

    public static void main() {

        /****
         * // Circle class
         * Circle circle = new Circle(); // default
         * //circle.setRadius(10);
         * System.out.printf("Radius of a circle is %.2f \n", circle.getRadius());
         * double area = circle.area();
         * System.out.printf("Area of radius 10 units is %f \n", area);
         * double circumference = circle.circumference();
         * System.out.printf("Circumference of radius 10 units is %f \n",
         * circumference);
         * double d = Circle.degreesToRadians(90);
         * System.out.printf("90 degrees is %f radians\n", d);
         * d = Circle.degreesToRadians(180);
         * System.out.printf("180 degrees is %f radians\n", d);
         * d = Circle.radiansToDegrees(2.0);
         * System.out.printf("2.0 radians is %f degrees\n", d);
         * d = Circle.radiansToDegrees(2.0 * Circle.PI);
         * System.out.printf("2 PI radians is %f degrees\n", d);
         * PlaneCircle pc1 = new PlaneCircle(10, 0, 0);
         * area = pc1.area();
         * System.out.printf("Area of radius 10 units is %f \n", area);
         * // Is a point inside the circle
         * boolean inside = pc1.isInside(-2.5, -2.5);
         * System.out.printf("The point is inside of the circle: %b\n", inside);
         * inside = pc1.isInside(-11, -11);
         * System.out.printf("The point is inside of the circle: %b\n", inside);
         * // default PlaneCircle constructor
         * PlaneCircle pc2 = new PlaneCircle();
         * area = pc2.circumference();
         * System.out.printf("Circumference of radius 1 units is %f \n", circumference);
         * // print the value of circle and plane circle
         * System.out.println(circle.toString());
         * System.out.println(pc2.toString());
         * // access the field of cicrle toString from plane circle
         * PlaneCircle pc3 = new PlaneCircle(12.1, 5.4, 5.4);
         * // you cannot invoke overridden instance methods with this technique.
         * // this line pc3 will still call the toString of the PlaneCircle.
         * System.out.println(((Circle)pc3).toString());
         * // Rectangle
         * Rectangle rect1 = new Rectangle(3.0, 5.0);
         * area = rect1.area();
         * System.out.printf("Area of %s is %.2f.\n", rect1.toString(), area);
         *** */

        // We have can different shapes
        /*
         * Shape[] shapes = new Shape[3];
         * shapes[0] = new Circle(10.0);
         * shapes[1] = new PlaneCircle(5.0, 0.0, 0.0);
         * shapes[2] = new Rectangle(4.0, 5.0);
         * double totalArea = 0;
         * for(int i=0; i<shapes.length; i=i+1){
         * totalArea = totalArea + shapes[i].area();
         * }
         * System.out.printf("Total area is %.2f.\n", totalArea);
         * }
         */

        // Using interface
        Shape[] shapes2 = new Shape[3];
        shapes2[0] = new CenteredCircle(15.0, 15.0, 10.0);
        shapes2[1] = new CenteredSquare(7.5, 7.5, 5.0);
        shapes2[2] = new CenteredRectangle(-20.0, -20.0, 18.0, 18.0);
        // Compute average area of the shapes and
        // average distance from the origin
        double totalArea = 0;
        double totalDistance = 0;
        double distance = 0;
        for (int i = 0; i < shapes2.length; i = i + 1) {
            // compute the area of the shapes
            System.out.printf("Area of %s is %.2f.\n",
                    shapes2[i].toString(), shapes2[i].area());
            totalArea = totalArea + shapes2[i].area();
            // Compute the distances from the center
            if (shapes2[i] instanceof Centered) {
                Centered c = (Centered) shapes2[i];
                double cx = c.getCenterX();
                double cy = c.getCenterY();
                distance = Math.sqrt(cx * cx + cy * cy);
                System.out.printf("Distance from the center (0,0) is %.2f.\n",
                        distance);
                totalDistance = totalDistance + distance;
            }
        }
        // average distance and area of the shapes
        System.out.printf("Average area: %.2f.\n", totalArea / shapes2.length);
        System.out.printf("Average distance: %.2f.\n", totalDistance / shapes2.length);
        // instance
        System.out.printf("shapes2 [0] instanceof Shape %b\n",
            shapes2[0] instanceof Shape);
        System.out.printf("shapes2 [0] instanceof Circle %b\n",
            shapes2[0] instanceof Circle);
        System.out.printf("shapes2 [0] instanceof CenteredCircle %b\n",
            shapes2[0] instanceof CenteredCircle);
        System.out.printf("shapes2 [0] instanceof Centered %b\n",
            shapes2[0] instanceof Centered);

        // create a homogenous collections of centered circle
        List<CenteredCircle> circles = new ArrayList<CenteredCircle>();
        // add some circles
        circles.add(new CenteredCircle(-12.0, -12.0, 6.5));
        circles.add(new CenteredCircle(12.0, 12.0, 6.5));
        circles.add(new CenteredCircle(11.0, 11.0, 5.5));
        CenteredCircle c = circles.get(0);
        System.out.println(c);
    }
}
