package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link the views in the layout XML file to the java code.
        final ImageView ballDisplay = findViewById(R.id.image_eightBall);

        // Stores the ball images in an array.
        final int[] ballArray = new int[] {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        // Creating a variable for the button.
        Button myButton = findViewById(R.id.askButton);

        // Tell the button to listen for clicks.
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // This code gets executed when the button is clicked.

                Random randomNumberGenerator = new Random(); // Creating a variable to store random numbers using Random().
                int number = randomNumberGenerator.nextInt(5); // Generating random numbers b/w 0-4.
                int imageResourceId = ballArray[number]; // New variable to store ball image index.

                ballDisplay.setImageResource(imageResourceId); // Assigning the random ball image.
            }
        });
    }
}
