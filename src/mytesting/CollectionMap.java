package mytesting;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionMap {
    public static void main(String[] args) {
        /* Коллекция Map - это интерфейс который фходит в Collections
         * Framework но нне фходит в интерфей Collection, то есть
          * это отдельный интерфейс, однако он так же позволяет
          * хранить в себе набор данных но отличие от остальных
          * коллекция в том что, данные он хранит с помощью
          * пары Key и Value (ключ и значение) а раньше когда
          * мы к примеру использовали List(список) мы просто
          * добавляли элименты и они могли находиться по какому то
          * индексу. В данном случае мы должны указывать какой то
          * уникальный ключ и привязывать к нему значения
          * */

        //Пример:
        //Мы напишем Map в треугольных скобках указываем тип ключа и тип значения
        //к примеру мы скажем что ключ будет Integer и значение String далее
        //даем название к примеру "map" и напишем реализацию new HashMap<>()

        Map<Integer, String> map = new HashMap<>();
        //Основные методы для работы с Map

        //Первый метод это метод - put - позволяет добовлять элементы в наш Map
        //в скобках мы указываем ключ и значение, и ключ должен быть уникальным,
        //то есть он не может повторяться в других элементах этого Mapa, а значения
        //могут повторяться
        map.put(1, "Black");
        map.put(2, "White");
        map.put(3, "Yellow");
        map.put(10, "Green");

        //След метод это метод .get - позволяет получать значения из Map
        //map.get(1);//Здесь мы говорим что нам нужно найти элемент с ключом 1
        System.out.println(map.get(1));
        System.out.println(map.get(10));
        System.out.println();

        //След метод .size - позволяет узнать размер нашего Map
        System.out.println(map.size());//Размер будет 4
        //След метод это метод .clear - позволяет очистить нашу Map
        //map.clear();
        System.out.println(map.size());//Размер будет 0
        //След метод это .containsKey позволяет узнать есть ли в Map пара
        //с ключом какого либо значения
        System.out.println();

        System.out.println(map.containsKey(90));//Результат будет false так как нет таго ключа
        System.out.println(map.containsKey(10));//Результат будет true так как есть такой ключ
        System.out.println();

        //След метод .containsValue - позволяет проверить по значению а не по ключу
        System.out.println(map.containsValue("White"));//такое есть получим true
        System.out.println(map.containsValue("Grey"));//такого нет получим false
        System.out.println();

        //След метод .keySet() позволяет получить Set всех ключей которые есть в нашей мапе,
        //для этого создадим Set типа Integer назовем его "keys" и используем метод .keySet()
        Set<Integer> keys = map.keySet();
        //дале для того что бы вывести все Value (значения) которые содержатся в нашей Map
        //мы используем Iterator, цикл while и метод .get
        Iterator<Integer> iterator = keys.iterator();
        while(iterator.hasNext()){
            System.out.println(map.get(iterator.next()));//Мы будем пробегаться по ключам
                                                         //и выводить значения которые
                                                         //хранятся в Map по каждому ключу
        }
        System.out.println();
        //Для того что бы изменить значение в каком то из ключей
        //мы также можем воспользоваться методом .put
        System.out.println(map.get(2));//проверим до изменения
        map.put(2,"Yellow");//изменим значения в ключе 2
        System.out.println(map.get(2));//проверим после изменения
        System.out.println();

        //Рассмотрим Map с другим типом данных напимер пусть ключ будет String
        //и значение тоже будет String
        Map<String, String> map2 = new HashMap<>();
        map2.put("Vasya", "Frolov");
        map2.put("Petya", "Gromov");
        System.out.println(map2.get("Petya"));


    }
}
