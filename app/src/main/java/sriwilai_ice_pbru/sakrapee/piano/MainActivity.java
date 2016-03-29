package sriwilai_ice_pbru.sakrapee.piano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //2. Explicit
    //access type name
    private Button DoButton;
    private Button LeButton;
    private Button MeButton;
    private Button FaButton;
    private Button SoButton;
    private Button LaButton;
    private Button TiButton;
    private Button DOButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3. Bind widget
        bindwidget();




    }//Main Method

    private void bindwidget() {
        DoButton = (Button) findViewById(R.id.button);
        LeButton = (Button) findViewById(R.id.button2);
        MeButton = (Button) findViewById(R.id.button3);
        FaButton = (Button) findViewById(R.id.button4);
        SoButton = (Button) findViewById(R.id.button5);
        LaButton = (Button) findViewById(R.id.button6);
        TiButton = (Button) findViewById(R.id.button7);
        DOButton = (Button) findViewById(R.id.button8);

    }// Bind widget
}//Main Class
//1. การหาขอบเขตของโปรเเกรม
//2. Explicit
//3. การทำ Bind widget