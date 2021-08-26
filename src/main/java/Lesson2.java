public class Lesson2 {
    public static void main(String[] args){

        System.out.println("Задача 1 = " + lesson2_1(10,20)+"\n");

        System.out.println("Задача 2 = " + lesson2_2(-10)+"\n");

        System.out.println("Задача 3 = " + lesson2_3(10)+"\n");

        System.out.println("Задача 4:");
        lesson2_4("Пример",10);

        System.out.println("\nЗадача 5: " +  lesson2_5(2044));
    }

    public static boolean lesson2_1(int a, int b){
        int c = a + b;

        boolean result = false;

        if(c >=10 && c <=20)
            result = true;

        return result;

    }

    public static String lesson2_2(int a){

        String result = "Положительное число";

        if(a < 0)
            result = "Отрицательное число";

        return result;

    }

    public static boolean lesson2_3(int a){

        boolean result = false;

        if(a < 0)
            result = true;

        return result;

    }

    public static void lesson2_4(String str, int a){
        for(int i=0;i<a;i++)
            System.out.println(str);
    }

    public static boolean lesson2_5(int a){

        boolean result = false;

        if(a % 400 == 0 || a % 4 == 0)
            result = true;

        return result;

    }
}
