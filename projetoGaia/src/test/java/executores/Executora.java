package executores;

import robos.GaiaRobo;

public class Executora {
    public static void main(String[] args) {
        GaiaRobo umaGaiaRobo = new GaiaRobo();

        umaGaiaRobo.acessarUmSite();
        umaGaiaRobo.fazerLogin();
        umaGaiaRobo.lancarNota();

        GaiaRobo umaOutraGaiaRobo = new GaiaRobo();
        umaOutraGaiaRobo.acessarUmSite();

    }
}
