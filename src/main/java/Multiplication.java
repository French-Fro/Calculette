public class Multiplication {
    private Integer a, b;

    public Multiplication() {
    }

    public Integer Multiplication() {
        try{
            return this.getA()*this.getB();
        }catch (TooBigValueException e){
            e.printStackTrace();
            return -1;
        }
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }
}

