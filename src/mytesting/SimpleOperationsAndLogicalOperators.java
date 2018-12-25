package mytesting;

public class SimpleOperationsAndLogicalOperators {

    public static void main(String[] args) {
        System.out.println("Операция присваивания: ");

        int a;
        a = 10; //Присвоили переменной а значиние 10
        a = 20; //Перезаписали в переменную а значение 20
        System.out.println(a);

        int b = a;  //Создали переменну b и присвоили ей значение переменной a то есть 20
        System.out.println(b);

        int c, d; // Создали переменнуые с и d
        c = d = b; // Задали перемменым с и d  значение пременной b то есть 20
        System.out.println(c + " " + d);
        System.out.println();

        System.out.println("Арефметические операции: ");

        //Зададим переменным а и b  значения
        a = 13;
        b = 5;
        //Выводим на экран результаты проделанных арефметических операций
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        // Такой же пример только с числами с плавающей точкой
        double f = 15;
        double e = 7;
        System.out.println(f / e);
        System.out.println();

        System.out.println("Опереция получение остатка от деления: ");
        // Для выполнения данной операции используем знак %
        System.out.println(a % b);

        //Так же можно совмещать операции
        System.out.println();
        a = b + c * d; //Результат будет 405
        System.out.println(a);
        System.out.println();

        System.out.println("Операция сравнения: ");
        a = 15;
        b = 10;
        // Операции сравнения всегда выдают результат типа boolean1 или true или false
        System.out.println(a > b);
        System.out.println(a < b);
        // Так же можно использовать операции <= и  >=
        System.out.println(a - 5 >= b);
        System.out.println(a - 5 <= b);
        System.out.println(a == b); // Операция равенста
        System.out.println(a != b); // Операция не равенства
        System.out.println(a + 10 <= b + 15); // Результат будет true
        System.out.println();

        System.out.println("Операция отрецания: ");
        // Если мы применяем знак отрецани ! к выражению которое привло к результату true
        // то при использовании знака ! мы получим результат false и на оборот
        System.out.println(!(a + 10 <= b + 15)); // Результат будет false
        System.out.println(!(false));//Результат будет true
        System.out.println();

        System.out.println("Операция инкримент: ");
        int i = 0;
        i++; // Инкримент это операция добавления единици I = 1+1, то есть значение увеличивается на единицу
        System.out.println(i);
        System.out.println();
        // Так же можно осуществить операцию дикримента то есть уменьшения на единицу
        i--; // i = 1-1
        System.out.println(i);
        System.out.println();
        // У инкримента и дикримента есть постфиксная и префиксная форма
        // Постфиксная форма: i++ и i-- когда знак сложения или вычитания указваются
        // после переменной
        // Так же их можно указывать перед переменной, это будет префиксная форма
        // Пример:
        i = 5;
        System.out.println(i++);
        System.out.println(i);
        System.out.println();
        i = 3;
        a = i++;
        System.out.println(a);
        i = 3;
        a = ++i;
        System.out.println(a);
        System.out.println();

        System.out.println("Операции булеанского типа: ");
        //Операции сравнения
        a = 10;
        b = 20;
        //Проверяем либо а больше чем b либо a меньше чем b
        // Если хоть один результат верный то получаем результат  true
        System.out.println(a > b || a < b); // В данном случае мы использовали операцию
        // сравнения и операцию булеанского типа "или"
        // пишется с помошью двух вертикальных черт ||

        System.out.println(a > b || b > 30);// Так как два результата отрицательных получим
        // результат false
        System.out.println();

        System.out.println("Операция И: ");
        // Операция "И" записывается с помощью двух имперсантов "&&"
        // Орерация "И" выведит результат true только если оба значения будут true
        System.out.println(a > b && a < b);//Результат будет false так как не оба случая
        // дают результат true

        System.out.println(a > 9 && b == 10);//В этом случае результат булет true
        // так как оба выражения дают результат true

        //Напишем более сложный пример
        System.out.println(a + 10 > 15 || b - 5 > 10 && a < b);//Результат будет true
        //так как все условия дают
        //результат true

        System.out.println(!(a + 10 > 15 || b - 5 > 10 && a < b));//Добавим знак отрецания
        //что бы изменить результат
        System.out.println();

        //Для вычесления синусов, косинусов, корней и т.д. мы можем использовать
        //класс "Math" .sqrt()-вычесления корня Math.pow()-возведение в степень и т.д.
        System.out.println("Класс Math: ");
        a = 9;
        System.out.println(Math.sqrt(a));// В данном случае мы находим корень из 9
        System.out.println(Math.pow(a, 3));// В данном случае мы возводим 9 в степень 3
        System.out.println();

        System.out.println("Комбенированные операции: ");
        //Комбенированные операции это операции которые включают в себя операции присваивания
        //и различные вмды арефметических операций
        a = 10;
        a = a + 5;
        System.out.println(a);

        //Упростим запись и сделаем её комбинированной
        a = 10;
        a += 5; // a = a + 5
        System.out.println(a);
        a -= 5;// a = a - 5
        System.out.println(a);
        a *= 5;// a = a * 5
        System.out.println(a);
        a /= 5;// a = a / 5
        System.out.println(a);
        a %= 3;// a = a % 3
        System.out.println(a);
    }
}
