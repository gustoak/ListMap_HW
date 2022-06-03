package HomeWorkMap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//Crie um método que receba uma lista de Hospitais e classifique quantos são públicos e quantos são privados;
        List<Hospital>listHospital = new ArrayList<>();
        Hospital hospital = new Hospital();
        hospital.setHpName("Sobam Jundiai");
        hospital.setHpType("Private");
        listHospital.add(hospital);

        hospital = new Hospital();
        hospital.setHpName("Notre Dame");
        hospital.setHpType("Private");
        listHospital.add(hospital);

        hospital = new Hospital();
        hospital.setHpName("Samaritano");
        hospital.setHpType("Public");
        listHospital.add(hospital);

        hospital = new Hospital();
        hospital.setHpName("Hospital da Cidade");
        hospital.setHpType("Public");
        listHospital.add(hospital);

        Methods methods = new Methods();
        methods.infoPublicPrivate(listHospital);


    }
}
