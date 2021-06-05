package com.example.moha.ui.home;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.moha.HelpActivity;
import com.example.moha.IslamicCalenderActivity;
import com.example.moha.LoginRegisterActivity;
import com.example.moha.R;
import com.example.moha.SalahTimingActivity;
import com.example.moha.SettingsActivity;
import com.example.moha.TenSurahActivity;
import com.example.moha.ZakatCalculatorActivity;

public class HomeFragment extends Fragment {

    LinearLayout llSalah, llZakat, llIslamicCal, ll10Surahs, llSettings, llHelp;
    Button btnLogout;
    AlertDialog.Builder builder;
    AlertDialog alertDialog;
    private HomeViewModel homeViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

        builder = new AlertDialog.Builder(getContext());

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        //((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        //  final TextView textView = root.findViewById(R.id.text_home);

        alertDialog = builder.create();
        llSalah = root.findViewById(R.id.llSalah);
        llZakat = root.findViewById(R.id.llZakat);
        llIslamicCal = root.findViewById(R.id.llIslamCal);
        ll10Surahs = root.findViewById(R.id.ll10);
        llSettings = root.findViewById(R.id.llsettings);

        llHelp = root.findViewById(R.id.llHelp);
        btnLogout = root.findViewById(R.id.btnLogout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        llSalah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), SalahTimingActivity.class);
                getActivity().startActivity(intent);
            }
        });

        llZakat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), ZakatCalculatorActivity.class);
                getActivity().startActivity(intent);
            }
        });

        llIslamicCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), IslamicCalenderActivity.class);
                getActivity().startActivity(intent);
            }
        });

        ll10Surahs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), TenSurahActivity.class);
                getActivity().startActivity(intent);
            }
        });

        llSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), SettingsActivity.class);
                getActivity().startActivity(intent);
            }
        });

        llHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), HelpActivity.class);
                getActivity().startActivity(intent);
            }
        });


        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });


        return root;
    }

    public void logout() {


        //Setting message manually and performing action on button click
        builder.setMessage("Do you want to Logout?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
/*

                        Intent intent = new Intent(getActivity(), LoginRegisterActivity.class);
                        getActivity().startActivity(intent);
*/

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //  Action for 'NO' Button
                        dialog.cancel();
                    }
                });
        //Creating dialog box
        AlertDialog alert = builder.create();
        //Setting the title manually
        //   alert.setTitle("Logout Alert!");
        alert.show();
    }


}