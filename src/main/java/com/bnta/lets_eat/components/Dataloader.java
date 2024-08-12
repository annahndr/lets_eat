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

        Location glagsowCityCentre = new Location ("Glasgow", "City Centre");
        locationRepository.save(glagsowCityCentre);

        Location inverurie = new Location("Inverurie", "Town Centre");
        locationRepository.save(inverurie);

        Location liverpoolWavertree = new Location("Liverpool", "Wavertree");
        locationRepository.save(liverpoolWavertree);

        Location manchesterCityCentre = new Location("Manchester", "City Centre");
        locationRepository.save(manchesterCityCentre);

        Location birminghamBalsallHeath = new Location("Birmingham", "Balsall Heath");
        locationRepository.save(birminghamBalsallHeath);

        Location birminghamChineseQuarter = new Location("Birmingham", "Chinese Quarter");
        locationRepository.save(birminghamChineseQuarter);

        Location windsorTownCentre = new Location("Windsor", "Town Centre");
        locationRepository.save(windsorTownCentre);

        Location westminster = new Location("London", "Westminster");
        locationRepository.save(westminster);

        Location hackney = new Location("London", "Hackney");
        locationRepository.save(hackney);

        Location towerHamlets = new Location ("London", "Tower Hamlets");
        locationRepository.save(towerHamlets);

        Location kensingtonAndChelsea = new Location("London", "Kensington and Chelsea");
        locationRepository.save(kensingtonAndChelsea);

        Location camden = new Location("London", "Camden");
        locationRepository.save(camden);

        Location brent = new Location("London", "Brent");
        locationRepository.save(brent);


