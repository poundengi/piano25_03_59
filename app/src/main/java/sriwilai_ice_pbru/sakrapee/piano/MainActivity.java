package sriwilai_ice_pbru.sakrapee.piano;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    //2. Explicit
    //access type name
    private Button DoButton;
    private Button LeButton;
    private Button MiButton;
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
        //4. Button Controller
        buttonController();




    }//Main Method

    private void buttonController() {

        DoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer DoMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song1);
                DoMediaPlayer.start();

            }
        });
        LeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer LeMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song2);
                LeMediaPlayer.start();
            }
        });
        MiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer MiMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song3);
                MiMediaPlayer.start();
            }
        });
        FaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer FaMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song4);
                FaMediaPlayer.start();


            }
        });

        DOButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/kTHcaTCM4rs"));
                startActivities(intent);

            }
        });






        }
    private void bindwidget() {
        DoButton = (Button) findViewById(R.id.button);
        LeButton = (Button) findViewById(R.id.button2);
        MiButton = (Button) findViewById(R.id.button3);
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