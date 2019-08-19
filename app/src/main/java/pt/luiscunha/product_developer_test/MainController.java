package pt.luiscunha.product_developer_test;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public interface MainController {

  void getVenuesData(String area, final ArrayList<VenueModel> venuesList, final RecyclerView.Adapter venuesRecyclerAdapter, Context mainContext);
}
