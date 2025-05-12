package Maths.Convert;

import Maths.Operation;

public class Conversion {
    Operation op;  

    
    public Conversion(Operation op) {
        this.op = op;
    }

   
    public void toBinary() {
        System.out.println("Binary: " + Integer.toBinaryString(op.num));
    }

   
    public void toOctal() {
        System.out.println("Octal: " + Integer.toOctalString(op.num));
    }

   
    public void toHex() {
        System.out.println("Hexadecimal: " + Integer.toHexString(op.num));
    }
}
