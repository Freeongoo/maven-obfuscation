package com.obfuscation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        SecretCat cat = new SecretCat();
        cat.sayHi();

        int age = cat.getAge();
        System.out.println("Age: " + age);
    }
}
