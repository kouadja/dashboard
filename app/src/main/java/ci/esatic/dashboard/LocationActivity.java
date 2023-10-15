package ci.esatic.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);
        Intent intentMap = new Intent(Intent.ACTION_VIEW);
        String url = "https://maps.google.com/maps?q=Esatic";
        intentMap.setData(Uri.parse(url));
        startActivity(intentMap);

    }

}