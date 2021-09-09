public class Main {

    public static void main(String[] args) {

        Course c = new Course(new Cross(5),
                new Wall(3),
                new Water(7));
        Team team = new Team("Животинка",
                new Cat("Барсик", 12, 15, 0),
                new Dog("Тузик", 20, 2, 15),
                new Cat("Вася", 5, 14, 1));
        team.getTeamInfo();

        c.doIt(team);
        team.showResults();

    }
    }
