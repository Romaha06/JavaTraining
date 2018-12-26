package mytesting;

public class Arrays {

    public static void main(String[] args) {
        System.out.println("Масивы:");
        //Создадим массив типа String и назовем его names
        //и зададим размер на 3 элемента

        String[] names;
        names = new String[3];
        System.out.println();

        //Тоже действие что и выше только в формате одной строки

        String[] name = new String[3];
        System.out.println();

        //Создадим массив типа int и назовем его arr с размером в 10 элементов

        int[] arr = new int[10];

        //Нумирация(Индексация) элементов масива начинается с 0. То есть если масим состоит из 3х элементов
        //то у первого элемента масива будет индекс 0, у второго 1, у третьего 3 и так далие
        //в зависимости сколько элементов содержит масив
        //Зададим каждому элементу масива свое содержимое и выведим на экран

        name[0] = "Vasya";
        name[1] = "Petya";
        name[2] = "Vanya";
        System.out.println(name[0]);
        System.out.println(name[2]);
        System.out.println();

        //Теже действия что и выше только с массивом типа int

        arr[3] = 15;
        System.out.println(arr[3]);

        System.out.println();
        int[] array = {15, 10, 100};//таким оброзом мы создали массив из трех элементов
        //и сразу указали значение всех элементов и вывели их на экран
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println();
        //Выводим массив с помощью циклов
        int[] array2 = {15, 10, 100, 9, 44};
        for (int i = 0; i < 5; i++) {
            System.out.print(array2[i]);
        }

        System.out.println();
        int[] arr2 = new int[15];//Создали пустой массив из 15 элементов
        //заполняем массив автоматически с помощью цикла
        //Создаем цикл который будет работать пока щотчик J будет меньше 15
        //Щотчик изменяется от 0 и +1 то есть 0,1,2,3 и так до 14
        for (int j = 0; j < 15; j++) {
            arr2[j] = j * 10;
            System.out.print(arr2[j]);
        }

        //Для того что бы узнать размер массива
        System.out.println();
        System.out.println(arr2.length);

        //Для того что бы найти последний элемент массива нам нужно от размера масива отнятьт 1
        // тоесть массив.langth - 1
        System.out.println(arr2[arr2.length - 1]);
    }
}
