import java.util.List;

public class Vector {
    private int[] k;

    public Vector(int size){
        k = new int[size];
    }

    void set_massive(int value , int i){
        k[i] = value;

    }

    void print_massive(int[] multiplication){
        for (int i:k) System.out.println(i + " ");
    }

    int get(int index){
        if (index < k.length){
            return k[index];
        }
        else {
            throw new RuntimeException();
        }
    }

    int size(){
        return k.length;
    }

    int[] addition( List<Vector> l){
        Vector sum_ = new Vector(0);
        if (k.length == l.size()){
            for (Vector i: l)
            sum_ = i;
        }
        else{
            throw new RuntimeException();
        }
    }

    int[] subtraction( List<Integer> l){
        if (k.length == l.size()){
            for (int i=0; i<k.length; i++) k[i] -= l.get(i);
            return k;
        }
        else{
            throw new RuntimeException();
        }
    }

    int[] div(int cur){
        for (int i = 0; i<k.length;i++){
            k[i] /= cur;
        }
        return k;
    }

    int[] multiplication(int cur){
        for (int i = 0; i<k.length;i++){
            k[i] *= cur;
        }
        return k;
    }


    public static void main(String[] args){
        Vector k = new Vector(3);
        k.set_massive(1,0);
        k.set_massive(2,1);
        k.set_massive(3,2);
        System.out.println(k.get(1));
        k.print_massive(k.multiplication(2));
        k.print_massive(k.addition(1,2,3));




    }




}
