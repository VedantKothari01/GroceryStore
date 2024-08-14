package com.example.grocerystore;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private ListView listViewGroceries;
    private GroceryAdapter adapter;
    private ArrayList<GroceryItem> groceriesList = new ArrayList<>();
    private TextView dateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateTextView = findViewById(R.id.textview_date);
        listViewGroceries = findViewById(R.id.listview_groceries);

        // Set initial date
        String currentDate = new SimpleDateFormat("MMMM d yyyy", Locale.getDefault()).format(new Date());
        dateTextView.setText(currentDate);

        // Initialize the list and adapter
        initArrayList();

        // Initialize and set the adapter
        adapter = new GroceryAdapter(this, groceriesList);
        listViewGroceries.setAdapter(adapter);

        // Set up the date picker
        dateTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePicker();
            }
        });

        // Handle item clicks in the list
        listViewGroceries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                GroceryItem groceryItem = adapter.getItem(position);
                Toast.makeText(MainActivity.this, groceryItem.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initArrayList() {
        groceriesList.clear();
        groceriesList.add(new GroceryItem("Potato", "https://i.imgur.com/dRnvRZZ.jpeg"));
        groceriesList.add(new GroceryItem("Onion", "https://i.imgur.com/xlJGTUT.jpeg"));
        groceriesList.add(new GroceryItem("Apple", "https://i.imgur.com/Fw42WFG.jpeg"));
        groceriesList.add(new GroceryItem("Carrot", "https://i.imgur.com/ACYuupz.jpeg"));
        groceriesList.add(new GroceryItem("Lettuce", "https://i.imgur.com/7tAUmwK.jpeg"));
        groceriesList.add(new GroceryItem("Tomato", "https://i.imgur.com/kJ4yWzib.jpg"));
        groceriesList.add(new GroceryItem("Garlic", "https://i.imgur.com/uXaaW4r.jpeg"));
        groceriesList.add(new GroceryItem("Spinach", "https://lettuceinfo.org/wp-content/uploads/2020/09/Spinach.jpg"));

        // Notify the adapter that data has changed
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }


    private void showDatePicker() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        Calendar selectedDate = Calendar.getInstance();
                        selectedDate.set(year, month, dayOfMonth);
                        String dateFormat = "MMMM d yyyy";
                        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat, Locale.getDefault());
                        dateTextView.setText(sdf.format(selectedDate.getTime()));
                    }
                }, year, month, day);
        datePickerDialog.show();
    }
}
