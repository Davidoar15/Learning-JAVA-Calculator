public class operations {
    float Num1;
    float Num2;

    public operations() {
        Num1 = 0;
        Num2 = 0;
    }

    public operations(float num1, float num2) {
        Num1 = num1;
        Num2 = num2;
    }

    public float add() {
        return Num1 + Num2;
    }

    public float subtract() {
        return Num1 - Num2;
    }

    public float multp() {
        return Num1 * Num2;
    }

    public float split() {
        if (Num2 != 0) {
            return Num1 / Num2;
        } else {
            throw new ArithmeticException("Division by 0 not allowed");
        }
    }

    public float power() {
        System.out.println("Base: "+Num1+" | Exponent: "+Num2);
        return (float) Math.pow(Num1, Num2);
    }
}
