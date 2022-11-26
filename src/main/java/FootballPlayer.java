public abstract class FootballPlayer {
    protected String name;
    protected int age;
    protected String position;
    int countMatchToSeason;
    protected static String country = "Россия";
    protected static String city = "Москва";

    public FootballPlayer(int countMatchToSeason) {
        this.countMatchToSeason = countMatchToSeason;
    }

    public FootballPlayer(String name) {
        this.name = name;
    }
    public static void sayCountry(){
        System.out.println(country);
    }

    public void sayCity(){
        System.out.println(city);
    }

    public abstract void workLeg();
}
