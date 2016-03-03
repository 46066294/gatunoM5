/**Mostra per pantalla el tipus de gat
 * i les seves caracteristiques de caminar
 * i miolar.
 * Created by 46066294p on 01/03/16.
 */
public class Executable {
    public static void main(String[] args) {

        GatPelutx gatPelutx = new GatPelutx();
        gatPelutx.mostra();
        gatPelutx.caminar();
        gatPelutx.miau();


        GatPersa gatPersa = new GatPersa();
        gatPersa.mostra();
        gatPersa.caminar();
        gatPersa.miau();


        GatPorcellana gatPorcellana = new GatPorcellana();
        gatPorcellana.mostra();
        gatPorcellana.caminar();
        gatPorcellana.miau();


        GatSiames gatSiames = new GatSiames();
        gatSiames.mostra();
        gatSiames.caminar();
        gatSiames.miau();


        GatPelutx gatPelutx2 = new GatPelutx();
        gatPelutx2.mostra();
        gatPelutx2.caminar();
        gatPelutx2.miau();

    }
}
