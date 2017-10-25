package rs.aleph.android.example12.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import rs.aleph.android.example12.R;
import rs.aleph.android.example12.providers.JeloProvider;

/**
 * Created by androiddevelopment on 20.10.17..
 */

public class ListFragment extends Fragment {
    OnItemSelectedListener listener;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast toast = Toast.makeText(getActivity(), "ListFragment.onCreate()", Toast.LENGTH_SHORT);
        toast.show();

    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Toast toast = Toast.makeText(getActivity(), "ListFragment.onActivityCreated()", Toast.LENGTH_SHORT);
        toast.show();

        final List<String> mealNames = JeloProvider.getJeloNames();

        // Creates an ArrayAdaptar from the array of String
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item, mealNames);

        ListView listView = (ListView) getActivity().findViewById(R.id.listofMeals);

        // Assigns ArrayAdaptar to ListView
        listView.setAdapter(dataAdapter);

        // Starts the SecondActivity and sends it the selected URL as an extra data
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listener.onItemSelected(position);
            }
        });

    }


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        Toast toast = Toast.makeText(getActivity(), "ListFragment.onCreateView()", Toast.LENGTH_SHORT);
        toast.show();

        if (container == null)
            return null;

        View view = inflater.inflate(R.layout.fragment_list,container,false);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast toast = Toast.makeText(getActivity(), "ListFragment.onDestroyView()", Toast.LENGTH_SHORT);
        toast.show();

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Toast toast = Toast.makeText(getActivity(), "ListFragment.onAttach()", Toast.LENGTH_SHORT);
        toast.show();
        try {
            listener = ( OnItemSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnItemSelectedListener");
        }
    }

    public interface OnItemSelectedListener {

        public void onItemSelected(int position);
    }
}
