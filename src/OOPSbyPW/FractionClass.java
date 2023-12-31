package OOPSbyPW;

public class FractionClass {
    public static class Fraction{
        int num;
        int den;

        Fraction(int num , int den){
            this.num = num;
            this.den =den;
        }
        void Print(){
            System.out.println("[" + this.num + "/" + this.den + "]");
        }

        public void Simplify() {

        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,4);
        f1.Print();
        Fraction f2 = new Fraction(3,4);
        f2.Print();
        f1.Simplify();



    }
}
