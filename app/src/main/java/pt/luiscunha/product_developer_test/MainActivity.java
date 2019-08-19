package pt.luiscunha.product_developer_test;

import android.app.SearchManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  private ArrayList<VenueModel> venuesList;
  private RecyclerView.Adapter venuesRecyclerAdapter;
  private MainController mainController;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    venuesList = new ArrayList<>();
    mainController = new MainControllerImpl();

    RecyclerView mRecyclerView = findViewById(R.id.venues_recycler_view);
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

    mRecyclerView.setLayoutManager(linearLayoutManager);
    venuesRecyclerAdapter = new VenueRecyclerAdapter(venuesList, MainActivity.this);
    mRecyclerView.setAdapter(venuesRecyclerAdapter);

    mainController.getVenuesData("London", venuesList, venuesRecyclerAdapter, MainActivity.this); //initialize the list in an arbitrary location
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {

    getMenuInflater().inflate(R.menu.menu_main, menu);
    final MenuItem searchMenuItem = menu.findItem(R.id.action_search);
    final SearchView searchView = (SearchView) searchMenuItem.getActionView();
    SearchManager searchManager = (SearchManager) getSystemService(SEARCH_SERVICE);

    if (searchManager != null) {
      searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
    }

    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

      @Override
      public boolean onQueryTextSubmit(String queryString) {

        mainController.getVenuesData(queryString, venuesList, venuesRecyclerAdapter, MainActivity.this);

        searchView.clearFocus();
        searchMenuItem.collapseActionView();
        searchView.setQuery("", false);

        return true;
      }

      @Override
      public boolean onQueryTextChange(String queryString) {
        return false;
      }
    });
    return true;
  }
}