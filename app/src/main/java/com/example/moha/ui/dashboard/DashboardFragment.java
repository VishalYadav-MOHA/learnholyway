package com.example.moha.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.moha.BasicQuidaActivity;
import com.example.moha.QuranReadingActivity;
import com.example.moha.QuranPurchaseActivity;
import com.example.moha.R;

public class DashboardFragment extends Fragment {

    ImageView imgPremium, imgPremium1;
    LinearLayout linearQuran, agreementLinear;
    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        imgPremium = (ImageView) root.findViewById(R.id.premium);
        imgPremium1 = (ImageView) root.findViewById(R.id.premium1);
        linearQuran = (LinearLayout) root.findViewById(R.id.messageLinear);
        agreementLinear = (LinearLayout) root.findViewById(R.id.agreementLinear);

        imgPremium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), QuranPurchaseActivity.class);
                startActivity(intent);


            }
        });

        imgPremium1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), QuranPurchaseActivity.class);
                startActivity(intent);


            }
        });

        linearQuran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), QuranReadingActivity.class);
                startActivity(intent);

            }
        });
        agreementLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BasicQuidaActivity.class);
                startActivity(intent);

            }
        });


        return root;
    }
}