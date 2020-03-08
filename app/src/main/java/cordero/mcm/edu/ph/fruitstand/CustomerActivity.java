package cordero.mcm.edu.ph.fruitstand;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        final EditText customerID = findViewById(R.id.customerid);
        final EditText customerName = findViewById(R.id.customername);
        final EditText customerFruit = findViewById(R.id.customerfruit);
        final EditText customerLoc = findViewById(R.id.customerloc);
        final Button submitbtn = findViewById(R.id.submitbtn);

    }
}
