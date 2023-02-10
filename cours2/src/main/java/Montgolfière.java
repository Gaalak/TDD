public class Montgolfière implements Amarable {

    //m2
    int surface;
    @Override
    public int combienDeCordes(int VitesseDuVent) {

        int nbCordes = surface/50;
        nbCordes = nbCordes + VitesseDuVent/100;

        return nbCordes;
    }
}
