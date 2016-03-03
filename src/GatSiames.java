/**
 * Created by 46066294p on 01/03/16.
 */
public class GatSiames extends Gat{


    @Override
    public void mostra() {
        System.out.println("Soc un gat siames");
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



/*
public class GatPersa extends Gat{


    @Override
    public void mostra() {
        System.out.println("Soc un gat persa");
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


 */