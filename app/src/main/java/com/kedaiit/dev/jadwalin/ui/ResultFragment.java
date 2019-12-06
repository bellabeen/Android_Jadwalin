package com.kedaiit.dev.jadwalin.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.kedaiit.dev.jadwalin.R;
import com.kedaiit.dev.jadwalin.model.Result;
import com.kedaiit.dev.jadwalin.adapter.ResultAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ResultFragment extends Fragment implements View.OnClickListener {

    private RecyclerView recyclerView;

    private LinearLayoutManager linearLayoutManager;
    private DividerItemDecoration dividerItemDecoration;
    private List<Result> list;
    private RecyclerView.Adapter adapter;

    private String url = "https://www.thesportsdb.com/api/v1/json/1/eventspastleague.php?id=4328";


    public ResultFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_result, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewResult);

        list = new ArrayList<Result>();
        adapter = new ResultAdapter(getContext(), list);

        linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), linearLayoutManager.getOrientation());

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setAdapter(adapter);


//        //Menambahan Listener, untuk menangani kejadian saat salah satu item listView di klik
//        recyclerView.setOnClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                //Mendapatkan Nama pada salah satu item yang diklik, berdasarkan posisinya
//
//                //Berpindah Activity dan Mempassing data Nama pada Activity Selanjutnya
//                Intent intent = new Intent(getContext(), DetailResult.class);
//                intent.putExtra("strHomeTeam", getString(strHomeTeam));
//                getContext().startActivity(intent);
//            }
//        });
//    }


//    Intent intent = new Intent(context, ListViewDetail.class);
//                intent.putExtra("iNama", nama);
//                intent.putExtra("iRemarks", remarks);
//                intent.putExtra("iFoto", foto);
//                intent.putExtra("iDetail", detail);
//                intent.putExtra("iKingdom", kingdom);
//                intent.putExtra("iKelas", kelas);
//                intent.putExtra("iFilum", filum);
//                intent.putExtra("iOrdo", ordo);
//                intent.putExtra("iFamili", famili);
//                context.startActivity(intent);

        getData();
        return view;

    }


    private void getData() {
        final ProgressDialog progressDialog = new ProgressDialog(getContext());
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        JsonObjectRequest my_request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    JSONArray jsonArray = response.getJSONArray("events");
                    for (int i = 0; i < jsonArray.length(); i++) {

                        JSONObject Jobj = jsonArray.getJSONObject(i);

                        Result obj = new Result();
                        obj.setStrHomeTeam(Jobj.getString("strHomeTeam"));
                        obj.setStrAwayTeam(Jobj.getString("strAwayTeam"));
                        obj.setStrDate(Jobj.getString("strDate"));
                        obj.setStrTime(Jobj.getString("strTime"));
                        obj.setStrHomeGoalDetails(Jobj.getString("strHomeGoalDetails"));
                        obj.setStrHomeRedCards(Jobj.getString("strHomeRedCards"));
                        obj.setStrHomeYellowCards(Jobj.getString("strHomeYellowCards"));
                        obj.setStrAwayGoalDetails(Jobj.getString("strAwayGoalDetails"));
                        obj.setStrAwayRedCards(Jobj.getString("strAwayRedCards"));
                        obj.setStrAwayYellowCards(Jobj.getString("strAwayYellowCards"));

                        obj.setIntHomeScore(Jobj.getString("intHomeScore"));
                        obj.setIntAwayScore(Jobj.getString("intAwayScore"));

                        list.add(obj);

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    progressDialog.dismiss();
                }
                adapter.notifyDataSetChanged();
                progressDialog.dismiss();
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Volley", "Error: " + error.getMessage());
                progressDialog.dismiss();
            }
        });



        RequestQueue requestQueue = Volley.newRequestQueue(getContext());
        requestQueue.add(my_request);
    }

    @Override
    public void onClick(View v) {

    }
}
