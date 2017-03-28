package com.example.khushal.myconverter;

import android.app.Application;

/**
 * Created by Khushal on 01-09-16.
 */
public class GlobalVars extends Application {
    private static String var2;
    private static int temp=0;
    private static double [][] area= new double[][]{
            {1,1000000,0.386102,1196000,10760000,1550000000,100,247.105},
            {0.000001,1,0.0000003861,1.19599,10.7639,1550,0.0001,0.000247105},
            {2.58999,2590000,1,3098000,27880000,4014000000L,258.999,640},
            {0.00000083613,0.836127,0.00000032283,1,9,1296,0.000083613,0.000206612},
            {0.000000092903,0.092903,0.00000003587,0.111111,1,144,0.0000092903,0.000022957},
            {0.00000000064516,0.00064516,0.0000000002491,0.000771605,0.00694444,1,0.000000064516,0.00000015942},
            {0.01,10000,0.00386102,11959.9,107639,15500000,1,2.47105},
            {0.00404686,4046.86,0.0015625,4840,43560,6273000,0.404686,1}
    };


    private static double [][] length=new double[][]{
            {1,0.001,100,1000,1000000,1000000000,0.000621371,1.09361,3.28084,39.3701,0.000539957},
            {1000,1,100000,1000000,1000000000,1000000000000L,0.621371,1093.61,3280.84,39370.1,0.539957},
            {0.01,0.00001,1,10,10000,10000000,0.0000062137,0.0109361,0.0328084,0.393701,0.0000053996},
            {0.001,0.000001,0.1,1,1000,1000000,0.00000062137,0.00109361,0.00328084,0.0393701,0.00000053996},
            {0.000001,0.000000001,0.0001,0.001,1,1000,0.00000000062137,0.0000010936,0.0000032808,0.00003937,0.00000000053996},
            {0.000000001,0.000000000001,0.0000001,0.000001,0.001,1,0.00000000000062137,0.0000000010936,0.0000000032808,0.00000003937,0.00000000000053996},
            {1609.34,1.60934,160934,1609340,1609340000,1609340000000L,1,1760,5280,63360,0.868976},
            {0.9144,0.0009144,91.44,914.4,914400,914400000,0.000568182,1,3,36,0.000493737},
            {0.3048,0.0003048,30.48,304.8,304800,304800000,0.000189394,0.333333,1,12,0.000164579},
            {0.0254,0.0000254,2.54,25.4,25400,25400000,0.000015783,0.0277778,0.0833333,1,0.000013715},
            {1852,1.852,185200,1852000,1852000000,1852000000000L,1.15078,2025.37,6076.12,72913.4,1}
    };

    private static double [][] freq=new double[][] {

            {1,0.001,0.000001,0.000000001},
            {1000,1,0.001,0.000001},
            {1000000,1000,1,0.001},
            {1000000000,1000000,1000,1}

    };

    private static double [][] dtr=new  double[][]{
            {1,0.001,0.000125,0.000976563,0.000001,0.000000125,0.00000095367,0.000000001,0.000000000125,0.00000000093132},
            {1000,1,0.125,0.976563,0.001,0.000125,0.000953674,0.000001,0.000000125,0.00000093132},
            {8000,8,1,7.8125,0.008,0.001,0.00762939,0.000008,0.000001,0.0000074506},
            {1024,1.024,0.128,1,0.001024,0.000128,0.000976563,0.000001024,0.000000128,0.00000095367},
            {1000000,1000,125,976.563,1,0.125,0.953674,0.001,0.000125,0.000931323},
            {8000000,8000,1000,7812.5,8,1,7.62939,0.008,0.001,0.00745058},
            {1049000,1048.58,131.072,1024,1.04858,0.131072,1,0.00104858,0.000131072,0.000976563},
            {1000000000,1000000,125000,976563,1000,125,953.674,1,0.125,0.931323},
            {8000000000L,8000000,1000000,7813000,8000,1000,7629.39,8,1,7.45058},
            {1074000000,1074000,134218,1049000,1073.74,134.218,1024,1.07374,0.134218,1}
    };

