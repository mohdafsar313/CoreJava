package com.xworkz.object.runner;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.xworkz.object.internal.*;

public class ObjectRunner {
    public static void main(String[] args) {

        Pen pen1 = new Pen("doms", 20, "ball", "plastic");
        Pen pen2 = new Pen("oracle", 15, "gel", "metal");
        Pen pen3 = new Pen("doms", 20, "ball", "plastic");

        boolean isSame = pen1.equals(pen3);
        boolean notMatch = pen3.equals(pen2);
        System.out.println("pen1 and pen3 match: " + isSame);
        System.out.println("pen1 and pen2 match: " + notMatch);
        System.out.println("==========================================================");
        Leaf leaf1 = new Leaf("Oval", "Green", "Mango", 5.5);
        Leaf leaf2 = new Leaf("Round", "Dark Green", "Peepal", 6.2);
        Leaf leaf3 = new Leaf("Oval", "Green", "Mango", 5.5);

        boolean Same = leaf1.equals(leaf3);
        boolean notSame = leaf2.equals(leaf1);

        System.out.println("leaf1 and leaf3 match: " + Same);
        System.out.println("leaf1 and leaf2 match: " + notSame);
        System.out.println("==========================================================");

        Paper paper1 = new Paper("A4", "White", "Printer", 0.1);
        Paper paper2 = new Paper("A3", "White", "Drawing", 0.2);
        Paper paper3 = new Paper("A4", "White", "Printer", 0.1);

        boolean Similar = paper1.equals(paper3);
        boolean notsimilar = paper1.equals(paper2);

        System.out.println("paper1 and paper3 match: " + Similar);
        System.out.println("paper1 and paper2 match: " + notsimilar);
        System.out.println("==========================================================");
        Fan fan1 = new Fan("Usha", "Ceiling", 5, true);
        Fan fan2 = new Fan("Havells", "Table", 3, false);
        Fan fan3 = new Fan("Usha", "Ceiling", 5, true);

        boolean fans = fan1.equals(fan3);
        boolean fann = fan1.equals(fan2);

        System.out.println("fan1 and fan3 match: " + fans);
        System.out.println("fan1 and fan2 match: " + fann);
        System.out.println("==========================================================");
        Baloon balloon1 = new Baloon("Red", 30.0, "Rubber", true);
        Baloon balloon2 = new Baloon("Blue", 25.0, "Latex", false);
        Baloon balloon3 = new Baloon("Red", 30.0, "Rubber", true);

        boolean balloons = balloon1.equals(balloon3);
        boolean balloonn = balloon1.equals(balloon2);

        System.out.println("balloon1 and balloon3 match: " + balloons);
        System.out.println("balloon1 and balloon2 match: " + balloonn);
        System.out.println("==========================================================");

        Rock rock1 = new Rock("Granite", 5.5, "Grey", true);
        Rock rock2 = new Rock("Limestone", 6.0, "Yellow", false);
        Rock rock3 = new Rock("Granite", 5.5, "Grey", true);

        boolean rocks = rock1.equals(rock3);
        boolean rockn = rock1.equals(rock2);

        System.out.println("rock1 and rock3 match: " + rocks);
        System.out.println("rock1 and rock2 match: " + rockn);
        System.out.println("==========================================================");

        Button button1 = new Button("Round", "Red", 15, true);
        Button button2 = new Button("Square", "Black", 20, false);
        Button button3 = new Button("Round", "Red", 15, true);

        boolean buttons = button1.equals(button3);
        boolean buttonn = button1.equals(button2);

        System.out.println("button1 and button3 match: " + buttons);
        System.out.println("button1 and button2 match: " + buttonn);
        System.out.println("==========================================================");

        Spoon spoon1 = new Spoon("Steel", "Silver", 15.5, false);
        Spoon spoon2 = new Spoon("Plastic", "White", 12.0, true);
        Spoon spoon3 = new Spoon("Steel", "Silver", 15.5, false);

        boolean spoons = spoon1.equals(spoon3);
        boolean spoonn = spoon1.equals(spoon2);

        System.out.println("spoon1 and spoon3 match: " + spoons);
        System.out.println("spoon1 and spoon2 match: " + spoonn);

        Cup cup1 = new Cup("Ceramic", "White", 250.0, true);
        Cup cup2 = new Cup("Glass", "Transparent", 200.0, false);
        Cup cup3 = new Cup("Ceramic", "White", 250.0, true);

        boolean cups = cup1.equals(cup3);
        boolean cupn = cup1.equals(cup2);

        System.out.println("cup1 and cup3 match: " + cups);
        System.out.println("cup1 and cup2 match: " + cupn);

        Plate plate1 = new Plate("Ceramic", "Round", 28.0, "White");
        Plate plate2 = new Plate("Steel", "Square", 25.0, "Silver");
        Plate plate3 = new Plate("Ceramic", "Round", 28.0, "White");

        boolean plates = plate1.equals(plate3);
        boolean platen = plate1.equals(plate2);

        System.out.println("plate1 and plate3 match: " + plates);
        System.out.println("plate1 and plate2 match: " + platen);

        Eraser eraser1 = new Eraser("Natraj", "White", "Rectangular", true);
        Eraser eraser2 = new Eraser("Apsara", "Pink", "Oval", false);
        Eraser eraser3 = new Eraser("Natraj", "White", "Rectangular", true);

        boolean erasers = eraser1.equals(eraser3);
        boolean erasern = eraser1.equals(eraser2);

        System.out.println("eraser1 and eraser3 match: " + erasers);
        System.out.println("eraser1 and eraser2 match: " + erasern);

        Ball ball1 = new Ball("Red", "Rubber", 7.5, true);
        Ball ball2 = new Ball("Blue", "Plastic", 6.0, false);
        Ball ball3 = new Ball("Red", "Rubber", 7.5, true);

        boolean balls = ball1.equals(ball3);
        boolean balln = ball1.equals(ball2);

        System.out.println("ball1 and ball3 match: " + balls);
        System.out.println("ball1 and ball2 match: " + balln);
        Feather feather1 = new Feather("White", 12.5, "Swan", true);
        Feather feather2 = new Feather("Brown", 9.0, "Owl", false);
        Feather feather3 = new Feather("White", 12.5, "Swan", true);

        boolean ferathers = feather1.equals(feather3);
        boolean ferathern = feather1.equals(feather2);

        System.out.println("feather1 and feather3 match: " + ferathers);
        System.out.println("feather1 and feather2 match: " + ferathern);
        Marble marble1 = new Marble("Green", "Glass", 2.5, true);
        Marble marble2 = new Marble("Blue", "Plastic", 2.0, false);
        Marble marble3 = new Marble("Green", "Glass", 2.5, true);

        boolean marbles = marble1.equals(marble3);
        boolean marblen = marble1.equals(marble2);

        System.out.println("marble1 and marble3 match: " + marbles);
        System.out.println("marble1 and marble2 match: " + marblen);
        Cap cap1 = new Cap("Black", "M", "Cotton", true);
        Cap cap2 = new Cap("Red", "L", "Polyester", false);
        Cap cap3 = new Cap("Black", "M", "Cotton", true);

        boolean caps = cap1.equals(cap3);
        boolean capn = cap1.equals(cap2);

        System.out.println("cap1 and cap3 match: " + caps);
        System.out.println("cap1 and cap2 match: " + capn);

        Box box1 = new Box("Brown", "Cardboard", 30.5, true);
        Box box2 = new Box("White", "Plastic", 20.0, false);
        Box box3 = new Box("Brown", "Cardboard", 30.5, true);

        boolean boxs = box1.equals(box3);
        boolean boxn = box1.equals(box2);

        System.out.println("box1 and box3 match: " + boxs);
        System.out.println("box1 and box2 match: " + boxn);

        Coin coin1 = new Coin("India", 2000, 5.0, "Steel");
        Coin coin2 = new Coin("USA", 1995, 1.0, "Copper");
        Coin coin3 = new Coin("India", 2000, 5.0, "Steel");

        boolean coins = coin1.equals(coin3);
        boolean coinn = coin1.equals(coin2);

        System.out.println("coin1 and coin3 match: " + coins);
        System.out.println("coin1 and coin2 match: " + coinn);
        Key key1 = new Key("Steel", 5.0, "House", false);
        Key key2 = new Key("Brass", 6.0, "Car", true);
        Key key3 = new Key("Steel", 5.0, "House", false);

        boolean keys = key1.equals(key3);
        boolean keyn = key1.equals(key2);

        System.out.println("key1 and key3 match: " + keys);
        System.out.println("key1 and key2 match: " + keyn);
        Ring ring1 = new Ring("Gold", 6.5, "Diamond", true);
        Ring ring2 = new Ring("Silver", 7.0, "Emerald", false);
        Ring ring3 = new Ring("Gold", 6.5, "Diamond", true);

        boolean rings = ring1.equals(ring3);
        boolean ringn = ring1.equals(ring2);

        System.out.println("ring1 and ring3 match: " + rings);
        System.out.println("ring1 and ring2 match: " + ringn);
        Comb comb1 = new Comb("Plastic", 20, 6.0, true);
        Comb comb2 = new Comb("Wood", 15, 7.5, false);
        Comb comb3 = new Comb("Plastic", 20, 6.0, true);

        boolean combs = comb1.equals(comb3);
        boolean combn = comb1.equals(comb2);

        System.out.println("comb1 and comb3 match: " + combs);
        System.out.println("comb1 and comb2 match: " + combn);
        Brush brush1 = new Brush("Plastic", 150, 8.0, true);
        Brush brush2 = new Brush("Wood", 120, 7.5, false);
        Brush brush3 = new Brush("Plastic", 150, 8.0, true);

        boolean brushes = brush1.equals(brush3);
        boolean brushn = brush1.equals(brush2);

        System.out.println("brush1 and brush3 match: " + brushes);
        System.out.println("brush1 and brush2 match: " + brushn);
        Rope rope1 = new Rope("Nylon", 15.0, 5, true);
        Rope rope2 = new Rope("Cotton", 10.0, 4, false);
        Rope rope3 = new Rope("Nylon", 15.0, 5, true);

        boolean ropes = rope1.equals(rope3);
        boolean ropen= rope1.equals(rope2);

        System.out.println("rope1 and rope3 match: " + ropes);
        System.out.println("rope1 and rope2 match: " + ropen);
        Kite kite1 = new Kite("Red", 5.0, "Paper", true);
        Kite kite2 = new Kite("Blue", 4.5, "Plastic", false);
        Kite kite3 = new Kite("Red", 5.0, "Paper", true);

        boolean kites = kite1.equals(kite3);
        boolean kiten = kite1.equals(kite2);

        System.out.println("kite1 and kite3 match: " + kites);
        System.out.println("kite1 and kite2 match: " + kiten);
        Stick stick1 = new Stick("Wood", 2.5, "Walking Stick", true);
        Stick stick2 = new Stick("Bamboo", 3.0, "Decorative", false);
        Stick stick3 = new Stick("Wood", 2.5, "Walking Stick", true);

        boolean sticks = stick1.equals(stick3);
        boolean stickn = stick1.equals(stick2);

        System.out.println("stick1 and stick3 match: " + sticks);
        System.out.println("stick1 and stick2 match: " + stickn);
        Sand sand1 = new Sand("Golden", 0.5, false, "Beach");
        Sand sand2 = new Sand("White", 0.3, true, "Desert");
        Sand sand3 = new Sand("Golden", 0.5, false, "Beach");

        boolean sands = sand1.equals(sand3);
        boolean sandn = sand1.equals(sand2);

        System.out.println("sand1 and sand3 match: " + sands);
        System.out.println("sand1 and sand2 match: " + sandn);
        Soap soap1=new Soap();
        soap1.setSoap("red","bodywash","jasmin",50);
        Soap soap2=new Soap();
        soap2.setSoap("pink","bodywash","lotus",59);
        Soap soap3=new Soap();
        soap3.setSoap("red","bodywash","jasmin",50);
        boolean soaps = sand1.equals(sand3);
        boolean soapn = sand1.equals(sand2);

        System.out.println("soap1 and soap3 match: " + soaps);
        System.out.println("soap1 and soap2 match: " + soapn);
        Mug mug1 = new Mug();
        mug1.setMug("Blue", "Ceramic", 350.0, 120);

        Mug mug2 = new Mug();
        mug2.setMug("White", "Plastic", 300.0, 100);

        Mug mug3 = new Mug();
        mug3.setMug("Blue", "Ceramic", 350.0, 120);

        boolean mugs = mug1.equals(mug3);
        boolean mugn = mug1.equals(mug2);

        System.out.println("mug1 and mug3 match: " + mugs);
        System.out.println("mug1 and mug2 match: " + mugn);
        Jar jar1 = new Jar();
        jar1.setJar("Glass", "Round", 750.0, 200);

        Jar jar2 = new Jar();
        jar2.setJar("Plastic", "Square", 500.0, 150);

        Jar jar3 = new Jar();
        jar3.setJar("Glass", "Round", 750.0, 200);

        boolean jars = jar1.equals(jar3);
        boolean jarn = jar1.equals(jar2);

        System.out.println("jar1 and jar3 match: " + jars);
        System.out.println("jar1 and jar2 match: " + jarn);
        Mat mat1 = new Mat();
        mat1.setMat("Cotton", "Blue", 6.0, 4.0);

        Mat mat2 = new Mat();
        mat2.setMat("Plastic", "Red", 5.0, 3.0);

        Mat mat3 = new Mat();
        mat3.setMat("Cotton", "Blue", 6.0, 4.0);

        boolean mats = mat1.equals(mat3);
        boolean matn = mat1.equals(mat2);

        System.out.println("mat1 and mat3 match: " + mats);
        System.out.println("mat1 and mat2 match: " + matn);
        Lid lid1 = new Lid();
        lid1.setLid("Round", "Plastic", 7.5, true);

        Lid lid2 = new Lid();
        lid2.setLid("Square", "Metal", 6.0, false);

        Lid lid3 = new Lid();
        lid3.setLid("Round", "Plastic", 7.5, true);

        boolean lids = lid1.equals(lid3);
        boolean lidn = lid1.equals(lid2);

        System.out.println("lid1 and lid3 match: " + lids);
        System.out.println("lid1 and lid2 match: " + lidn);
        Candle candle1 = new Candle();
        candle1.setCandle("Red", "Rose", 5.0, 120);

        Candle candle2 = new Candle();
        candle2.setCandle("White", "Lavender", 6.0, 150);

        Candle candle3 = new Candle();
        candle3.setCandle("Red", "Rose", 5.0, 120);

        boolean candles = candle1.equals(candle3);
        boolean candlen = candle1.equals(candle2);

        System.out.println("candle1 and candle3 match: " + candles);
        System.out.println("candle1 and candle2 match: " + candlen);
        Hanger hanger1 = new Hanger();
        hanger1.setHanger("Plastic", "Black", true, 5);

        Hanger hanger2 = new Hanger();
        hanger2.setHanger("Wood", "Brown", false, 10);

        Hanger hanger3 = new Hanger();
        hanger3.setHanger("Plastic", "Black", true, 5);

        boolean hangers = hanger1.equals(hanger3);
        boolean hangern = hanger1.equals(hanger2);

        System.out.println("hanger1 and hanger3 match: " + hangers);
        System.out.println("hanger1 and hanger2 match: " + hangern);
        Napkin napkin1 = new Napkin();
        napkin1.setNapkin("Cotton", "White", "Medium", false);

        Napkin napkin2 = new Napkin();
        napkin2.setNapkin("Paper", "White", "Medium", true);

        Napkin napkin3 = new Napkin();
        napkin3.setNapkin("Cotton", "White", "Medium", false);

        boolean napkins = napkin1.equals(napkin3);
        boolean napkinn = napkin1.equals(napkin2);

        System.out.println("napkin1 and napkin3 match: " + napkins);
        System.out.println("napkin1 and napkin2 match: " + napkinn);
        Toothpick pick1 = new Toothpick();
        pick1.setToothpick("Wood", 6.5, false, 100);

        Toothpick pick2 = new Toothpick();
        pick2.setToothpick("Plastic", 7.0, true, 50);

        Toothpick pick3 = new Toothpick();
        pick3.setToothpick("Wood", 6.5, false, 100);

        boolean pickMatch = pick1.equals(pick3);
        boolean pickNoMatch = pick1.equals(pick2);

        System.out.println("pick1 and pick3 match: " + pickMatch);
        System.out.println("pick1 and pick2 match: " + pickNoMatch);
        Pillow pillow1 = new Pillow();
        pillow1.setPillow("Cotton", "Medium", "White", true);

        Pillow pillow2 = new Pillow();
        pillow2.setPillow("Foam", "Large", "Blue", false);

        Pillow pillow3 = new Pillow();
        pillow3.setPillow("Cotton", "Medium", "White", true);

        boolean pillowMatch = pillow1.equals(pillow3);
        boolean pillowNoMatch = pillow1.equals(pillow2);

        System.out.println("pillow1 and pillow3 match: " + pillowMatch);
        System.out.println("pillow1 and pillow2 match: " + pillowNoMatch);
        Shell shell1 = new Shell();
        shell1.setShell("Conch", "White", 7.5, true);

        Shell shell2 = new Shell();
        shell2.setShell("Spiral", "Brown", 6.0, false);

        Shell shell3 = new Shell();
        shell3.setShell("Conch", "White", 7.5, true);

        boolean shellMatch = shell1.equals(shell3);
        boolean shellNoMatch = shell1.equals(shell2);

        System.out.println("shell1 and shell3 match: " + shellMatch);
        System.out.println("shell1 and shell2 match: " + shellNoMatch);
        Crayon crayon1 = new Crayon();
        crayon1.setCrayon("Red", "Crayola", 7.5, true);

        Crayon crayon2 = new Crayon();
        crayon2.setCrayon("Blue", "Faber-Castell", 8.0, true);

        Crayon crayon3 = new Crayon();
        crayon3.setCrayon("Red", "Crayola", 7.5, true);

        boolean crayonMatch = crayon1.equals(crayon3);
        boolean crayonNoMatch = crayon1.equals(crayon2);

        System.out.println("crayon1 and crayon3 match: " + crayonMatch);
        System.out.println("crayon1 and crayon2 match: " + crayonNoMatch);
        Bell bell1 = new Bell();
        bell1.setBell("Brass", 12.5, "Golden", true);

        Bell bell2 = new Bell();
        bell2.setBell("Steel", 10.0, "Silver", false);

        Bell bell3 = new Bell();
        bell3.setBell("Brass", 12.5, "Golden", true);

        boolean bellMatch = bell1.equals(bell3);
        boolean bellNoMatch = bell1.equals(bell2);

        System.out.println("bell1 and bell3 match: " + bellMatch);
        System.out.println("bell1 and bell2 match: " + bellNoMatch);
        MyString myString1 = new MyString();
        myString1.setString("Hello", 5, "UTF-8", false);

        MyString myString2 = new MyString();
        myString2.setString("World", 5, "UTF-16", false);

        MyString myString3 = new MyString();
        myString3.setString("Hello", 5, "UTF-8", false);

        boolean stringMatch = myString1.equals(myString3);
        boolean stringNoMatch = myString1.equals(myString2);

        System.out.println("myString1 and myString3 match: " + stringMatch);
        System.out.println("myString1 and myString2 match: " + stringNoMatch);
        Sock sock1 = new Sock();
        sock1.setSock("Red", "Medium", "Cotton", true);

        Sock sock2 = new Sock();
        sock2.setSock("Blue", "Large", "Wool", false);

        Sock sock3 = new Sock();
        sock3.setSock("Red", "Medium", "Cotton", true);

        boolean sockMatch = sock1.equals(sock3);
        boolean sockNoMatch = sock1.equals(sock2);

        System.out.println("sock1 and sock3 match: " + sockMatch);
        System.out.println("sock1 and sock2 match: " + sockNoMatch);
        Bubble bubble1 = new Bubble();
        bubble1.setBubble("Blue", 5.0, "Soap", true);

        Bubble bubble2 = new Bubble();
        bubble2.setBubble("Red", 4.5, "Gum", false);

        Bubble bubble3 = new Bubble();
        bubble3.setBubble("Blue", 5.0, "Soap", true);

        boolean bubbleMatch = bubble1.equals(bubble3);
        boolean bubbleNoMatch = bubble1.equals(bubble2);

        System.out.println("bubble1 and bubble3 match: " + bubbleMatch);
        System.out.println("bubble1 and bubble2 match: " + bubbleNoMatch);
        ToyCar toyCar1 = new ToyCar();
        toyCar1.setToyCar("Red", "SportsCar", 150, true);

        ToyCar toyCar2 = new ToyCar();
        toyCar2.setToyCar("Blue", "Truck", 100, false);

        ToyCar toyCar3 = new ToyCar();
        toyCar3.setToyCar("Red", "SportsCar", 150, true);

        boolean toyCarMatch = toyCar1.equals(toyCar3);
        boolean toyCarNoMatch = toyCar1.equals(toyCar2);

        System.out.println("toyCar1 and toyCar3 match: " + toyCarMatch);
        System.out.println("toyCar1 and toyCar2 match: " + toyCarNoMatch);
        ToyTrain toyTrain1 = new ToyTrain();
        toyTrain1.setToyTrain("Green", "Passenger", 6, true);

        ToyTrain toyTrain2 = new ToyTrain();
        toyTrain2.setToyTrain("Red", "Cargo", 4, false);

        ToyTrain toyTrain3 = new ToyTrain();
        toyTrain3.setToyTrain("Green", "Passenger", 6, true);

        boolean toyTrainMatch = toyTrain1.equals(toyTrain3);
        boolean toyTrainNoMatch = toyTrain1.equals(toyTrain2);

        System.out.println("toyTrain1 and toyTrain3 match: " + toyTrainMatch);
        System.out.println("toyTrain1 and toyTrain2 match: " + toyTrainNoMatch);
        Tape tape1 = new Tape();
        tape1.setTape("Black", 5.0, "Duct", true);

        Tape tape2 = new Tape();
        tape2.setTape("Yellow", 10.0, "Masking", false);

        Tape tape3 = new Tape();
        tape3.setTape("Black", 5.0, "Duct", true);

        boolean tapeMatch = tape1.equals(tape3);
        boolean tapeNoMatch = tape1.equals(tape2);

        System.out.println("tape1 and tape3 match: " + tapeMatch);
        System.out.println("tape1 and tape2 match: " + tapeNoMatch);
        Straw straw1 = new Straw();
        straw1.setStraw("Red", 20.0, "Plastic", false);

        Straw straw2 = new Straw();
        straw2.setStraw("Green", 25.0, "Paper", true);

        Straw straw3 = new Straw();
        straw3.setStraw("Red", 20.0, "Plastic", false);

        boolean strawMatch = straw1.equals(straw3);
        boolean strawNoMatch = straw1.equals(straw2);

        System.out.println("straw1 and straw3 match: " + strawMatch);
        System.out.println("straw1 and straw2 match: " + strawNoMatch);
        Tissue tissue1 = new Tissue();
        tissue1.setTissue("White", 100, "Paper", false);

        Tissue tissue2 = new Tissue();
        tissue2.setTissue("Pink", 50, "Cotton", true);

        Tissue tissue3 = new Tissue();
        tissue3.setTissue("White", 100, "Paper", false);

        boolean tissueMatch = tissue1.equals(tissue3);
        boolean tissueNoMatch = tissue1.equals(tissue2);

        System.out.println("tissue1 and tissue3 match: " + tissueMatch);
        System.out.println("tissue1 and tissue2 match: " + tissueNoMatch);
        Sticker sticker1 = new Sticker();
        sticker1.setSticker("Sunflower", "Yellow", "Vinyl", 5.0);

        Sticker sticker2 = new Sticker();
        sticker2.setSticker("Star", "Blue", "Paper", 4.0);

        Sticker sticker3 = new Sticker();
        sticker3.setSticker("Sunflower", "Yellow", "Vinyl", 5.0);

        boolean stickerMatch = sticker1.equals(sticker3);
        boolean stickerNoMatch = sticker1.equals(sticker2);

        System.out.println("sticker1 and sticker3 match: " + stickerMatch);
        System.out.println("sticker1 and sticker2 match: " + stickerNoMatch);
        Leaflet leaflet1 = new Leaflet();
        leaflet1.setLeaflet("Discount Offers", "Amazing discounts on products!", "Green", 4);

        Leaflet leaflet2 = new Leaflet();
        leaflet2.setLeaflet("New Arrivals", "Check out the latest collection!", "Blue", 6);

        Leaflet leaflet3 = new Leaflet();
        leaflet3.setLeaflet("Discount Offers", "Amazing discounts on products!", "Green", 4);

        boolean leafletMatch = leaflet1.equals(leaflet3);
        boolean leafletNoMatch = leaflet1.equals(leaflet2);

        System.out.println("leaflet1 and leaflet3 match: " + leafletMatch);
        System.out.println("leaflet1 and leaflet2 match: " + leafletNoMatch);
        Hat hat1 = new Hat();
        hat1.setHat("Red", "Medium", "Cotton", "Baseball");

        Hat hat2 = new Hat();
        hat2.setHat("Blue", "Large", "Wool", "Fedora");

        Hat hat3 = new Hat();
        hat3.setHat("Red", "Medium", "Cotton", "Baseball");

        boolean hatMatch = hat1.equals(hat3);
        boolean hatNoMatch = hat1.equals(hat2);

        System.out.println("hat1 and hat3 match: " + hatMatch);
        System.out.println("hat1 and hat2 match: " + hatNoMatch);
        Clip clip1 = new Clip();
        clip1.setClip("Metal", "Silver", 50, true);

        Clip clip2 = new Clip();
        clip2.setClip("Plastic", "Black", 40, false);

        Clip clip3 = new Clip();
        clip3.setClip("Metal", "Silver", 50, true);

        boolean clipMatch = clip1.equals(clip3);
        boolean clipNoMatch = clip1.equals(clip2);

        System.out.println("clip1 and clip3 match: " + clipMatch);
        System.out.println("clip1 and clip2 match: " + clipNoMatch);
        Fork fork1 = new Fork();
        fork1.setFork("Stainless Steel", "Silver", 15, true);

        Fork fork2 = new Fork();
        fork2.setFork("Plastic", "Red", 12, false);

        Fork fork3 = new Fork();
        fork3.setFork("Stainless Steel", "Silver", 15, true);

        boolean forkMatch = fork1.equals(fork3);
        boolean forkNoMatch = fork1.equals(fork2);

        System.out.println("fork1 and fork3 match: " + forkMatch);
        System.out.println("fork1 and fork2 match: " + forkNoMatch);














    }
}
