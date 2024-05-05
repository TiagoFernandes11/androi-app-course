package udemy.alimentos.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import business.FoodBusiness;
import constants.FoodConstats;
import entities.FoodEntity;
import udemy.alimentos.R;

public class DetailsActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        this.mViewHolder.mtextName = findViewById(R.id.text_name);
        this.mViewHolder.mtextCalories = findViewById(R.id.text_calories);
        this.getData();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void getData() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int id = bundle.getInt(FoodConstats.FOOD_ID);
            FoodEntity foodEntity = new FoodBusiness().get(id);
            this.mViewHolder.mtextName.setText(foodEntity.getName());
            this.mViewHolder.mtextCalories.setText(String.valueOf(foodEntity.getCalories()));
        }
    }

    private static class ViewHolder {
        TextView mtextName;
        TextView mtextCalories;
    }
}