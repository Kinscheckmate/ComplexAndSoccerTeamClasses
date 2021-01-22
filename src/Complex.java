public class Complex {
    private double a;
    private double b;

    public Complex(double x, double y) {
        a = x;
        b = y;
    }

    public Complex(double x) {
        this(x, 0.0);
    }

    public double abs() {
        double ans = Math.sqrt((a * a) + (b * b));
        return ans;
    }

    public Complex add(Complex other) {
        Complex temp = new Complex((this.a + other.a), (this.b + other.b));
        return temp;
    }
    public Complex add(double a) {
        Complex temp = new Complex((this.a + a), (this.b));
        return temp;
    }

    public Complex multiply(Complex other){
        Complex temp = new Complex( (this.a * other.a - this.b * other.b),
                (this.b * other.a + this.a * other.b) );
        return temp;
    }

    public Complex multiply(double a){
        Complex temp = new Complex( this.a * a, this.b * a);
        return temp;
    }

    public String toString(){
        return a + " + " + b + "*i";
    }

    public static void main(String args[]) {
        Complex c1 = new Complex(10,5);
        Complex c2 = new Complex(20, 10);
        Complex c3 = new Complex(3, 4);

        System.out.println("Print Complex");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("\nAbs Method");
        System.out.println(c1.abs());
        System.out.println(c2.abs());
        System.out.println(c3.abs());
        System.out.println("\nAdd Complex");
        System.out.println(c1.add(c2));
        System.out.println(c2.add(c1));
        System.out.println(c2.add(c3));
        System.out.println("\nAdd Double");
        System.out.println(c1.add(10.0));
        System.out.println(c2.add(73.0));
        System.out.println(c3.add(7));
        System.out.println("\nMultiply Complex");
        System.out.println(c1.multiply(c2));
        System.out.println(c2.multiply(c1));
        System.out.println(c2.multiply(c3));
        System.out.println("\nMultiply Double");
        System.out.println(c1.multiply(10));
        System.out.println(c2.multiply(5));
        System.out.println(c3.multiply(1500));
    }

}