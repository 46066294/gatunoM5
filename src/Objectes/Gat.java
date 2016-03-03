package Objectes;

import interficiesCaractGato.Caminable;
import interficiesCaractGato.Miolable;

/**Superclase: Representa un gat generic
 * del qual derivaran tots els altres gats.
 *
 * Created by Marc Cano i Moises Villaverde on 01/03/16.
 */
public abstract class Gat implements Miolable, Caminable {

    //metodes
    public abstract void mostra();

}
