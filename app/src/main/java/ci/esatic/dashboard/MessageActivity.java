package ci.esatic.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MessageActivity extends AppCompatActivity {
    private ImageButton btn;
    private EditText number;
    private EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message);

        btn = findViewById(R.id.back);
        number =  findViewById(R.id.number);
        message = findViewById(R.id.message);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
    public void envoyerMessage(View view) {
        String numberValue = number.getText().toString();
        String messageValue =message.getText().toString();

        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(numberValue, null, messageValue, null, null);
            Toast.makeText(this, "Message envoyé avec succès!", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(this, "Erreur lors de l'envoi du message.", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}
