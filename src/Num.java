public class Num {
    private int value;

    public Num(){
        value = 0;
    }

    public String toString(){
        String result = value + "";
        return result;
    }
    public int getValue(){
        return value;
    }
    public void getValue(int myVal) {
        value = myVal;
    }
    public boolean equals(int value2) {
        if (value == value2) {
            return true;
        }
        else{
            return false;
        }

    }
}
