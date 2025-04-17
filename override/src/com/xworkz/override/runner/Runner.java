package com.xworkz.override.runner;

import com.xworkz.override.internal.*;

public class Runner {
    public static void main(String[] args) {
        Croma9 croma9=new Croma9("tata","madiwala");
        croma9.kormangala();

        Croma9 croma =new Land9();
        croma.kormangala();

        Land9 land9=new Land9();
        land9.fridge();
        land9.lap();

        Galaxy galaxy = new Galaxy("neptune",23456);
        galaxy.orbit();

        Planet planet = new Planet();
        planet.atmosphere();
        planet.life();

        Animal animal = new Animal("dog","brown");
        animal.makeSound();

        Dog dog = new Dog();
        dog.wagTail();
        dog.fetch();

        Vehicle vehicle = new Vehicle();
        vehicle.startEngine();

        Car car = new Car();
        car.playMusic();
        car.openSunroof();

        Device device = new Device("phone",25999);
        device.powerOn();

        Smartphone phone = new Smartphone();
        phone.takePhoto();
        phone.browseInternet();

        Course course = new Course("java",256);
        course.start();

        JavaCourse javaCourse = new JavaCourse();
        javaCourse.compileCode();
        javaCourse.runCode();

        Building building = new Building("skyscarper",5);
        building.construct();

        Skyscraper skyscraper = new Skyscraper();
        skyscraper.installElevator();
        skyscraper.addObservationDeck();

        Instrument instrument = new Instrument("guitar","vocal");
        instrument.play();

        Guitar guitar = new Guitar();
        guitar.tuneStrings();
        guitar.switchPickup();

        Experiment experiment = new Experiment("chemstry","laboratory");
        experiment.conduct();

        ChemistryExperiment chem = new ChemistryExperiment();
        chem.heatSample();
        chem.recordResults();

        Media media = new Media("video","mp4");
        media.play();

        Video video = new Video();
        video.pause();
        video.stop();

        Food food = new Food("pizza",199);
        food.prepare();

        Pizza pizza = new Pizza();
        pizza.addToppings();
        pizza.bake();

        Account account = new Account("savings account",12354674);
        account.displayBalance();

        SavingsAccount savings = new SavingsAccount();
        savings.deposit();
        savings.withdraw();

        Sport sport = new Sport();
        sport.play();

        Cricket cricket = new Cricket();
        cricket.bowl();
        cricket.bat();

        Transport transport = new Train();
        transport.move();

        Train train = new Train();
        train.announceStation();
        train.checkTickets();

        Application app = new Application("web application","vscode");
        app.launch();

        WebApplication webApp = new WebApplication();
        webApp.loadPage();
        webApp.handleRequest();

        Plant plant = new Plant("cactus","desert");
        plant.grow();

        Cactus cactus = new Cactus();
        cactus.storeWater();
        cactus.protectWithSpines();

        Entertainment entertainment = new Entertainment("movie","romcom");
        entertainment.enjoy();

        Movie movie = new Movie();
        movie.playTrailer();
        movie.showCredits();

        School school = new School();
        school.conductClass();

        HighSchool highSchool = new HighSchool();
        highSchool.organizeEvent();
        highSchool.assignHomework();

        Studio studio = new RecordingStudio();
        studio.produce();

        RecordingStudio recording = new RecordingStudio();
        recording.setupMicrophones();
        recording.mixAudio();

        Game game = new Game("video","mobile");
        game.start();

        VideoGame videoGame = new VideoGame();
        videoGame.saveProgress();
        videoGame.loadLevel();

        Kitchen kitchen = new Kitchen(500,"marble");
        kitchen.cook();

        ModernKitchen smartKitchen = new ModernKitchen();
        smartKitchen.autoClean();
        smartKitchen.controlWithApp();

        Transports transports = new Metro();
        transport.move();

        Metro metro = new Metro();
        metro.openDoors();
        metro.announceStops();

        Hospital hospital = new Hospital("kvg","sullia");
        hospital.treatPatient();

        SpecialityHospital speciality = new SpecialityHospital();
        speciality.performSurgery();
        speciality.runDiagnostics();

        Farm farm = new Farm("farsi","coffee");
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

        Bank bank = new Bank("canara",64675687);
        bank.processTransaction();

        OnlineBank online = new OnlineBank();
        online.checkBalance();
        online.transferFunds();

        Publisher publisher = new Publisher();
        publisher.publish();

        BookPublisher bookPub = new BookPublisher();
        bookPub.editManuscript();
        bookPub.designCover();

        Restaurant restaurant = new FastFoodRestaurant();
        restaurant.serveFood();

        FastFoodRestaurant fastFood = new FastFoodRestaurant();
        fastFood.takeDriveThruOrder();
        fastFood.prepareComboMeal();

        WeatherStation station = new DigitalWeatherStation();
        station.recordTemperature();

        DigitalWeatherStation digital = new DigitalWeatherStation();
        digital.displayHumidity();
        digital.sendAlert();

        DeliveryService service = new DeliveryService("banglore",543);
        service.deliverPackage();

        ExpressDelivery express = new ExpressDelivery();
        express.trackPackage();
        express.notifyCustomer();

        TigerReserve reserve = new TigerReserve();
        reserve.monitorTigers();
        reserve.conductSafari();

        Theatre theatre = new Multiplex();
        theatre.showMovie();

        Multiplex multiplex = new Multiplex();
        multiplex.offerSnacks();
        multiplex.reserveSeats();

        Gym gym = new Gym("crossfit",7);
        gym.workout();

        CrossfitGym crossfit = new CrossfitGym();
        crossfit.startTimer();
        crossfit.logPerformance();

        MythicalCreature creature = new Dragon();
        creature.usePower();

        Dragon dragon = new Dragon();
        dragon.guardTreasure();
        dragon.roar();

        TimeMachine machine = new QuantumTimeMachine();
        machine.travel();

        QuantumTimeMachine quantum = new QuantumTimeMachine();
        quantum.stabilizeWormhole();
        quantum.calibrateCoordinates();

        Theater theater = new IMAXTheater();
        theater.playMovie();

        IMAXTheater imax = new IMAXTheater();
        imax.enableSurroundSound();
        imax.adjustScreenSize();

        SecuritySystem system = new SecuritySystem("ai",465834);
        system.monitor();

        AICyberSecurity aiSystem = new AICyberSecurity();
        aiSystem.autoRespond();
        aiSystem.generateReport();

        Spacecraft craft = new MarsRover();
        craft.launch();

        MarsRover rover = new MarsRover();
        rover.collectSoilSample();
        rover.sendDataToEarth();

        Submarine sub = new DeepSeaExplorer();
        sub.dive();

        DeepSeaExplorer explorer = new DeepSeaExplorer();
        explorer.captureFootage();
        explorer.analyzePressure();

        Wizard wizard = new ElementalWizard();
        wizard.castSpell();

        ElementalWizard elemental = new ElementalWizard();
        elemental.summonFire();
        elemental.controlWind();














    }
}
