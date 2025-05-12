import Maths.Operation;
import  Maths.Convert.Conversion;
class Main{
public static void main(String [] args){
Operation op=new Operation ();
Conversion convert=new Conversion(op);
op.getNum();
op.factorial();
op.cube();
convert.toBinary();
convert.toOctal();
convert.toHex();

}

}