    private static double [][] ds=new double[][]{
            {1,0.125,0.001,0.000125,0.000976563,0.00012207,0.000001,0.000000125,0.00000095367,0.00000011921,0.000000001,0.000000000125,0.00000000093132,0.00000000011642,0.000000000001,0.000000000000125,0.00000000000090949,0.00000000000011369,0.000000000000001,0.000000000000000125,0.00000000000000088818,0.00000000000000011102},
            {8,1,0.008,0.001,0.0078125,0.000976563,0.000008,0.0000001,0.0000076294,0.00000095367,0.000000008,0.000000001,0.0000000074506,0.00000000093132,0.000000000008,0.000000000001,0.000000000007276,0.00000000000090949,0.000000000000008,0.000000000000001,0.0000000000000071054,0.00000000000000088818},
            {1000,125,1,0.125,0.976563,0.12207,0.001,0.000125,0.000953674,0.000119209,0.000001,0.000000125,0.00000093132,0.00000011642,0.000000001,0.000000000125,0.000000000949,0.00000000011369,0.000000000001,0.000000000000125,0.00000000000088818,0.00000000000011102},
            {8000,1000,8,1,7.8125,0.976563,0.008,0.001,0.00762939,0.000953674,0.000008,0.000001,0.0000074506,0.00000093132,0.000000008,0.000000001,0.000000007276,0.000000000949,0.000000000008,0.000000000001,0.000000000007105,0.00000000000088818},
            {1024,128,1.024,0.128,1,0.125,0.001024,0.000128,0.000976563,0.00012207,0.000001024,0.000000128,0.00000095367,0.00000011921,0.000000001024,0.000000000128,0.00000000093132,0.00000000011642,0.000000000001024,0.000000000000128,0.000000000000949,0.00000000000011369},
            {8192,1024,8.192,1.024,8,1,0.008192,0.001024,0.0078125,0.000976563,0.000008192,0.000001024,0.0000076294,0.00000095367,0.000000008192,0.000000001024,0.0000000074506,0.00000000093132,0.000000000008192,0.000000000001024,0.000000000007276,0.000000000000949},
            {1000000,125000,1000,125,976.563,122.07,1,0.125,0.953674,0.119209,0.001,0.000125,0.000931323,0.000116415,0.000001,0.000000125,0.000000949,0.00000011369,0.000000001,0.000000000125,0.00000000088818,0.00000000011102},
            {8000000,1000000,8000,1000,7812.5,976.563,8,1,7.62939,0.953674,0.008,0.001,0.00745058,0.000931323,0.000008,0.000001,0.000007276,0.000000949,0.000000008,0.000000001,0.0000000071054,0.00000000088818},
            {1049000,131072,1048.58,131.072,1024,128,1.04858,0.131072,1,0.125,0.00104858,0.000131072,0.000976563,0.00012207,0.0000010486,0.00000013107,0.00000095367,0.00000011921,0.0000000010486,0.00000000013107,0.00000000093132,0.00000000011642},
            {8389000,1049000,8388.61,1048.58,8192,1024,8.38861,1.04858,8,1,0.00838861,0.00104858,0.0078125,0.000976563,0.0000083886,0.0000010486,0.0000076294,0.00000095367,0.0000000083886,0.0000000010486,0.0000000074506,0.00000000093132},
            {1000000000,125000000,1000000,125000,976563,122070,1000,125,953.694,119.209,1,0.125,0.931323,0.116415,0.001,0.000125,0.000909495,0.000113687,0.000001,0.000000125,0.00000088818,0.00000011102},
            {8000000000L,1000000000,8000000,1000000,7813000,976563,8000,1000,8,1,7.45058,0.931323,0.008,0.001,0.00727596,0.000909495,0.000008,0.000001,0.0000071054,0.00000088818},
            {1074000000,134200000,1074000,134218,1049000,131072,1073.74,134.218,1024,128,1.07374,0.134218,1,0.125,0.00107374,0.000134218,0.000979563,0.00012207,0.0000010737,0.00000013422,0.00000095367,0.00000011921},
            {8590000000L,1074000000,8590000,1074000,8389000,1049000,8589.93,1073.74,8192,1024,8.58993,1.07374,8,1,0.00858993,0.00107374,0.0078125,0.000976563,0.0000085899,0.0000010737,0.0000076294,0.00000095367},
            {1000000000000L,125000000000L,1000000000,125000000,976600000,122100000,1000000,125000,953674,119209,1000,125,931.323,116.415,1,0.125,0.909495,0.113687,0.001,0.000125,0.000888178,0.000111022},
            {8000000000000L,1000000000000L,8000000000L,1000000000,7813000000L,976600000,8000000,1000000,7629000,953674,8000,1000,7450.58,931.323,8,1,7.27596,0.909495,0.008,0.001,0.00710543,0.000888178},
            {1100000000000L,137400000000L,1100000000,137400000,1074000000,134200000,1100000,137439,1049000,131072,1099.51,137.439,1024,128,1.09951,0.137439,1,0.125,0.00109951,0.000137439,0.000976563,0.00012207},
            {8796000000000L,1100000000000L,8796000000L,11000000,859000000,1074000000,8796000,11000,8389000,1049000,8796.09,1099.51,8192,1024,8.79609,1.09951,8,1,0.00879609,0.00109951,0.0078125,0.000976563},
            {1000000000000000L,125000000000000L,1000000000000L,125000000000L,976600000000L,122100000000L,1000000000,125000000,953700000,119200000,1000000,125000,931323,116415,1000,125,909.495,113.687,1,0.125,0.888178,0.111022},
            {8000000000000000L,1000000000000000L,8000000000000L,1000000000000L,7813000000000L,976600000000L,8000000000L,1000000000,7629000000L,953700000,8000000,1000000,7451000,931323,8000,1000,7275.96,909.495,8,1,7.10543,0.888178},
            {1126000000000000L,140700000000000L,1126000000000L,140700000000L,1100000000000L,137400000000L,1126000000,140700000,1074000000,134200000,1126000,140737,1049000,131072,1125.9,128,1.1259,0.140737,1,0.125},
            {9007000000000000L,1126000000000000L,9007000000000L,1126000000000L,8796000000000L,1100000000000L,9007000000L,1126000000,8590000000L,1074000000,9007000,1126000,8389000,1049000,9007.2,1125.9,8192,1024,9.0072,1.1259,8,1}
    };

