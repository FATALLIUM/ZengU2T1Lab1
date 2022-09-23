
public class Player {
    private String name;
    private String pClass;
    private boolean fugitive;
    private int age;

    public Player(String playerName, String playerClass, boolean isFugitive, int playerAge) {
        name = playerName;
        pClass = playerClass;
        fugitive = isFugitive;
        age = playerAge;
    }

    public void introduce() {
        System.out.println("Your name is " + name + " , aged " + age + " and your class is: " + pClass + ".");
        if (fugitive) {
            System.out.println("You are a fugitive.");
        }
        else {
            System.out.println("You are not a fugitive.");
        }
    }

    public void legend() {
        System.out.println("The chicken of hell: " + name);
        System.out.println("With " + age + " teapots,");
        System.out.println("They are also the hero of " + pClass);
        System.out.println("All hail the unicorn.");

    }










}
