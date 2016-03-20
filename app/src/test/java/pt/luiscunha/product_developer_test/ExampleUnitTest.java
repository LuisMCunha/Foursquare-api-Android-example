package pt.luiscunha.product_developer_test;

import android.content.Context;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
  @Test
  public void test1() {
    //  create mock
    Context context = Mockito.mock(Context.class);
    MainControllerImpl test = Mockito.mock(MainControllerImpl.class, Mockito.CALLS_REAL_METHODS);
    VenueRecyclerAdapter mockAdapter = Mockito.mock(VenueRecyclerAdapter.class);
    List mockList = Mockito.mock(ArrayList.class);
    // define return value for method getUniqueId()
    test.getVenuesData("test", mockList, mockAdapter, context);

    // use mock in test....
//    assertEquals(test.getUniqueId(), 43);
  }

}