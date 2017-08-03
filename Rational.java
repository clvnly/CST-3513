
class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String getFraction() {
        return numerator + "/" + denominator;
    }
    public double getFractionDecimal() {
        return ((double) numerator) / denominator; //change int to double
    }

    public String add(int num, int den) {
        // Sum: a/b + c/d = (ad + cb)/bd
        int a = this.numerator;
        int b = this.denominator;
        int c = num;
        int d = den;
        return ((a*d) + (c*b)) + "/" + (b*d);
    }

    public String subtract(int num, int den) {
        // Subtraction: a/b - c/d = (ad - cb)/bd
        int a = this.numerator;
        int b = this.denominator;
        int c = num;
        int d = den;
        return ((a*d) - (c*b)) + "/" + (b*d);
    }

    public String multiply(int num, int den) {
        // Multiplication: a/b * c/d = ac/bd
        int a = this.numerator;
        int b = this.denominator;
        int c = num;
        int d = den;
        return (a*c) + "/" + (b*d);
    }

    public String divide(int num, int den) {
        // Division: (a/b) / (c/d) = ad/bc
        int a = this.numerator;
        int b = this.denominator;
        int c = num;
        int d = den;
        return (a*d) + "/" + (b*c);
    }

    public float addDec(int num, int den) {
        float a = this.numerator;
        float b = this.denominator;
        float c = num;
        float d = den;
        return ((a*d) + (c*b)) / (b*d);
    }
    public float subtractDec(int num, int den) {
        float a = this.numerator;
        float b = this.denominator;
        float c = num;
        float d = den;
        return ((a*d) - (c*b)) / (b*d);
    }
    public float multiplyDec(int num, int den) {
        float a = this.numerator;
        float b = this.denominator;
        float c = num;
        float d = den;
        return (a*c) / (b*d);
    }
    public float divideDec(int num, int den) {
        float a = this.numerator;
        float b = this.denominator;
        float c = num;
        float d = den;
        return (a*d) / (b*c);
    }

}
