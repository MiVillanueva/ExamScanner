package com.example.scan;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class activity_AddClass extends AppCompatActivity {

    private List<String> classList = new ArrayList<>();
    private TextView tvClassList;
    private EditText editClassName;
    private EditText editClassId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_class);

        Button addButton = findViewById(R.id.button);
        tvClassList = findViewById(R.id.tvClassList);
        editClassName = findViewById(R.id.editClassName);
        editClassId = findViewById(R.id.editClassId);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addClass();
            }
        });
    }

    private void addClass() {
        String className = editClassName.getText().toString().trim();
        String classId = editClassId.getText().toString().trim();
        String classInfo = className + " (ID: " + classId + ")";
        classList.add(classInfo);
        updateClassListUI();
        clearInputs();
    }

    private void updateClassListUI() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String classInfo : classList) {
            stringBuilder.append(classInfo).append("\n");
        }
        tvClassList.setText(stringBuilder.toString());
    }

    private void clearInputs() {
        editClassName.setText("");
        editClassId.setText("");
    }
}
