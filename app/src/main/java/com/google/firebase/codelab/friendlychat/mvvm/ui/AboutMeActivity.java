package com.google.firebase.codelab.friendlychat.mvvm.ui;

/**
 * Created by MINH NPA on 21 Jun 2016.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.google.firebase.codelab.friendlychat.R;

public class AboutMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        TextView phone = (TextView) findViewById(R.id.PhoneNumber);
        TextView google_plus = (TextView) findViewById(R.id.GooglePlus);
        TextView facebook = (TextView) findViewById(R.id.Facebook);
        if (phone != null)
            phone.setMovementMethod(LinkMovementMethod.getInstance());
        if (google_plus != null)
            google_plus.setMovementMethod(LinkMovementMethod.getInstance());
        if (facebook != null)
            facebook.setMovementMethod(LinkMovementMethod.getInstance());
    }
}