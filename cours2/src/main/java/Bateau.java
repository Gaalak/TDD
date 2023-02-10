public class Bateau implements Amarable{

    //tonne
    int masse;
    @Override
    public int combienDeCordes(int VitesseDuVent) {

        int nbCordes = masse/10;
        nbCordes = nbCordes + VitesseDuVent/100;
        return nbCordes;
    }
}
