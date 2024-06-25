package Java.PokemonV2.Java.Attack;
import Java.PokemonV2.Enum.TypeEnum;
import java.util.ArrayList;
import java.util.List;
import static Java.PokemonV2.Enum.TypeEnum.*;

public class Attack {

    private final TypeEnum typeattack;

    private final List<Attack> listofattack = new ArrayList<>();

    private final String name;
    private final int damage;
    private final boolean ultiattack;

   public final static Attack DEFLAGRATION = new Attack("Deflagration", 20, FIRE, true);
   public final static Attack FLAMMICHE = new Attack("Flammiche", 10, FIRE, false);
   public final static Attack FOUETLIAGNE = new Attack("Fouet liagne", 20, GRASS, true);
   public final static Attack TRANCHERBE = new Attack("Tranch'herbe", 10, GRASS, false);
   public final static Attack PISTOLETAO = new Attack("Pistolet à O", 10, WATER, false);
   public final static Attack SURF = new Attack("Surf", 20, WATER, true);
   public final static Attack tomberoche = new Attack("tomberoche", 10, GROUND, false);

    private Attack(String name, int damage, TypeEnum typeattack, boolean ultiattack) {
        this.name = name;
        this.damage = damage;
        this.typeattack = typeattack;
        this.ultiattack = ultiattack;
    }


//    public void setTypeAttackFromPokemonType(Pokemon pokemon) {
//        this.pokemon = pokemon;
//        listtypeattack = pokemon.getTypelist();
//        System.out.println(listtypeattack);
//
//    }
//
//
//    public void setListofattack() {
//        if (listtypeattack.contains(FIRE)) {
//            listofattack.add(deflagration);
//            listofattack.add(flammiche);
//        }
//        if (listtypeattack.contains(WATER)) {
//            listofattack.add(pistoletao);
//            listofattack.add(surf);
//        }
//        if (listtypeattack.contains(GRASS)) {
//            listofattack.add(trancherbe);
//            listofattack.add(fouetliagne);
//        }
//        System.out.println(listofattack);
//    }
//
//    public List<Attack> setPokemonAttacks() {
//        finishedlistofattack.add(listofattack.get(Integer.parseInt(String.valueOf(attackrandom.nextInt(listofattack.size())))));
//        finishedlistofattack.add(listofattack.get(Integer.parseInt(String.valueOf(attackrandom.nextInt(listofattack.size())))));
//        System.out.println(finishedlistofattack);
//        return finishedlistofattack;
//    }



    public List<Attack> getListofattack() {
        return listofattack;
    }

    public TypeEnum getAttackType() {
        return typeattack;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isUltiAttack() {
        return ultiattack;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
