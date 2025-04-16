package com.xworkz.override.external;


import com.xworkz.override.internal.*;

public class TypeCasting {
    public TypeCasting(){
        System.out.println("no-arg constructor for UniversalCasting");
    }
    public void castWizard(Wizard wizard) {
        if (wizard != null) {
            wizard.castSpell();
            if (wizard instanceof ElementalWizard) {
                ElementalWizard ew = (ElementalWizard) wizard;
                ew.summonFire();
                ew.controlWind();
            }
        }
    }

    public void castSubmarine(Submarine submarine) {
        if (submarine != null) {
            submarine.dive();
            if (submarine instanceof DeepSeaExplorer) {
                DeepSeaExplorer explorer = (DeepSeaExplorer) submarine;
                explorer.captureFootage();
                explorer.analyzePressure();
            }
        }
    }

    public void castSpacecraft(Spacecraft spacecraft) {
        if (spacecraft != null) {
            spacecraft.launch();
            if (spacecraft instanceof MarsRover) {
                MarsRover rover = (MarsRover) spacecraft;
                rover.collectSoilSample();
                rover.sendDataToEarth();
            }
        }
    }

    public void castSecuritySystem(SecuritySystem system) {
        if (system != null) {
            system.monitor();
            if (system instanceof AICyberSecurity) {
                AICyberSecurity ai = (AICyberSecurity) system;
                ai.autoRespond();
                ai.generateReport();
            }
        }
    }

    public void castTheater(Theater theater) {
        if (theater != null) {
            theater.playMovie();
            if (theater instanceof IMAXTheater) {
                IMAXTheater imax = (IMAXTheater) theater;
                imax.enableSurroundSound();
                imax.adjustScreenSize();
            }
        }
    }

    public void castCroma9(Croma9 croma) {
        if (croma != null) {
            croma.kormangala();
            if (croma instanceof Land9) {
                Land9 land = (Land9) croma;
                land.fridge();
                land.lap();
            }
        }
    }

