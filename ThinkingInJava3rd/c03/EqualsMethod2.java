class Value {
    int i;
}

class ValueOverrideEquals {
    int i;
    public boolean equals(ValueOverrideEquals other) {
        return (this.i == other.i);
    }
}

public class EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        /**
         * he result is false. This is because the default
         * behavior of equals( ) is to compare references. 
         * So unless you override equals( ) in your new class you won’t 
         * get the desired behavior.
         */
        System.out.println(v1.equals(v2));
        

        ValueOverrideEquals v3 = new ValueOverrideEquals();
        ValueOverrideEquals v4 = new ValueOverrideEquals();
        v3.i = v4.i = 100;

        System.out.println(v3.equals(v4));
    }
}