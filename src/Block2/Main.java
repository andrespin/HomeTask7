package Block2;
/*

Блок условий номер №1

1. Расширить задачу про котов и тарелки с едой.
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
(например, в миске 10 еды, а кот пытается покушать 15-20).
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту
удалось покушать (хватило еды), сытость = true.
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
наполовину сыт ( это сделано для упрощения логики программы ).
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и
потом вывести информацию о сытости котов в консоль.
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */

/*
В первую очередь проверяю:
1. Проверки на то, чтоб коты не могли загнать значение еды в тарелке в минус
2. Как реализован механизм сытости кота, какие условия расставлены в методе eat().
Кот ест столько, сколько дали. Шкала еды при этом двигается на n позиций
3. Как и где вы создаете массив котов. Как вы их кормите
*/

/*

Блок условий номер №2

Дополнительно:
4. Создан ли массив тарелок
5. Кот поедает все, что найдет (со всех тарелок, где есть еда)
Учитываем, что у нас воспитанные коты, и подходят к мискам они в порядке очереди
6. Как добавляется еда в тарелки (можно через 1 метод, который автоматически раскидает по всем мискам)
7*** Реализован ли класс-посредник между котами и тарелками. Через него довольно просто можно оповещать котов о том, что пошуршали пакетом еды и рассыпали по мискам
 */




public class Main {

    public static void main(String[] args) {

        Cat[] cats = new Cat[]
                {
                        new Cat( "Barsik" , 200 ),
                        new Cat( "Vasilii" , 200 ),
                        new Cat( "Robert" , 200 ),
                        new Cat( "Jingo" , 200 ),
                        new Cat( "Leonard" , 200 )
                };


        // выполнения условий для "дополнительно"
        // Task 4 массив тарелок
        Plate[] plates = new Plate[] {new Plate(0), new Plate(0),new Plate(0)};

        // Task 6 автоматическое добавление еды в тарелки
        fillPlates(plates, 300);

        // Task 7 через класс-посредник даём котам поесть
        new EatingProcess().eat(plates, cats);

        checkSatiety(cats);


    }

    private static void checkSatiety(Cat[] cats)
    {
        for (Cat cat: cats)
        {
            System.out.println(cat.getName() + "сытость: " + cat.getSatiety() + " его шкала сытости: " + cat.getSatietyScale());
        }
    }

    private static void fillPlates(Plate[] plates, int food)
    {
        for (Plate plate: plates) {
            plate.increaseFood(food);
        }
    }

}
