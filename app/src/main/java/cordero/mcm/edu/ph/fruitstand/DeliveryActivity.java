package cordero.mcm.edu.ph.fruitstand;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class DeliveryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);

        final EditText deliveryID = findViewById(R.id.deliveryid); /* customer/suppler info(??) */
        final EditText deliveryName = findViewById(R.id.deliveryname); /* customer/suppler info(??) */
        final EditText fruitDlvrd = findViewById(R.id.fruitsdlvr);
        final EditText deliveryLoc = findViewById(R.id.deliverloc);
        final EditText deliveryDate = findViewById(R.id.deliverdate);
        final Button submitbtn = findViewById(R.id.submitbtn);
    }
}
