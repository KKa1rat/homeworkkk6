package com.company;

public class Skeleton extends Boss{
    private int numberOfSkeletons;

    public int getNumberOfSkeletons() {
        return numberOfSkeletons;
    }

    public void setNumberOfSkeletons(int numberOfSkeletons) {
        this.numberOfSkeletons = numberOfSkeletons;
    }

    @Override
    public String printInfo() {
        System.out.println(getNumberOfSkeletons());
        return super.printInfo();
    }
}
