package U5_POO.T08.Test;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Character.Profession.Asesino;
import U5_POO.T08.Character.Race.Humano;
import U5_POO.T08.Character.Stat.StatsKit;
import U5_POO.T08.Item.Equipamiento.Collar.Collar;
import U5_POO.T08.Item.Equipamiento.Equipamiento;
import org.junit.jupiter.api.Test;

class ItemEquipableTest {

    @Test
    void equipar() {
        Collar collar = new Collar(new StatsKit(1, 1, 1, 1), "Collar!");
        //Personaje pj = new Personaje("Mar", new Humano(), new Asesino(), new StatsKit(0));
        //pj.toString();
        Equipamiento prueba = new Equipamiento();
    }
}