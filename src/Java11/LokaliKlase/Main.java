package Java11.LokaliKlase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        Integer skaicius = out.nextInt();

        if(skaicius > 0) {
            class A {
                public A() {
                    System.out.println("Daugiau uz nuli");
                }

                void spausdinti() {
                    System.out.println("Labas vakaras");
                }
            }
            A obj = new A();
            obj.spausdinti();
        } else {
            class B {
                public B() {
                    System.out.println("Maziau uz nuli");
                }
            }
            B obj = new B();
        }

    }


}
