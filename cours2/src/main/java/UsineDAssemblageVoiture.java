public class UsineDAssemblageVoiture extends UsineDAssemblage{

    Voiture assemble(){
        Voiture v = new Voiture() {
            @Override
            void klaxonner() {

            }
        };
        return v;
    }
}
