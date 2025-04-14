package com.xworkz.override.runner;

import com.xworkz.override.external.*;
import com.xworkz.override.internal.*;

public class TypeCastingRunner {
    public static void main(String[] args) {
        TypeCasting typeCasting = new TypeCasting();

        // Casting Wizard and its subclass
        Wizard wizard = new Wizard();
        ElementalWizard elementalWizard = new ElementalWizard();

        typeCasting.castWizard(wizard);
        typeCasting.castWizard(elementalWizard);

        System.out.println("==================================");

        // Casting Submarine and its subclass
        Submarine submarine = new Submarine();
        DeepSeaExplorer deepSeaExplorer = new DeepSeaExplorer();

        typeCasting.castSubmarine(submarine);
        typeCasting.castSubmarine(deepSeaExplorer);

        System.out.println("==================================");

        // Casting Spacecraft and its subclass
        Spacecraft spacecraft = new Spacecraft();
        MarsRover marsRover = new MarsRover();

        typeCasting.castSpacecraft(spacecraft);
        typeCasting.castSpacecraft(marsRover);

        System.out.println("==================================");

        // Casting SecuritySystem and its subclass
        SecuritySystem securitySystem = new SecuritySystem();
        AICyberSecurity aiCyberSecurity = new AICyberSecurity();

        typeCasting.castSecuritySystem(securitySystem);
        typeCasting.castSecuritySystem(aiCyberSecurity);

        System.out.println("==================================");

        // Casting Theater and its subclass
        Theater theater = new Theater();
        IMAXTheater imaxTheater = new IMAXTheater();

        typeCasting.castTheater(theater);
        typeCasting.castTheater(imaxTheater);

        System.out.println("==================================");

        // Casting Croma9 and its subclass
        Croma9 croma9 = new Croma9();
        Land9 land9 = new Land9();

        typeCasting.castCroma9(croma9);
        typeCasting.castCroma9(land9);

        System.out.println("==================================");

        // Casting Animal and its subclass
        Animal animal = new Animal();
        Dog dog = new Dog();

        typeCasting.castAnimal(animal);
        typeCasting.castAnimal(dog);

        System.out.println("==================================");

        // Casting Building and its subclass
        Building building = new Building();
        Skyscraper skyscraper = new Skyscraper();

        typeCasting.castBuilding(building);
        typeCasting.castBuilding(skyscraper);

        System.out.println("==================================");

        // Casting Device and its subclass
        Device device = new Device();
        Smartphone smartphone = new Smartphone();

        typeCasting.castDevice(device);
        typeCasting.castDevice(smartphone);

        System.out.println("==================================");

        // Casting Bank and its subclass
        Bank bank = new Bank();
        OnlineBank onlineBank = new OnlineBank();

        typeCasting.castBank(bank);
        typeCasting.castBank(onlineBank);

        System.out.println("==================================");

        // Casting Transport and its subclass
        Transports transport = new Transports();
        Metro metro = new Metro();

        typeCasting.castTransport(transport);
        typeCasting.castTransport(metro);

        System.out.println("==================================");

        // Casting Game and its subclass
        Game game = new Game();
        VideoGame videoGame = new VideoGame();

        typeCasting.castGame(game);
        typeCasting.castGame(videoGame);

        System.out.println("==================================");

        // Casting Hospital and its subclass
        Hospital hospital = new Hospital();
        SpecialityHospital specialityHospital = new SpecialityHospital();

        typeCasting.castHospital(hospital);
        typeCasting.castHospital(specialityHospital);

        System.out.println("==================================");

        // Casting School and its subclass
        School school = new School();
        HighSchool highSchool = new HighSchool();

        typeCasting.castSchool(school);
        typeCasting.castSchool(highSchool);

        System.out.println("==================================");

        // Casting Restaurant and its subclass
        Restaurant restaurant = new Restaurant();
        FastFoodRestaurant fastFoodRestaurant = new FastFoodRestaurant();

        typeCasting.castRestaurant(restaurant);
        typeCasting.castRestaurant(fastFoodRestaurant);

        System.out.println("==================================");

        // Casting Instrument and its subclass
        Instrument instrument = new Instrument();
        Guitar guitar = new Guitar();

        typeCasting.castInstrument(instrument);
        typeCasting.castInstrument(guitar);

        System.out.println("==================================");

        // Casting Gym and its subclass
        Gym gym = new Gym();
        CrossfitGym crossfitGym = new CrossfitGym();

        typeCasting.castGym(gym);
        typeCasting.castGym(crossfitGym);

        System.out.println("==================================");

        // Casting Planet and its subclass
        Galaxy galaxy = new Galaxy();
        Planet planet = new Planet();

        typeCasting.castPlanet(galaxy);
        typeCasting.castPlanet(planet);

        System.out.println("==================================");

        // Casting Media and its subclass
        Media media = new Media();
        Video video = new Video();

        typeCasting.castMedia(media);
        typeCasting.castMedia(video);

        System.out.println("==================================");

        // Casting Experiment and its subclass
        Experiment experiment = new Experiment();
        ChemistryExperiment chemistryExperiment = new ChemistryExperiment();

        typeCasting.castExperiment(experiment);
        typeCasting.castExperiment(chemistryExperiment);

        System.out.println("==================================");

        // Casting Sport and its subclass
        Sport sport = new Sport();
        Cricket cricket = new Cricket();

        typeCasting.castSport(sport);
        typeCasting.castSport(cricket);

        System.out.println("==================================");

        // Casting WeatherStation and its subclass
        WeatherStation weatherStation = new WeatherStation();
        DigitalWeatherStation digitalWeatherStation = new DigitalWeatherStation();

        typeCasting.castWeatherStation(weatherStation);
        typeCasting.castWeatherStation(digitalWeatherStation);

        System.out.println("==================================");

        // Casting Transport and Train subclass
        Transport transport1 = new Transport();
        Train train = new Train();

        typeCasting.castTransport(transport1);
        typeCasting.castTransport(train);
    }
}
