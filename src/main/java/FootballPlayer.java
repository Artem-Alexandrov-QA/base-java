public class FootballPlayer {
    protected String name;
    protected int age;
    protected String position;
    int countMatchToSeason;
    protected static String country = "Россия";

    public void setPosition(String position) {
        this.position = position;
    }
    public static String getCountry() {
        return country;
    }
    public static void setCountry(String country) {
        FootballPlayer.country = country;
    }
    public FootballPlayer(int countMatchToSeason) {
        this.countMatchToSeason = countMatchToSeason;
    }

    public FootballPlayer(String name) {
        this.name = name;
    }
    static void sayCountry(){
        System.out.println(country);
    }
}
