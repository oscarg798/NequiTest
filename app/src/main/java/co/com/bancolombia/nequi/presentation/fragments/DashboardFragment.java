package co.com.bancolombia.nequi.presentation.fragments;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.com.bancolombia.nequi.R;
import co.com.bancolombia.nequi.presentation.fragments.base.BaseFragment;


public class DashboardFragment extends BaseFragment {

    private FloatingActionButton mFABMoneyUse;

    private FloatingActionButton mFABX;

    public DashboardFragment() {
        // Required empty public constructor
    }

    public static DashboardFragment newInstance() {
        DashboardFragment fragment = new DashboardFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_dashboard, container, false);
        initViewComponents(view);
        return view;
    }

    @Override
    public void initViewComponents(View view) {
        super.initViewComponents(view);
        mFABMoneyUse = (FloatingActionButton) view.findViewById(R.id.fab_money_use);
        mFABX = (FloatingActionButton) view.findViewById(R.id.fab_x);

        mFABMoneyUse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }
}
