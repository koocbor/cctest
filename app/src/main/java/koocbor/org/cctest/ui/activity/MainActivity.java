package koocbor.org.cctest.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import koocbor.org.cctest.R;
import koocbor.org.cctest.models.TestModel;

/**
 * Created by robcook on 4/20/17.
 */

public class MainActivity extends AppCompatActivity {

    TestModel model;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        model = new TestModel();
        model.setValue("Random String");

        TextView testStringView = (TextView)findViewById(R.id.test_string);
        testStringView.setText(model.getValue());
    }
}
