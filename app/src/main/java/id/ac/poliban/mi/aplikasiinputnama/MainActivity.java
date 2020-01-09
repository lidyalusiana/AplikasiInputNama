package id.ac.poliban.mi.aplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNama = findViewById(R.id.etNama);
        Button btButton = findViewById(R.id.btButton);

        btButton.setOnClickListener(View -> {
            Toast.makeText(this, "Selamat Datang ", Toast.LENGTH_SHORT).show();
        });
    }
}
