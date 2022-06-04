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

    public void checkMusic (List<PlayList> infoMusic){
        int counter = 1;
        Map<String, Integer> numberOfTracks = new HashMap<>();
        for(PlayList infoMusics : infoMusic){
            if(infoMusics.getTimeMusic() >= 3) {
                if (!numberOfTracks.containsKey(infoMusics.getTypeMusic())) {
                    numberOfTracks.put(infoMusics.getTypeMusic(), counter);
                } else {
                    Integer receivesValue = numberOfTracks.get(infoMusics.getTypeMusic());
                    numberOfTracks.replace(infoMusics.getTypeMusic(), receivesValue, receivesValue + counter);
                }
            }
        }
        System.out.println(numberOfTracks);
    }

    public void checkPokemon(List<Pokemon> infoPokemon){
        int counter = 1;
        Map<String, Integer> numberOfPokemon = new HashMap<>();
        for(Pokemon infoPokemons : infoPokemon){
            if(infoPokemons.getCategoryPokemon() == "Legendary"){
                if(!numberOfPokemon.containsKey(infoPokemons.getCategoryPokemon())){
                    numberOfPokemon.put(infoPokemons.getCategoryPokemon(), counter);
                } else {
                    Integer receivesValue = numberOfPokemon.get(infoPokemons.getCategoryPokemon());
                    numberOfPokemon.replace(infoPokemons.getCategoryPokemon(), receivesValue, receivesValue + counter);
                }
            }
        }
        System.out.println(numberOfPokemon);

    }

    public void checkFilms(List<Films> infoFilms){
        int counter = 1;
        Map<String, Integer> numberOfFilms = new HashMap<>();
        for(Films infoFilm : infoFilms){
            if(infoFilm.getProhibitedUpTwelve() == false){
                if(!numberOfFilms.containsKey("Free")){
                    numberOfFilms.put("Free", counter);
                } else {
                    Integer receivesValue = numberOfFilms.get("Free");
                    numberOfFilms.replace("Free", receivesValue, receivesValue + counter);
                }
            }
            if(!numberOfFilms.containsKey("Para maiores de 12 anos")){
                numberOfFilms.put("Para maiores de 12 anos", counter);
            } else {
                Integer nowValue = numberOfFilms.get("Para maiores de 12 anos");
                numberOfFilms.replace("Para maiores de 12 anos", nowValue, nowValue + counter);
            }
        }
        System.out.println(numberOfFilms);
    }

    }

