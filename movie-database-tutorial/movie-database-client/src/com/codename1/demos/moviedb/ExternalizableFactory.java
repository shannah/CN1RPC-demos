// DO NOT MODIFY THIS FILE.  IT HAS BEEN AUTOMATICALLY GENERATED
// CHANGES MAY BE OVERWRITTEN WITHOUT NOTICE
package com.codename1.demos.moviedb;

import com.codename1.io.Util;
import java.lang.Class;

public class ExternalizableFactory {
  public void init() {
    Util.register("com.codename1.demos.moviedb.Movie", MovieImpl.class);
    Util.register("com.codename1.demos.moviedb.InsertMovieResponse", InsertMovieResponseImpl.class);
    Util.register("com.codename1.demos.moviedb.InsertMovieRequest", InsertMovieRequestImpl.class);
    Util.register("com.codename1.demos.moviedb.FindMoviesResponse", FindMoviesResponseImpl.class);
    Util.register("com.codename1.demos.moviedb.UpdateMovieResponse", UpdateMovieResponseImpl.class);
    Util.register("com.codename1.demos.moviedb.FindMoviesRequest", FindMoviesRequestImpl.class);
    Util.register("com.codename1.demos.moviedb.UpdateMovieRequest", UpdateMovieRequestImpl.class);
  }

  public <T> T create(Class<T> cls) {
    if (Movie.class.equals(cls)) {
      return (T)new MovieImpl();
    }
    if (InsertMovieResponse.class.equals(cls)) {
      return (T)new InsertMovieResponseImpl();
    }
    if (InsertMovieRequest.class.equals(cls)) {
      return (T)new InsertMovieRequestImpl();
    }
    if (FindMoviesResponse.class.equals(cls)) {
      return (T)new FindMoviesResponseImpl();
    }
    if (UpdateMovieResponse.class.equals(cls)) {
      return (T)new UpdateMovieResponseImpl();
    }
    if (FindMoviesRequest.class.equals(cls)) {
      return (T)new FindMoviesRequestImpl();
    }
    if (UpdateMovieRequest.class.equals(cls)) {
      return (T)new UpdateMovieRequestImpl();
    }
    throw new RuntimeException("No matching implementation found for class.");
  }
}
