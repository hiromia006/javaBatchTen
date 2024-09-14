package class5;

public class LoopStatementsTest {
    public static void main(String[] args) {
//        int i = 0;
//        for (; i < 10; ) {
//            System.out.println(i);
//            i++;
//        }

//j=j-2
//        for (int j = 10; j >= 0; j-=2) {
//            System.out.println(j);
//
//        }

//        String[] strs={"Shimu", "Esha", "Azim", "mamum"};
//        for (String st:strs){
//            System.out.println(st);
//        }
//
//        int []numbers={90,80,70,60,50,40,30,20,10};
//        for (int num:numbers){
//            System.out.println(num);
//        }

        int j = 0;
        while (j < 20) {
            System.out.println("Afaan " + j);
            j += 6; //18+6=18
        }

        System.out.println("=========================");
        int k = 0;
        do {
            System.out.println("Keya " + k);
            k += 6; //18+6=18
        } while (k > 20);


    }
}
