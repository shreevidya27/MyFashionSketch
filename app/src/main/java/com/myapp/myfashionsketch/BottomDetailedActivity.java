package com.myapp.myfashionsketch;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.myapp.myfashionsketch.adapter.HorizontalAdapter;

import java.util.ArrayList;
import java.util.List;

public class BottomDetailedActivity extends Activity {
    private static final int CONTENT_VIEW_ID = 10101010;

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frame = new FrameLayout(this);
        frame.setId(CONTENT_VIEW_ID);
        setContentView(frame, new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT));

        if (savedInstanceState == null) {
            Fragment newFragment = new DebugExampleTwoFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(CONTENT_VIEW_ID,newFragment).commit();
        }
    }

    public static class DebugExampleTwoFragment extends Fragment {
        RecyclerView recyclerView;
        List<String> data = new ArrayList<>();
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView =inflater.inflate(R.layout.bottom_activity_detailed, container, false);
            recyclerView = rootView.findViewById(R.id.recycler);
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
            data.add("https://www.linkpicture.com/q/ic_skirt_wear-5.png");
            data.add("https://www.linkpicture.com/q/ic_skirt_wear-6.png");
            data.add("https://www.linkpicture.com/q/ic_skirt_wear-4.png");
            data.add("https://www.linkpicture.com/q/ic_skirt_wear-2.png");
            data.add("https://www.linkpicture.com/q/ic_skirt_wear-3.png");
            recyclerView.setAdapter(new HorizontalAdapter(data));
            return rootView;
        }
    }
}