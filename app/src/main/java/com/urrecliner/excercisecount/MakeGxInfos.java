package com.urrecliner.excercisecount;

import java.util.ArrayList;

class MakeGxInfos {


    ArrayList<GxInfo> getGxArray() {
        ArrayList<GxInfo> gxDefault;

        gxDefault = new ArrayList<>();

        gxDefault.add(new GxInfo("Squat", 22, 20, false, 4, true, 10, 0, true, true, 0, 0));
        gxDefault.add(new GxInfo("플랭크", 60, 30, false, 4, false, 10, 1, true, true, 0, 0));
        gxDefault.add(new GxInfo("Jumping Jack", 90, 12, true, 4, false, 10, 0, true, true, 0, 0));
        gxDefault.add(new GxInfo("Lunge", 30, 20, false, 4, false, 10, 2, true, true, 0, 0));
        gxDefault.add(new GxInfo("푸시업", 20, 12, false, 4, false, 10, 0, true, true, 0, 0));
        gxDefault.add(new GxInfo("Burpee", 40, 10, true, 4, false, 10, 3, true, true, 0, 0));
        gxDefault.add(new GxInfo("Plank Jack", 30, 10, true, 4, false, 10, 0, true, true, 0, 0));
        gxDefault.add(new GxInfo("Crunch", 30, 10, true, 2, false, 10, 0, true, true, 0, 0));
        gxDefault.add(new GxInfo("Mount Climber", 60, 20, true, 2, false, 10, 0, true, true, 0, 0));
        gxDefault.add(new GxInfo("Leg Raise", 30, 15, false, 4, true, 10, 0, true, true, 0, 0));
        return gxDefault;
    }
}