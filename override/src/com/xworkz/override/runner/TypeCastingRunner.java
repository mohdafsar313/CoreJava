package com.xworkz.override.runner;

import com.xworkz.override.external.*;
import com.xworkz.override.internal.*;

public class TypeCastingRunner {
    public static void main(String[] args) {
        TypeCasting typeCasting = new TypeCasting();

        Wizard wizard = new Wizard();
        ElementalWizard elementalWizard = new ElementalWizard();

        typeCasting.castWizard(wizard);
        typeCasting.castWizard(elementalWizard);

        System.out.println("==================================");

        Submarine submarine = new Submarine();
        DeepSeaExplorer deepSeaExplorer = new DeepSeaExplorer();

        typeCasting.castSubmarine(submarine);
        typeCasting.castSubmarine(deepSeaExplorer);

        System.out.println("==================================");

        Spacecraft spacecraft = new Spacecraft();
        MarsRover marsRover = new MarsRover();

        typeCasting.castSpacecraft(spacecraft);
        typeCasting.castSpacecraft(marsRover);

        System.out.println("==================================");

        SecuritySystem securitySystem = new SecuritySystem("cyber",123);
        AICyberSecurity aiCyberSecurity = new AICyberSecurity();


        Theater theater = new Theater();
        IMAXTheater imaxTheater = new IMAXTheater();

        typeCasting.castTheater(theater);
        typeCasting.castTheater(imaxTheater);

        System.out.println("==================================");

        Croma9 croma9 = new Croma9();
        Land9 land9 = new Land9();

        typeCasting.castCroma9(croma9);
        typeCasting.castCroma9(land9);

        System.out.println("==================================");

        Animal animal = new Animal();
        Dog dog = new Dog();

        typeCasting.castAnimal(animal);
        typeCasting.castAnimal(dog);

        System.out.println("==================================");

        Building building = new Building();
        Skyscraper skyscraper = new Skyscraper();

        typeCasting.castBuilding(building);
        typeCasting.castBuilding(skyscraper);

        System.out.println("==================================");

        Device device = new Device();
        Smartphone smartphone = new Smartphone();

        typeCasting.castDevice(device);
        typeCasting.castDevice(smartphone);

        System.out.println("==================================");

        Bank bank = new Bank();
        OnlineBank onlineBank = new OnlineBank();

        typeCasting.castBank(bank);
        typeCasting.castBank(onlineBank);

        System.out.println("==================================");

        Transports transport = new Transports();
        Metro metro = new Metro();

        typeCasting.castTransport(transport);
        typeCasting.castTransport(metro);

        System.out.println("==================================");

        Game game = new Game();
        VideoGame videoGame = new VideoGame();

        typeCasting.castGame(game);
        typeCasting.castGame(videoGame);

        System.out.println("==================================");

        Hospital hospital = new Hospital();
        SpecialityHospital specialityHospital = new SpecialityHospital();

        typeCasting.castHospital(hospital);
        typeCasting.castHospital(specialityHospital);

        System.out.println("==================================");

        School school = new School();
        HighSchool highSchool = new HighSchool();

        typeCasting.castSchool(school);
        typeCasting.castSchool(highSchool);

        System.out.println("==================================");

        Restaurant restaurant = new Restaurant();
        FastFoodRestaurant fastFoodRestaurant = new FastFoodRestaurant();

        typeCasting.castRestaurant(restaurant);
        typeCasting.castRestaurant(fastFoodRestaurant);

        System.out.println("==================================");

        Instrument instrument = new Instrument();
        Guitar guitar = new Guitar();

        typeCasting.castInstrument(instrument);
        typeCasting.castInstrument(guitar);

        System.out.println("==================================");

        Gym gym = new Gym();
        CrossfitGym crossfitGym = new CrossfitGym();

        typeCasting.castGym(gym);
        typeCasting.castGym(crossfitGym);

        System.out.println("==================================");

        Galaxy galaxy = new Galaxy();
        Planet planet = new Planet();

        typeCasting.castPlanet(galaxy);
        typeCasting.castPlanet(planet);

        System.out.println("==================================");

        Media media = new Media();
        Video video = new Video();

        typeCasting.castMedia(media);
        typeCasting.castMedia(video);

        System.out.println("==================================");

        Experiment experiment = new Experiment();
        ChemistryExperiment chemistryExperiment = new ChemistryExperiment();

        typeCasting.castExperiment(experiment);
        typeCasting.castExperiment(chemistryExperiment);

        System.out.println("==================================");

        Sport sport = new Sport();
        Cricket cricket = new Cricket();

        typeCasting.castSport(sport);
        typeCasting.castSport(cricket);

        System.out.println("==================================");

        WeatherStation weatherStation = new WeatherStation();
        DigitalWeatherStation digitalWeatherStation = new DigitalWeatherStation();

        typeCasting.castWeatherStation(weatherStation);
        typeCasting.castWeatherStation(digitalWeatherStation);

        System.out.println("==================================");

        Transport transport1 = new Transport();
        Train train = new Train();

        typeCasting.castTransport(transport1);
        typeCasting.castTransport(train);

        System.out.println("==== Publisher ====");
        Publisher publisher = new Publisher();
        BookPublisher bookPublisher = new BookPublisher();
        typeCasting.castPublisher(publisher);
        typeCasting.castPublisher(bookPublisher);
        System.out.println("====================");

        System.out.println("==== TimeMachine ====");
        TimeMachine timeMachine = new TimeMachine();
        QuantumTimeMachine quantumTimeMachine = new QuantumTimeMachine();
        typeCasting.castTimeMachine(timeMachine);
        typeCasting.castTimeMachine(quantumTimeMachine);
        System.out.println("====================");

        System.out.println("==== Application ====");
        Application application = new Application();
        WebApplication webApplication = new WebApplication();
        typeCasting.castApplication(application);
        typeCasting.castApplication(webApplication);
        System.out.println("====================");

        System.out.println("==== Studio ====");
        Studio studio = new Studio();
        RecordingStudio recordingStudio = new RecordingStudio();
        typeCasting.castStudio(studio);
        typeCasting.castStudio(recordingStudio);
        System.out.println("====================");

        System.out.println("==== Food ====");
        Food food = new Food();
        Pizza pizza = new Pizza();
        typeCasting.castFood(food);
        typeCasting.castFood(pizza);
        System.out.println("====================");


    }
}
