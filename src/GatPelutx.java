/**
 * Created by 46066294p on 01/03/16.
 */
public class GatPelutx extends Gat{

    @Override
    public void mostra() {
        System.out.println("Soc un gat de pelutx");
    }

    @Override
    public void caminar() {
        System.out.println("...no que camino");
    }

    @Override
    public void miau() {
        SenseMiau senseMiau = new SenseMiau();
        System.out.println();
    }
}