    private static double [][] energy=new double[][]{
            {1,0.001,0.239006,0.000239006,0.000277778,0.00000027778,6242000000000000000L,0.000947817,0.0000000094804,0.737562},
            {1000,1,239006,0.239006,0.277778,0.000277778,6242000000000000000000D,0.947817,0.0000094804,737.562},
            {4.184,0.004184,1,0.001,0.00116222,0.0000011622,26110000000000000000D,0.00396567,0.000000039666,3.08596},
            {4184,4.184,1000,1,1.16222,0.00116222,26110000000000000000000D,3.96567,0.000039666,3085.96},
            {3600,3.6,860.421,0.860421,1,0.001,22470000000000000000000D,3.41214,0.00003413,2655.22},
            {3600000,3600,860421,860.421,1000,1,22470000000000000000000000D,3412.14,0.0341296,265500000},
            {0.00000000000000000016022,0.00000000000000000000016022,0.000000000000000000038293,0.000000000000000000000038293,0.000000000000000000000044505,0.000000000000000000000000044505,1,0.00000000000000000000015186,0.0000000000000000000000000015189,0.00000000000000000011817},
            {1055.06,1.05506,252.164,0.252164,0.293071,0.000293071,6585000000000000000000D,1,0.000010002,778.169},
            {105500000,105480,25210000,25210.4,29300.1,29.3001,658400000000000000000000000D,99976.1,1,77800000},
            {1.35582,0.00135582,0.324048,0.000324048,0.000376616,0.00000037662,8462000000000000000D,0.00128507,0.000000012854,1}
    };

