package org.example.Adapter;

public class HdmiAdapterHeriatge extends TV implements VGA {



    @Override
    public void print(String message) {
        System.out.println("++++++++++ TV Adaptation  ++++++++++++++");
        System.out.println(message);
        System.out.println("++++++++++ Tv adaptation  ++++++++++++++");
         super.view(message.getBytes());
    }

    // l'inconenient de l'heitage que c'est un couplage fort donc ici on est lié a tv et pas a n'importe quel classe qui implemnte HDmi , et  pour n'importe quelle sous classe de HDmi on doit créer un adaptateur
}
