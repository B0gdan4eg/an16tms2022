package by.tms.model;


public enum Season {
    SUMMER(25, "best season") {
        @Override
        public void getDescription(Season season) {
            System.out.println("Warm");
            ;
        }
    },
    AUTUMN(11, "ok"),
    WINTER(-6, "vary nice"),
    SPRING(15, "not bad");
    private final int temp;
    private final String des;

    Season(int temp, String des) {
        this.temp = temp;
        this.des = des;
    }

    public int getTemp() {
        return temp;
    }

    public String getDes() {
        return des;
    }

    public void favorite(Season favoriteSeason) {
        switch (favoriteSeason) {
            case AUTUMN -> System.out.println("I love Autumn");
            case SPRING -> System.out.println("I love Spring");
            case SUMMER -> System.out.println("I love Summer");
            case WINTER -> System.out.println("I love Winter");
        }
    }

    public void getDescription(Season season) {
        System.out.println("too cold");
    }

}
/**
 * Задача1: Времена года
 * 1) Создать перечисление(enum), содержащее названия времен года.
 * 2) Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
 * 3) Создать метод, который принимает на вход переменную созданного вами enum типа.
 * Если значение равно Лето, выводим на консоль “Я люблю лето” и так далее. Используем оператор switch.
 * 4) Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
 * 5) Добавить конструктор принимающий на вход среднюю температуру.
 * 6) Создать метод getDescription, возвращающий строку “Холодное время года”.
 * Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
 * 7) В цикле распечатать все времена года, среднюю температуру и описание времени года.
 **/