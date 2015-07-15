package com.swet.buggyapp.bug;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.swet.buggyapp.R;

public class ButtonBugActivity extends AbstractBugActivity {

    private Button sayHi;
    private Button sayHello;
    private Button crashMe;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_bug);

        sayHi    = (Button) findViewById(R.id.say_hi_button);
        sayHello = (Button) findViewById(R.id.say_hello_button);
        crashMe  = (Button) findViewById(R.id.crash_me_button);
        textView = (TextView) findViewById(R.id.text_view);
    }

    public void sayHi(View _) {
        this.textView.setText("Hii");
    }

    public void sayHello(View _) {
        this.textView.setText("Hello");
    }

// Commenting out the below method so that application will be crashed on pressing "crashMe" button

//    public void crashMe(View _) {
//        // On pressing this button, application will be crashed for android 4.2.x
//        if (Build.VERSION.SDK_INT == 17) {
//            throw new RuntimeException("This is a crash");
//        }
//    }


}
