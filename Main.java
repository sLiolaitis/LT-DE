package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
// addded just a commented line
// randomaizeris kad nekartotu skaiciu

    // double enter problema

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println(ANSI_GREEN + "SVEIKI!" + ANSI_RESET);
        System.out.println("Pasirinkite kalbos lygį: \n 1.  A1\n 2.  A2\n 3.  B1");

        int kalbosLygis = scan.nextInt();

        switch (kalbosLygis) {
            case 1:




                ArrayList<Integer> randomai = new ArrayList<Integer>();

                ArrayList<String> pakartojimuiLT = new ArrayList<String>();
                ArrayList<String> pakartojimuiDE = new ArrayList<String>();
                com.company.Lt a1 = new com.company.Lt("A1");
                com.company.De A1 = new com.company.De("A1");

                A1.pridetiZodi("die Einrichtung"); // yra
                A1.pridetiZodi("die Pflanze"); // yra
                A1.pridetiZodi("das Nahrungsmittel"); // yra
                A1.pridetiZodi("die Mahlzeiten"); // yra
                A1.pridetiZodi("die Dienstleistungen"); // nera
                A1.pridetiZodi("das Geschlecht");
                A1.pridetiZodi("persönliche Beziehungen");
                A1.pridetiZodi("die Staatsangehörigkeit");
                A1.pridetiZodi("die Herkunft");
                A1.pridetiZodi("die Gewohnheit");
                A1.pridetiZodi("der Tagesablauf");
                A1.pridetiZodi("das Aussehen");
                A1.pridetiZodi("die Einrichtung");
                A1.pridetiZodi("wohnungswechsel");
                A1.pridetiZodi("abfahren");
                A1.pridetiZodi("die Abfahrt");
                A1.pridetiZodi("abgeben");
                A1.pridetiZodi("abholen");
                A1.pridetiZodi("der Absender");
                A1.pridetiZodi("anbieten");
                A1.pridetiZodi("das Angebot");
                A1.pridetiZodi("anklicken");
                A1.pridetiZodi("die Ankunft");
                A1.pridetiZodi("ankreuzen");
                A1.pridetiZodi("anmachen");
                A1.pridetiZodi("sich anmelden");
                A1.pridetiZodi("der Beantworter");
                A1.pridetiZodi("die Ansage");
                A1.pridetiZodi("der Anschluss");
                A1.pridetiZodi("die Anzeige");
                A1.pridetiZodi("anziehen");
                A1.pridetiZodi("die Aufgabe");
                A1.pridetiZodi("aufhören");
                A1.pridetiZodi("auf sein");
                A1.pridetiZodi("der Aufzug");
                A1.pridetiZodi("der Ausflug");
                A1.pridetiZodi("die Auskunft");
                A1.pridetiZodi("ausmachen");
                A1.pridetiZodi("die Aussage");
                A1.pridetiZodi("das Aussehen");
                A1.pridetiZodi("aussteigen");
                A1.pridetiZodi("der Ausweis");
                A1.pridetiZodi("sich ausziehen");
                A1.pridetiZodi("die Bahn");
                A1.pridetiZodi("der Bahnhof");
                A1.pridetiZodi("der Bahnsteig");
                A1.pridetiZodi("bald");
                A1.pridetiZodi("die Bar");
                A1.pridetiZodi("der Bauch");
                A1.pridetiZodi("der Beamter");
                A1.pridetiZodi("bedeuten");
                A1.pridetiZodi("bei");
                A1.pridetiZodi("besichtigen");
                A1.pridetiZodi("bestellen");
                A1.pridetiZodi("besuchen");
                A1.pridetiZodi("billig");
                A1.pridetiZodi("die Birne");
                A1.pridetiZodi("bitter");
                A1.pridetiZodi("der Bleistift");
                A1.pridetiZodi("der Blick");
                A1.pridetiZodi("der Bogen");
                A1.pridetiZodi("breit");
                A1.pridetiZodi("die Briefmarke");
                A1.pridetiZodi("der Buchstabe");
                A1.pridetiZodi("buchstabieren");
                A1.pridetiZodi("circa / ca.");
                A1.pridetiZodi("daneben");
                A1.pridetiZodi("dauern");
                A1.pridetiZodi("denn");
                A1.pridetiZodi("draußen");
                A1.pridetiZodi("die Durchsage");
                A1.pridetiZodi("eilig");
                A1.pridetiZodi("einfach");
                A1.pridetiZodi("der Eingang");
                A1.pridetiZodi("einladen");
                A1.pridetiZodi("die Einladung");
                A1.pridetiZodi("einmal");
                A1.pridetiZodi("einsteigen");
                A1.pridetiZodi("der Eintritt");
                A1.pridetiZodi("der Empfänger");
                A1.pridetiZodi("empfehlen");
                A1.pridetiZodi("das Ergebnis");
                A1.pridetiZodi("erlauben");
                A1.pridetiZodi("erzählen");
                A1.pridetiZodi("euer");
                A1.pridetiZodi("die Fahrkarte");
                A1.pridetiZodi("der Familienstand");
                A1.pridetiZodi("die Feier");
                A1.pridetiZodi("fehlen");
                A1.pridetiZodi("der Fehler");
                A1.pridetiZodi("das Fieber");
                A1.pridetiZodi("fremd");
                A1.pridetiZodi("sich freuen");
                A1.pridetiZodi("die Führung");
                A1.pridetiZodi("der Gast");
                A1.pridetiZodi("das Gepäck");
                A1.pridetiZodi("gerade");
                A1.pridetiZodi("geradeaus");
                A1.pridetiZodi("das Geschäft");
                A1.pridetiZodi("das Gespräch");
                A1.pridetiZodi("gestorben");
                A1.pridetiZodi("das Gewicht");
                A1.pridetiZodi("gleich");
                A1.pridetiZodi("der Grad");
                A1.pridetiZodi("grillen");
                A1.pridetiZodi("gültig");
                A1.pridetiZodi("günstig");
                A1.pridetiZodi("die Halbpension");
                A1.pridetiZodi("halten");
                A1.pridetiZodi("die Haltestelle");
                A1.pridetiZodi("die Heimat");
                A1.pridetiZodi("hell");
                A1.pridetiZodi("der Herd");
                A1.pridetiZodi("hinten");
                A1.pridetiZodi("holen");
                A1.pridetiZodi("kennenlernen");
                A1.pridetiZodi("der Koffer");
                A1.pridetiZodi("der Kollege");
                A1.pridetiZodi("kriegen");
                A1.pridetiZodi("der Kugelschreiber");
                A1.pridetiZodi("der Kühlschrank");
                A1.pridetiZodi("sich kümmern");
                A1.pridetiZodi("der Kunde");
                A1.pridetiZodi("lachen");
                A1.pridetiZodi("der Laden");
                A1.pridetiZodi("das Land");
                A1.pridetiZodi("leicht");
                A1.pridetiZodi("leise");
                A1.pridetiZodi("das Lied");
                A1.pridetiZodi("der Lastkraftwagen");
                A1.pridetiZodi("die Lösung");
                A1.pridetiZodi("das Meer");
                A1.pridetiZodi("müde");
                A1.pridetiZodi("die Praxis");
                A1.pridetiZodi("die Prüfung");
                A1.pridetiZodi("reparieren");
                A1.pridetiZodi("riechen");
                A1.pridetiZodi("das Schild");
                A1.pridetiZodi("der Schluss");
                A1.pridetiZodi("der See");
                A1.pridetiZodi("der Stock");
                A1.pridetiZodi("die Straßenbahn");
                A1.pridetiZodi("tot");
                A1.pridetiZodi("überweisen");
                A1.pridetiZodi("umziehen");
                A1.pridetiZodi("unten");
                A1.pridetiZodi("verboten");
                A1.pridetiZodi("verdienen");
                A1.pridetiZodi("der Verein");
                A1.pridetiZodi("die Vorwahl");
                A1.pridetiZodi("wandern");
                A1.pridetiZodi("weiblich");
                A1.pridetiZodi("weit");
                A1.pridetiZodi("wiederholen");
                A1.pridetiZodi("zurzeit");
                A1.pridetiZodi("zufrieden");
                A1.pridetiZodi("verbringen");
                A1.pridetiZodi("spazieren");
                A1.pridetiZodi("tätigkeiten");
                A1.pridetiZodi("entwickeln");
                A1.pridetiZodi("bedienen");
                A1.pridetiZodi("untersuchen");
                A1.pridetiZodi("unterrichten");
                A1.pridetiZodi("die Tätigkeiten");
                A1.pridetiZodi("erfahren");
                A1.pridetiZodi("die Besprechung");
                A1.pridetiZodi("die Vorlesung");
                A1.pridetiZodi("ausgehen ");
                A1.pridetiZodi("ergänzen");
                A1.pridetiZodi("dringend ");
                A1.pridetiZodi("der Begriff");
                A1.pridetiZodi("die Getreideprodukte");
                A1.pridetiZodi("die Backwaren");
                A1.pridetiZodi("die Ampel");
                A1.pridetiZodi("verweilen");
                A1.pridetiZodi("die Gaststätte");
                A1.pridetiZodi("der Feinschmecker");
                A1.pridetiZodi("der Bericht");
                A1.pridetiZodi("der Monteur");
                A1.pridetiZodi("das Studentenleben");
                A1.pridetiZodi("der Studentenwohnheim");
                A1.pridetiZodi("die Studiengebühr");
                A1.pridetiZodi("der Jura");
                A1.pridetiZodi("einen Vortrag halten");
                A1.pridetiZodi("der Lesesaal");
                A1.pridetiZodi("ausleihen");
                A1.pridetiZodi("die Mensa");
                A1.pridetiZodi("der Hörsaal");
                A1.pridetiZodi("überhaupt");
                A1.pridetiZodi("öffentlichen");
                A1.pridetiZodi("einchecken");
                A1.pridetiZodi("das Gleis");
                A1.pridetiZodi("check-in-Schalter");
                A1.pridetiZodi("der Flugsteig");
                A1.pridetiZodi("neblig");
                A1.pridetiZodi("die Hitze");
                A1.pridetiZodi("die Postkarte");
                A1.pridetiZodi("zuordnen");
                A1.pridetiZodi("besonderes");
                A1.pridetiZodi("der Anzug");
                A1.pridetiZodi("der Pullover");
                A1.pridetiZodi("der Mantel ");
                A1.pridetiZodi("anprobieren");
                A1.pridetiZodi("umtauschen");
                A1.pridetiZodi("das Bargeld");
                A1.pridetiZodi("preiswert");
                A1.pridetiZodi("vereinbaren");
                A1.pridetiZodi("übersetzen");
                A1.pridetiZodi("die Halsschmerzen");
                A1.pridetiZodi("schnupfen");
                A1.pridetiZodi("husten");
                A1.pridetiZodi("das Hemd");
                A1.pridetiZodi("Sport treiben");
                A1.pridetiZodi("freizeittrends");
                A1.pridetiZodi("unternehmen");
                A1.pridetiZodi("die Haushalte");
                A1.pridetiZodi("der Vorteil");
                A1.pridetiZodi("der Nachteil");
                A1.pridetiZodi("der Fahrstuhl");
                A1.pridetiZodi("die Gegend");
                A1.pridetiZodi("die Wohngemeinschaft");
                A1.pridetiZodi("das Geschir");
                A1.pridetiZodi("die Regel");
                A1.pridetiZodi("zusammengesetzt");
                A1.pridetiZodi("die Einweihungsparty");
                A1.pridetiZodi("einige");
                A1.pridetiZodi("der Chefarzt");
                A1.pridetiZodi("die Beförderung");
                A1.pridetiZodi("die Vergangenheit");
                A1.pridetiZodi("sammeln");
                A1.pridetiZodi("die Amtssprache");
                A1.pridetiZodi("die Gegenteile");
                A1.pridetiZodi("die Kantine");
                A1.pridetiZodi("der Aufenthalt");
                A1.pridetiZodi("das Zimmerausstattung");
                A1.pridetiZodi("der Wortschatz");
                A1.pridetiZodi("die Gurke");
                A1.pridetiZodi("die Erdbeere");
                A1.pridetiZodi("der Sahnekuchen");
                A1.pridetiZodi("die Praline");
                A1.pridetiZodi("die Erbse");
                A1.pridetiZodi("die Reihe");
                A1.pridetiZodi("das Vollkornbrot");
                A1.pridetiZodi("die Leberwurst");
                A1.pridetiZodi("der Gemüsehändler");
                A1.pridetiZodi("die Weintraube");
                A1.pridetiZodi("das Erfrischungsgetränk");
                A1.pridetiZodi("das Betrieb");
                A1.pridetiZodi("die Spitze");
                A1.pridetiZodi("das Abendbrot");
                A1.pridetiZodi("schälen");
                A1.pridetiZodi("parken verboten");
                A1.pridetiZodi("die Prospekte");
                A1.pridetiZodi("begrüßen");
                A1.pridetiZodi("erwarten");
                A1.pridetiZodi("stürmisch");
                A1.pridetiZodi("der Sturm");
                A1.pridetiZodi("die Turnschuhe");
                A1.pridetiZodi("das Schaufenster");
                A1.pridetiZodi("der Fähre");
                A1.pridetiZodi("der Gegenstand");
                A1.pridetiZodi("der Spiegel");
                A1.pridetiZodi("der Rechtsanwalt");
                A1.pridetiZodi("die Querstraße");
                A1.pridetiZodi("abbiegen");
                A1.pridetiZodi("die Kreuzung");
                A1.pridetiZodi("das Lebensmittelgeschäft");
                A1.pridetiZodi("der Blumenstrauß");
                A1.pridetiZodi("der Ratschlag");
                A1.pridetiZodi("der Po");
                A1.pridetiZodi("das Handgelenk");
                A1.pridetiZodi("Der Kater");
                A1.pridetiZodi("die Silbe");
                A1.pridetiZodi("die Anweisungen");
                A1.pridetiZodi("die Kanne");
                A1.pridetiZodi("die Untertasse");
                A1.pridetiZodi("die Seife");
                A1.pridetiZodi("das Besteck");
                A1.pridetiZodi("satt");
                A1.pridetiZodi("der Blumenkohl");
                A1.pridetiZodi("das gebratene Hammel");
                A1.pridetiZodi("das Gewürz");
                A1.pridetiZodi("der Weißkraut");
                A1.pridetiZodi("das Mehl");
                A1.pridetiZodi("schenken");
                A1.pridetiZodi("das Trinkgeld");
                A1.pridetiZodi("der Knochen");
                A1.pridetiZodi("der Wasserhahn");
                A1.pridetiZodi("verwenden");
                A1.pridetiZodi("das Geräusch");
                A1.pridetiZodi("das Gemälde");
                A1.pridetiZodi("das Gewitter");
                A1.pridetiZodi("der Wecker");
                A1.pridetiZodi("schminken");
                A1.pridetiZodi("tauchen");
                A1.pridetiZodi("die Zahnbürste");
                A1.pridetiZodi("speichern");
                A1.pridetiZodi("beeilen");
                A1.pridetiZodi("verlieren");
                A1.pridetiZodi("springen");
                A1.pridetiZodi("die Pute");
                A1.pridetiZodi("entscheiden");


                a1.pridetiZodi("įranga");
                a1.pridetiZodi("augalas");
                a1.pridetiZodi("maistas");
                a1.pridetiZodi("maitinimas");
                a1.pridetiZodi("paslaugos");
                a1.pridetiZodi("lytis");
                a1.pridetiZodi("asmeniniai santykiai");
                a1.pridetiZodi("tautybė");
                a1.pridetiZodi("kilmė");
                a1.pridetiZodi("įprotis");
                a1.pridetiZodi("kasdienybė");
                a1.pridetiZodi("išvaizda");
                a1.pridetiZodi("įrengimas / paslaugos");
                a1.pridetiZodi("persikraustymas / namo pakeitimas");
                a1.pridetiZodi("išvykti");
                a1.pridetiZodi("išvykimas");
                a1.pridetiZodi("atiduoti");
                a1.pridetiZodi("paimti / pakelti");
                a1.pridetiZodi("išsiuntėjas");
                a1.pridetiZodi("siūlyti");
                a1.pridetiZodi("pasiūlymas");
                a1.pridetiZodi("spustelti (pelyte)");
                a1.pridetiZodi("atvykimas");
                a1.pridetiZodi("patikrinti / užbraukti");
                a1.pridetiZodi("įjungti");
                a1.pridetiZodi("užsiregistruoti");
                a1.pridetiZodi("atsakiklis");
                a1.pridetiZodi("skelbimas");
                a1.pridetiZodi("jungtis / ryšys");
                a1.pridetiZodi("reklama");
                a1.pridetiZodi("pritraukti");
                a1.pridetiZodi("užduotis");
                a1.pridetiZodi("sustabdyti / sustoti");
                a1.pridetiZodi("būti atsikėlusiam");
                a1.pridetiZodi("liftas");
                a1.pridetiZodi("ekskursija");
                a1.pridetiZodi("informacija");
                a1.pridetiZodi("išjungti");
                a1.pridetiZodi("teiginys / pareiškimas");
                a1.pridetiZodi("išvaizda");
                a1.pridetiZodi("išeiti / išlipti");
                a1.pridetiZodi("asmens dokumentas");
                a1.pridetiZodi("nusirengti");
                a1.pridetiZodi("traukinys");
                a1.pridetiZodi("traukinių stotis");
                a1.pridetiZodi("platforma");
                a1.pridetiZodi("greitai");
                a1.pridetiZodi("baras / grynieji pinigai");
                a1.pridetiZodi("pilvukas");
                a1.pridetiZodi("pareigūnas");
                a1.pridetiZodi("reikšti");
                a1.pridetiZodi("pas / šalia / prie");
                a1.pridetiZodi("aplankyti");
                a1.pridetiZodi("užsakyti");
                a1.pridetiZodi("aplankyti");
                a1.pridetiZodi("pigus");
                a1.pridetiZodi("kriaušė");
                a1.pridetiZodi("kartus (skonis)");
                a1.pridetiZodi("pieštukas");
                a1.pridetiZodi("vaizdas (pro langą / balkoną)");
                a1.pridetiZodi("lankas");
                a1.pridetiZodi("platus");
                a1.pridetiZodi("antspaudas / pašto ženklas");
                a1.pridetiZodi("raidė");
                a1.pridetiZodi("pasakyti paraidžiui");
                a1.pridetiZodi("maždaug");
                a1.pridetiZodi("netoliese");
                a1.pridetiZodi("trukti");
                a1.pridetiZodi("todėl nes");
                a1.pridetiZodi("lauke");
                a1.pridetiZodi("skelbimas");
                a1.pridetiZodi("skubėti");
                a1.pridetiZodi("paprastas / tiesiog");
                a1.pridetiZodi("įėjimas");
                a1.pridetiZodi("pakviesti");
                a1.pridetiZodi("pakvietimas");
                a1.pridetiZodi("kartas");
                a1.pridetiZodi("įlipti");
                a1.pridetiZodi("įėjimas (pvz. į klubą)");
                a1.pridetiZodi("gavėjas");
                a1.pridetiZodi("rekomenduoti");
                a1.pridetiZodi("rezultatas / diagnozė");
                a1.pridetiZodi("leisti");
                a1.pridetiZodi("pasakyti / papasakoti");
                a1.pridetiZodi("jūsų");
                a1.pridetiZodi("bilietas");
                a1.pridetiZodi("šeimyninė padėtis");
                a1.pridetiZodi("šventimas");
                a1.pridetiZodi("nebuvimas");
                a1.pridetiZodi("klaida");
                a1.pridetiZodi("karštis (sergant)");
                a1.pridetiZodi("nepažįstamasis / atvykėlis");
                a1.pridetiZodi("laukiančiai džiaugtis");
                a1.pridetiZodi("vadovybė");
                a1.pridetiZodi("svečias");
                a1.pridetiZodi("lagaminas");
                a1.pridetiZodi("tiesiog");
                a1.pridetiZodi("tiesiai");
                a1.pridetiZodi("verslas / parduotuvė");
                a1.pridetiZodi("pokalbis");
                a1.pridetiZodi("mirė");
                a1.pridetiZodi("svoris");
                a1.pridetiZodi("lygus");
                a1.pridetiZodi("laipsnis");
                a1.pridetiZodi("kepti ant grotelių");
                a1.pridetiZodi("galiojantis");
                a1.pridetiZodi("pigus / palankus");
                a1.pridetiZodi("pusė maitinimo");
                a1.pridetiZodi("stoti / pasilaikyti (apie traukinį)");
                a1.pridetiZodi("stotelė");
                a1.pridetiZodi("gimtinė");
                a1.pridetiZodi("šviesu");
                a1.pridetiZodi("viryklė");
                a1.pridetiZodi("už");
                a1.pridetiZodi("gauti / paimti (to get)");
                a1.pridetiZodi("susipažinti");
                a1.pridetiZodi("lagaminas");
                a1.pridetiZodi("kolega");
                a1.pridetiZodi("gauti užmokestį");
                a1.pridetiZodi("tušinukas");
                a1.pridetiZodi("šaldytuvas");
                a1.pridetiZodi("pasirūpinti");
                a1.pridetiZodi("klientas");
                a1.pridetiZodi("juoktis");
                a1.pridetiZodi("parduotuvė");
                a1.pridetiZodi("šalis");
                a1.pridetiZodi("lengvas");
                a1.pridetiZodi("tyliai");
                a1.pridetiZodi("daina");
                a1.pridetiZodi("sunkvežimis");
                a1.pridetiZodi("sprendimas");
                a1.pridetiZodi("jūra");
                a1.pridetiZodi("pavargęs");
                a1.pridetiZodi("praktika");
                a1.pridetiZodi("egzaminas");
                a1.pridetiZodi("remontuoti");
                a1.pridetiZodi("kvepėti");
                a1.pridetiZodi("skydas");
                a1.pridetiZodi("išvada / pabaiga");
                a1.pridetiZodi("ežeras");
                a1.pridetiZodi("aukštas (pastato)");
                a1.pridetiZodi("tramvajus");
                a1.pridetiZodi("miręs");
                a1.pridetiZodi("pinigų pervedimas");
                a1.pridetiZodi("pasitraukti / persikraustyti");
                a1.pridetiZodi("žemiau");
                a1.pridetiZodi("uždraustas");
                a1.pridetiZodi("uždirbti / nusipelnyti");
                a1.pridetiZodi("asociacija");
                a1.pridetiZodi("vietovės kodas");
                a1.pridetiZodi("vaikščioti");
                a1.pridetiZodi("moteriškas");
                a1.pridetiZodi("toli");
                a1.pridetiZodi("pakartoti");
                a1.pridetiZodi("šiuo metu");
                a1.pridetiZodi("patenkintas");
                a1.pridetiZodi("praleisti laiką");
                a1.pridetiZodi("pasivaikščioti");
                a1.pridetiZodi("veikla");
                a1.pridetiZodi("kurti / plėtoti");
                a1.pridetiZodi("aptarnauti");
                a1.pridetiZodi("ištirti");
                a1.pridetiZodi("mokyti");
                a1.pridetiZodi("veikla (activities)");
                a1.pridetiZodi("išsiaišikinti");
                a1.pridetiZodi("susitikimas / diskusija");
                a1.pridetiZodi("paskaita");
                a1.pridetiZodi("išeiti lauk / pavykti");
                a1.pridetiZodi("užpildyti / papildyti");
                a1.pridetiZodi("primygtina / skubu / būtina");
                a1.pridetiZodi("terminas");
                a1.pridetiZodi("grudų produktai");
                a1.pridetiZodi("kepiniai");
                a1.pridetiZodi("šviesaforas");
                a1.pridetiZodi("užgaišti");
                a1.pridetiZodi("restoranas / baras");
                a1.pridetiZodi("gurmanas");
                a1.pridetiZodi("ataskaita");
                a1.pridetiZodi("montuotojas");
                a1.pridetiZodi("studentų gyvenimas");
                a1.pridetiZodi("bendrabutis");
                a1.pridetiZodi("mokestis už mokslą");
                a1.pridetiZodi("teisė");
                a1.pridetiZodi("vesti paskaitą");
                a1.pridetiZodi("skaitykla");
                a1.pridetiZodi("skolintis");
                a1.pridetiZodi("kavinė");
                a1.pridetiZodi("paskaitų salė");
                a1.pridetiZodi("visai / visiškai");
                a1.pridetiZodi("visuomeninis / viešas / atviras");
                a1.pridetiZodi("užsiregistruoti (check in)");
                a1.pridetiZodi("platforma / bėgiai");
                a1.pridetiZodi("registracijos staliukas");
                a1.pridetiZodi("vartai");
                a1.pridetiZodi("ūkanotas");
                a1.pridetiZodi("šiluma / karštis");
                a1.pridetiZodi("atvirukas");
                a1.pridetiZodi("priskirti");
                a1.pridetiZodi("specialu / išskirtina");
                a1.pridetiZodi("kostiumas");
                a1.pridetiZodi("megztinis");
                a1.pridetiZodi("paltas");
                a1.pridetiZodi("pasimatuoti (drabužį)");
                a1.pridetiZodi("išmainyti / iškeisti");
                a1.pridetiZodi("grynieji pinigai");
                a1.pridetiZodi("nebrangus");
                a1.pridetiZodi("susitarti");
                a1.pridetiZodi("išversti");
                a1.pridetiZodi("gerklės skausmas");
                a1.pridetiZodi("sloguoti");
                a1.pridetiZodi("kosėti");
                a1.pridetiZodi("marškiniai");
                a1.pridetiZodi("sportuoti");
                a1.pridetiZodi("laisvalaikio tendencijos");
                a1.pridetiZodi("kažką veikti");
                a1.pridetiZodi("namų ūkis");
                a1.pridetiZodi("privalumas");
                a1.pridetiZodi("trūkumas");
                a1.pridetiZodi("liftas");
                a1.pridetiZodi("vietinė aplinka / kaiminystė");
                a1.pridetiZodi("dalinamoji gyvenamoji vieta");
                a1.pridetiZodi("indai");
                a1.pridetiZodi("taisyklė");
                a1.pridetiZodi("sudėtinis");
                a1.pridetiZodi("inauguracijos vakarėlis");
                a1.pridetiZodi("šiek tiek");
                a1.pridetiZodi("vyriausiasis gydytojas");
                a1.pridetiZodi("paaukštinimas");
                a1.pridetiZodi("praeitis");
                a1.pridetiZodi("rinkti / kolekcionuoti");
                a1.pridetiZodi("oficiali kalba");
                a1.pridetiZodi("priešingybės");
                a1.pridetiZodi("valgykla");
                a1.pridetiZodi("buvimas / apsistojimas");
                a1.pridetiZodi("kambario įranga");
                a1.pridetiZodi("žodynas");
                a1.pridetiZodi("agurkas");
                a1.pridetiZodi("braškė");
                a1.pridetiZodi("grietinėlės / kreminiai gaminiai");
                a1.pridetiZodi("tie mandri saldainiai iš dėžučių");
                a1.pridetiZodi("žirniai");
                a1.pridetiZodi("serija / eilė / seka");
                a1.pridetiZodi("viso grūdo duona");
                a1.pridetiZodi("kepenų dešra");
                a1.pridetiZodi("daržovių ir vaisių pardavėjas");
                a1.pridetiZodi("vynuogė");
                a1.pridetiZodi("gaivusis gėrimas");
                a1.pridetiZodi("kompanija / įmonė");
                a1.pridetiZodi("viršūnė / topas");
                a1.pridetiZodi("vakarienė");
                a1.pridetiZodi("nulupti");
                a1.pridetiZodi("uždrausta parkuotis zona");
                a1.pridetiZodi("brošiūra / lankstinukas");
                a1.pridetiZodi("pasitikti / laukti");
                a1.pridetiZodi("tikėtis (expect)");
                a1.pridetiZodi("audringas");
                a1.pridetiZodi("audra");
                a1.pridetiZodi("sportbačiai");
                a1.pridetiZodi("vitrina / parduotuvės langas");
                a1.pridetiZodi("keltas");
                a1.pridetiZodi("objektas / daiktas");
                a1.pridetiZodi("veidrodis");
                a1.pridetiZodi("advokatas");
                a1.pridetiZodi("skersinė gatvė");
                a1.pridetiZodi("pasukti / lenkti");
                a1.pridetiZodi("sankryža");
                a1.pridetiZodi("maisto prekių parduotuvė");
                a1.pridetiZodi("gėlių puokštė");
                a1.pridetiZodi("patarimas");
                a1.pridetiZodi("užpakalis");
                a1.pridetiZodi("riešas");
                a1.pridetiZodi("pagirios");
                a1.pridetiZodi("skiemuo");
                a1.pridetiZodi("instrukcijos");
                a1.pridetiZodi("ąsotėlis / arbatinukas");
                a1.pridetiZodi("lėkštutė puodeliui");
                a1.pridetiZodi("muilas");
                a1.pridetiZodi("stalo įrankiai");
                a1.pridetiZodi("sotus");
                a1.pridetiZodi("žiedinis kopūstas");
                a1.pridetiZodi("aviena / avienos kepsnys");
                a1.pridetiZodi("prieskonis");
                a1.pridetiZodi("baltagūžis kopūstas");
                a1.pridetiZodi("miltai");
                a1.pridetiZodi("duoti / dovanoti");
                a1.pridetiZodi("arbatpinigiai");
                a1.pridetiZodi("kaulas");
                a1.pridetiZodi("vandens maišytuvas / čiaupas");
                a1.pridetiZodi("panaudoti");
                a1.pridetiZodi("garsas / triukšmas");
                a1.pridetiZodi("paveikslas /  piešinys");
                a1.pridetiZodi("perkūnija / audra");
                a1.pridetiZodi("žadintuvas");
                a1.pridetiZodi("dažytis / darytis makiažą");
                a1.pridetiZodi("nerti / nardyti");
                a1.pridetiZodi("dantų šepetėlis");
                a1.pridetiZodi("išsaugoti");
                a1.pridetiZodi("skubėti");
                a1.pridetiZodi("prarasti / pamesti");
                a1.pridetiZodi("šokinėti / šoliuoti");
                a1.pridetiZodi("kalakutas / kalakutiena");
                a1.pridetiZodi("nuspręsti");



                System.out.println("Pasirinkite veiksmą pagal numerį sąrašę: \n" +
                        "1. Spausdinti turimą žodyną   (" + a1.getArraySize() + " žodžiai)\n" +
                        "2. Mokytis Vokiečių -- Lietuvių \n" +
                        "3. Mokytis Lietuvių -- Vokiečių");

                int meniu = scan.nextInt();
                scan.nextLine();

                switch (meniu) {
                    case 1:
                        for (int r = 0; r < a1.getArraySize(); r++) {
                            System.out.println("\n" + (r + 1) + ".  " + A1.getZodi(r) + "  ---  " + a1.getZodi(r));
                        }
                        break;
                    case 2:


                        System.out.println(ANSI_PURPLE + "Įvesti norimų testuoti žodžių kiekį: " + ANSI_RESET);
                        int x = scan.nextInt();
                        scan.nextLine();


                        if ((x < 1) || (x > a1.getArraySize())) {
                            while ((x < 1) || (x > a1.getArraySize())) {
                                System.out.println("Įvesta reikšmė negali viršyti viso žodžių sąrašo ilgio arba būti mažesnė už 0!!! \n" +
                                        "PRAŠOME PAKARTOTI");
                                System.out.println(ANSI_PURPLE + "Įvesti norimų testuoti žodžių kiekį: " + ANSI_RESET);
                                x = scan.nextInt();
                                scan.nextLine();
                            }
                        }

                        System.out.println("Testą sudarys " + x + " žodžių... \n PRADEDAM.... \n");

                        int teisingi = 0;
                        int neteisingi = 0;

                        for (int i = 0; i < x; i++) {

                            System.out.println(i + 1 + "...");


                            int randomaizeris;

                            int randomiukas = rand.nextInt(a1.getArraySize()); // sugeneruojamas random skaicius

                            randomaizeris = randomiukas; // sugeneruotas random skaicius priskiriamas kitai int reiksmei

//            System.out.println("Sugeneruotas random skaicius: " + randomiukas);

                            if (i == 0) { // jeigu tai pirmas ciklo kartas tada pridedam sugeneruotas random skaiciu prie listo ir judam toliau
                                randomai.add(randomiukas);
                            } else {   // jei ne tada bandom padaryt randoma, kurio pries tai dar nebuvo
//                boolean arYraToks = false;
                                for (int y = 0; y < randomai.size(); y++) {
                                    if (randomiukas == randomai.get(y)) { // jei randomas lygus kazkuriam buvusiam pries tai
//                        arYraToks = true;
                                        randomiukas = rand.nextInt(a1.getArraySize()); // tada generuojam nauja randoma ir...
                                        y = -1; // ... o reiksme nustatom i nuli, kad ciklas realiai prasidetu is naujo

                                    }
                                }
                                randomai.add(randomiukas); // kai iseiname is ciklo reiskia, kad nei vienas skaicius nebuvo vienodas su naujai sugeneruotu random skaiciu
                                // galime ramiai prideti randoma i lista
                                randomaizeris = randomiukas; // ir priskit savo randoma prie naujos int reiksmes ir toliau ramiai viska testi

                            }


                            System.out.print("Vokiškas žodis: " + ANSI_BLUE + A1.getZodi(randomaizeris) + ANSI_RESET);
                            System.out.println("\nĮrašyti lietuvišką žodį: ");
                            String zodeliukas = scan.nextLine();
//            scan.nextLine();
                            boolean testas = a1.arTeisingai(randomaizeris, zodeliukas);
                            if (testas) {
                                System.out.println(ANSI_CYAN + "Teisingai \n " + ANSI_RESET);
                                teisingi += 1;
                            } else {
                                System.out.println(ANSI_RED + "Neteisingai " + ANSI_RESET);
                                neteisingi += 1;
                                pakartojimuiLT.add(a1.getZodi(randomaizeris));
                                pakartojimuiDE.add(A1.getZodi(randomaizeris));
                                System.out.println("Teisingas žodis:   " + ANSI_YELLOW + a1.getZodi(randomaizeris) + ANSI_RESET);
                                System.out.println("");

                            }
                        }

                        double pazymys = ((teisingi * 100) / (double) x) / 10;
                        System.out.println("Teisingai įrašėte " + teisingi + "  \n" +
                                "Neteisingai įrašėte " + neteisingi + " .\n" +
                                "");
                        System.out.println("Jūsų gautas pažymys: ");
                        double suapvalintasPazymys = Math.round(pazymys * 100) / 100.0;
                        if (suapvalintasPazymys >= 8) {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :D");
                        } else if (suapvalintasPazymys >= 6) {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :)");
                        }
                        else if (suapvalintasPazymys >= 4) {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :/");
                        }
                        else {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :(");
                        }
                        System.out.println("\nTaip pat žodžiai, kuriuos derėtų pakartoti: \n");

                        for (int b = 0; b < pakartojimuiDE.size(); b++) {

                            System.out.println(ANSI_YELLOW + (b + 1) + ". " + pakartojimuiDE.get(b) + " --- " + pakartojimuiLT.get(b) + ANSI_RESET);
                        }

                        break;
                    case 3:

                        System.out.println(ANSI_PURPLE + "Įvesti norimų testuoti žodžių kiekį: " + ANSI_RESET);
                        int p = scan.nextInt();
                        scan.nextLine();


                        if ((p < 1) || (p > a1.getArraySize())) {
                            while ((p < 1) || (p > a1.getArraySize())) {
                                System.out.println("Įvesta reikšmė negali viršyti viso žodžių sąrašo ilgio arba būti mažesnė už 0!!! \n" +
                                        "PRAŠOME PAKARTOTI");
                                System.out.println(ANSI_PURPLE + "Įvesti norimų testuoti žodžių kiekį: " + ANSI_RESET);
                                p = scan.nextInt();
                                scan.nextLine();
                            }
                        }

                        System.out.println("Testą sudarys " + p + " žodžių... \n PRADEDAM.... \n");

                        teisingi = 0;
                        neteisingi = 0;

                        for (int i = 0; i < p; i++) {

                            System.out.println(i + 1 + "...");


                            int randomaizeris;

                            int randomiukas = rand.nextInt(a1.getArraySize()); // sugeneruojamas random skaicius

                            randomaizeris = randomiukas; // sugeneruotas random skaicius priskiriamas kitai int reiksmei

//            System.out.println("Sugeneruotas random skaicius: " + randomiukas);

                            if (i == 0) { // jeigu tai pirmas ciklo kartas tada pridedam sugeneruotas random skaiciu prie listo ir judam toliau
                                randomai.add(randomiukas);
                            } else {   // jei ne tada bandom padaryt randoma, kurio pries tai dar nebuvo
//                boolean arYraToks = false;
                                for (int y = 0; y < randomai.size(); y++) {
                                    if (randomiukas == randomai.get(y)) { // jei randomas lygus kazkuriam buvusiam pries tai
//                        arYraToks = true;
                                        randomiukas = rand.nextInt(a1.getArraySize()); // tada generuojam nauja randoma ir...
                                        y = -1; // ... o reiksme nustatom i nuli, kad ciklas realiai prasidetu is naujo

                                    }
                                }
                                randomai.add(randomiukas); // kai iseiname is ciklo reiskia, kad nei vienas skaicius nebuvo vienodas su naujai sugeneruotu random skaiciu
                                // galime ramiai prideti randoma i lista
                                randomaizeris = randomiukas; // ir priskit savo randoma prie naujos int reiksmes ir toliau ramiai viska testi

                            }


                            System.out.print("Lietuviškas žodis: " + ANSI_BLUE + a1.getZodi(randomaizeris) + ANSI_RESET);
                            System.out.println("\nĮrašyti vokišką žodį: ");
                            String zodeliukas = scan.nextLine();
//            scan.nextLine();
                            boolean testas = A1.arTeisingai(randomaizeris, zodeliukas);
                            if (testas) {
                                System.out.println(ANSI_CYAN + "Teisingai \n " + ANSI_RESET);
                                teisingi += 1;
                            } else {
                                System.out.println(ANSI_RED + "Neteisingai " + ANSI_RESET);
                                neteisingi += 1;
                                pakartojimuiLT.add(A1.getZodi(randomaizeris));
                                pakartojimuiDE.add(a1.getZodi(randomaizeris));
                                System.out.println("Teisingas žodis:   " + ANSI_YELLOW + A1.getZodi(randomaizeris) + ANSI_RESET);
                                System.out.println("");

                            }
                        }

                        pazymys = ((teisingi * 100) / (double) p) / 10;
                        System.out.println("Teisingai įrašėte " + teisingi + "  \n" +
                                "Neteisingai įrašėte " + neteisingi + " .\n" +
                                "");
                        System.out.println("Jūsų gautas pažymys: ");
                        suapvalintasPazymys = Math.round(pazymys * 100) / 100.0;
                        if (suapvalintasPazymys >= 8) {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :D");
                        } else if (suapvalintasPazymys >= 6) {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :)");
                        }
                        else if (suapvalintasPazymys >= 4) {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :/");
                        }
                        else {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :(");
                        }
                        System.out.println("\nTaip pat žodžiai, kuriuos derėtų pakartoti: \n");

                        for (int b = 0; b < pakartojimuiDE.size(); b++) {

                            System.out.println(ANSI_YELLOW + (b + 1) + ". " + pakartojimuiDE.get(b) + " --- " + pakartojimuiLT.get(b) + ANSI_RESET);
                        }

                        break;
                    default:
                        System.out.println("NETEISINGA ĮVESTIS\n Paleiskite programą iš naujo.....");

                }
                break;
            case 2:
                ArrayList<Integer> ups = new ArrayList<Integer>();

                ArrayList<String> pakartojimuiLT1 = new ArrayList<String>();
                ArrayList<String> pakartojimuiDE1 = new ArrayList<String>();
                com.company.Lt a2 = new com.company.Lt("A2");
                com.company.De A2 = new com.company.De("A2");



                A2.pridetiZodi("der Familienmitglieder");
                A2.pridetiZodi("der Antwortbogen");
                A2.pridetiZodi("der Angestellter");
                A2.pridetiZodi("der Auszubildender");
                A2.pridetiZodi("der Handwerker");
                A2.pridetiZodi("der Krankenpfleger");
                A2.pridetiZodi("der Rentner");
                A2.pridetiZodi("die Klassenfahrt");
                A2.pridetiZodi("die Sozialkunde");
                A2.pridetiZodi("März");
                A2.pridetiZodi("Mai");
                A2.pridetiZodi("Oktober");
                A2.pridetiZodi("abschließen");
                A2.pridetiZodi("die Ahnung");
                A2.pridetiZodi("aktuell");
                A2.pridetiZodi("ändern");
                A2.pridetiZodi("der Anfang");
                A2.pridetiZodi("die Angst");
                A2.pridetiZodi("die Arbeit");
                A2.pridetiZodi("arbeitslos");
                A2.pridetiZodi("sich ärgern");
                A2.pridetiZodi("auf jeden fall");
                A2.pridetiZodi("aufmachen");
                A2.pridetiZodi("aufpassen");
                A2.pridetiZodi("aufräumen");
                A2.pridetiZodi("aufregend");
                A2.pridetiZodi("ausfüllen");
                A2.pridetiZodi("sich ausruhen");
                A2.pridetiZodi("außer");
                A2.pridetiZodi("außerdem");
                A2.pridetiZodi("außerhalb");
                A2.pridetiZodi("aussprechen");
                A2.pridetiZodi("die Ausstellung");
                A2.pridetiZodi("austragen");
                A2.pridetiZodi("baden");
                A2.pridetiZodi("basteln");
                A2.pridetiZodi("begründen");
                A2.pridetiZodi("bequem");
                A2.pridetiZodi("beraten");
                A2.pridetiZodi("berühmt");
                A2.pridetiZodi("der Bescheid");
                A2.pridetiZodi("beschreiben");
                A2.pridetiZodi("sich beschweren");
                A2.pridetiZodi("bestätigen");
                A2.pridetiZodi("bestehen");
                A2.pridetiZodi("der Besuch");
                A2.pridetiZodi("bewerben");
                A2.pridetiZodi("bewölkt");
                A2.pridetiZodi("die Wolke");
                A2.pridetiZodi("das Blatt");
                A2.pridetiZodi("blöd");
                A2.pridetiZodi("die Brücke");
                A2.pridetiZodi("bunt");
                A2.pridetiZodi("darüber");
                A2.pridetiZodi("dabei ");
                A2.pridetiZodi("damals");
                A2.pridetiZodi("die Datei");
                A2.pridetiZodi("deutlich");
                A2.pridetiZodi("das Ding");
                A2.pridetiZodi("drinnen");
                A2.pridetiZodi("drüben");
                A2.pridetiZodi("dünn");
                A2.pridetiZodi("echt");
                A2.pridetiZodi("die Ecke");
                A2.pridetiZodi("eigentlich");
                A2.pridetiZodi("eintragen");
                A2.pridetiZodi("einverstanden");
                A2.pridetiZodi("einzel");
                A2.pridetiZodi("einziehen");
                A2.pridetiZodi("erinnern");
                A2.pridetiZodi("die Ermäßigung");
                A2.pridetiZodi("erreichen");
                A2.pridetiZodi("erst");
                A2.pridetiZodi("das Fach");
                A2.pridetiZodi("faul");
                A2.pridetiZodi("fehlen");
                A2.pridetiZodi("fleißig");
                A2.pridetiZodi("der Flohmarkt");
                A2.pridetiZodi("der Fluss");
                A2.pridetiZodi("freiwillig");
                A2.pridetiZodi("froh");
                A2.pridetiZodi("der Führerschein");
                A2.pridetiZodi("die Fundsachen");
                A2.pridetiZodi("furchtbar");
                A2.pridetiZodi("geehrt");
                A2.pridetiZodi("gefährlich");
                A2.pridetiZodi("gefallen");
                A2.pridetiZodi("gegenüber");
                A2.pridetiZodi("das Gericht");
                A2.pridetiZodi("die Geschichte");
                A2.pridetiZodi("das Gesicht");
                A2.pridetiZodi("die Gesundheit");
                A2.pridetiZodi("die Gitarre");
                A2.pridetiZodi("die Größe");
                A2.pridetiZodi("das Handtuch");
                A2.pridetiZodi("hart");
                A2.pridetiZodi("hässlich");
                A2.pridetiZodi("herstellen");
                A2.pridetiZodi("herunterladen");
                A2.pridetiZodi("die Hochzeit");
                A2.pridetiZodi("die Insel");
                A2.pridetiZodi("joggen");
                A2.pridetiZodi("die  Jugendherberge");
                A2.pridetiZodi("die Kette");
                A2.pridetiZodi("klappen");
                A2.pridetiZodi("klug");
                A2.pridetiZodi("das Konto");
                A2.pridetiZodi("die Krankheit");
                A2.pridetiZodi("kühl");
                A2.pridetiZodi("kündigen");
                A2.pridetiZodi("die Kunst");
                A2.pridetiZodi("lassen");
                A2.pridetiZodi("die Lebensmittel");
                A2.pridetiZodi("leer");
                A2.pridetiZodi("leihen");
                A2.pridetiZodi("liefern");
                A2.pridetiZodi("das Lokal");
                A2.pridetiZodi("die Lüge");
                A2.pridetiZodi("lügen");
                A2.pridetiZodi("die Lust");
                A2.pridetiZodi("lustig");
                A2.pridetiZodi("der Magen");
                A2.pridetiZodi("die Mannschaft");
                A2.pridetiZodi("die Meinung");
                A2.pridetiZodi("die Menge");
                A2.pridetiZodi("merken");
                A2.pridetiZodi("die Messe");
                A2.pridetiZodi("der Mitarbeiter");
                A2.pridetiZodi("der Müll");
                A2.pridetiZodi("die Mütze");
                A2.pridetiZodi("nass");
                A2.pridetiZodi("nennen");
                A2.pridetiZodi("nirgends");
                A2.pridetiZodi("notieren");
                A2.pridetiZodi("die Notiz");
                A2.pridetiZodi("notwendig");
                A2.pridetiZodi("nützlich");
                A2.pridetiZodi("offen");
                A2.pridetiZodi("öffnen");
                A2.pridetiZodi("das Passwort");
                A2.pridetiZodi("plötzlich");
                A2.pridetiZodi("das Poster");
                A2.pridetiZodi("probieren");
                A2.pridetiZodi("die Qualität");
                A2.pridetiZodi("das Quiz");
                A2.pridetiZodi("raten");
                A2.pridetiZodi("das Rätsel");
                A2.pridetiZodi("rechnen");
                A2.pridetiZodi("reich");
                A2.pridetiZodi("der Reifen");
                A2.pridetiZodi("die Reinigung");
                A2.pridetiZodi("reiten");
                A2.pridetiZodi("der Rentner");
                A2.pridetiZodi("der Rest");
                A2.pridetiZodi("das Rind");
                A2.pridetiZodi("das Ring");
                A2.pridetiZodi("die Rose");
                A2.pridetiZodi("der Rundgang");
                A2.pridetiZodi("die Sache");
                A2.pridetiZodi("sauer");
                A2.pridetiZodi("schädlich");
                A2.pridetiZodi("schimpfen");
                A2.pridetiZodi("der Schirm");
                A2.pridetiZodi("schrecklich");
                A2.pridetiZodi("schriftlich");
                A2.pridetiZodi("schwanger");
                A2.pridetiZodi("schwierig");
                A2.pridetiZodi("die Sendung");
                A2.pridetiZodi("der Ski");
                A2.pridetiZodi("sogar");
                A2.pridetiZodi("sonst");
                A2.pridetiZodi("spannend");
                A2.pridetiZodi("sparen");
                A2.pridetiZodi("stattfinden");
                A2.pridetiZodi("sterben");
                A2.pridetiZodi("der Stiefel");
                A2.pridetiZodi("der Stift");
                A2.pridetiZodi("stören");
                A2.pridetiZodi("der Strand");
                A2.pridetiZodi("streiten");
                A2.pridetiZodi("streng");
                A2.pridetiZodi("die Tafel");
                A2.pridetiZodi("das Taschengeld");
                A2.pridetiZodi("tauschen");
                A2.pridetiZodi("teilnehmen");
                A2.pridetiZodi("tief");
                A2.pridetiZodi("der Tipp");
                A2.pridetiZodi("der Titel");
                A2.pridetiZodi("träumen");
                A2.pridetiZodi("traurig");
                A2.pridetiZodi("trocken");
                A2.pridetiZodi("tut");
                A2.pridetiZodi("üben");
                A2.pridetiZodi("übersetzen");
                A2.pridetiZodi("umsteigen");
                A2.pridetiZodi("sich umziehen");
                A2.pridetiZodi("unbedingt");
                A2.pridetiZodi("der Unfall");
                A2.pridetiZodi("sich unterhalten");
                A2.pridetiZodi("die Unterkunft");
                A2.pridetiZodi("der Unterschied");
                A2.pridetiZodi("unterwegs sein");
                A2.pridetiZodi("verabredet sein");
                A2.pridetiZodi("die Veranstaltung");
                A2.pridetiZodi("vergleichen");
                A2.pridetiZodi("sich verletzen");
                A2.pridetiZodi("verpassen");
                A2.pridetiZodi("verschieben");
                A2.pridetiZodi("verschieden");
                A2.pridetiZodi("vorher");
                A2.pridetiZodi("der Vorschlag");
                A2.pridetiZodi("wach");
                A2.pridetiZodi("wahr");
                A2.pridetiZodi("wahrscheinlich");
                A2.pridetiZodi("die Wäsche");
                A2.pridetiZodi("wechseln");
                A2.pridetiZodi("wecken");
                A2.pridetiZodi("wegen");
                A2.pridetiZodi("wehtun");
                A2.pridetiZodi("weich");
                A2.pridetiZodi("weinen");
                A2.pridetiZodi("die Werkstatt");
                A2.pridetiZodi("der Wettbewerb");
                A2.pridetiZodi("der Witz");
                A2.pridetiZodi("witzig");
                A2.pridetiZodi("die Wolke");
                A2.pridetiZodi("wünschen");
                A2.pridetiZodi("zeichnen");
                A2.pridetiZodi("das Zeugnis");
                A2.pridetiZodi("das Ziel");
                A2.pridetiZodi("zuhören");
                A2.pridetiZodi("zumachen");
                A2.pridetiZodi("verschieden");
                A2.pridetiZodi("die Volksschule");
                A2.pridetiZodi("behandeln");
                A2.pridetiZodi("feststellen");
                A2.pridetiZodi("herstellen");
                A2.pridetiZodi("der Bauer");
                A2.pridetiZodi("der Hof");
                A2.pridetiZodi("das Feld");
                A2.pridetiZodi("pflanzen");
                A2.pridetiZodi("liefern");
                A2.pridetiZodi("der Regenbogen");
                A2.pridetiZodi("die Himbeere");
                A2.pridetiZodi("die Arten");
                A2.pridetiZodi("ergeben");
                A2.pridetiZodi("der Stamm");
                A2.pridetiZodi("die Taube");
                A2.pridetiZodi("der Sonnenuntergang");
                A2.pridetiZodi("ähnlich");
                A2.pridetiZodi("edlen");
                A2.pridetiZodi("der Edelstein");
                A2.pridetiZodi("überqueren");
                A2.pridetiZodi("sich lassen");
                A2.pridetiZodi("die Mittelmeerinsel");
                A2.pridetiZodi("erreichen");
                A2.pridetiZodi("der Wartebereich");
                A2.pridetiZodi("übel");
                A2.pridetiZodi("der Alltag");
                A2.pridetiZodi("gemeinsam");
                A2.pridetiZodi("die Grenze");
                A2.pridetiZodi("ehemalig");
                A2.pridetiZodi("das Ufer");
                A2.pridetiZodi("die Gesetze");
                A2.pridetiZodi("der Bürger");
                A2.pridetiZodi("die Kiste");
                A2.pridetiZodi("wiegen");
                A2.pridetiZodi("auferstehung");
                A2.pridetiZodi("die Gewerkschaften");
                A2.pridetiZodi("der Ehrentag");
                A2.pridetiZodi("verwöhnen");
                A2.pridetiZodi("die Wiedervereinigung");
                A2.pridetiZodi("der Adventskranz");
                A2.pridetiZodi("heilig");
                A2.pridetiZodi("ehren");
                A2.pridetiZodi("stattfinden");
                A2.pridetiZodi("anschließend");
                A2.pridetiZodi("köstlich");
                A2.pridetiZodi("allerdings");
                A2.pridetiZodi("furchtbar");
                A2.pridetiZodi("der Schulbank");
                A2.pridetiZodi("der Klassenkamerad");
                A2.pridetiZodi("der Radiergummi");
                A2.pridetiZodi("das Lineal");
                A2.pridetiZodi("die Vereinigten Staaten von Amerika");
                A2.pridetiZodi("Polen");
                A2.pridetiZodi("Die Werkstatt");
                A2.pridetiZodi("teilzunehmen");
                A2.pridetiZodi("der Steinpilz");
                A2.pridetiZodi("sich eignen");
                A2.pridetiZodi("die Beilage");
                A2.pridetiZodi("ein Leib Brot");
                A2.pridetiZodi("aufwachen");
                A2.pridetiZodi("selten");
                A2.pridetiZodi("die Umgebung");
                A2.pridetiZodi("entfernt");
                A2.pridetiZodi("unterschiedlich");
                A2.pridetiZodi("herum");
                A2.pridetiZodi("der Dichter");
                A2.pridetiZodi("die Erledigung");
                A2.pridetiZodi("streng");
                A2.pridetiZodi("beobachten");
                A2.pridetiZodi("das Lagerfeuer");
                A2.pridetiZodi("das Zelt");
                A2.pridetiZodi("begleiten");
                A2.pridetiZodi("die Hütte");
                A2.pridetiZodi("überlegen");
                A2.pridetiZodi("schlemmen");
                A2.pridetiZodi("anstrengend");
                A2.pridetiZodi("überreichen");
                A2.pridetiZodi("die Beschwerde");
                A2.pridetiZodi("die Ferne");
                A2.pridetiZodi("herrschen");
                A2.pridetiZodi("das Reh");
                A2.pridetiZodi("der Felsen ");
                A2.pridetiZodi("verletzen");
                A2.pridetiZodi("das Futter");
                A2.pridetiZodi("angeln");
                A2.pridetiZodi("der Bach");
                A2.pridetiZodi("flach");
                A2.pridetiZodi("blasen");
                A2.pridetiZodi("feucht");
                A2.pridetiZodi("der Stall");
                A2.pridetiZodi("anzünden");
                A2.pridetiZodi("heimlich");
                A2.pridetiZodi("das Plätzchen");
                A2.pridetiZodi("achten");
                A2.pridetiZodi("der Umstand");
                A2.pridetiZodi("angesichts");
                A2.pridetiZodi("nachsichtig");
                A2.pridetiZodi("anhand");
                A2.pridetiZodi("ermitteln");
                A2.pridetiZodi("anlässlich");
                A2.pridetiZodi("aufgrund");
                A2.pridetiZodi("gesperrt");
                A2.pridetiZodi("einschließlich");
                A2.pridetiZodi("ausschließlich");
                A2.pridetiZodi("bezüglich");
                A2.pridetiZodi("hinsichtlich");
                A2.pridetiZodi("infolge");
                A2.pridetiZodi("innerhalb");
                A2.pridetiZodi("laut");
                A2.pridetiZodi("jenseits");
                A2.pridetiZodi("mangels");
                A2.pridetiZodi("der Beweis");
                A2.pridetiZodi("freigesprochen");
                A2.pridetiZodi("die Grenze");
                A2.pridetiZodi("der Wert");
                A2.pridetiZodi("oberhalb");
                A2.pridetiZodi("trotz");
                A2.pridetiZodi("unfernt / unweit");
                A2.pridetiZodi("unterhalb");
                A2.pridetiZodi("wegen");
                A2.pridetiZodi("zugunsten");
                A2.pridetiZodi("das Waisenhaus");
                A2.pridetiZodi("darstellen");
                A2.pridetiZodi("sich verteidigen");
                A2.pridetiZodi("ein Examplar");
                A2.pridetiZodi("wertvoll");
                A2.pridetiZodi("die Petersilie");
                A2.pridetiZodi("die Minze");
                A2.pridetiZodi("das Lammfleisch");
                A2.pridetiZodi("der Schnittlauch");
                A2.pridetiZodi("erstellen");
                A2.pridetiZodi("worum");
                A2.pridetiZodi("betreuen");
                A2.pridetiZodi("beschäftigen");
                A2.pridetiZodi("ein Jurist");
                A2.pridetiZodi("ein Betriebswirt");
                A2.pridetiZodi("erfolgreich");
                A2.pridetiZodi("überlegen");
                A2.pridetiZodi("das Ereignis");
                A2.pridetiZodi("flüchten / fliechen");
                A2.pridetiZodi("die Zunahme");
                A2.pridetiZodi("der Gefallen");
                A2.pridetiZodi("der Berater");
                A2.pridetiZodi("atmen");
                A2.pridetiZodi("befehlen");
                A2.pridetiZodi("frieren");
                A2.pridetiZodi("brennen");
                A2.pridetiZodi("vertrauen");
                A2.pridetiZodi("flauschig");
                A2.pridetiZodi("verzeihen / vergeben");
                A2.pridetiZodi("drohen");
                A2.pridetiZodi("tiefgründig");
                A2.pridetiZodi("das Fell");
                A2.pridetiZodi("der Masseur");
                A2.pridetiZodi("pflücken");
                A2.pridetiZodi("der Abschnitt");
                A2.pridetiZodi("der Schneider");
                A2.pridetiZodi("gelegentlich");
                A2.pridetiZodi("die Brombeere");
                A2.pridetiZodi("ständig");
                A2.pridetiZodi("ausgeben");
                A2.pridetiZodi("die Pinakothek");
                A2.pridetiZodi("bügeln");
                A2.pridetiZodi("das Ereignis");
                A2.pridetiZodi("die Regierung");
                A2.pridetiZodi("die Wirtschaft");
                A2.pridetiZodi("der Vertreter");
                A2.pridetiZodi("die Straftat");
                A2.pridetiZodi("ansteigen");
                A2.pridetiZodi("turnen");
                A2.pridetiZodi("der Innenarchitekt");
                A2.pridetiZodi("erleben");
                A2.pridetiZodi("das Andenken");
                A2.pridetiZodi("die Lage");
                A2.pridetiZodi("der Zustand");
                A2.pridetiZodi("das Waschbecken");
                A2.pridetiZodi("die Ordner");
                A2.pridetiZodi("die Gardine");
                A2.pridetiZodi("trotzdem");
                A2.pridetiZodi("bedeutende");
                A2.pridetiZodi("hervorragende");
                A2.pridetiZodi("die Verlage");
                A2.pridetiZodi("die Aufmerksamkeit");


                a2.pridetiZodi("šeimos narys");
                a2.pridetiZodi("atsakymų lapas");
                a2.pridetiZodi("darbuotojas");
                a2.pridetiZodi("praktikantas");
                a2.pridetiZodi("amatininkas");
                a2.pridetiZodi("slaugytojas");
                a2.pridetiZodi("pensininkas");
                a2.pridetiZodi("mokyklos kelionė");
                a2.pridetiZodi("socialinis ugdymas");
                a2.pridetiZodi("kovas");
                a2.pridetiZodi("gegužė");
                a2.pridetiZodi("spalis");
                a2.pridetiZodi("uždaryti / užrakinti / užbaigti");
                a2.pridetiZodi("idėja / užduomina / mintis");
                a2.pridetiZodi("dabartinis");
                a2.pridetiZodi("pakeisti");
                a2.pridetiZodi("pradžia");
                a2.pridetiZodi("baimė");
                a2.pridetiZodi("darbas");
                a2.pridetiZodi("bedarbis");
                a2.pridetiZodi("susierzinti");
                a2.pridetiZodi("būtinai / bet kokiu atveju");
                a2.pridetiZodi("atidaryti");
                a2.pridetiZodi("stebėti / žiūrėti");
                a2.pridetiZodi("sutvarkyti");
                a2.pridetiZodi("jaudinantis");
                a2.pridetiZodi("užpildyti anketą / formuliarą");
                a2.pridetiZodi("ilsėtis / atsipalaiduoti");
                a2.pridetiZodi("išskyrus");
                a2.pridetiZodi("papildomai");
                a2.pridetiZodi("už / kažkur kitur");
                a2.pridetiZodi("tiksliai pasakyti");
                a2.pridetiZodi("paroda");
                a2.pridetiZodi("pristatyti");
                a2.pridetiZodi("maudytis vonioje");
                a2.pridetiZodi("pagaminti / pastatyti");
                a2.pridetiZodi("pagrįsti / argumentuoti");
                a2.pridetiZodi("patogus");
                a2.pridetiZodi("konsultuoti / patarti");
                a2.pridetiZodi("įžymus");
                a2.pridetiZodi("pranešimas / informavimas");
                a2.pridetiZodi("apibūdinti");
                a2.pridetiZodi("pasiskųsti");
                a2.pridetiZodi("patvirtinti / užtikrinti");
                a2.pridetiZodi("išlaikyti egzaminą");
                a2.pridetiZodi("vizitas");
                a2.pridetiZodi("kandidaduoti");
                a2.pridetiZodi("debesuota");
                a2.pridetiZodi("debesis");
                a2.pridetiZodi("lapas");
                a2.pridetiZodi("kvaila");
                a2.pridetiZodi("tiltas");
                a2.pridetiZodi("margas / spalvotas");
                a2.pridetiZodi("apie tai / ant to");
                a2.pridetiZodi("tenai");
                a2.pridetiZodi("tuo metu / tomis dienomis");
                a2.pridetiZodi("duomenys");
                a2.pridetiZodi("aiškiai");
                a2.pridetiZodi("daiktas / dalykas");
                a2.pridetiZodi("patalpoje / viduje");
                a2.pridetiZodi("štai ten");
                a2.pridetiZodi("plonas / lieknas");
                a2.pridetiZodi("tikras");
                a2.pridetiZodi("kampas");
                a2.pridetiZodi("iš tikrųjų");
                a2.pridetiZodi("įtraukti į sąrašą");
                a2.pridetiZodi("supratau");
                a2.pridetiZodi("viengubas");
                a2.pridetiZodi("įsikraustyti / įsikelti");
                a2.pridetiZodi("prisiminti");
                a2.pridetiZodi("nuolaida");
                a2.pridetiZodi("pasiekti / suspėti / rasti");
                a2.pridetiZodi("tik (only)");
                a2.pridetiZodi("subjektas / mokomasis dalykas");
                a2.pridetiZodi("tingus");
                a2.pridetiZodi("nebuvimas");
                a2.pridetiZodi("darbštus / stropus");
                a2.pridetiZodi("sendaikčių turgus");
                a2.pridetiZodi("upė");
                a2.pridetiZodi("savanoriškai");
                a2.pridetiZodi("laimingas");
                a2.pridetiZodi("vairuotojo pažymėjimas");
                a2.pridetiZodi("prarasta nuosavybė");
                a2.pridetiZodi("siaubingas / beprotiškas");
                a2.pridetiZodi("gerbiamas");
                a2.pridetiZodi("pavojingas");
                a2.pridetiZodi("patikti");
                a2.pridetiZodi("priešais");
                a2.pridetiZodi("patiekalas");
                a2.pridetiZodi("istorija");
                a2.pridetiZodi("veidas");
                a2.pridetiZodi("sveikata");
                a2.pridetiZodi("gitara");
                a2.pridetiZodi("dydis");
                a2.pridetiZodi("rankšluostis");
                a2.pridetiZodi("kietas");
                a2.pridetiZodi("bjaurus");
                a2.pridetiZodi("gaminti");
                a2.pridetiZodi("parsisiųsti");
                a2.pridetiZodi("vestuvės");
                a2.pridetiZodi("sala");
                a2.pridetiZodi("bėgioti");
                a2.pridetiZodi("jaunimo viežbutis");
                a2.pridetiZodi("grandinėlė");
                a2.pridetiZodi("pavykti / praeiti");
                a2.pridetiZodi("protingas");
                a2.pridetiZodi("sąskaita (account)");
                a2.pridetiZodi("liga");
                a2.pridetiZodi("šalta / vėsu");
                a2.pridetiZodi("nutraukti / sustabdyti");
                a2.pridetiZodi("menas");
                a2.pridetiZodi("palikti / leisti");
                a2.pridetiZodi("maistas");
                a2.pridetiZodi("tuščias");
                a2.pridetiZodi("skolintis");
                a2.pridetiZodi("pristatyti / tiekti");
                a2.pridetiZodi("restoranas");
                a2.pridetiZodi("melas");
                a2.pridetiZodi("meluoti");
                a2.pridetiZodi("noras / geismas / nuotaika");
                a2.pridetiZodi("juokingas");
                a2.pridetiZodi("skrandis");
                a2.pridetiZodi("komanda");
                a2.pridetiZodi("nuomonė");
                a2.pridetiZodi("daugybė");
                a2.pridetiZodi("pasižymėti / prisiminti");
                a2.pridetiZodi("mugė");
                a2.pridetiZodi("darbuotojas");
                a2.pridetiZodi("šiukšlės");
                a2.pridetiZodi("kepurytė");
                a2.pridetiZodi("šlapias / drėgnas");
                a2.pridetiZodi("vadinti");
                a2.pridetiZodi("niekur");
                a2.pridetiZodi("pasirašyti pastabą");
                a2.pridetiZodi("raštelis / užrašas");
                a2.pridetiZodi("būtinas");
                a2.pridetiZodi("naudingas");
                a2.pridetiZodi("atidarytas");
                a2.pridetiZodi("atidaryti");
                a2.pridetiZodi("slaptažodis");
                a2.pridetiZodi("staiga");
                a2.pridetiZodi("plakatas");
                a2.pridetiZodi("pabandyti / paragauti");
                a2.pridetiZodi("kokybė");
                a2.pridetiZodi("viktorina");
                a2.pridetiZodi("patarti");
                a2.pridetiZodi("mįslė");
                a2.pridetiZodi("skaičiuoti");
                a2.pridetiZodi("turtingas");
                a2.pridetiZodi("padanga");
                a2.pridetiZodi("valymas");
                a2.pridetiZodi("jodinėti");
                a2.pridetiZodi("pensininkas");
                a2.pridetiZodi("likutis");
                a2.pridetiZodi("jautiena");
                a2.pridetiZodi("žiedas");
                a2.pridetiZodi("rožė");
                a2.pridetiZodi("kelionė / turas");
                a2.pridetiZodi("daiktas");
                a2.pridetiZodi("rūgštus");
                a2.pridetiZodi("žalingas");
                a2.pridetiZodi("niurzgėti");
                a2.pridetiZodi("skėtis");
                a2.pridetiZodi("pasibaisėtinas");
                a2.pridetiZodi("raštu");
                a2.pridetiZodi("nėščia");
                a2.pridetiZodi("sudėtingas");
                a2.pridetiZodi("transliacija");
                a2.pridetiZodi("slidinėjimas");
                a2.pridetiZodi("net");
                a2.pridetiZodi("kitaip (otherwise)");
                a2.pridetiZodi("jaudinantis / įdomus");
                a2.pridetiZodi("taupyti / saugoti");
                a2.pridetiZodi("vykti");
                a2.pridetiZodi("mirti");
                a2.pridetiZodi("auliniai batai");
                a2.pridetiZodi("rašiklis");
                a2.pridetiZodi("trugdyti");
                a2.pridetiZodi("paplūdimys");
                a2.pridetiZodi("peštis / ginčytis");
                a2.pridetiZodi("griežtas");
                a2.pridetiZodi("lenta");
                a2.pridetiZodi("kišenpinigiai");
                a2.pridetiZodi("mainyti / pakeisti");
                a2.pridetiZodi("dalyvauti");
                a2.pridetiZodi("gilus");
                a2.pridetiZodi("patarimas");
                a2.pridetiZodi("pavadinimas");
                a2.pridetiZodi("svajoti / sapnuoti");
                a2.pridetiZodi("liūdnas");
                a2.pridetiZodi("sausas");
                a2.pridetiZodi("does");
                a2.pridetiZodi("praktikuotis");
                a2.pridetiZodi("išversti");
                a2.pridetiZodi("perlipti");
                a2.pridetiZodi("persirengti");
                a2.pridetiZodi("visiškai / būtinai");
                a2.pridetiZodi("nelaimingas atsitikimas / avarija");
                a2.pridetiZodi("šnekučiuotis / pramogauti");
                a2.pridetiZodi("apgyvendinimas");
                a2.pridetiZodi("skirtumas ");
                a2.pridetiZodi("būti kelyje / pakeliui");
                a2.pridetiZodi("būti susitarusiam");
                a2.pridetiZodi("įvykys");
                a2.pridetiZodi("palyginti / įvertinti");
                a2.pridetiZodi("susižeisti");
                a2.pridetiZodi("praleisti");
                a2.pridetiZodi("perkelti (susitikimą)");
                a2.pridetiZodi("skirtingas / kitoks");
                a2.pridetiZodi("prieš tai / ankščiau");
                a2.pridetiZodi("pasiūlymas");
                a2.pridetiZodi("pabudęs / budrus");
                a2.pridetiZodi("tiesa");
                a2.pridetiZodi("tikriausiai");
                a2.pridetiZodi("skalbiniai");
                a2.pridetiZodi("pakeisti (padangą / pinigą)");
                a2.pridetiZodi("pažadinti");
                a2.pridetiZodi("nes (because of)");
                a2.pridetiZodi("nuskriausti / įskaudinti / sužeisti");
                a2.pridetiZodi("minkštas");
                a2.pridetiZodi("verkti");
                a2.pridetiZodi("dirbtuvės");
                a2.pridetiZodi("konkursas");
                a2.pridetiZodi("pokštas");
                a2.pridetiZodi("šmaikštus");
                a2.pridetiZodi("debesis");
                a2.pridetiZodi("norėti");
                a2.pridetiZodi("piešti");
                a2.pridetiZodi("sertifikatas");
                a2.pridetiZodi("tikslas");
                a2.pridetiZodi("išklausyti");
                a2.pridetiZodi("uždaryti");
                a2.pridetiZodi("įvairus / skirtingas");
                a2.pridetiZodi("pradinė mokykla");
                a2.pridetiZodi("gydyti");
                a2.pridetiZodi("nustatyti");
                a2.pridetiZodi("gaminti");
                a2.pridetiZodi("ūkininkas");
                a2.pridetiZodi("kiemas");
                a2.pridetiZodi("laukas");
                a2.pridetiZodi("sodinti / auginti augalą");
                a2.pridetiZodi("tiekti");
                a2.pridetiZodi("vaivorykštė");
                a2.pridetiZodi("avietės");
                a2.pridetiZodi("tipai / rūšys");
                a2.pridetiZodi("result in / produce");
                a2.pridetiZodi("kamienas");
                a2.pridetiZodi("balandis");
                a2.pridetiZodi("saulėlydis");
                a2.pridetiZodi("panašus");
                a2.pridetiZodi("kilnus");
                a2.pridetiZodi("brangaakmenis");
                a2.pridetiZodi("kirsti gatvę");
                a2.pridetiZodi("leisti sau");
                a2.pridetiZodi("viduržemio jūros sala");
                a2.pridetiZodi("pasiekti");
                a2.pridetiZodi("laukimo zona");
                a2.pridetiZodi("blogai / nemaloniai / pykinančiai");
                a2.pridetiZodi("kasdienis gyvenimas");
                a2.pridetiZodi("kartu (together)");
                a2.pridetiZodi("siena / riba");
                a2.pridetiZodi("buvęs");
                a2.pridetiZodi("krantas");
                a2.pridetiZodi("įstatymai");
                a2.pridetiZodi("pilietis");
                a2.pridetiZodi("dežė");
                a2.pridetiZodi("sverti");
                a2.pridetiZodi("prisikėlimas");
                a2.pridetiZodi("sąjungos");
                a2.pridetiZodi("ypatinga diena");
                a2.pridetiZodi("lepinti");
                a2.pridetiZodi("susijungimas (reunion)");
                a2.pridetiZodi("advento vainikas");
                a2.pridetiZodi("šventasis");
                a2.pridetiZodi("pagerbti");
                a2.pridetiZodi("vykti");
                a2.pridetiZodi("toliau (subsequently / afterwards)");
                a2.pridetiZodi("skanus");
                a2.pridetiZodi("however");
                a2.pridetiZodi("beprotiškai");
                a2.pridetiZodi("mokyklinis suolas");
                a2.pridetiZodi("mokyklos draugas");
                a2.pridetiZodi("trintukas");
                a2.pridetiZodi("liniuotė");
                a2.pridetiZodi("Jungtinės Amerikos Valstijos");
                a2.pridetiZodi("Lenkija");
                a2.pridetiZodi("dirbtuvės / garažas");
                a2.pridetiZodi("sudalyvauti");
                a2.pridetiZodi("baravykas");
                a2.pridetiZodi("būti tinkamu");
                a2.pridetiZodi("garnyras / priedas");
                a2.pridetiZodi("duonos kepalas");
                a2.pridetiZodi("atsibusti");
                a2.pridetiZodi("retai");
                a2.pridetiZodi("aplinka");
                a2.pridetiZodi("away / distant");
                a2.pridetiZodi("kitoks");
                a2.pridetiZodi("aplinkui (arround)");
                a2.pridetiZodi("poetas");
                a2.pridetiZodi("naminis / kasdienis darbas");
                a2.pridetiZodi("griežtas");
                a2.pridetiZodi("žiūrėti į eksponatus (observe)");
                a2.pridetiZodi("laužas");
                a2.pridetiZodi("palapinė");
                a2.pridetiZodi("lydėti");
                a2.pridetiZodi("namelis");
                a2.pridetiZodi("apsvarstyti");
                a2.pridetiZodi("švęsti");
                a2.pridetiZodi("alinantis / sekinantis (exhausting)");
                a2.pridetiZodi("pristatyti / perduoti");
                a2.pridetiZodi("skundas");
                a2.pridetiZodi("toluma  / atstumas");
                a2.pridetiZodi("vyrauti");
                a2.pridetiZodi("elnias");
                a2.pridetiZodi("uola / akmuo");
                a2.pridetiZodi("skaudėti / susitraumuoti");
                a2.pridetiZodi("pašaras");
                a2.pridetiZodi("žvejoti");
                a2.pridetiZodi("upeliukas / kanaliukas");
                a2.pridetiZodi("plokščias / švelnus");
                a2.pridetiZodi("pūsti");
                a2.pridetiZodi("šlapias / drėgnas");
                a2.pridetiZodi("arklidė / prakartėlė");
                a2.pridetiZodi("padegti / uždegti");
                a2.pridetiZodi("paslapčia");
                a2.pridetiZodi("sausainukas");
                a2.pridetiZodi("atkreipti dėmesį");
                a2.pridetiZodi("aplinkybė / sąlyga");
                a2.pridetiZodi("atsižvelgiant į");
                a2.pridetiZodi("pakantus / atlaidus");
                a2.pridetiZodi("remiantis (kuo)");
                a2.pridetiZodi("nustatyti (kainą)");
                a2.pridetiZodi("šia proga");
                a2.pridetiZodi("dėl kažko (due to / on the basis of)");
                a2.pridetiZodi("užblokuotas / uždarytas");
                a2.pridetiZodi("įskaitant");
                a2.pridetiZodi("neįskaitant");
                a2.pridetiZodi("dėl (regarding / in terms of / relating to)");
                a2.pridetiZodi("dėl (regarding)");
                a2.pridetiZodi("kažko tai pasakoje");
                a2.pridetiZodi("per (within)");
                a2.pridetiZodi("pagal / pasak (according to)");
                a2.pridetiZodi("už (beyond)");
                a2.pridetiZodi("dėl trūkumo");
                a2.pridetiZodi("įkaltis / įrodymas");
                a2.pridetiZodi("išteisintas");
                a2.pridetiZodi("riba / siena");
                a2.pridetiZodi("vertė");
                a2.pridetiZodi("aukščiau / virš");
                a2.pridetiZodi("nepaisant");
                a2.pridetiZodi("netoli nuo (not far from)");
                a2.pridetiZodi("žemiau");
                a2.pridetiZodi("dėl (due to)");
                a2.pridetiZodi("naudai");
                a2.pridetiZodi("našlaičių namai");
                a2.pridetiZodi("atstovauti");
                a2.pridetiZodi("apsiginti");
                a2.pridetiZodi("exempliorius");
                a2.pridetiZodi("vertingas");
                a2.pridetiZodi("petražolės");
                a2.pridetiZodi("mėta");
                a2.pridetiZodi("ėriena");
                a2.pridetiZodi("laiškinis česnakas");
                a2.pridetiZodi("sukurti / sudaryti");
                a2.pridetiZodi("apie ką");
                a2.pridetiZodi("prižiūrėti");
                a2.pridetiZodi("įdarbinti");
                a2.pridetiZodi("teisininkas");
                a2.pridetiZodi("verslo ekonomistas");
                a2.pridetiZodi("sėkmingai");
                a2.pridetiZodi("apsvarstyti");
                a2.pridetiZodi("incidentas / nutikimas");
                a2.pridetiZodi("pabėgti / pasprukti");
                a2.pridetiZodi("padidėjimas");
                a2.pridetiZodi("paslauga ");
                a2.pridetiZodi("konsultantas");
                a2.pridetiZodi("kvėpuoti");
                a2.pridetiZodi("įsakyti / komanduoti");
                a2.pridetiZodi("užšaldyti");
                a2.pridetiZodi("degti");
                a2.pridetiZodi("pasitikėti");
                a2.pridetiZodi("švelnus / pukuotas / minkštas");
                a2.pridetiZodi("atleisti (forgive)");
                a2.pridetiZodi("grąsinti");
                a2.pridetiZodi("gilus (žinios / knowlegde) (profound)");
                a2.pridetiZodi("kailis / oda");
                a2.pridetiZodi("masažuotojas");
                a2.pridetiZodi("pasirinkti");
                a2.pridetiZodi("sekcija / segmentas / skyrius");
                a2.pridetiZodi("siuvėjas");
                a2.pridetiZodi("retkarčiais");
                a2.pridetiZodi("gervuogė");
                a2.pridetiZodi("nuolatos");
                a2.pridetiZodi("leisti (pinigus)");
                a2.pridetiZodi("leisti (pinigus)");
                a2.pridetiZodi("lyginti drabužius");
                a2.pridetiZodi("renginys");
                a2.pridetiZodi("vyriausybė");
                a2.pridetiZodi("ekonomika");
                a2.pridetiZodi("atstovas");
                a2.pridetiZodi("nusikaltimas");
                a2.pridetiZodi("padidėjimas");
                a2.pridetiZodi("užsiimti gymnastika");
                a2.pridetiZodi("interjero dizaineris");
                a2.pridetiZodi("patirti (experience)");
                a2.pridetiZodi("suvenyras");
                a2.pridetiZodi("vieta / lokacija");
                a2.pridetiZodi("kondicija");
                a2.pridetiZodi("praustuvas / kriauklė");
                a2.pridetiZodi("aplankai");
                a2.pridetiZodi("uždanga / užuolaida");
                a2.pridetiZodi("vis dėl to (nevertheless)");
                a2.pridetiZodi("reikšmingas / svarbus (significant)");
                a2.pridetiZodi("puikus / nuostabus (excellent)");
                a2.pridetiZodi("leidėjai");
                a2.pridetiZodi("dėmesingumas");
                


                System.out.println("Pasirinkite veiksmą pagal numerį sąrašę: \n" +
                        "1. Spausdinti turimą žodyną   (" + a2.getArraySize() + " žodžiai)\n" +
                        "2. Mokytis Vokiečių -- Lietuvių \n" +
                        "3. Mokytis Lietuvių -- Vokiečių");

                int meniuVeiksmas = scan.nextInt();
                scan.nextLine();

                switch (meniuVeiksmas) {
                    case 1:
                        for (int r = 0; r < a2.getArraySize(); r++) {
                            System.out.println("\n" + (r + 1) + ".  " + A2.getZodi(r) + "  ---  " + a2.getZodi(r));
                        }
                        break;
                    case 2:


                        System.out.println(ANSI_PURPLE + "Įvesti norimų testuoti žodžių kiekį: " + ANSI_RESET);
                        int x = scan.nextInt();
                        scan.nextLine();


                        if ((x < 1) || (x > a2.getArraySize())) {
                            while ((x < 1) || (x > a2.getArraySize())) {
                                System.out.println("Įvesta reikšmė negali viršyti viso žodžių sąrašo ilgio arba būti mažesnė už 0!!! \n" +
                                        "PRAŠOME PAKARTOTI");
                                System.out.println(ANSI_PURPLE + "Įvesti norimų testuoti žodžių kiekį: " + ANSI_RESET);
                                x = scan.nextInt();
                                scan.nextLine();
                            }
                        }

                        System.out.println("Testą sudarys " + x + " žodžių... \n PRADEDAM.... \n");

                        int teisingi = 0;
                        int neteisingi = 0;

                        for (int i = 0; i < x; i++) {

                            System.out.println(i + 1 + "...");


                            int randomaizeris;

                            int randomiukas = rand.nextInt(a2.getArraySize()); // sugeneruojamas random skaicius

                            randomaizeris = randomiukas; // sugeneruotas random skaicius priskiriamas kitai int reiksmei

//            System.out.println("Sugeneruotas random skaicius: " + randomiukas);

                            if (i == 0) { // jeigu tai pirmas ciklo kartas tada pridedam sugeneruotas random skaiciu prie listo ir judam toliau
                                ups.add(randomiukas);
                            } else {   // jei ne tada bandom padaryt randoma, kurio pries tai dar nebuvo
//                boolean arYraToks = false;
                                for (int y = 0; y < ups.size(); y++) {
                                    if (randomiukas == ups.get(y)) { // jei randomas lygus kazkuriam buvusiam pries tai
//                        arYraToks = true;
                                        randomiukas = rand.nextInt(a2.getArraySize()); // tada generuojam nauja randoma ir...
                                        y = -1; // ... o reiksme nustatom i nuli, kad ciklas realiai prasidetu is naujo

                                    }
                                }
                                ups.add(randomiukas); // kai iseiname is ciklo reiskia, kad nei vienas skaicius nebuvo vienodas su naujai sugeneruotu random skaiciu
                                // galime ramiai prideti randoma i lista
                                randomaizeris = randomiukas; // ir priskit savo randoma prie naujos int reiksmes ir toliau ramiai viska testi

                            }


                            System.out.print("Vokiškas žodis: " + ANSI_BLUE + A2.getZodi(randomaizeris) + ANSI_RESET);
                            System.out.println("\nĮrašyti lietuvišką žodį: ");
                            String zodeliukas = scan.nextLine();
//            scan.nextLine();
                            boolean testas = a2.arTeisingai(randomaizeris, zodeliukas);
                            if (testas) {
                                System.out.println(ANSI_CYAN + "Teisingai \n " + ANSI_RESET);
                                teisingi += 1;
                            } else {
                                System.out.println(ANSI_RED + "Neteisingai " + ANSI_RESET);
                                neteisingi += 1;
                                pakartojimuiLT1.add(a2.getZodi(randomaizeris));
                                pakartojimuiDE1.add(A2.getZodi(randomaizeris));
                                System.out.println("Teisingas žodis:   " + ANSI_YELLOW + a2.getZodi(randomaizeris) + ANSI_RESET);
                                System.out.println("");

                            }
                        }

                        double pazymys = ((teisingi * 100) / (double) x) / 10;
                        System.out.println("Teisingai įrašėte " + teisingi + "  \n" +
                                "Neteisingai įrašėte " + neteisingi + " .\n" +
                                "");
                        System.out.println("Jūsų gautas pažymys: ");
                        double suapvalintasPazymys = Math.round(pazymys * 100) / 100.0;
                        if (suapvalintasPazymys >= 8) {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :D");
                        } else if (suapvalintasPazymys >= 6) {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :)");
                        }
                        else if (suapvalintasPazymys >= 4) {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :/");
                        }
                        else {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :(");
                        }
                        System.out.println("\nTaip pat žodžiai, kuriuos derėtų pakartoti: \n");

                        for (int b = 0; b < pakartojimuiDE1.size(); b++) {

                            System.out.println(ANSI_YELLOW + (b + 1) + ". " + pakartojimuiDE1.get(b) + " --- " + pakartojimuiLT1.get(b) + ANSI_RESET);
                        }

                        break;
                    case 3:

                        System.out.println(ANSI_PURPLE + "Įvesti norimų testuoti žodžių kiekį: " + ANSI_RESET);
                        int p = scan.nextInt();
                        scan.nextLine();


                        if ((p < 1) || (p > a2.getArraySize())) {
                            while ((p < 1) || (p > a2.getArraySize())) {
                                System.out.println("Įvesta reikšmė negali viršyti viso žodžių sąrašo ilgio arba būti mažesnė už 0!!! \n" +
                                        "PRAŠOME PAKARTOTI");
                                System.out.println(ANSI_PURPLE + "Įvesti norimų testuoti žodžių kiekį: " + ANSI_RESET);
                                p = scan.nextInt();
                                scan.nextLine();
                            }
                        }

                        System.out.println("Testą sudarys " + p + " žodžių... \n PRADEDAM.... \n");

                        teisingi = 0;
                        neteisingi = 0;

                        for (int i = 0; i < p; i++) {

                            System.out.println(i + 1 + "...");


                            int randomaizeris;

                            int randomiukas = rand.nextInt(a2.getArraySize()); // sugeneruojamas random skaicius

                            randomaizeris = randomiukas; // sugeneruotas random skaicius priskiriamas kitai int reiksmei

//            System.out.println("Sugeneruotas random skaicius: " + randomiukas);

                            if (i == 0) { // jeigu tai pirmas ciklo kartas tada pridedam sugeneruotas random skaiciu prie listo ir judam toliau
                                ups.add(randomiukas);
                            } else {   // jei ne tada bandom padaryt randoma, kurio pries tai dar nebuvo
//                boolean arYraToks = false;
                                for (int y = 0; y < ups.size(); y++) {
                                    if (randomiukas == ups.get(y)) { // jei randomas lygus kazkuriam buvusiam pries tai
//                        arYraToks = true;
                                        randomiukas = rand.nextInt(a2.getArraySize()); // tada generuojam nauja randoma ir...
                                        y = -1; // ... o reiksme nustatom i nuli, kad ciklas realiai prasidetu is naujo

                                    }
                                }
                                ups.add(randomiukas); // kai iseiname is ciklo reiskia, kad nei vienas skaicius nebuvo vienodas su naujai sugeneruotu random skaiciu
                                // galime ramiai prideti randoma i lista
                                randomaizeris = randomiukas; // ir priskit savo randoma prie naujos int reiksmes ir toliau ramiai viska testi

                            }


                            System.out.print("Lietuviškas žodis: " + ANSI_BLUE + a2.getZodi(randomaizeris) + ANSI_RESET);
                            System.out.println("\nĮrašyti vokišką žodį: ");
                            String zodeliukas = scan.nextLine();
//            scan.nextLine();
                            boolean testas = A2.arTeisingai(randomaizeris, zodeliukas);
                            if (testas) {
                                System.out.println(ANSI_CYAN + "Teisingai \n " + ANSI_RESET);
                                teisingi += 1;
                            } else {
                                System.out.println(ANSI_RED + "Neteisingai " + ANSI_RESET);
                                neteisingi += 1;
                                pakartojimuiLT1.add(A2.getZodi(randomaizeris));
                                pakartojimuiDE1.add(a2.getZodi(randomaizeris));
                                System.out.println("Teisingas žodis:   " + ANSI_YELLOW + A2.getZodi(randomaizeris) + ANSI_RESET);
                                System.out.println("");

                            }
                        }

                        pazymys = ((teisingi * 100) / (double) p) / 10;
                        System.out.println("Teisingai įrašėte " + teisingi + "  \n" +
                                "Neteisingai įrašėte " + neteisingi + " .\n" +
                                "");
                        System.out.println("Jūsų gautas pažymys: ");
                        suapvalintasPazymys = Math.round(pazymys * 100) / 100.0;
                        if (suapvalintasPazymys >= 8) {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :D");
                        } else if (suapvalintasPazymys >= 6) {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :)");
                        }
                        else if (suapvalintasPazymys >= 4) {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :/");
                        }
                        else {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :(");
                        }
                        System.out.println("\nTaip pat žodžiai, kuriuos derėtų pakartoti: \n");

                        for (int b = 0; b < pakartojimuiDE1.size(); b++) {

                            System.out.println(ANSI_YELLOW + (b + 1) + ". " + pakartojimuiDE1.get(b) + " --- " + pakartojimuiLT1.get(b) + ANSI_RESET);
                        }

                        break;
                    default:
                        System.out.println("NETEISINGA ĮVESTIS\n Paleiskite programą iš naujo.....");

                }
                break;
            case 3:
                ArrayList<Integer>belenkas = new ArrayList<Integer>();

                ArrayList<String> pakartojimuiLT2 = new ArrayList<String>();
                ArrayList<String> pakartojimuiDE2 = new ArrayList<String>();
                com.company.Lt b1 = new com.company.Lt("B1");
                com.company.De B1 = new com.company.De("B1");

//                B1.pridetiZodi("passende");
//                B1.pridetiZodi("die Einleitung");
//                B1.pridetiZodi("die Folie");
//                B1.pridetiZodi("das Hilfsmittel");
//                B1.pridetiZodi("die Rückmeldung");
//                B1.pridetiZodi("übertragen");
//                B1.pridetiZodi("die Krippe");
//                B1.pridetiZodi("der Kindergarten");
//                B1.pridetiZodi("befriedigend");
//                B1.pridetiZodi("ausreichend");
//                B1.pridetiZodi("mangelhaft");
//                B1.pridetiZodi("ungenügend");
//                B1.pridetiZodi("die Gemeinde");
//                B1.pridetiZodi("die Regierung");
//                B1.pridetiZodi("der Affe");
//                B1.pridetiZodi("der Bär");
//                B1.pridetiZodi("die Biene");
//                B1.pridetiZodi("der Hase");
//                B1.pridetiZodi("die Mücke");
//                B1.pridetiZodi("das Schaf");
//                B1.pridetiZodi("die Schildkröte");
//                B1.pridetiZodi("die Schlange");
//                B1.pridetiZodi("Pfingsten");
//                B1.pridetiZodi("die Abbildung");
//                B1.pridetiZodi("der Abfall");
//                B1.pridetiZodi("die Abgase");
//                B1.pridetiZodi("abhängen");
//                B1.pridetiZodi("abheben");
//                B1.pridetiZodi("abschreiben");
//                B1.pridetiZodi("ablehnen");
//                B1.pridetiZodi("abmachen");
//                B1.pridetiZodi("absagen");
//                B1.pridetiZodi("der Abschnitt");
//                B1.pridetiZodi("die Absicht");
//                B1.pridetiZodi("abstimmen");
//                B1.pridetiZodi("der Abwart");
//                B1.pridetiZodi("abwärts");
//                B1.pridetiZodi("achten");
//                B1.pridetiZodi("die Wunde");
//                B1.pridetiZodi("allerbesten");
//                B1.pridetiZodi("allgemein");
//                B1.pridetiZodi("der Alltag");
//                B1.pridetiZodi("die Ampel");
//                B1.pridetiZodi("sich amüsieren");
//                B1.pridetiZodi("andererseits");
//                B1.pridetiZodi("anerkennen");
//                B1.pridetiZodi("die Angabe");
//                B1.pridetiZodi("der Angehörige");
//                B1.pridetiZodi("angenehm");
//                B1.pridetiZodi("ankündigen");
                B1.pridetiZodi("die Anlage");
                B1.pridetiZodi("die Anleitung");
                B1.pridetiZodi("annehmen");
                B1.pridetiZodi("die Anrede");
                B1.pridetiZodi("anschaffen");
                B1.pridetiZodi("anschnallen");
                B1.pridetiZodi("der Anspruch");
                B1.pridetiZodi("sich anstrengen");
                B1.pridetiZodi("der Antrag");
                B1.pridetiZodi("anwenden");
                B1.pridetiZodi("die Salbe");
                B1.pridetiZodi("anwesend");
                B1.pridetiZodi("die Aprikose");
                B1.pridetiZodi("das Asyl");
                B1.pridetiZodi("atmen");
//                B1.pridetiZodi("angenehmen");
                B1.pridetiZodi("auffallen");
                B1.pridetiZodi("auffordern");
                B1.pridetiZodi("aufführen");
                B1.pridetiZodi("auflösen");
                B1.pridetiZodi("aufmerksam");
                B1.pridetiZodi("die Aufnahme");
                B1.pridetiZodi("aufregen");
                B1.pridetiZodi("auftreten");
                B1.pridetiZodi("aufwärts");
//                B1.pridetiZodi("auseinander");
//                B1.pridetiZodi("ausfallen");
//                B1.pridetiZodi("die Ausgabe");
//                B1.pridetiZodi("die Aushilfe");
//                B1.pridetiZodi("ausmachen");
//                B1.pridetiZodi("die Ausnahme");
//                B1.pridetiZodi("außer Betrieb sein");
//                B1.pridetiZodi("die Aussicht");
//                B1.pridetiZodi("(sich etwas) aussuchen");
//                B1.pridetiZodi("die Bankleitzahl");
//                B1.pridetiZodi("beantragen");
//                B1.pridetiZodi("der Bedarf");
//                B1.pridetiZodi("die Bedienungsanleitung");
//                B1.pridetiZodi("die Bedingung");
//                B1.pridetiZodi("befreit");
//                B1.pridetiZodi("befriedigend");
//                B1.pridetiZodi("begleiten");
//                B1.pridetiZodi("die Behörde");
//                B1.pridetiZodi("beinahe");
//                B1.pridetiZodi("beißen");
//                B1.pridetiZodi("der Beitrag");
//                B1.pridetiZodi("der Beleg");
//                B1.pridetiZodi("beleidigen");
//                B1.pridetiZodi("bemerken");
//                B1.pridetiZodi("sich bemühen");

//                b1.pridetiZodi("tinkamas");
//                b1.pridetiZodi("įvadas / įžanga");
//                b1.pridetiZodi("skaidrė");
//                b1.pridetiZodi("pagalbinė priemonė / įrankis");
//                b1.pridetiZodi("atsiliepimas");
//                b1.pridetiZodi("perkelti");
//                b1.pridetiZodi("lopšelis / darželis");
//                b1.pridetiZodi("darželis");
//                b1.pridetiZodi("patenkinamas");
//                b1.pridetiZodi("pakankamas");
//                b1.pridetiZodi("nepakankamas / nepatenkinamas");
//                b1.pridetiZodi("nepakankamas / labai nuviliantis");
//                b1.pridetiZodi("bendruomenė");
//                b1.pridetiZodi("vyriausybė");
//                b1.pridetiZodi("beždžionė");
//                b1.pridetiZodi("meška");
//                b1.pridetiZodi("bitė");
//                b1.pridetiZodi("kiškis");
//                b1.pridetiZodi("uodas / moskitas");
//                b1.pridetiZodi("avis");
//                b1.pridetiZodi("vėžlys");
//                b1.pridetiZodi("gyvatė");
//                b1.pridetiZodi("sekminės");
//                b1.pridetiZodi("iliustracija");
//                b1.pridetiZodi("atliekos");
//                b1.pridetiZodi("išmetamosios dujos");
//                b1.pridetiZodi("priklausyti nuo");
//                b1.pridetiZodi("išimti / išsiimti");
//                b1.pridetiZodi("nurašyti");
//                b1.pridetiZodi("atmesti (reject)");
//                b1.pridetiZodi("susitarti");
//                b1.pridetiZodi("atšaukti");
//                b1.pridetiZodi("skyrius");
//                b1.pridetiZodi("ketinimas");
//                b1.pridetiZodi("balsuoti");
//                b1.pridetiZodi("ūkvedys / budėtojas");
//                b1.pridetiZodi("žemyn");
//                b1.pridetiZodi("atkreipti dėmesį");
//                b1.pridetiZodi("žaizda");
//                b1.pridetiZodi("geriausia");
//                b1.pridetiZodi("apskritai / bendrai");
//                b1.pridetiZodi("kasdieninis gyvenimas");
//                b1.pridetiZodi("šviesoforas");
//                b1.pridetiZodi("linksmintis");
//                b1.pridetiZodi("iš kitos pusės");
//                b1.pridetiZodi("pripažinti");
//                b1.pridetiZodi("informacija");
//                b1.pridetiZodi("giminaitis");
//                b1.pridetiZodi("malonus");
//                b1.pridetiZodi("paskelbti");
                b1.pridetiZodi("prisegtas failas");
                b1.pridetiZodi("instrukcija");
                b1.pridetiZodi("priimti");
                b1.pridetiZodi("pasveikinimas");
                b1.pridetiZodi("įsigyti / nusipirkti");
                b1.pridetiZodi("prisisegti diržą");
                b1.pridetiZodi("teisė kažkam");
                b1.pridetiZodi("nualinti / pasistengti");
                b1.pridetiZodi("paraiška");
                b1.pridetiZodi("naudoti (vaistus / tepalus)");
                b1.pridetiZodi("tepalas");
                b1.pridetiZodi("sudalyvauti");
                b1.pridetiZodi("abrikosas");
                b1.pridetiZodi("prieglobstis");
                b1.pridetiZodi("kvėpuoti");
//                b1.pridetiZodi("malonus");
                b1.pridetiZodi("išsiskirti (bruožu / išvaizda)");
                b1.pridetiZodi("pakviesti kažką daryti / paprašyti");
                b1.pridetiZodi("performinti");
                b1.pridetiZodi("ištirpinti");
                b1.pridetiZodi("dėmesingai");
                b1.pridetiZodi("įrašas");
                b1.pridetiZodi("nusiminti / jaudintis");
                b1.pridetiZodi("pasirodyti / pasireikšti");
                b1.pridetiZodi("į viršų");
//                b1.pridetiZodi("atskirai vienas nuo kito");
//                b1.pridetiZodi("atšaukti");
//                b1.pridetiZodi("pristatymas / išlaidos / edition");
//                b1.pridetiZodi("laikina / draugiška pagalba");
//                b1.pridetiZodi("išjungti / nuspręsti / susitarti");
//                b1.pridetiZodi("išimtis");
//                b1.pridetiZodi("neveikti");
//                b1.pridetiZodi("vaizdas");
//                b1.pridetiZodi("kažką išsirinkti");
//                b1.pridetiZodi("banko sąskaitos numeris");
//                b1.pridetiZodi("kreiptis dėl");
//                b1.pridetiZodi("poreikis");
//                b1.pridetiZodi("naudojimosi instrukcija");
//                b1.pridetiZodi("sąlyga");
//                b1.pridetiZodi("atleistas (nuo mokesčio)");
//                b1.pridetiZodi("patenkinamas");
//                b1.pridetiZodi("lydėti");
//                b1.pridetiZodi("institucija");
//                b1.pridetiZodi("beveik");
//                b1.pridetiZodi("įkąsti");
//                b1.pridetiZodi("indėlis / mokestis");
//                b1.pridetiZodi("kvitas");
//                b1.pridetiZodi("įžeisti");
//                b1.pridetiZodi("pastebėti");
//                b1.pridetiZodi("stengtis");

                System.out.println("Pasirinkite veiksmą pagal numerį sąrašę: \n" +
                        "1. Spausdinti turimą žodyną   (" + b1.getArraySize() + " žodžiai)\n" +
                        "2. Mokytis Vokiečių -- Lietuvių \n" +
                        "3. Mokytis Lietuvių -- Vokiečių");

                int elVeiksmas = scan.nextInt();
                scan.nextLine();

                switch (elVeiksmas) {
                    case 1:
                        for (int r = 0; r < b1.getArraySize(); r++) {
                            System.out.println("\n" + (r + 1) + ".  " + B1.getZodi(r) + "  ---  " + b1.getZodi(r));
                        }
                        break;
                    case 2:


                        System.out.println(ANSI_PURPLE + "Įvesti norimų testuoti žodžių kiekį: " + ANSI_RESET);
                        int x = scan.nextInt();
                        scan.nextLine();


                        if ((x < 1) || (x > b1.getArraySize())) {
                            while ((x < 1) || (x > b1.getArraySize())) {
                                System.out.println("Įvesta reikšmė negali viršyti viso žodžių sąrašo ilgio arba būti mažesnė už 0!!! \n" +
                                        "PRAŠOME PAKARTOTI");
                                System.out.println(ANSI_PURPLE + "Įvesti norimų testuoti žodžių kiekį: " + ANSI_RESET);
                                x = scan.nextInt();
                                scan.nextLine();
                            }
                        }

                        System.out.println("Testą sudarys " + x + " žodžių... \n PRADEDAM.... \n");

                        int teisingi = 0;
                        int neteisingi = 0;

                        for (int i = 0; i < x; i++) {

                            System.out.println(i + 1 + "...");


                            int randomaizeris;

                            int randomiukas = rand.nextInt(b1.getArraySize()); // sugeneruojamas random skaicius

                            randomaizeris = randomiukas; // sugeneruotas random skaicius priskiriamas kitai int reiksmei

//            System.out.println("Sugeneruotas random skaicius: " + randomiukas);

                            if (i == 0) { // jeigu tai pirmas ciklo kartas tada pridedam sugeneruotas random skaiciu prie listo ir judam toliau
                                belenkas.add(randomiukas);
                            } else {   // jei ne tada bandom padaryt randoma, kurio pries tai dar nebuvo
//                boolean arYraToks = false;
                                for (int y = 0; y < belenkas.size(); y++) {
                                    if (randomiukas == belenkas.get(y)) { // jei randomas lygus kazkuriam buvusiam pries tai
//                        arYraToks = true;
                                        randomiukas = rand.nextInt(b1.getArraySize()); // tada generuojam nauja randoma ir...
                                        y = -1; // ... o reiksme nustatom i nuli, kad ciklas realiai prasidetu is naujo

                                    }
                                }
                                belenkas.add(randomiukas); // kai iseiname is ciklo reiskia, kad nei vienas skaicius nebuvo vienodas su naujai sugeneruotu random skaiciu
                                // galime ramiai prideti randoma i lista
                                randomaizeris = randomiukas; // ir priskit savo randoma prie naujos int reiksmes ir toliau ramiai viska testi

                            }


                            System.out.print("Vokiškas žodis: " + ANSI_BLUE + B1.getZodi(randomaizeris) + ANSI_RESET);
                            System.out.println("\nĮrašyti lietuvišką žodį: ");
                            String zodeliukas = scan.nextLine();
//            scan.nextLine();
                            boolean testas = b1.arTeisingai(randomaizeris, zodeliukas);
                            if (testas) {
                                System.out.println(ANSI_CYAN + "Teisingai \n " + ANSI_RESET);
                                teisingi += 1;
                            } else {
                                System.out.println(ANSI_RED + "Neteisingai " + ANSI_RESET);
                                neteisingi += 1;
                                pakartojimuiLT2.add(b1.getZodi(randomaizeris));
                                pakartojimuiDE2.add(B1.getZodi(randomaizeris));
                                System.out.println("Teisingas žodis:   " + ANSI_YELLOW + b1.getZodi(randomaizeris) + ANSI_RESET);
                                System.out.println("");

                            }
                        }

                        double pazymys = ((teisingi * 100) / (double) x) / 10;
                        System.out.println("Teisingai įrašėte " + teisingi + "  \n" +
                                "Neteisingai įrašėte " + neteisingi + " .\n" +
                                "");
                        System.out.println("Jūsų gautas pažymys: ");
                        double suapvalintasPazymys = Math.round(pazymys * 100) / 100.0;
                        if (suapvalintasPazymys >= 8) {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :D");
                        } else if (suapvalintasPazymys >= 6) {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :)");
                        }
                        else if (suapvalintasPazymys >= 4) {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :/");
                        }
                        else {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :(");
                        }
                        System.out.println("\nTaip pat žodžiai, kuriuos derėtų pakartoti: \n");

                        for (int b = 0; b < pakartojimuiDE2.size(); b++) {

                            System.out.println(ANSI_YELLOW + (b + 1) + ". " + pakartojimuiDE2.get(b) + " --- " + pakartojimuiLT2.get(b) + ANSI_RESET);
                        }

                        break;
                    case 3:

                        System.out.println(ANSI_PURPLE + "Įvesti norimų testuoti žodžių kiekį: " + ANSI_RESET);
                        int p = scan.nextInt();
                        scan.nextLine();


                        if ((p < 1) || (p > b1.getArraySize())) {
                            while ((p < 1) || (p > b1.getArraySize())) {
                                System.out.println("Įvesta reikšmė negali viršyti viso žodžių sąrašo ilgio arba būti mažesnė už 0!!! \n" +
                                        "PRAŠOME PAKARTOTI");
                                System.out.println(ANSI_PURPLE + "Įvesti norimų testuoti žodžių kiekį: " + ANSI_RESET);
                                p = scan.nextInt();
                                scan.nextLine();
                            }
                        }

                        System.out.println("Testą sudarys " + p + " žodžių... \n PRADEDAM.... \n");

                        teisingi = 0;
                        neteisingi = 0;

                        for (int i = 0; i < p; i++) {

                            System.out.println(i + 1 + "...");


                            int randomaizeris;

                            int randomiukas = rand.nextInt(b1.getArraySize()); // sugeneruojamas random skaicius

                            randomaizeris = randomiukas; // sugeneruotas random skaicius priskiriamas kitai int reiksmei

//            System.out.println("Sugeneruotas random skaicius: " + randomiukas);

                            if (i == 0) { // jeigu tai pirmas ciklo kartas tada pridedam sugeneruotas random skaiciu prie listo ir judam toliau
                                belenkas.add(randomiukas);
                            } else {   // jei ne tada bandom padaryt randoma, kurio pries tai dar nebuvo
//                boolean arYraToks = false;
                                for (int y = 0; y < belenkas.size(); y++) {
                                    if (randomiukas == belenkas.get(y)) { // jei randomas lygus kazkuriam buvusiam pries tai
//                        arYraToks = true;
                                        randomiukas = rand.nextInt(b1.getArraySize()); // tada generuojam nauja randoma ir...
                                        y = -1; // ... o reiksme nustatom i nuli, kad ciklas realiai prasidetu is naujo

                                    }
                                }
                                belenkas.add(randomiukas); // kai iseiname is ciklo reiskia, kad nei vienas skaicius nebuvo vienodas su naujai sugeneruotu random skaiciu
                                // galime ramiai prideti randoma i lista
                                randomaizeris = randomiukas; // ir priskit savo randoma prie naujos int reiksmes ir toliau ramiai viska testi

                            }


                            System.out.print("Lietuviškas žodis: " + ANSI_BLUE + b1.getZodi(randomaizeris) + ANSI_RESET);
                            System.out.println("\nĮrašyti vokišką žodį: ");
                            String zodeliukas = scan.nextLine();
//            scan.nextLine();
                            boolean testas = B1.arTeisingai(randomaizeris, zodeliukas);
                            if (testas) {
                                System.out.println(ANSI_CYAN + "Teisingai \n " + ANSI_RESET);
                                teisingi += 1;
                            } else {
                                System.out.println(ANSI_RED + "Neteisingai " + ANSI_RESET);
                                neteisingi += 1;
                                pakartojimuiLT2.add(B1.getZodi(randomaizeris));
                                pakartojimuiDE2.add(b1.getZodi(randomaizeris));
                                System.out.println("Teisingas žodis:   " + ANSI_YELLOW + B1.getZodi(randomaizeris) + ANSI_RESET );
                                System.out.println("");

                            }
                        }

                        pazymys = ((teisingi * 100) / (double) p) / 10;
                        System.out.println("Teisingai įrašėte " + teisingi + "  \n" +
                                "Neteisingai įrašėte " + neteisingi + " .\n" +
                                "");
                        System.out.println("Jūsų gautas pažymys: ");
                        suapvalintasPazymys = Math.round(pazymys * 100) / 100.0;
                        if (suapvalintasPazymys >= 8) {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :D");
                        } else if (suapvalintasPazymys >= 6) {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :)");
                        }
                        else if (suapvalintasPazymys >= 4) {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :/");
                        }
                        else {
                            System.out.println(ANSI_RED + suapvalintasPazymys + ANSI_RESET + "    :(");
                        }
                        System.out.println("\nTaip pat žodžiai, kuriuos derėtų pakartoti: \n");

                        for (int b = 0; b < pakartojimuiDE2.size(); b++) {

                            System.out.println(ANSI_YELLOW + (b + 1) + ". " + pakartojimuiDE2.get(b) + " --- " + pakartojimuiLT2.get(b) + ANSI_RESET);
                        }

                        break;
                    default:
                        System.out.println("NETEISINGA ĮVESTIS\n Paleiskite programą iš naujo.....");

                }

                break;
            default:
                System.out.println("Neteisinga įvestis... .. Paleiskite programą iš naujo...");
                break;

        }
    }
}
