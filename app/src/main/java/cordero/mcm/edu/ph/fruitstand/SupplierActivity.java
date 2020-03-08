package cordero.mcm.edu.ph.fruitstand;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SupplierActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplier);

        final EditText supplierID = findViewById(R.id.supplyid);
        final EditText supplierName = findViewById(R.id.supplyname);
        final EditText fruitSupply = findViewById(R.id.supplyfruit);
        final EditText supplierLoc = findViewById(R.id.supplyloc);
        final Button submitbtn = findViewById(R.id.submitbtn);
    }
}
