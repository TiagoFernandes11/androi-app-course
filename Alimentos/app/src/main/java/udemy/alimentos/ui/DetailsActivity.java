package udemy.alimentos.ui;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Objects;

import constants.FoodConstats;
import udemy.alimentos.R;

public class DetailsActivity extends AppCompatActivity {

    private ViewHolder viewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details);
        int id = Integer.parseInt(Objects.requireNonNull(getIntent().getStringExtra("key")));
        this.viewHolder.mtextName = findViewById(R.id.text_name);
        this.viewHolder.mtextCalories = findViewById(R.id.text_calories);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        this.getData();
    }

    private void getData() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int id = bundle.getInt(FoodConstats.FOOD_ID);
        }
    }

    private static class ViewHolder {
        TextView mtextName;
        TextView mtextCalories;
    }
}