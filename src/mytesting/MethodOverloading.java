package mytesting;

public class MethodOverloading {
    public static void main(String[] args) {
        /* Перегрузка методов:
         * Ранее созданый нами метод getSum возвращает некоторую сумму и
         * принимает в качестве параметров две переменные типа int.
         * И так возникает вопрос,
         * а что если мы хотим сложить не две переменные а три и больше,
         * соответственно для этого случая получается что нам нужно писать
         * новый метод и называть его каким то другим образом "получение сумм
         * трёх элементов" и т.д. Но по сути этот метод будет выполнять
         * одну и ту же цель и нам хотелось бы выполнять для этого один и
         * тот же метод, просто передавать ему разнвые значения. Так же
         * и с методом sayHello в котором вы передаём некое имя, но данный
         * метод мы к примеру можем передать два имени или неодного
         * Для того что бы предусмотреть такие ситуации существует такое
         * понятие как Перегрузка методов - то есть нам позволяется писать
         * метод с одним именем в зависимости от параметров которые он принемает
         * То есть мы можем написать несколько методов getSum с различными
         * входными параметрами и далее в програме мы можем вызывать один и тот же
         * метод getSum но передавать ему разные параметры*/

        /*Пример для перегруженного метода getSum*/

        int result; //создали переменную result в которую мы будем передавать значения
        result = getSum(1, 10);//используем getSum для двух значений
        System.out.println(result);

        result = getSum(5, 10, 5);//используем getSum для трёх значений
        System.out.println(result);

        System.out.println();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = getSum(array, "Oleg");

        /*Пример для метода sayHello*/
        sayHello("Petya");
        sayHello("Vasya", "Roman");
        sayHello();


    }

    /*Мы написали метод getSum который считает сумму только двух параметров */
    static int getSum(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }

    /*Теперь мы создали такой же метод getSum только он уже может считать сумму
     * трёх параметров. И соответственно теперь мы имеем метод getSum котороый
     * перегружен. Теперь мы можем вызывать метод getSum передавая ему разные
     * параметры*/
    static int getSum(int x, int y, int z) {
        int sum;
        sum = x + y + z;
        return sum;
    }

    /*Напишем метод getSum который будет принимать в себя массив
     * То есть нашь метод будет принимать массив, будет считать сумму
     * всех элементов массива. Для этого мы напишем цикл for
     * который будет перебирать значения по индексу от 0 до окончиания массива
     * перед счетчиком напишем переменную sum которой присвоим значение 0
     * и в теле цикла мы будем прибовлять к нашей сумме каждый раз, значиния
     * элементу массива. То есть это будет sum += array[i].
     * После того как мы посчитаем всю сумму мы вернем данную сумму с помощью
     * return sum*/
    static int getSum(int[] array, String name) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Hi " + name + "!");
        System.out.println("Your sum is: " + sum);
        return sum;
    }

    /*Данный метод sayHello позволяет поздороваться с одним человеком*/
    static void sayHello(String name) {
        System.out.println();
        System.out.println("Hello " + name);
        System.out.println("I'm your program");
        System.out.println("Nice to meat you");
    }

    /*Теперь мы создали такой же метод sayHello который позволяет поздароваться
     * с двумя людми*/
    static void sayHello(String name1, String name2) {
        System.out.println();
        System.out.println("Hello " + name1 + "!");
        System.out.println("Hello " + name2 + "!");
        System.out.println("I'm your program");
        System.out.println("Nice to meat you");
    }

    /*Так же мы можем написать данный метод sayHello который не будет принимать
     * ни каких параметров, в таком случае мы просто напишем строчку "Hello"
     * и не будем указывать конкретное имя, мы просто поздороваемся!*/
    static void sayHello() {
        System.out.println();
        System.out.println("Hello");
        System.out.println("I'm your program");
        System.out.println("Nice to meat you");
    }
}
