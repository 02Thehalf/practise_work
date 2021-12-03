package PTA12_03;

import java.util.Arrays;

class ArrayIntegerStack implements IntegerStack{
    Integer A[];
    int Max,Size=0;
    public ArrayIntegerStack(int n){
        A=new Integer[n];
        Max=n;
    }
    public Integer push(Integer item){
        if(item==null){
            return null;
        }
        else if(Size==Max){
            return null;
        }
        else{
            A[Size]=item;
            Size++;
            return item;
        }
    }
    public Integer pop(){
        if(Size==0) return null;
        Size--;
        return A[Size];
    }
    public Integer peek() {
        if(Size == 0)
            return null;
        else
            return A[Size - 1];
    }

    public boolean empty() {
        if(Size == 0)
            return true;
        else
            return false;
    }

    public int size() {
        return Size;
    }

    public String toString() {
        return Arrays.toString(A);
    }

}

