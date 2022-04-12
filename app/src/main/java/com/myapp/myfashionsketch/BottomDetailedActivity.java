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
            data.add("https://stylesatlife.com/wp-content/uploads/2020/05/Keyhole-Neckline-Kurta-Design.jpg");
            data.add("https://i.pinimg.com/564x/a5/90/4f/a5904f056bdf6b17dcd3525fda3e0277.jpg");
            data.add("https://cdn.shopify.com/s/files/1/0021/8241/4420/products/1001-ag-002214-navy_2_1024x1024@2x.jpg?v=1580991861");
            data.add("https://stylesatlife.com/wp-content/uploads/2020/05/Sweet-Heart-Neck-Kurta-Design.jpg.webp");
            recyclerView.setAdapter(new HorizontalAdapter(data));
            return rootView;
        }
    }
}