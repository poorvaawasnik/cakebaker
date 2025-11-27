package com.bakery.cakebaker.bakery;

// CakeBaker.java
public class CakeBaker {

    private Frosting frosting;
    private syrup syrup;

    // Dependency Injection through constructor
    public CakeBaker(Frosting frosting,syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bakeCake() {
        System.out.println("Baking a cake with:");
        System.out.println("- " + frosting.getFrostingType());
        System.out.println("- " + syrup.getSyrupType());
        System.out.println("Cake is ready!");
    }
}
