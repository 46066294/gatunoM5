package Objectes;

/**Representa un objecte
 * gat de porcellana.
 *
 * Created by Marc Cano i Moises Villaverde on 01/03/16.
 */
public class GatPorcellana extends Gat {

    @Override
    public void mostra() {
        System.out.println("\nSoc un gat de porcellana");
    }

    @Override
    public void caminar() {
        System.out.println("...no camino");
    }

    @Override
    public void miau() {
        SenseMiau senseMiau = new SenseMiau();
    }
}


