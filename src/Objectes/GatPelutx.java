package Objectes;

/**Representa un objecte
 * gat de pelutx.
 *
 * Created by Marc Cano i Moises Villaverde on 01/03/16.
 */
public class GatPelutx extends Gat {

    @Override
    public void mostra() {
        System.out.println("\nSoc un gat de pelutx");
    }

    @Override
    public void caminar() {
        System.out.println("...no camino");
    }

    @Override
    public void miau() {
        MiauMetalic miauMetalic = new MiauMetalic();
    }
}
