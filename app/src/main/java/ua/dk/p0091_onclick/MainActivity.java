package ua.dk.p0091_onclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView myText;
    Button myBtn1;
    Button myBtn2;
    Button myBtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myText = (TextView) findViewById(R.id.myText);
        myBtn1 = (Button) findViewById(R.id.myBtn1);
        myBtn2 = (Button) findViewById(R.id.myBtn2);
        myBtn3 = (Button) findViewById(R.id.myBtn3);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.myBtn1:
                        myText.setText (R.string.text1);
                        break;
                    case R.id.myBtn2:
                        myText.setText (R.string.text2);
                        break;
                    case R.id.myBtn3:
                        myText.setText (R.string.text3);
                        break;
                }
            }
        };

        myBtn1.setOnClickListener(onClickListener);
        myBtn2.setOnClickListener(onClickListener);
        myBtn3.setOnClickListener(onClickListener);

        myText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myBtn3.setText(R.string.textButton);
            }
        });
    }
}
