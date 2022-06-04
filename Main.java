package HomeWorkMap;

import java.util.ArrayList;
import java.util.List;

 //- Crie um método que receba uma lista de Pokemon e classifique quantos Pokemon por tipo foram recebidos,
 // porém, só adicione Pokemon que são lendários;
 //- Crie um método que receba uma lista de Filmes, separe em listas distintas filmes para maiores de 12 anos
 // e filmes de classificação livre. Para cada uma das listas, classifique quantos filmes de cada gênero foram
 // recebidos e exiba de forma individual;
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

        List<PlayList> infoMusic = new ArrayList<>();
        PlayList playList = new PlayList();
        playList.setNameMusic("Titico no Fubá");
        playList.setTimeMusic(5);
        playList.setTypeMusic("MPB");
        infoMusic.add(playList);

        playList = new PlayList();
        playList.setNameMusic("Hell Bells");
        playList.setTimeMusic(2);
        playList.setTypeMusic("Rock");
        infoMusic.add(playList);

        playList = new PlayList();
        playList.setNameMusic("The Mirror");
        playList.setTimeMusic(6);
        playList.setTypeMusic("Power Metal");
        infoMusic.add(playList);

        playList = new PlayList();
        playList.setNameMusic("Land Of Immortals");
        playList.setTimeMusic(6);
        playList.setTypeMusic("Power Metal");
        infoMusic.add(playList);

        playList = new PlayList();
        playList.setNameMusic("Nightfall");
        playList.setTimeMusic(1);
        playList.setTypeMusic("Power Metal");
        infoMusic.add(playList);

        methods.checkMusic(infoMusic);

        List<Pokemon> infoPokemons = new ArrayList<>();
        Pokemon pokemon = new Pokemon();
        pokemon.setNamePokemon("Blastoise");
        pokemon.setTypePokemon("Water");
        pokemon.setCategoryPokemon("First Class");
        infoPokemons.add(pokemon);

        pokemon = new Pokemon();
        pokemon.setNamePokemon("Psyduck");
        pokemon.setTypePokemon("Water");
        pokemon.setCategoryPokemon("First Class");
        infoPokemons.add(pokemon);

        pokemon = new Pokemon();
        pokemon.setNamePokemon("Dewgong");
        pokemon.setTypePokemon("Water");
        pokemon.setCategoryPokemon("Legendary");
        infoPokemons.add(pokemon);

        pokemon = new Pokemon();
        pokemon.setNamePokemon("Mega Gengar");
        pokemon.setTypePokemon("Ghost");
        pokemon.setCategoryPokemon("Legendary");
        infoPokemons.add(pokemon);

        pokemon = new Pokemon();
        pokemon.setNamePokemon("Lugia");
        pokemon.setTypePokemon("Dragon");
        pokemon.setCategoryPokemon("Legendary");
        infoPokemons.add(pokemon);

        pokemon = new Pokemon();
        pokemon.setNamePokemon("Tapu Koko");
        pokemon.setTypePokemon("Electric");
        pokemon.setCategoryPokemon("Legendary");
        infoPokemons.add(pokemon);

        methods.checkPokemon(infoPokemons);

        List<Films> infoFilms = new ArrayList<>();
        Films films = new Films();
        films.setNameFilm("Mama");
        films.setTypeFilm("Horror");
        films.setProhibitedUpTwelve(true);
        infoFilms.add(films);

        films = new Films();
        films.setNameFilm("The Orphan");
        films.setTypeFilm("Horror");
        films.setProhibitedUpTwelve(true);
        infoFilms.add(films);

        films = new Films();
        films.setNameFilm("Ratos de Praia");
        films.setTypeFilm("Drama");
        films.setProhibitedUpTwelve(true);
        infoFilms.add(films);

        films = new Films();
        films.setNameFilm("Amores Canibais");
        films.setTypeFilm("Horror");
        films.setProhibitedUpTwelve(true);
        infoFilms.add(films);

        films = new Films();
        films.setNameFilm("Babogamers");
        films.setTypeFilm("Horror");
        films.setProhibitedUpTwelve(true);
        infoFilms.add(films);


        films = new Films();
        films.setNameFilm("Fogo no Ceu");
        films.setTypeFilm("Drama");
        films.setProhibitedUpTwelve(false);
        infoFilms.add(films);


        films = new Films();
        films.setNameFilm("Dinotopia");
        films.setTypeFilm("Science fiction");
        films.setProhibitedUpTwelve(false);
        infoFilms.add(films);

        methods.checkFilms(infoFilms);

    }
}
