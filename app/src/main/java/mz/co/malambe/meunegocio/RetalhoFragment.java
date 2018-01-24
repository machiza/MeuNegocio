package mz.co.malambe.meunegocio;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by secreto on 1/23/18.
 */

public class RetalhoFragment extends Fragment {

    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.retalho_fragment,container,false);
        RecyclerView mRecycler = (RecyclerView)view.findViewById(R.id.recyclerViewM);
        ListAdapter listAdapter = new ListAdapter();
        mRecycler.setAdapter(listAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecycler.setLayoutManager(layoutManager);


        return view;
    }
}
