/*
 * Copyright (C) 2017 Javier Delgado
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.javierdelgado.popularmovies_stage1.model;

import java.io.Serializable;

/**
 * Created by Delga on 03/05/2017.
 */

public class Movie implements Serializable {

    private int id;
    private String title;
    private String cover;
    private String releaseDate;
    private double rating;
    private String description;
    private String backdrop;
    private boolean favorite;

    public Movie(int id, String title, String cover, String backdrop, String releaseDate, double rating, String description) {
        this.id = id;
        this.title = title;
        this.cover = cover;
        this.backdrop = backdrop;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.description = description;
        // Favorite false by default
        this.favorite = false;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCover() {
        return cover;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public double getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }

    public String getBackdrop() {
        return backdrop;
    }
}
