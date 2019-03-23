package com.dsc.android.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView title, description;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        title = (TextView) findViewById(R.id.DTitleID);
        description = (TextView) findViewById(R.id.DdescriptionID);

        extras = getIntent().getExtras();

        if (extras != null) {
            title.setText(extras.getString("title"));
            description.setText(extras.getString("description"));
        }
    }
}
