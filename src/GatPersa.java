/**Representa un objecte
 * gat persa.
 * Created by 46066294p on 01/03/16.
 */
public class GatPersa extends Gat{


    @Override
    public void mostra() {
        System.out.println("\nSoc un gat persa");
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

