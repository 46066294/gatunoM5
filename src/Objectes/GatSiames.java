package Objectes;

/**Representa un objecte
 * gat de siames.
 *
 * Created by Marc Cano i Moises Villaverde on 01/03/16.
 */
public class GatSiames extends Gat {


    @Override
    public void mostra() {
        System.out.println("\nSoc un gat siames");
    }

    @Override
    public void caminar() {
        System.out.println("...si que camino");
    }

    @Override
    public void miau() {
        MiauNormal miauNormal = new MiauNormal();
    }
}


