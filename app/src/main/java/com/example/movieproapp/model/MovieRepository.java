package com.example.movieproapp.model;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.example.movieproapp.service.MovieDataService;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private ArrayList<Movie> movies = new ArrayList<>();
    private MutableLiveData<List<Movie>> mutableLiveData = new MutableLiveData<>();
    private Application application;

    public MovieRepository(Application application) {
        this.application = application;
    }

    public MutableLiveData<List<Movie>> getMutableLiveData() {

        MovieDataService movieDataService = RetrofitInstance.

    }

}
