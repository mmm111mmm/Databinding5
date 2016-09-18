package com.newfivefour.databinding;

import android.databinding.Bindable;

public class ViewObject extends android.databinding.BaseObservable {
  private String status;
  private String name;
  private String favouriteBand;

  public ViewObject(String name, String favouriteBand, String status) {
    this.name = name;
    this.favouriteBand = favouriteBand;
    this.status = status;
  }

  @Bindable public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
    notifyPropertyChanged(com.newfivefour.databinding.BR.name);
  }

  public void setFavouriteBand(String favouriteBand) {
    this.favouriteBand = favouriteBand;
    notifyPropertyChanged(com.newfivefour.databinding.BR.favouriteBand);
  }

  @Bindable public String getFavouriteBand() {
    return this.favouriteBand;
  }

  public void setStatus(String status) {
    this.status = status;
    notifyPropertyChanged(com.newfivefour.databinding.BR.status);
  }

  @Bindable public String getStatus() {
    return status;
  }
}
