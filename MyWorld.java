import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 *
 */
public class MyWorld extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("BackgroundMusic1.mp3");
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld() {
        super(1500, 800, 1);
        backgroundMusic.playLoop();
        backgroundMusic.setVolume(50);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayableWombat playableWombat = new PlayableWombat();
        addObject(playableWombat,109,98);
        Wall wall = new Wall();
        addObject(wall,24,162);
        Wall wall2 = new Wall();
        addObject(wall2,74,161);
        Wall wall3 = new Wall();
        addObject(wall3,124,162);
        Wall wall4 = new Wall();
        addObject(wall4,289,25);
        Wall wall5 = new Wall();
        addObject(wall5,289,75);
        Wall wall6 = new Wall();
        addObject(wall6,288,124);
        Wall wall7 = new Wall();
        addObject(wall7,287,173);
        Wall wall8 = new Wall();
        addObject(wall8,288,223);
        Wall wall9 = new Wall();
        addObject(wall9,288,262);
        Wall wall10 = new Wall();
        addObject(wall10,287,306);
        Wall wall11 = new Wall();
        addObject(wall11,274,334);
        Wall wall12 = new Wall();
        addObject(wall12,225,334);
        Wall wall13 = new Wall();
        addObject(wall13,177,335);
        Wall wall14 = new Wall();
        addObject(wall14,177,384);
        Wall wall15 = new Wall();
        addObject(wall15,177,433);
        Wall wall16 = new Wall();
        addObject(wall16,177,484);
        Wall wall17 = new Wall();
        addObject(wall17,177,533);
        Wall wall18 = new Wall();
        addObject(wall18,177,580);
        Wall wall19 = new Wall();
        addObject(wall19,199,361);
        Wall wall20 = new Wall();
        addObject(wall20,226,580);
        Wall wall21 = new Wall();
        addObject(wall21,276,580);
        Wall wall22 = new Wall();
        addObject(wall22,322,580);
        Wall wall23 = new Wall();
        addObject(wall23,367,580);
        Wall wall24 = new Wall();
        addObject(wall24,366,553);
        Wall wall25 = new Wall();
        addObject(wall25,203,554);
        Wall wall26 = new Wall();
        addObject(wall26,192,510);
        Wall wall27 = new Wall();
        addObject(wall27,243,348);
        Wall wall28 = new Wall();
        addObject(wall28,274,318);
        Wall wall29 = new Wall();
        addObject(wall29,549,582);
        Wall wall30 = new Wall();
        addObject(wall30,483,773);
        Wall wall31 = new Wall();
        addObject(wall31,484,742);
        Wall wall32 = new Wall();
        addObject(wall32,519,793);
        Wall wall33 = new Wall();
        addObject(wall33,559,791);
        Wall wall34 = new Wall();
        addObject(wall34,607,789);
        Wall wall35 = new Wall();
        addObject(wall35,651,788);
        Wall wall36 = new Wall();
        addObject(wall36,595,583);
        Wall wall37 = new Wall();
        addObject(wall37,642,583);
        Wall wall38 = new Wall();
        addObject(wall38,665,609);
        Wall wall39 = new Wall();
        addObject(wall39,665,658);
        Wall wall40 = new Wall();
        addObject(wall40,665,706);
        Wall wall41 = new Wall();
        addObject(wall41,665,756);
        Wall wall42 = new Wall();
        addObject(wall42,666,783);
        Wall wall43 = new Wall();
        addObject(wall43,657,592);
        Kangaroo kangaroo = new Kangaroo();
        addObject(kangaroo,567,696);
        Kangaroo kangaroo2 = new Kangaroo();
        addObject(kangaroo2,277,486);
        Wall wall44 = new Wall();
        addObject(wall44,618,537);
        Wall wall45 = new Wall();
        addObject(wall45,716,608);
        Wall wall46 = new Wall();
        addObject(wall46,618,487);
        Wall wall47 = new Wall();
        addObject(wall47,619,438);
        Wall wall48 = new Wall();
        addObject(wall48,620,389);
        Wall wall49 = new Wall();
        addObject(wall49,669,387);
        Wall wall50 = new Wall();
        addObject(wall50,719,388);
        Wall wall51 = new Wall();
        addObject(wall51,596,360);
        Wall wall52 = new Wall();
        addObject(wall52,569,331);
        Wall wall53 = new Wall();
        addObject(wall53,543,301);
        Wall wall54 = new Wall();
        addObject(wall54,500,268);
        Wall wall55 = new Wall();
        addObject(wall55,544,253);
        Wall wall56 = new Wall();
        addObject(wall56,579,224);
        Wall wall57 = new Wall();
        addObject(wall57,577,182);
        Wall wall58 = new Wall();
        addObject(wall58,619,196);
        Wall wall59 = new Wall();
        addObject(wall59,577,159);
        Wall wall60 = new Wall();
        addObject(wall60,666,193);
        Wall wall61 = new Wall();
        addObject(wall61,721,194);
        Wall wall62 = new Wall();
        addObject(wall62,767,196);
        Wall wall63 = new Wall();
        addObject(wall63,801,196);
        Wall wall64 = new Wall();
        addObject(wall64,801,168);
        Wall wall65 = new Wall();
        addObject(wall65,745,364);
        Wall wall66 = new Wall();
        addObject(wall66,802,236);
        Wall wall67 = new Wall();
        addObject(wall67,766,607);
        Wall wall68 = new Wall();
        addObject(wall68,814,605);
        Wall wall69 = new Wall();
        addObject(wall69,847,576);
        Kangaroo kangaroo3 = new Kangaroo();
        addObject(kangaroo3,746,513);
        Wall wall70 = new Wall();
        addObject(wall70,645,417);
        Wall wall71 = new Wall();
        addObject(wall71,629,544);
        Wall wall72 = new Wall();
        addObject(wall72,595,553);
        Wall wall73 = new Wall();
        addObject(wall73,644,609);
        Wall wall74 = new Wall();
        addObject(wall74,655,773);
        Wall wall75 = new Wall();
        addObject(wall75,492,776);
        Wall wall76 = new Wall();
        addObject(wall76,357,570);
        Wall wall77 = new Wall();
        addObject(wall77,606,208);
        Wall wall78 = new Wall();
        addObject(wall78,775,226);
        Wall wall79 = new Wall();
        addObject(wall79,740,208);
        Kangaroo kangaroo4 = new Kangaroo();
        addObject(kangaroo4,691,101);
        Kangaroo kangaroo5 = new Kangaroo();
        addObject(kangaroo5,670,297);
        TrappedWombat trappedWombat = new TrappedWombat();
        addObject(trappedWombat,1385,92);
        Wall wall80 = new Wall();
        addObject(wall80,1238,24);
        Wall wall81 = new Wall();
        addObject(wall81,1238,75);
        Wall wall82 = new Wall();
        addObject(wall82,1238,123);
        Wall wall83 = new Wall();
        addObject(wall83,1238,172);
        Wall wall84 = new Wall();
        addObject(wall84,1239,220);
        Wall wall85 = new Wall();
        addObject(wall85,1286,201);
        Wall wall86 = new Wall();
        addObject(wall86,1337,219);
        Wall wall87 = new Wall();
        addObject(wall87,1344,256);
        Wall wall88 = new Wall();
        addObject(wall88,1344,304);
        Wall wall89 = new Wall();
        addObject(wall89,1190,221);
        Wall wall90 = new Wall();
        addObject(wall90,1139,220);
        Wall wall91 = new Wall();
        addObject(wall91,1114,246);
        Wall wall92 = new Wall();
        addObject(wall92,1344,353);
        Wall wall93 = new Wall();
        addObject(wall93,1344,399);
        Wall wall94 = new Wall();
        addObject(wall94,1307,429);
        Wall wall95 = new Wall();
        addObject(wall95,1269,424);
        Wall wall96 = new Wall();
        addObject(wall96,1218,425);
        Wall wall97 = new Wall();
        addObject(wall97,1172,424);
        Wall wall98 = new Wall();
        addObject(wall98,1119,422);
        Wall wall99 = new Wall();
        addObject(wall99,1090,388);
        Wall wall100 = new Wall();
        addObject(wall100,1071,425);
        Wall wall101 = new Wall();
        addObject(wall101,1058,400);
        Wall wall102 = new Wall();
        addObject(wall102,1110,457);
        Wall wall103 = new Wall();
        addObject(wall103,1145,466);
        Wall wall104 = new Wall();
        addObject(wall104,1144,514);
        Wall wall105 = new Wall();
        addObject(wall105,1144,561);
        Wall wall106 = new Wall();
        addObject(wall106,1031,774);
        Wall wall107 = new Wall();
        addObject(wall107,1074,798);
        Wall wall108 = new Wall();
        addObject(wall108,1102,798);
        Wall wall109 = new Wall();
        addObject(wall109,1135,798);
        Wall wall110 = new Wall();
        addObject(wall110,1165,797);
        Wall wall111 = new Wall();
        addObject(wall111,1224,799);
        Wall wall112 = new Wall();
        addObject(wall112,1272,799);
        Wall wall113 = new Wall();
        addObject(wall113,1319,798);
        Wall wall114 = new Wall();
        addObject(wall114,1357,799);
        Wall wall115 = new Wall();
        addObject(wall115,1406,798);
        Wall wall116 = new Wall();
        addObject(wall116,1453,799);
        Wall wall117 = new Wall();
        addObject(wall117,1476,799);
        Wall wall118 = new Wall();
        addObject(wall118,1045,788);
        Wall wall119 = new Wall();
        addObject(wall119,826,595);
        Wall wall120 = new Wall();
        addObject(wall120,1170,591);
        Wall wall121 = new Wall();
        addObject(wall121,1193,613);
        Wall wall122 = new Wall();
        addObject(wall122,1243,613);
        Wall wall123 = new Wall();
        addObject(wall123,1295,613);
        Wall wall124 = new Wall();
        addObject(wall124,1318,588);
        Wall wall125 = new Wall();
        addObject(wall125,1318,560);
        Wall wall126 = new Wall();
        addObject(wall126,1165,447);
        Wall wall127 = new Wall();
        addObject(wall127,1213,437);
        Wall wall128 = new Wall();
        addObject(wall128,1155,555);
        Wall wall129 = new Wall();
        addObject(wall129,1320,405);
        Wall wall130 = new Wall();
        addObject(wall130,1336,363);
        Wall wall131 = new Wall();
        addObject(wall131,1279,417);
        Wall wall1312 = new Wall();
        addObject(wall131,1107,406);
        Wall wall132 = new Wall();
        addObject(wall132,1150,232);
        Wall wall133 = new Wall();
        addObject(wall133,1302,416);
        Wall wall134 = new Wall();
        addObject(wall134,1330,446);
        Kangaroo kangaroo6 = new Kangaroo();
        addObject(kangaroo6,1234,521);
        Kangaroo kangaroo7 = new Kangaroo();
        addObject(kangaroo7,1213,330);
        Kangaroo kangaroo8 = new Kangaroo();
        addObject(kangaroo8,1437,706);
        Wall wall135 = new Wall();
        addObject(wall135,1195,789);
        Wall wall137 = new Wall();
        addObject(wall137,1321,245);
        Wall wall138 = new Wall();
        addObject(wall138,1279,231);
        Wall wall139 = new Wall();
        addObject(wall139,1239,423);
        Wall wall140 = new Wall();
        addObject(wall140,1264,613);
        Wall wall141 = new Wall();
        addObject(wall141,686,608);
        Wall wall142 = new Wall();
        addObject(wall142,693,194);
        Wall wall143 = new Wall();
        addObject(wall143,177,461);        
        kangaroo.setLocation(576,731);                       
        kangaroo7.setLocation(1213,334);        
    }
}
