package com.example.hotumit.myfirstkotlin.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.hotumit.myfirstkotlin.R;
import com.example.hotumit.myfirstkotlin.dao.PhotoItemDao;


import java.util.List;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.FilmHolder> {

    private List<PhotoItemDao> films;
    private OnFilmClickListener onFilmClickListener;

    public PhotoAdapter(List<PhotoItemDao> films, OnFilmClickListener onFilmClickListener) {
        this.films = films;
        this.onFilmClickListener = onFilmClickListener;
    }

    public void setFilms(List<PhotoItemDao> films) {
        this.films = films;
        notifyDataSetChanged();
    }

    @Override
    public FilmHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_itemshowfeed, parent, false);
        return new FilmHolder(view, onFilmClickListener);
    }

    @Override
    public void onBindViewHolder(FilmHolder holder, int position) {
        PhotoItemDao item = films.get(position);
        Log.e("myposition","myposition"+item);
        holder.film = item;
        holder.title.setText(item.getUsername());
    }

    @Override
    public int getItemCount() {
        if (films == null) {
            return 0;
        } else {
            return films.size();
        }
    }

    static class FilmHolder extends RecyclerView.ViewHolder {

        PhotoItemDao film;
        TextView title;

        FilmHolder(View itemView, final OnFilmClickListener onFilmClickListener) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.hotel);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onFilmClickListener.onFilmClick(film);
                }
            });
        }
    }

    interface OnFilmClickListener {
        void onFilmClick(PhotoItemDao film);
    }
}
