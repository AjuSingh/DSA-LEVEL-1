package Oops.interfaces.extendinginterfaces;

//we will access the nested interfaces with help of . operator
public class C implements NestedInterfaces.Inner{

    @Override
    public boolean isOdd(int num) {
        return ((num&1) ==1);
    }

}