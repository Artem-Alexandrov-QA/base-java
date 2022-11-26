public class Main {

    static NationalTeam nationalTeam = new NationalTeam();

    public static void main(String[] args) {

        SpartakPlayer spartak = new SpartakPlayer("Александр Соболев");
        spartak.age = 24;
        spartak.position = "Нападающий";
        spartak.countMatchToSeason = 20;
        FootballPlayer.sayCountry();
        spartak.sayHeight();
        System.out.println("Возраст:" +spartak.age);
        System.out.println("Позиция:" + spartak.position);
        System.out.println("Количество матчей в сезоне:" + spartak.countMatchToSeason);
        nationalTeam.invitation(spartak);

        ZenitPlayer zenit = new ZenitPlayer("Михаил Кержаков");
        zenit.position = "Вратарь";
        zenit.age = 26;
        zenit.countMatchToSeason = 19;
        FootballPlayer.sayCountry();
        zenit.sayHeight();
        System.out.println("Возраст:" + zenit.age);
        System.out.println("Позиция:" + zenit.position);
        System.out.println("Количество матчей в сезоне:" + zenit.countMatchToSeason);
        nationalTeam.invitation(zenit);


    }

}

