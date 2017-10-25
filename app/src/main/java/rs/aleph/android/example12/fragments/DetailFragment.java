package rs.aleph.android.example12.fragments;

import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example12.R;
import rs.aleph.android.example12.model.Sastojak;
import rs.aleph.android.example12.providers.CategoryProvider;
import rs.aleph.android.example12.providers.JeloProvider;

/**
 * Created by androiddevelopment on 20.10.17..
 */

public class DetailFragment extends Fragment {
    private int position = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        // Each lifecycle method should call the method it overrides
        super.onCreate(savedInstanceState);
        // setContentView method draws UI
           // Shows a toast message (a pop-up message)
        Toast toast = Toast.makeText(getActivity(), "DetailFragment.onCreate()", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (savedInstanceState != null) {
            position = savedInstanceState.getInt("position", 0);
        }


        ImageView ivImage = (ImageView) getActivity().findViewById(R.id.iv_slika);
        InputStream is = null;
        try {
            is = getActivity().getAssets().open(JeloProvider.getJeloById(position).getSlika());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }



        TextView tvName = (TextView) getActivity().findViewById(R.id.tv_name);
        tvName.setText(JeloProvider.getJeloById(position).getNaziv());

        TextView tvOpis = (TextView) getActivity().findViewById(R.id.tv_opis);
        tvOpis.setText(JeloProvider.getJeloById(position).getOpisJela());


        Spinner category = (Spinner) getActivity().findViewById(R.id.sp_category);
        List<String> categoryNames = CategoryProvider.getCategoryNames();
        ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, categoryNames);
        category.setAdapter(adapter);
        category.setSelection((int)JeloProvider.getJeloById(position).getCategory().getId());


        TextView tvCena = (TextView) getActivity().findViewById(R.id.tv_cena);
        String s = String.valueOf(JeloProvider.getJeloById(position).getCena());
        tvCena.setText(s);


        TextView tvKalorijskaVrednost = (TextView) getActivity().findViewById(R.id.tv_kalorija);
        s = String.valueOf(JeloProvider.getJeloById(position).getKalorijskaVrednost());
        tvKalorijskaVrednost.setText(s);



        RatingBar rbOcena = (RatingBar) getActivity().findViewById(R.id.rb_ocena);
        float r = JeloProvider.getJeloById(position).getOcena();
        rbOcena.setRating(r);

        List<Sastojak> sastojci = JeloProvider.getJeloById(position).getSastojci();
        List<String> sastojciNaziv = new ArrayList<>();
        for (Sastojak sastojak:sastojci){
            sastojciNaziv.add(sastojak.toString());
        }
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(getActivity(), R.layout.list_item,sastojciNaziv);
        ListView lvSastojci = (ListView)getActivity().findViewById(R.id.listOfSastojak);
        lvSastojci.setAdapter(dataAdapter);






        Button btnOrder = (Button) getActivity().findViewById(R.id.btn_order);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(), "You've ordered " + JeloProvider.getJeloById(position).getNaziv() + "!", Toast.LENGTH_LONG);
                toast.show();
            }
        });





    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Toast.makeText(getActivity(),"DetailFragment.onSaveInstanceState()",Toast.LENGTH_SHORT).show();
        savedInstanceState.putInt("position",position);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Toast.makeText(getActivity(),"DetailFragment.onCreateView()",Toast.LENGTH_SHORT).show();
        View view = inflater.inflate(R.layout.fragment_detail,container,false);
        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    public void setContent(final int position){
        Log.v("DetailFragment", "setContent() sets position to " + position);
        this.position = position;
    }

    public void updateContent(final int position){

        this.position = position;
        Log.v("DetailFragment", "updateContent() sets position to " + position);
        ImageView ivImage = (ImageView) getActivity().findViewById(R.id.iv_slika);
        InputStream is = null;
        try {
            is = getActivity().getAssets().open(JeloProvider.getJeloById(position).getSlika());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }



        TextView tvName = (TextView) getActivity().findViewById(R.id.tv_name);
        tvName.setText(JeloProvider.getJeloById(position).getNaziv());

        TextView tvOpis = (TextView) getActivity().findViewById(R.id.tv_opis);
        tvOpis.setText(JeloProvider.getJeloById(position).getOpisJela());


        Spinner category = (Spinner) getActivity().findViewById(R.id.sp_category);
        List<String> categoryNames = CategoryProvider.getCategoryNames();
        ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, categoryNames);
        category.setAdapter(adapter);
        category.setSelection((int)JeloProvider.getJeloById(position).getCategory().getId());


        TextView tvCena = (TextView) getActivity().findViewById(R.id.tv_cena);
        String s = String.valueOf(JeloProvider.getJeloById(position).getCena());
        tvCena.setText(s);


        TextView tvKalorijskaVrednost = (TextView) getActivity().findViewById(R.id.tv_kalorija);
        s = String.valueOf(JeloProvider.getJeloById(position).getKalorijskaVrednost());
        tvKalorijskaVrednost.setText(s);



        RatingBar rbOcena = (RatingBar) getActivity().findViewById(R.id.rb_ocena);
        float r = JeloProvider.getJeloById(position).getOcena();
        rbOcena.setRating(r);

        List<Sastojak> sastojci = JeloProvider.getJeloById(position).getSastojci();
        List<String> sastojciNaziv = new ArrayList<>();
        for (Sastojak sastojak:sastojci){
            sastojciNaziv.add(sastojak.toString());
        }
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(getActivity(), R.layout.list_item,sastojciNaziv);
        ListView lvSastojci = (ListView)getActivity().findViewById(R.id.listOfSastojak);
        lvSastojci.setAdapter(dataAdapter);






        Button btnOrder = (Button) getActivity().findViewById(R.id.btn_order);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(), "You've ordered " + JeloProvider.getJeloById(position).getNaziv() + "!", Toast.LENGTH_LONG);
                toast.show();
            }
        });

}



}
