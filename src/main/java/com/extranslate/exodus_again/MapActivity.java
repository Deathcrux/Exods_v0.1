package com.extranslate.exodus_again;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

///com.google.android.gms.maps.MapView
//android:id="@+id/mapView"
//android:layout_width="wrap_content"
//android:layout_height="wrap_content"
//    tools:layout_editor_absoluteX="184dp"
//    tools:layout_editor_absoluteY="189dp" />
public class MapActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Button GotoActivityBtn = findViewById(R.id.GotoMainActivityBtn);

        GotoActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
