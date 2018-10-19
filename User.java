package com.company;

public class User {
    private long A;
    private long P;
    private long X;
    private long Y;
    private long Z;

    User(long a,long p){
        this.A = a;
        this.P = p;
        this.X = (long) (Math.random() * 6) + 1;
    }

    public void setY(){
        long st = (long) Math.pow(A,X);
        Y = st % P;
    }

    public long getY(){
        return Y;
    }

    public void setZ(long Y) {
        long st = (long) Math.pow(Y,X);
        Z = st % P;
        System.out.println("X=" + X);
        System.out.println("A=" + A);
        System.out.println("P=" + P);
        System.out.println("Y=" + Y);
        System.out.println("Z=" + Z);
        System.out.println();
    }

    public long getZ(){
        return Z;
    }
}