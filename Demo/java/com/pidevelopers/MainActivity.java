package com.pidevelopers;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.pidevelopers.robotype.RoboType;

/**
 * Created by almas on 24/7/15.
 */

public class MainActivity extends Activity {
    static TextView textView;

    @Override
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.text);
        RoboType.update(getString(R.string.aa),"com.pidevelopers.MainActivity",100);

    }
    public static void Robo(String te) {
        textView.append(te);
    }
}
