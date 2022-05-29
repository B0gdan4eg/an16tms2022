package by.tms.model;


public enum Season {
    SUMMER(25, "best season") {
        @Override
        public void getDescription(Season season) {
            System.out.println("Warm");
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