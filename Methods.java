package HomeWorkMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Methods {
    public void infoPublicPrivate(List<Hospital> listHospital){
        int counter = 1;
        Map<String, Integer> amountHospital = new HashMap<>();
        for (Hospital hospital : listHospital) {
            if (!amountHospital.containsKey(hospital.getHpType())) {
                amountHospital.put(hospital.getHpType(), counter);
            } else {
                Integer valor = amountHospital.get(hospital.getHpType());
                amountHospital.replace(hospital.getHpType(), valor, valor + counter);
            }
        }
        System.out.println(amountHospital);
    }

    }

