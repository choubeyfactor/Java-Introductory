class circle1{
    public double radius;
    
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}

public class circle {
    public static void main(String[] args) {
        circle1 c1=new circle1();
        circle c2 = new circle1();

        c1.radius=7;
        c2.radius = 14;

        System.out.println("Area:"+c1.area());
        System.out.println("Perimeter:"+c1.perimeter());
        System.out.println("Circumference:"+c1.circumference());

        System.out.println("Area:"+c2.area());
        System.out.println("Perimeter:"+c2.perimeter());
        System.out.println("Circumference:"+c2.circumference());
       }
}
