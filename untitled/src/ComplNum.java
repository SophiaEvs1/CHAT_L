import java.util.List;

public class ComplNum {


    private double double_real;
    private double double_imaginary;

    public ComplNum(double real, double imaginary){
        this.double_real = real;
        this.double_imaginary = imaginary;
    }
    public double getDouble_real(){
        return double_real;
    }

    public void setDouble_real (double double_real){
        this.double_real = double_real;
    }

    public double getDouble_imaginary(){
        return double_imaginary;
    }

    public void setDouble_imaginary(double double_imaginary){
        this.double_imaginary = double_imaginary;
    }

    public static ComplNum sum(ComplNum compnum1, ComplNum compnum2){
        return new ComplNum(compnum1.getDouble_real() + compnum2.getDouble_real(), compnum1.getDouble_imaginary() + compnum2.getDouble_imaginary());

    }

    public  static ComplNum sum_list(List<ComplNum> list){
        ComplNum sum_list = new ComplNum(0,0);
        for (ComplNum i : list){
            sum_list = sum(i,sum_list);
        }
        return sum_list;
    }

    public static ComplNum minus(ComplNum compnum1, ComplNum compnum2){
        return new ComplNum(compnum1.getDouble_real() - compnum2.getDouble_real(),compnum1.getDouble_imaginary() - compnum2.getDouble_imaginary());
    }

    public static ComplNum chast(ComplNum compnum1, ComplNum compnum2){
        return new ComplNum(compnum1.getDouble_real() * compnum2.getDouble_real(), compnum1.getDouble_imaginary() * compnum2.getDouble_imaginary());
    }

    public  String toString() {
        if (double_imaginary >= 0)
            return double_real + "+" +  double_imaginary + "i";

        else
            return double_real + "-" + -double_imaginary+ "i";
    }

    public static void main(String[] args){
        System.out.println("Hello");
        ComplNum z2 = new ComplNum(1, 5);
        ComplNum  z3 = new ComplNum(4, 8);
        ComplNum z4 = new ComplNum(0, 0);
        ComplNum z5 = z2.sum(z3, z4);
        System.out.println(z5);


    }
}


