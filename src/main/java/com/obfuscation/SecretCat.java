package com.obfuscation;

import java.util.Random;

public class SecretCat {
    private Random rand;
    private String secret_message = "secret message";

    public SecretCat() {
        rand = new Random();
    }

    public SecretCat(Random rand) {
        this.rand = rand;
    }

    // very secret information, no one should understand what is doing
    public void sayHi() {
        System.out.println(secret_message);
    }

    public int getAge() {
        return rand.nextInt(10) + 1;
    }
}
