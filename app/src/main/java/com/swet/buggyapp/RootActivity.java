package com.swet.buggyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.swet.buggyapp.bug.ButtonBugActivity;

public class RootActivity extends Activity {

    private Button buttonBugActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);

        buttonBugActivity = (Button) findViewById(R.id.button_bug_activity_button);
    }

    public void sendToButtonBugActivity(View _) {
        Intent buttonBugActivityIntent = new Intent(this, ButtonBugActivity.class);
        startActivity(buttonBugActivityIntent);
    }

}
