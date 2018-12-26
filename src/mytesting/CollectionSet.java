package mytesting;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) {
        /* Колекция Set. Отличие set от list в том что set хранит в себе
         * уникальные значения, то есть если в list мы можем добавить
         * два элемента с одинаковым значением то set будет хранить
         * всего лишь один обьект с тем самым значением которое мы укажим,
         * даже если мы его укажим повторно, то есть set это
         * множество обьектов в которых нет какго то индекса и эти
         * обьекты являются уникальными */
        //как создается данная колекция Set
        //В начале мы пишем Set, далие тип Integer после даем названиие Seta "set"
        //пропишем реализацию new HashSet<>() Реализации существуют разные
        //но мы расмотрим саммую популярную. Если в set добавлять одинаковые обьекты
        //(значения) то размер его меняться не будет, по скольку данные элементы
        //(одинаковые обьекты) будут не уникальными. То есть set это колекция которая
        //хранит в себе уникальные обьекты
        Set<Integer> set = new HashSet<>();
        set.add(10);//метод добавления обьекта в set
        set.add(11);
        set.add(12);
        set.add(11);
        System.out.println(set.size());//метод для полочения размера seta
        //Для того что бы вывести на экраен все обьекты нашего seta
        //необходима использовать iterator и цикл как и с Listom используя те
        //же методы .hasNext и .next
        //для этого мы создадим iterator1 и напишем цикл, в цикле мы напишем
        //следуещее, пока .hesNext будет возвращать true, то есть мы будем
        //перебирать все элементы в списке и когда мы окажемся на последнем
        //мы выполним какие то операции и наш цикл закончится так как след
        //элемента не будет, и внутри цикла мы воводим на экран iterator.next
        //то есть переходим на следующий элемент и выводим его на экран
        System.out.println();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        //можно использовать цикл foreach
        for (int i : set) {
            System.out.println(i);
        }
        System.out.println();
        /* Расмотрим методы которые можно использовать в колекции Set*/
        //Метод remove - метод удаления элементов, в случае с колексией
        //Set мы указываем конкретно значение элемента а не индекс как
        //в колекции List
        //set.remove(11);

        /*Большенство методов такое же как и в колекции List*/
        //Расмотрим метод clear - метод очистки
        //set.clear();
        System.out.println(set.size());//результат будет 0
        System.out.println();

        //Для проверки, существует ли в нашем сете какое то значение
        //например проверим существует ли значение 11, для этого
        //используем метод contains
        System.out.println(set.contains(11));//Получим рез rue так как токое значение есть
        System.out.println(set.contains(10));//Получим рез rue так как токое значение есть
        /* По сути интерфейс Set и интерфейс List наследуются от одного интерфейся
         * Collection и поэтому большинство их методов являются одинаковыми
         * но стоит учесть что в Sete нету метода .get, то есть мы не можем
         * получить элемент по индексу, у элементов в sete нет индекса
         * и все элементы в sete являются уникальными, соответственно
         * если мы хотим иметь какую то каллекцию где будем хранить
         * уникальные элементы, то мы должны использовать Set если же
         * нам нужен какой то массив где мы можем хранить любые элементы
         * и находить их по индексу, нам подойдек коллекция List
         * К примеру Set используется в коллекции Map*/
    }
}