    private  static  double [][] fe=new double[][]{
            {1,1.20095,0.425144,235.215},
            {0.832674,1,0.354006,282.481},
            {2.35215,2.82481,1,100},
            {235.215,282.481,100,}
    };

    private  static  double [][] mass=new double[][]{
            {1, 1000, 1000000, 1000000000, 1000000000000L, 0.984207, 1.10231, 157.473, 2204.62, 35274},
            {0.001, 1, 1000, 1000000, 1000000000L, 0.000984207, 0.00110231, 0.157473, 2.20462, 35.274},
            {0.000001, 0.001, 1, 1000, 1000000, 0.00000098421, 0.0000011023, 0.000157473, 0.00220462, 0.035274},
            {0.000000001, 0.000001, 0.001, 1, 1000, 0.00000000098421, 0.0000000011023, 0.000000157473, 0.0000022046, 0.000035274},
            {0.000000000001, 0.000000001, 0.000001, 0.001, 1, 0.00000000000098421, 0.0000000000011023, 0.00000000015747, 0.0000000022046, 0.000000035274},
            {1.01605, 1016.05, 1016000, 1016000000, 1016000000000L, 1, 1.12, 160, 2240, 35840},
            {0.907185, 907.185, 907185, 9007200000L, 907200000000L, 0.892857, 1, 142.857, 2000, 32000},
            {0.00635029, 6.35029, 6350.29, 6350000, 635000000, 0.00625, 0.007, 1, 14, 224},
            {0.000453592, 0.453592, 453.592, 453592, 453600000, 0.000446429, 0.0005, 0.0714286, 1, 16},
            {0.00002835, 0.0283495, 28.3495, 28349.5, 28350000, 0.000027902, 0.00003125, 0.00446429, 0.0625, 1}

    };

    private static double [][] pa=new double[][]{
            {1,1.11111,17.4533,60,0.0174533,3600},
            {0.9,1,15.708,54,0.015708,3240},
            {0.0572958,0.063662,1,3.43775,0.001,206.265},
            {0.0166667,0.0185185,0.290888,1,0.000290888,60},
            {57.2958,63.662,1000,3437.75,1,206265},
            {0.000277778,0.000308642,0.00484814,0.166667,0.0000048481,1}
    };

    private  static  double [][] pressure=new double[][]{
            {1,1.01325,101325,14.6959,760},
            {0.986923,1,100000,14.5038,750.062},
            {0.0000098692,0.00001,1,0.000145038,0.00750062},
            {0.068046,0.0689476,6894.76,1,51.7149},
            {0.00131579,0.00133322,133.322,0.0193368,1}
    };

    private  static double [][] speed=new double[][]{
            {1,1.46667,0.44704,1.60934,0.868976},
            {0.681818,1,0.3048,1.09728,0.592484},
            {2.23694,3.28084,1,3.6,1.94384},
            {0.621371,0.911344,0.277778,1,0.539957},
            {1.15078,1.68781,0.514444,1.852,1}
    };

