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
import com.example.terry.triviaflic.PlayActivity;
import com.example.terry.triviaflic.RulesActivity;

public class MainActivity
extends AppCompatActivity {
    private Button playBtn;
    private Button rulesBtn;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296287);
        this.rulesBtn = (Button)this.findViewById(2131165273);
        this.playBtn = (Button)this.findViewById(2131165267);
        this.rulesBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                MainActivity.this.openRules();
            }
        });
        this.playBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                MainActivity.this.openPlay();
            }
        });
    }

    public void openPlay() {
        this.startActivity(new Intent((Context)this, PlayActivity.class));
    }

    public void openRules() {
        this.startActivity(new Intent((Context)this, RulesActivity.class));
    }

}

