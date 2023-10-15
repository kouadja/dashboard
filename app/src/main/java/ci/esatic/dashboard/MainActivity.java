package ci.esatic.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.cardview.widget.CardView;
public class MainActivity extends AppCompatActivity {
    private CardView phone;
    private CardView audio;
    private CardView video;
    private CardView message;
    private CardView web_site;
    private CardView location;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = findViewById(R.id.btnMessage1);
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMessage = new Intent(getApplicationContext(),MessageActivity.class);
                startActivity(intentMessage);
                finish();
            }
        });
        phone = findViewById(R.id.phone);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPhone = new Intent(getApplicationContext(),PhoneActivity.class);
                startActivity(intentPhone);
                finish();
            }
        });
        audio = findViewById(R.id.audio);
        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAudio = new Intent(getApplicationContext(),AudioActivity.class);
                startActivity(intentAudio);
                finish();
            }
        });
        video = findViewById(R.id.video);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVideo = new Intent(getApplicationContext(),VideoActivity.class);
                startActivity(intentVideo);
                finish();
            }
        });
        location = findViewById(R.id.location);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLocation = new Intent(getApplicationContext(),LocationActivity.class);
                startActivity(intentLocation);
                finish();
            }
        });
        web_site = findViewById(R.id.web_site);
        web_site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentWebSite = new Intent(getApplicationContext(),WebSiteActivity.class);
                startActivity(intentWebSite);
                finish();
            }
        });





//            @Override
//            public void onClick(View view) {
//                switch (view.getId())
//
//
//            }




    }


}