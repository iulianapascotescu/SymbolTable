package com.company;

public class Pair<A,B> {
    A element1;
    B element2;

    public Pair(A element1, B element2) {
        this.element1 = element1;
        this.element2 = element2;
    }

    public String toString(){
        return element1.toString()+" "+element2.toString();
    }
}
