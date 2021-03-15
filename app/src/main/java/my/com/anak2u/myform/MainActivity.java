package my.com.anak2u.myform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText, emailEditText, phoneEditText,
    cellEditText, messageEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        cellEditText = findViewById(R.id.cellEditText);
        messageEditText = findViewById(R.id.messageEditText);
    }

    public void sendClick(View view) {
        Log.d("debug",
                nameEditText.getText().toString());
        Log.d("debug",
                emailEditText.getText().toString());
        Log.d("debug",
                cellEditText.getText().toString());
        Log.d("debug",
                phoneEditText.getText().toString());
        Log.d("debug",
                messageEditText.getText().toString());

        Intent intent = new Intent(MainActivity.this,
                DetailActivity.class);
        startActivity(intent);
    }
}