/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.support.v7.app.AppCompatActivity
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  java.lang.Class
 *  java.lang.Object
 */
package com.example.terry.triviaflic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.example.terry.triviaflic.AcademicActivity;
import com.example.terry.triviaflic.ClassActivity;
import com.example.terry.triviaflic.ClubActivity;
import com.example.terry.triviaflic.HolidayActivity;
import com.example.terry.triviaflic.SportActivity;
import com.example.terry.triviaflic.TeacherActivity;

public class PlayActivity
extends AppCompatActivity {
    private Button academicBtn;
    private Button classBtn;
    private Button clubBtn;
    private Button holidayBtn;
    private Button sportBtn;
    private Button teacherBtn;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296288);
        this.academicBtn = (Button)this.findViewById(2131165190);
        this.classBtn = (Button)this.findViewById(2131165225);
        this.clubBtn = (Button)this.findViewById(2131165226);
        this.holidayBtn = (Button)this.findViewById(2131165240);
        this.teacherBtn = (Button)this.findViewById(2131165305);
        this.sportBtn = (Button)this.findViewById(2131165295);
        this.academicBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                PlayActivity.this.openAcademic();
            }
        });
        this.classBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                PlayActivity.this.openClass();
            }
        });
        this.clubBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                PlayActivity.this.openClub();
            }
        });
        this.holidayBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                PlayActivity.this.openHoliday();
            }
        });
        this.teacherBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                PlayActivity.this.openTeacher();
            }
        });
        this.sportBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                PlayActivity.this.openSport();
            }
        });
    }

    public void openAcademic() {
        this.startActivity(new Intent((Context)this, AcademicActivity.class));
    }

    public void openClass() {
        this.startActivity(new Intent((Context)this, ClassActivity.class));
    }

    public void openClub() {
        this.startActivity(new Intent((Context)this, ClubActivity.class));
    }

    public void openHoliday() {
        this.startActivity(new Intent((Context)this, HolidayActivity.class));
    }

    public void openSport() {
        this.startActivity(new Intent((Context)this, SportActivity.class));
    }

    public void openTeacher() {
        this.startActivity(new Intent((Context)this, TeacherActivity.class));
    }

}

