package com.example.domekwgorach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button ButtonLike;
    private Button ButtonDelete;
    private TextView TextViewLikes;
    private int LikeCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonLike = findViewById(R.id.ButtonLike);
        ButtonDelete = findViewById(R.id.ButtonDelete);
        TextViewLikes = findViewById(R.id.TextViewLikes);

        ButtonLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LikeCounter++;
                updateLikeCounter();
            }
        });
        ButtonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(LikeCounter > 0) {
                    LikeCounter--;
                }
                updateLikeCounter();
            }
        });
    }
    public void updateLikeCounter() {
        TextViewLikes.setText(LikeCounter + " polubień");
    }
}