package com.example.kato_android_application;

import static android.view.View.INVISIBLE;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

public class MessagePopupBox extends Fragment {
    private ConstraintLayout mainContainer = null;

    private TextView messageLabel = null;

    private Button okButton = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.message_popup_box, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        this.mainContainer = view.findViewById(R.id.MainContainer);

        this.messageLabel = view.findViewById(R.id.MessageLabel);

        this.okButton = view.findViewById(R.id.OkButton);

        this.okButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MessagePopupBox.this.setVisibility(INVISIBLE);
                    }
                }
        );
    }

    public void setVisibility(int visibility)
    {
        if (this.mainContainer != null)
        {
            this.mainContainer.setVisibility(visibility);
        }
    }
}
