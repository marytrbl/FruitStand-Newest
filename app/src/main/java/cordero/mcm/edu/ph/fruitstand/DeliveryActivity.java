package cordero.mcm.edu.ph.fruitstand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        submitbtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(DeliveryActivity.this, SummaryActivity.class);
                        i.putExtra("ID", deliveryID.getText().toString());
                        i.putExtra("Name", deliveryName.getText().toString());
                        i.putExtra("Info1", fruitDlvrd.getText().toString());
                        i.putExtra("Info2", deliveryLoc.getText().toString());
                        i.putExtra("Info3",deliveryDate.getText().toString());
                        i.putExtra("Entity", "delivery");
                        startActivity(i);
                    }
                }
        );
    }
}
