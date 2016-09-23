/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find numbers TextView
        TextView numbersClick = (TextView) findViewById(R.id.numbers);

        numbersClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numbersPage = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersPage);
            }
        });

        TextView colorsClick = (TextView) findViewById(R.id.colors);

        colorsClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent colorsPage = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsPage);
            }
        });

        // find family view
        TextView familyView = (TextView) findViewById(R.id.family);

        // assign click listener to view
        familyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyPage = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyPage);
            }
        });

        // find phrases view
        TextView phraseView = (TextView) findViewById(R.id.phrases);

        // set click listener to textview
        phraseView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesPage = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesPage);
            }
        });
    }

    public void familyIntent(View view) {
        Intent goToFamily = new Intent(this, NumbersActivity.class);
        startActivity(goToFamily);
    }

    public void colorsIntent(View view) {
        Intent goToColors = new Intent(this, NumbersActivity.class);
        startActivity(goToColors);
    }

    public void phrasesIntent(View view) {
        Intent goToPhrases = new Intent(this, NumbersActivity.class);
        startActivity(goToPhrases);
    }
}
