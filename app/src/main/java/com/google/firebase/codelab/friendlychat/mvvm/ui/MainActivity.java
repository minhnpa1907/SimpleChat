package com.google.firebase.codelab.friendlychat.mvvm.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.codelab.friendlychat.mvvm.ui.chat.ChatActivity;
import com.google.firebase.codelab.friendlychat.mvvm.ui.signin.SignInActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize FirebaseAuth
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();

        Intent intent;
        if (firebaseUser == null) {
            // Not signed in, launch the Sign In activity
            intent = new Intent(this, SignInActivity.class);
            finish();
        } else {
            intent = new Intent(this, ChatActivity.class);
        }

        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
        finish();
        overridePendingTransition(0, 0);
    }
}