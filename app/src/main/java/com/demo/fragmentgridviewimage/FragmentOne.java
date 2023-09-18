package com.demo.fragmentgridviewimage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentOne extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_one, container, false);

        ImageView imageView = view.findViewById(R.id.detailImageView);
        Bundle args = getArguments();
        if (args != null && args.containsKey("imageResource")) {
            int imageResource = args.getInt("imageResource");
            imageView.setImageResource(imageResource);
        }

        return view;
    }
}