//        RESTAURANTS

        Restaurant oro = new Restaurant("Oro", "85 Kilmarnock Road", "G41 3YR",  "https://oro.restaurant/", shawlands,55.82848067622028, -4.283155686885101);
        oro.getCuisines().add(Cuisine.ITALIAN);
        oro.getCuisines().add(Cuisine.SCOTTISH);
        restaurantRepository.save(oro);

        Restaurant halloumiSouth = new Restaurant("Halloumi South", "697 Pollockshaws Road", "G41 2AB", "https://halloumiglasgow.co.uk/", shawlands, 55.83631038173913, -4.270213013722374);
        halloumiSouth.getCuisines().add(Cuisine.GREEK);
        restaurantRepository.save(halloumiSouth);

        Restaurant theBrunchClub = new Restaurant("The Brunch Club", "67 Old Dumbarton Road", "G3 8RF", "https://www.thebrunchclub.co/", glasgowWestEnd, 55.867491696125064, -4.293176500740617);
        theBrunchClub.getCuisines().add(Cuisine.BRUNCH);
        restaurantRepository.save(theBrunchClub);

        Restaurant nipponKitchen = new Restaurant("Nippon Kitchen", "91 West George Street", "G2 1PB", "http://nipponrestaurant.co.uk/", glagsowCityCentre, 55.862206104811186, -4.255168672861043);
        nipponKitchen.getCuisines().add(Cuisine.JAPANESE);
        restaurantRepository.save(nipponKitchen);

        Restaurant bigLolas = new Restaurant("Big Lola's Taqueria", "493 Smithdown Road", "L15 5AE", "https://biglolas.co.uk/", liverpoolWavertree, 53.390099848417435, -2.9255602025424277);
        bigLolas.getCuisines().add(Cuisine.MEXICAN);
        restaurantRepository.save(bigLolas);

        Restaurant rudysPizza = new Restaurant("Rudy's Pizza", "Peter Street", "M2 5QJ", "https://www.rudyspizza.co.uk/pizzerias/peterst", manchesterCityCentre, 53.47842331842055, -2.2474895790689655);
        rudysPizza.getCuisines().add(Cuisine.PIZZA);
        restaurantRepository.save(rudysPizza);

        Restaurant fargos = new Restaurant("Fargo's", "377 Ladypool Road", "B12 8LA", "http://www.fargosfresh.co.uk/", birminghamBalsallHeath, 52.45295183461756, -1.8789830376678671);
        fargos.getCuisines().add(Cuisine.BURGERS);
        fargos.getCuisines().add(Cuisine.PIZZA);
        restaurantRepository.save(fargos);

        Restaurant happyLambHotPotBirmingham = new Restaurant("Happy Lamb Hot Pot", "21 Ladywell Walk", "B5 4ST", "https://happylambuk.com/restaurants/birmingham/", birminghamChineseQuarter, 52.475159788534754, -1.8966440079643896);
        happyLambHotPotBirmingham.getCuisines().add(Cuisine.MONGOLIAN);
        restaurantRepository.save(happyLambHotPotBirmingham);

        Restaurant lazySundaeWindsor = new Restaurant("Lazy Sundae Windsor", "112 Peascod Street", "SL4 1DN", "https://www.instagram.com/lazysundaeuk/?hl=en", windsorTownCentre, 51.481711410545, -0.6101581296246342);
        lazySundaeWindsor.getCuisines().add(Cuisine.SWEET);
        restaurantRepository.save(lazySundaeWindsor);

        Restaurant rasaSayangSoho = new Restaurant("Rasa Sayang Soho", "5 Macclesfield Street", "W1D 6AY", "https://www.rasasayangfood.com/", westminster, 51.51221728426225, -0.13142491613083804);
        rasaSayangSoho.getCuisines().add(Cuisine.MALAYSIAN);
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

        Restaurant boneDaddiesSoho = new Restaurant("Bone Daddies Soho", "31 Peter Street", "W1F 0AR", "https://bonedaddies.com/", westminster, 51.51303243103601, -0.13385438794191476);
        boneDaddiesSoho.getCuisines().add(Cuisine.JAPANESE);
        restaurantRepository.save(boneDaddiesSoho);

        Restaurant humbleCrumnbleCamden = new Restaurant("Humble Crumble Camden", "Unit 739, Camden Market", "NW1 8AH", "https://www.humble-crumble.com/", camden, 51.54257526961926, -0.1481973203643318);
        humbleCrumnbleCamden.getCuisines().add(Cuisine.SWEET);
        restaurantRepository.save(humbleCrumnbleCamden);

        Restaurant chinChinLabsCamden = new Restaurant("Chin Chin Labs", "49-50 Camden Lock Place", "NW1 8AF", "https://www.chinchinicecream.com/", camden, 51.54145434460556, -0.1463242314730382);
        chinChinLabsCamden.getCuisines().add(Cuisine.SWEET);
        restaurantRepository.save(chinChinLabsCamden);

        Restaurant superStar = new Restaurant("SuperStar BBQ", "4 St Giles High Street", "WC2H 8AB", "https://www.superstarbbq.co.uk/", camden, 51.51587690882989, -0.1276293891461802);
        superStar.getCuisines().add(Cuisine.KOREAN);
        restaurantRepository.save(superStar);

        Restaurant lezziz = new Restaurant("Lezziz Charcoal Grill", "13 Walm Lane", "NW2 5SJ", "http://www.lezziz.co.uk/", brent, 51.54858338557935, -0.2232626773812744);
        lezziz.getCuisines().add(Cuisine.TURKISH);
        restaurantRepository.save(lezziz);

        Restaurant bancone = new Restaurant("Bancone Covent Garden", "39 William IV Street", "WC2N 4DD", "https://www.bancone.co.uk/", westminster, 51.50971969812324, -0.1263729161309642);
        bancone.getCuisines().add(Cuisine.ITALIAN);
        restaurantRepository.save(bancone);

        Restaurant rotiKing = new Restaurant("Roti King", "40 Doric Way", "NW1 1LH", "https://www.rotiking.com/", camden, 51.529269810897006, -0.1317596682474947);
        rotiKing.getCuisines().add(Cuisine.SINGAPOREAN);
        rotiKing.getCuisines().add(Cuisine.MALAYSIAN);
        restaurantRepository.save(rotiKing);

        Restaurant gopalsCornerVictoria = new Restaurant("Gopal's Corner Victoria", "Markethalls, 121 Victoria Street", "SW1E 5NE", "https://www.instagram.com/gopalscorner/?hl=en", westminster, 51.496560314928864, -0.14441286031125022);
        gopalsCornerVictoria.getCuisines().add(Cuisine.MALAYSIAN);
        gopalsCornerVictoria.getCuisines().add(Cuisine.SINGAPOREAN);
        restaurantRepository.save(gopalsCornerVictoria);

        Restaurant gordonHighlanderWetherspoons = new Restaurant("The Gordon Highlander", "W High Street", "AB51 3QQ", "https://www.jdwetherspoon.com/pubs/all-pubs/scotland/aberdeen/the-gordon-highlander-inverurie", inverurie, 57.284996342160724, -2.3796990138752268);
        gordonHighlanderWetherspoons.getCuisines().add(Cuisine.BRITISH);
        restaurantRepository.save(gordonHighlanderWetherspoons);

    }
}
