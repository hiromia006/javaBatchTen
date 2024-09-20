package class8.generic;

import class4.Car;

public class GenericTest {
    public static void main(String[] args) {
        DoubleTest test = new DoubleTest(56.96);
        System.out.println("Double Value : " + test.getaDouble());

        StringTest test1 = new StringTest("Rakhi & Esha");
        System.out.println("String value: " + test1.getString());

        IntegerTest test2 = new IntegerTest(1000);
        System.out.println("Integer value: " + test2.getInteger());

        System.out.println("======================================");
        Generic<Double> doubleTest = new Generic<>(890.97);
        System.out.println("Double Value : " + doubleTest.getType());

        Generic<String> stringRakhi = new Generic<>("Rakhi & Esha");
        System.out.println("String value: " + stringRakhi.getType());

        Generic<Integer> integerGeneric = new Generic<>(1000);
        System.out.println("Integer value: " + integerGeneric.getType());

        Generic<Long> longGeneric =new Generic<>(9999l);
        System.out.println("Long value: " + longGeneric.getType());

        Generic<Car> carGeneric =new Generic<>(new Car());
        System.out.println("Car value : "+ carGeneric.getType());


        System.out.println("======================================");
        GenericWildCard<Double> wildCard = new GenericWildCard<>(890.97);
        System.out.println("Double Value : " + wildCard.getType());

//        GenericWildCard<String> wildCard1 = new GenericWildCard<>("Rakhi & Esha");
//        System.out.println("String value: " + stringRakhi.getType());

        GenericWildCard<Integer> wildCard1 = new GenericWildCard<>(1000);
        System.out.println("Integer value: " + wildCard1.getType());

        GenericWildCard<Long> wildCard2 =new GenericWildCard<>(9999l);
        System.out.println("Long value: " + longGeneric.getType());

//        Generic<Car> carGeneric =new Generic<>(new Car());
//        System.out.println("Car value : "+ carGeneric.getType());
    }
}
