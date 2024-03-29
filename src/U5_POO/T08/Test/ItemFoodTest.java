package U5_POO.T08.Test;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Character.Profession.Asesino;
import U5_POO.T08.Character.Race.Humano;
import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Item.Consumibles.ItemConsumible;
import U5_POO.T08.Item.Consumibles.Potions.HealingPotion;
import org.junit.jupiter.api.Test;

class ItemFoodTest {

    @Test
    void consumedBy() {
        Personaje personaje = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(5));
        ItemConsumible manzana = new HealingPotion();
        //manzana = new PoisonousFoodDecorator(manzana);
        //manzana = new EnhancedFoodDecorator(manzana);

        //double vidaInicial = personaje.health();
        manzana.consumedBy(personaje);
        //assertTrue(personaje.health() < vidaInicial);
    }

    @Test
    void getPower() {
    }

    @Test
    void testToString() {
    }
}