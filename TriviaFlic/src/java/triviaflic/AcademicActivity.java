/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.hardware.Sensor
 *  android.hardware.SensorEvent
 *  android.hardware.SensorEventListener
 *  android.hardware.SensorManager
 *  android.os.Bundle
 *  android.support.v7.app.AppCompatActivity
 *  android.view.View
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 */
package com.example.terry.triviaflic;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AcademicActivity
extends AppCompatActivity
implements SensorEventListener {
    private SensorManager SM;
    private boolean correct = false;
    int counter = 0;
    private Sensor mySensor;
    private boolean pass = false;
    private int score = -1;
    Thread t;
    int time = 100;
    private TextView timeTxt;
    private TextView wordTxt;
    private String[] words = new String[]{"GPA", "Homework", "SAT", "PSAT", "Classwork", "Labs", "Worksheet", "Esssay", "Annotations", "Oral"};

    public void onAccuracyChanged(Sensor sensor, int n) {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296283);
        this.SM = (SensorManager)this.getSystemService("sensor");
        this.mySensor = this.SM.getDefaultSensor(1);
        this.SM.registerListener((SensorEventListener)this, this.mySensor, 3);
        this.wordTxt = (TextView)this.findViewById(2131165329);
        for (int i = 0; i < 10; ++i) {
            int n = (int)(10.0 * Math.random());
            String string2 = this.words[i];
            this.words[i] = this.words[n];
            this.words[n] = string2;
        }
        this.timeTxt = (TextView)this.findViewById(2131165319);
        this.t = new Thread(){

            public void run() {
                while (!this.isInterrupted()) {
                    try {
                        Thread.sleep((long)1000L);
                        AcademicActivity.this.runOnUiThread(new Runnable(){

                            /*
                             * Enabled aggressive block sorting
                             */
                            public void run() {
                                if (AcademicActivity.this.time != 0) {
                                    AcademicActivity academicActivity = AcademicActivity.this;
                                    academicActivity.time = -1 + academicActivity.time;
                                } else if (AcademicActivity.this.time == 0) {
                                    AcademicActivity.this.wordTxt.setText((CharSequence)("TIME IS OVER! Score: " + String.valueOf((int)AcademicActivity.this.score)));
                                }
                                AcademicActivity.this.timeTxt.setText((CharSequence)String.valueOf((int)AcademicActivity.this.time));
                            }
                        });
                    }
                    catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                }
            }

        };
        this.t.start();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.counter == 10) {
            this.wordTxt.setText((CharSequence)("Score: " + String.valueOf((int)this.score)));
            this.timeTxt.setText((CharSequence)"DONE");
        }
        if (Math.abs((int)((int)sensorEvent.values[0])) < 4 && (int)sensorEvent.values[2] < -4) {
            this.correct = true;
        } else if (Math.abs((int)((int)sensorEvent.values[0])) < 4 && (int)sensorEvent.values[2] > 4) {
            this.pass = true;
        }
        if (Math.abs((int)((int)sensorEvent.values[0])) > 7 && this.correct) {
            this.wordTxt.setText((CharSequence)this.words[this.counter]);
            this.counter = 1 + this.counter;
            this.score = 1 + this.score;
            this.correct = false;
            return;
        } else {
            if (Math.abs((int)((int)sensorEvent.values[0])) <= 7 || !this.pass) return;
            {
                this.wordTxt.setText((CharSequence)this.words[this.counter]);
                this.counter = 1 + this.counter;
                this.pass = false;
                return;
            }
        }
    }

}

