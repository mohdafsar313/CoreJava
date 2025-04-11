package com.xworkz.override.runner;

import com.xworkz.override.internal.*;

public class Runner {
    public static void main(String[] args) {
        Croma9 croma9=new Croma9();
        croma9.kormangala();

        Croma9 croma =new Land9();
        croma.kormangala();

        Land9 land9=new Land9();
        land9.fridge();
        land9.lap();

        Galaxy galaxy = new Planet();
        galaxy.orbit();

        Planet planet = new Planet();
        planet.atmosphere();
        planet.life();

        Animal animal = new Dog();
        animal.makeSound();

        Dog dog = new Dog();
        dog.wagTail();
        dog.fetch();

        Vehicle vehicle = new Car();
        vehicle.startEngine();

        Car car = new Car();
        car.playMusic();
        car.openSunroof();

        Device device = new Smartphone();
        device.powerOn();

        Smartphone phone = new Smartphone();
        phone.takePhoto();
        phone.browseInternet();

        Course course = new JavaCourse();
        course.start();

        JavaCourse javaCourse = new JavaCourse();
        javaCourse.compileCode();
        javaCourse.runCode();

        Building building = new Skyscraper();
        building.construct();

        Skyscraper skyscraper = new Skyscraper();
        skyscraper.installElevator();
        skyscraper.addObservationDeck();

        Instrument instrument = new Guitar();
        instrument.play();

        Guitar guitar = new Guitar();
        guitar.tuneStrings();
        guitar.switchPickup();

        Experiment experiment = new ChemistryExperiment();
        experiment.conduct();

        ChemistryExperiment chem = new ChemistryExperiment();
        chem.heatSample();
        chem.recordResults();

        Media media = new Video();
        media.play();

        Video video = new Video();
        video.pause();
        video.stop();

        Food food = new Pizza();
        food.prepare();

        Pizza pizza = new Pizza();
        pizza.addToppings();
        pizza.bake();

        Account account = new SavingsAccount();
        account.displayBalance();

        SavingsAccount savings = new SavingsAccount();
        savings.deposit();
        savings.withdraw();

        Sport sport = new Cricket();
        sport.play();

        Cricket cricket = new Cricket();
        cricket.bowl();
        cricket.bat();

        Transport transport = new Train();
        transport.move();

        Train train = new Train();
        train.announceStation();
        train.checkTickets();

        Application app = new WebApplication();
        app.launch();

        WebApplication webApp = new WebApplication();
        webApp.loadPage();
        webApp.handleRequest();

        Plant plant = new Cactus();
        plant.grow();

        Cactus cactus = new Cactus();
        cactus.storeWater();
        cactus.protectWithSpines();

        Entertainment entertainment = new Movie();
        entertainment.enjoy();

        Movie movie = new Movie();
        movie.playTrailer();
        movie.showCredits();

        School school = new HighSchool();
        school.conductClass();

        HighSchool highSchool = new HighSchool();
        highSchool.organizeEvent();
        highSchool.assignHomework();

        Studio studio = new RecordingStudio();
        studio.produce();

        RecordingStudio recording = new RecordingStudio();
        recording.setupMicrophones();
        recording.mixAudio();

        Game game = new VideoGame();
        game.start();

        VideoGame videoGame = new VideoGame();
        videoGame.saveProgress();
        videoGame.loadLevel();

        Kitchen kitchen = new ModernKitchen();
        kitchen.cook();

        ModernKitchen smartKitchen = new ModernKitchen();
        smartKitchen.autoClean();
        smartKitchen.controlWithApp();

        Transports transports = new Metro();
        transport.move();

        Metro metro = new Metro();
        metro.openDoors();
        metro.announceStops();

        Hospital hospital = new SpecialityHospital();
        hospital.treatPatient();

        SpecialityHospital speciality = new SpecialityHospital();
        speciality.performSurgery();
        speciality.runDiagnostics();

        Farm farm = new OrganicFarm();
        farm.growCrops();

        OrganicFarm organic = new OrganicFarm();
        organic.compost();
        organic.waterWithDrip();

        Robot robot = new ServiceRobot();
        robot.performTask();

        ServiceRobot bot = new ServiceRobot();
        bot.cleanRoom();
        bot.deliverItems();

        University university = new EngineeringCollege();
        university.conductExam();

        EngineeringCollege college = new EngineeringCollege();
        college.arrangeHackathon();
        college.offerInternships();

        SpaceAgency agency = new MarsMission();
        agency.launchMission();

        MarsMission mars = new MarsMission();
        mars.collectSoilSamples();
        mars.analyzeAtmosphere();


    }
}
