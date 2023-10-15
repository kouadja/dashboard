package ci.esatic.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class WebSiteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_site);

        Intent monIntent = new Intent(Intent.ACTION_VIEW);


        String url = "https://esatic.ci/";
        monIntent.setData(Uri.parse(url));
        startActivity(monIntent);

    }
}