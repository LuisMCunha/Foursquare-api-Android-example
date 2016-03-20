package pt.luiscunha.product_developer_test;

import android.app.Application;
import android.test.ApplicationTestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {

  public ApplicationTest() {
    super(Application.class);
  }

  @Before
  public void setUp() throws Exception {
    super.setUp();
//    Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
//    System.setProperty("dexmaker.dexcache", instrumentation.getTargetContext().getCacheDir().getPath());
  }

  @Test
  public void test() {

//    Context context = Mockito.mock(Context.class);
//    MainControllerImpl test = Mockito.mock(MainControllerImpl.class, Mockito.CALLS_REAL_METHODS);
//    VenueRecyclerAdapter mockAdapter = Mockito.mock(VenueRecyclerAdapter.class);
//    List mockList = Mockito.mock(ArrayList.class);
//
//    test.getVenuesData("test", mockList, mockAdapter, context.getApplicationContext());
  }
}