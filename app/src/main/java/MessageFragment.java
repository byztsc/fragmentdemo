package com.example.fragmentdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MessageFragment extends Fragment {

    private TextView textMessage;
    private Button buttonChange;
    private Button buttonReset;

    private String originalText = "Beyza Taşçı"; // your name

    public MessageFragment() {
        // Required empty constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_message, container, false);

        textMessage = view.findViewById(R.id.text_message);
        buttonChange = view.findViewById(R.id.button_change);
        buttonReset = view.findViewById(R.id.button_reset);

        // Set initial text
        textMessage.setText(originalText);

        // Button 1 → change text
        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textMessage.setText("Instagram"); // your favorite app
            }
        });

        // Button 2 → reset text
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textMessage.setText(originalText);
            }
        });

        return view;
    }
}