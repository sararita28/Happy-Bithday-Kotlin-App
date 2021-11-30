/*
 * Copyright (C) 2020 The Android Open Source Project
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
package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private val PRESENT_STATE = "PRESENT_STATE"
    private var presentState = "click"
    private val UNOPENED = "click"
    private val OPENED = "restart"

    private var presentImage: ImageView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState != null) {
            presentState = savedInstanceState.getString(PRESENT_STATE, "click")
        }

        presentImage = findViewById(R.id.image_present_state)
        setViewElements()
        presentImage!!.setOnClickListener {
            clickPresentImage()
        }
    }


    private fun clickPresentImage() {
        if (presentState == UNOPENED){
            presentState = OPENED
        } else if ( presentState == OPENED){
            presentState = UNOPENED
        }
        setViewElements()
    }

        private fun setViewElements() {

            if (presentState == UNOPENED){
                presentImage?.setImageResource(R.drawable.present)
            } else if (presentState == OPENED){
                presentImage?.setImageResource(R.drawable.electronics)
            }
    }

    }
























