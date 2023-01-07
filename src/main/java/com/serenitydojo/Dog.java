package com.serenitydojo;

public class Dog {
    public String Name;
    public String FavoriteToy;
    public int Age;

    public Dog(String Name, String FavoriteToy, int Age) {
        this.Name=Name;
        this.FavoriteToy=FavoriteToy;
        this.Age=Age;
    }


    public String getName() {
        return Name;
    }

    public String getFavoriteToy() {
        return FavoriteToy;
    }

    public int getAge() {
        return Age;
    }

    public static String DOG_NOISE="WOOF WOOF WOOF";

    public void makeNoise() {
        System.out.println(DOG_NOISE);
    }

    public void feed() {
        System.out.println("fido is fed");
    }
}
