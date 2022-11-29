public abstract class FootballPlayer {

    protected String name;
    protected int age;
    protected String position;
    protected int countMatchToSeason;
    protected static String country = "Россия";
    protected static String city = "Москва";

    public static void sayCountry() {
        System.out.println("Страна: " + country);
    }

    public void sayCity() {
        System.out.println("Город: " + city);
    }

    public abstract void workLeg();

    public abstract void sayHeight();

    public abstract void sayClub();

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getCountMatchToSeason() {
        return countMatchToSeason;
    }

    public void setCountMatchToSeason(int countMatchToSeason) {
        this.countMatchToSeason = countMatchToSeason;
    }
}
