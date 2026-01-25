package OOPS.Practice;

public class complexProblem {
    public static void main(String[] args) {
        Complex c = new Complex(4,5);
        Complex d = new Complex(9,4);

        Complex e = Complex.add(c,d);
        Complex f = Complex.diff(c,d);
        Complex g = Complex.prod(c,d);
        e.print();
        f.print();
        g.print();
    }
}

//class Complex {
//    int real;
//    int imaginary;
//    public Complex(int r, int i){
//        real = r;
//        imaginary = i;
//    }
//    public static Complex add(Complex a, Complex b){
//        return new Complex((a.real+b.real),(a.imaginary+b.imaginary));
//    }
//    public static Complex diff(Complex a, Complex b){
//        return new Complex((a.real-b.real),(a.imaginary-b.imaginary));
//    }
//    public static Complex product(Complex a, Complex b){
//        return new Complex(((a.real*b.real)-(a.imaginary*b.imaginary)),((a.real*b.imaginary)+(a.imaginary*b.real)));
//    }
//
//    public void printComplex(){
//        if(real == 0  &&  imaginary != 0){
//            System.out.println(imaginary+"i");
//        } else if(real != 0  &&  imaginary == 0){
//            System.out.println(real);
//        } else {
//            System.out.println(real+" + "+imaginary+"i");
//        }
//    }
//}
class Complex {
    int real;
    int img;
    public Complex(int a, int b){
        real = a;
        img = b;
    }
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real),(a.img+b.img));
    }
    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.img-b.img));
    }
    public static Complex prod(Complex a, Complex b){
        return new Complex(((a.real*b.real)-(a.img*b.img)),((a.real*b.img)+(a.img*b.real)));
//        return new Complex(((a.real*b.real)-(a.img*b.img)),((a.real*b.img)+(a.img*b.real)));
    }
    public void print(){
        if(real == 0 && img != 0){
            System.out.println(img+"i");
        } else if(real != 0 && img == 0){
            System.out.println(real);
        } else {
            System.out.println(real+" + "+img+"i");
        }
    }
}
































