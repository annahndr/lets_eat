package com.bnta.lets_eat.components;

import com.bnta.lets_eat.models.Cuisine;
import com.bnta.lets_eat.models.Location;
import com.bnta.lets_eat.models.Restaurant;
import com.bnta.lets_eat.repositories.LocationRepository;
import com.bnta.lets_eat.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.HashSet;
import java.util.Set;

@Component
public class Dataloader implements ApplicationRunner {

    @Autowired
    LocationRepository locationRepository;

    @Autowired
    RestaurantRepository restaurantRepository;


    public Dataloader(){}

    public void run(ApplicationArguments args){

//        LOCATIONS
        Location shawlands = new Location("Glasgow", "Shawlands");
        locationRepository.save(shawlands);

        Location glasgowWestEnd = new Location ("Glasgow", "West End");
        locationRepository.save(glasgowWestEnd);

        Location wavertree = new Location("Liverpool", "Wavertree");
        locationRepository.save(wavertree);

        Location westminster = new Location("London", "Westminster");
        locationRepository.save(westminster);

        Location hackney = new Location("London", "Hackney");
        locationRepository.save(hackney);

        Location towerHamlets = new Location ("London", "Tower Hamlets");
        locationRepository.save(towerHamlets);

        Location kensingtonAndChelsea = new Location("London", "Kensington and Chelsea");
        locationRepository.save(kensingtonAndChelsea);


//        RESTAURANTS

        Restaurant oro = new Restaurant("Oro", "85 Kilmarnock Road", "G41 3YR",  "https://oro.restaurant/", shawlands,55.82848067622028, -4.283155686885101);
        oro.getCuisines().add(Cuisine.ITALIAN);
        oro.getCuisines().add(Cuisine.SCOTTISH);
        restaurantRepository.save(oro);

        Restaurant halloumiSouth = new Restaurant("Halloumi South", "697 Pollockshaws Road", "G41 2AB", "https://halloumiglasgow.co.uk/", shawlands, 55.83631038173913, -4.270213013722374);
        halloumiSouth.getCuisines().add(Cuisine.GREEK);
        restaurantRepository.save(halloumiSouth);

        Restaurant rasaSayangSoho = new Restaurant("Rasa Sayang Soho", "5 Macclesfield Street", "W1D 6AY", "https://www.rasasayangfood.com/", westminster, 51.51221728426225, -0.13142491613083804);
        rasaSayangSoho.getCuisines().add(Cuisine.MALAY);
        rasaSayangSoho.getCuisines().add(Cuisine.SINGAPOREAN);
        restaurantRepository.save(rasaSayangSoho);

        Restaurant angelina = new Restaurant("Angelina", "58 Dalston Lane", "E8 3AH", "https://www.angelina.london/", hackney, 51.54878549516992, -0.0653088161289957);
        angelina.getCuisines().add(Cuisine.ITALIAN);
        angelina.getCuisines().add(Cuisine.JAPANESE);
        restaurantRepository.save(angelina);

        Restaurant alKahf = new Restaurant("Al-Kahf", "112-116 Vine Ct", "E1 1JE", "", towerHamlets, 51.520815214449684, -0.06448335739339328);
        alKahf.getCuisines().add(Cuisine.SOMALI);
        restaurantRepository.save(alKahf);

        Restaurant inkoNitoSoho = new Restaurant("Inko Nito", "55 Broadwick Street", "W1F 9QS", "https://inkonitorestaurant.com/", westminster, 51.51702341430502, -0.13749934134555605);
        inkoNitoSoho.getCuisines().add(Cuisine.JAPANESE);
        restaurantRepository.save(inkoNitoSoho);

        Restaurant cafeBeamNottingHill = new Restaurant("Cafe Beam", "103 Westbourne Grove", "W2 4UW", "https://www.cafebeam.co.uk/", kensingtonAndChelsea, 51.51605897169, -0.19338849369059816);
        cafeBeamNottingHill.getCuisines().add(Cuisine.MIDDLE_EASTERN);
        restaurantRepository.save(cafeBeamNottingHill);

        Restaurant bullgogi = new Restaurant("Bullgogi", "145 Nottinghill Gate", "W11 3LB", "http://www.bullgogi.com/", kensingtonAndChelsea, 51.50868087191573, -0.1996357897948266);
        bullgogi.getCuisines().add(Cuisine.KOREAN);
        restaurantRepository.save(bullgogi);

        Restaurant bigLolas = new Restaurant("Big Lola's Taqueria", "493 Smithdown Road", "L15 5AE", "https://biglolas.co.uk/", wavertree, 53.390099848417435, -2.9255602025424277);
        bullgogi.getCuisines().add(Cuisine.MEXICAN);
        restaurantRepository.save(bigLolas);


        Restaurant boneDaddiesSoho = new Restaurant("Bone Daddies Soho", "31 Peter Street", "W1F 0AR", "https://bonedaddies.com/", westminster, 51.51303243103601, -0.13385438794191476);
        boneDaddiesSoho.getCuisines().add(Cuisine.JAPANESE);
        restaurantRepository.save(boneDaddiesSoho);








    }
}
