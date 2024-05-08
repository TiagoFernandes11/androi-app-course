package udemy.alimentos.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import adapter.FoodAdapter;
import business.FoodBusiness;
import constants.FoodConstats;
import entities.FoodEntity;
import listener.OnListClick;
import udemy.alimentos.R;

public class MainActivity extends AppCompatActivity {

    private OnListClick mListener;
    private FoodBusiness mFoodBusiness = new FoodBusiness();
    private ViewHolder mViewHolder = new ViewHolder();
    private int mFilter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        this.mListener = new OnListClick() {
            @Override
            public void onClick(int id) {
                Bundle bundle = new Bundle();
                bundle.putInt(FoodConstats.FOOD_ID, id);
                Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        };
        this.mViewHolder.mRecyclerView = findViewById(R.id.recycler_food);
        this.mViewHolder.mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.listFood();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        item.setCheckable(true);
        if (item.getItemId() == R.id.filter_low) {
            this.mFilter = FoodConstats.FILTER.CAL_LOW;
        } else if (item.getItemId() == R.id.filter_medium) {
            this.mFilter = FoodConstats.FILTER.CAL_MEDIUM;
        } else if (item.getItemId() == R.id.filter_high) {
            this.mFilter = FoodConstats.FILTER.CAL_HIGH;
        }
        this.listFood();
        return super.onOptionsItemSelected(item);
    }

    private void listFood() {
        List<FoodEntity> list = this.mFoodBusiness.getList(this.mFilter);
        this.mViewHolder.mRecyclerView.setAdapter(new FoodAdapter(list, this.mListener));
    }

    private static class ViewHolder {
        RecyclerView mRecyclerView;
    }
}