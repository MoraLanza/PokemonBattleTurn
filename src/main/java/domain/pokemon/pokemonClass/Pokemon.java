package domain.pokemon.pokemonClass;
import java.util.Random;
public abstract class Pokemon {
    protected int hp;

    protected String name;

    protected int exp;

    public Pokemon(String name) {
        this.name = name;
        this.hp = 800;
    }

    protected void notEffective() {
         System.out.println("It's not very effective...");
    }

    protected void superEffective() {
        System.out.println("It's super effective!");
    }


    public int getHp() {

        return hp;
    }
    public String getName() {
        return name;
    }

    public void showStats(){
        System.out.println(this.getName() + "  Hp: " + this.getHp());
    }

    public void showAttacks(){
        System.out.println("1) Tackle (Accuracy: 90, Damage: 20)");
        System.out.println("2) Bite (Accuracy: 50, Damage: 40)");
        System.out.println("3) Scratch (Accuracy: 80, Damage: 30)");
    }
    protected void attack(int accuracy, int damage, Pokemon pokemon){
         int attackAccuracy = new Random().nextInt(10);
        if (attackAccuracy < accuracy) {
            superEffective();
            pokemon.hp -= damage;
        } else {
            notEffective();
        }
    }

    public void attackTackle(Pokemon pokemon){
        attack(9, 20, pokemon);

    }

    public void attackBite(Pokemon pokemon){
        attack(5, 40, pokemon);
    }

    public void attackScratch(Pokemon pokemon){
        attack(8,30, pokemon);
    }

}
