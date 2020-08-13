package com.urrecliner.excercisecount;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class Vars {
    static SharedPreferences sharedPreferences;

    static ArrayList<GxInfo> gxInfos;
    static GxInfo gxInfo;
    static RecyclerViewAdapter recyclerViewAdapter;

    @SuppressLint("StaticFieldLeak")
    static Context mContext;
    @SuppressLint("StaticFieldLeak")
    static Activity mActivity;
    @SuppressLint("StaticFieldLeak")
    static RecyclerView recyclerView;
    static Utils utils;
    static int currIdx;
    static boolean cdtRunning;
    static int spanCount;
    static int sizeX;
    static int[] soundSource = {    // 1 ~ 19
            R.raw.s_00, R.raw.s_01, R.raw.s_02, R.raw.s_03, R.raw.s_04, R.raw.s_05, R.raw.s_06, R.raw.s_07, R.raw.s_08, R.raw.s_09,
                R.raw.s_10, R.raw.s_11, R.raw.s_12, R.raw.s_13, R.raw.s_14, R.raw.s_15, R.raw.s_16, R.raw.s_17, R.raw.s_18, R.raw.s_19, R.raw.s_20};
    static int[] soundTenSource = { // 10 ~ 80
            0, R.raw.s_10, R.raw.s_20, R.raw.s_30, R.raw.s_40, R.raw.s_50, R.raw.s_60, R.raw.s_70, R.raw.s_80};
    static int[] soundStep = {R.raw.b0, R.raw.b1, R.raw.b2, R.raw.b3};
//    static int[] soundStep = {
//            0, R.raw.e_01, R.raw.e_02, R.raw.e_03, R.raw.e_04, R.raw.e_05, R.raw.e_06, R.raw.e_07, R.raw.e_08, R.raw.e_09,
//            R.raw.e_10, R.raw.e_11, R.raw.e_12, R.raw.e_13};
                                    // 0            1               2           3               4
    static int[] soundSpecial = { R.raw.i_keep, R.raw.i_nomore, R.raw.i_start, R.raw.i_ready, R.raw.i_last};
    static int [] countUpDowns = {R.mipmap.icon_count_up, R.mipmap.icon_count_down, R.mipmap.icon_count_up5, R.mipmap.icon_count_down5};

    static int[] sndTbl, sndTenTbl, sndStepTbl, sndSpecialTbl;

    static TextView nowTVMainCount, nowTVStepCount, nowTVHoldCount;
    static ImageView nowIVShout, nowIVStop, nowIVReady, nowIVStart;
//    static GifView nowGifView;
    static CardView nowCard;
    static int [] soundTable, soundTime;
    static String[] soundText;
    static Shouter shouter = new Shouter();
    static boolean speakName = true;

}