    private static  double [][] time=new double[][]{
            {1,0.001,0.000001,0.000000001,0.000000000016667,0.00000000000027778,0.000000000000011574,0.0000000000000016534,0.00000000000000038052,0.00000000000000003171,0.000000000000000003171,0.0000000000000000003171},
            {1000,1,0.001,0.000001,0.000000016667,0.00000000027778,0.000000000011574,0.0000000000016534,0.00000000000038052,0.00000000000003171,0.000000000000003171,0.0000000000000003171},
            {1000000,1000,1,0.001,0.000016667,0.00000027778,0.000000011574,0.0000000016534,0.00000000038052,0.00000000003171,0.000000000003171,0.0000000000003171},
            {1000000000,1000000,1000,1,0.016667,0.00027778,0.000011574,0.0000016534,0.00000038052,0.00000003171,0.000000003171,0.0000000003171},
            {60000000000L,60000000,60000,60,1,0.0166667,0.000694444,0.000099206,0.000022831,0.0000019026,0.00000019026,0.000000019026},
            {3600000000000L,3600000000L,3600000,3600,60,1,0.0416667,0.00595238,0.00136986,0.000114155,0.000011416,0.0000011416},
            {86400000000000L,86400000000L,86400000,86400,1440,24,1,0.142857,0.0328767,0.00273973,0.000273973,0.000027397},
            {604800000000000L,604800000000L,604800000,604800,10080,168,7,1,0.230137,0.0191781,0.00191781,0.000191781},
            {2628000000000000L,2628000000000L,2628000000L,2628000,43800,730.001,30.4167,4.34524,1,0.0833334,0.00833334,0.000833334},
            {31540000000000000L,31540000000000L,31540000000L,31540000,525600,8760,365,52.1429,12,1,0.1,0.01},
            {315400000000000000L,315400000000000L,315400000000L,315400000,5256000,87600,3650,521.429,120,10,1,0.1},
            {3154000000000000000L,3154000000000000L,3154000000000L,3154000000L,52560000,876000,3650,5214.29,100,10,1},
    };

    private static double [][] volume=new double[][]{
            {1,0.001,0.000001,0.061023744094732,0.000035314666721489,0.0021133764188652,0.0010566882094326,0.00026417205235815,0.0000083864143605761},
            {1000,1,0.001,61.023744094732,0.035314666721489,2.1133764188652,1.0566882094326,0.26417205235815,0.0083864143605761},
            {1000000,1000,1,61023.744094732,35.314666721489,2113.3764188652,1056.6882094326,264.17205235815,8.3864143605761},
            {16.387064,0.016387064,0.000016387064,1,0.0005787037037037,0.034632034632035,0.017316017316017,0.0043290043290043,0.00013742870885728},
            {28316.846592,28.316846592,0.028316846592,1728,1,59.844155844156,29.922077922078,7.4805194805195,0.23747680890538},
            {473.176473,0.473176473,0.000473176473,28.875,0.016710069444444,1,0.5,0.125,0.003968253968254},
            {946.352946,0.946352946,0.000946352946,57.75,0.033420138888889,2,1,0.25,0.0079365079365079},
            {3785.411784,3.785411784,0.003785411784,231,0.13368055555556,8,4,1,0.031746031746032},
            {119240.471196,119.240471196,0.119240471196,7276.5,4.2109375,252,126,31.5,1},
    };

    public static String getVar() {
        return var2;
    }

    public static int getTemp(){return temp;}

    public static void setVar(String var) {
        var2 = var;
    }

    public  static void setTemp(int t){temp = t;}

    public static double getArea(int i,int j){return area[i][j];}

    public static double getFreq(int i,int j){return freq[i][j];}

    public static double getLength(int i,int j){return length[i][j];}

    public static double getDtr(int i,int j) {return dtr[i][j];}

    public static  double getDs(int i,int j) {return ds[i][j];}

    public static  double getEnergy(int i,int j) {return energy[i][j];}

    public static  double getFe(int i,int j) {return fe[i][j];}

    public static  double getMass(int i,int j) {return mass[i][j];}

    public static  double getPa(int i,int j) {return pa[i][j];}

    public static  double getPressure(int i,int j) {return pressure[i][j];}

    public static  double getSpeed(int i,int j) {return speed[i][j];}

    public static  double getTime(int i,int j) {return time[i][j];}

    public static  double getVolume(int i,int j) {return volume[i][j];}




}