    public void castAnimal(Animal animal) {
        if (animal != null) {
            animal.makeSound();
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.fetch();
                dog.wagTail();
            }
        }
    }

    public void castBuilding(Building building) {
        if (building != null) {
            building.construct();
            if (building instanceof Skyscraper) {
                Skyscraper sky = (Skyscraper) building;
                sky.construct();
                sky.addObservationDeck();
            }
        }
    }

    public void castDevice(Device device) {
        if (device != null) {
            device.powerOn();
            if (device instanceof Smartphone) {
                Smartphone phone = (Smartphone) device;
                phone.browseInternet();
            }
        }
    }


    public void castBank(Bank bank) {
        if (bank != null) {
            bank.processTransaction();
            if (bank instanceof OnlineBank) {
                OnlineBank ob = (OnlineBank) bank;
                ob.transferFunds();

            }
        }
    }

    public void castTransport(Transports transports) {
        if (transports != null) {
            transports.move();
            if (transports instanceof Metro) {
                Metro metro = (Metro) transports;
                metro.move();
                metro.openDoors();
            }
        }
    }
    public void castGame(Game game) {
        if (game != null) {
            game.start();
            if (game instanceof VideoGame) {
                VideoGame vg = (VideoGame) game;
                vg.loadLevel();
                vg.saveProgress();
            }
        }
    }



    public void castHospital(Hospital hospital) {
        if (hospital != null) {
            hospital.treatPatient();
            if (hospital instanceof SpecialityHospital) {
                SpecialityHospital msh = (SpecialityHospital) hospital;
                msh.performSurgery();
                msh.runDiagnostics();
            }
        }
    }

    public void castSchool(School school) {
        if (school != null) {
            school.conductClass();
            if (school instanceof HighSchool) {
                HighSchool os = (HighSchool) school;
                os.conductClass();
                os.assignHomework();
            }
        }
    }

    public void castRestaurant(Restaurant restaurant) {
        if (restaurant != null) {
            restaurant.serveFood();
            if (restaurant instanceof FastFoodRestaurant) {
                FastFoodRestaurant ck = (FastFoodRestaurant) restaurant;
                ck.serveFood();
                ck.prepareComboMeal();
            }
        }
    }

    public void castInstrument(Instrument instrument) {
        if (instrument != null) {
            instrument.play();
            if (instrument instanceof Guitar) {
                Guitar guitar = (Guitar) instrument;
                guitar.play();
                guitar.switchPickup();
            }
        }
    }

    public void castGym(Gym gym) {
        if (gym != null) {
            gym.workout();
            if (gym instanceof CrossfitGym) {
                CrossfitGym crossfit = (CrossfitGym) gym;
                crossfit.workout();
                crossfit.logPerformance();
            }
        }
    }



    public void castCroma(Croma9 croma) {
        if (croma != null) {
            croma.kormangala();
            if (croma instanceof Land9) {
                Land9 land = (Land9) croma;
                land.fridge();
                land.lap();
            }
        }
    }
    public void castPlanet(Galaxy galaxy) {
        if (galaxy != null) {
            galaxy.orbit();
            if (galaxy instanceof Planet) {
                Planet earth = (Planet) galaxy;
                earth.atmosphere();
                earth.life();
            }
        }
    }


    public void castMedia(Media media) {
        if (media != null) {
            media.play();
            if (media instanceof Video) {
                Video news = (Video) media;
                news.pause();
                news.stop();
            }
        }
    }



    public void castExperiment(Experiment experiment) {
        if (experiment != null) {
            experiment.conduct();
            if (experiment instanceof ChemistryExperiment) {
                ChemistryExperiment ch = (ChemistryExperiment) experiment;
                ch.conduct();
                ch.heatSample();
            }
        }
    }

    public void castSport(Sport sport) {
        if (sport != null) {
            sport.play();
            if (sport instanceof Cricket) {
                Cricket ck= (Cricket) sport;
                ck.bat();
                ck.bowl();
            }
        }
    }

    public void castWeatherStation(WeatherStation weatherStation) {
        if (weatherStation != null) {
            weatherStation.recordTemperature();
            if (weatherStation instanceof DigitalWeatherStation) {
                DigitalWeatherStation dws = (DigitalWeatherStation) weatherStation;
                dws.displayHumidity();
                dws.recordTemperature();
            }
        }
    }
    public void castTransport(Transport transport) {
        if (transport != null) {
            transport.move();
            if (transport instanceof Train) {
                Train tain = (Train) transport;
                tain.announceStation();
                tain.checkTickets();
            }
        }
    }

    public void castPublisher(Publisher publisher) {
        if (publisher != null) {
            publisher.publish();
            if (publisher instanceof BookPublisher) {
                BookPublisher book = (BookPublisher) publisher;
                book.designCover();
                book.publish();
            }
        }
    }
    public void castTimeMachine(TimeMachine timeMachine) {
        if (timeMachine != null) {
            timeMachine.travel();
            if (timeMachine instanceof QuantumTimeMachine) {
                QuantumTimeMachine time = (QuantumTimeMachine) timeMachine;
                time.calibrateCoordinates();
                time.travel();
            }
        }
    }

    public void castApplication(Application application) {
        if (application != null) {
            application.launch();
            if (application instanceof WebApplication) {
                WebApplication app = (WebApplication) application;
                app.launch();
                app.loadPage();
            }
        }
    }
    public void castStudio(Studio studio) {
        if (studio != null) {
            studio.produce();
            if (studio instanceof RecordingStudio) {
                RecordingStudio rec = (RecordingStudio) studio;
                rec.mixAudio();
                rec.setupMicrophones();
            }
        }
    }
    public void castFood(Food food) {
        if (food != null) {
            food.prepare();
            if (food instanceof Pizza) {
                Pizza pizza = (Pizza) food;
                pizza.addToppings();
                pizza.bake();
            }
        }
    }




}


