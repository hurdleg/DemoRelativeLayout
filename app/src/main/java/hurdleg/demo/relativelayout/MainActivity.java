package hurdleg.demo.relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Demo Android's RelativeLayout.
 *
 * A Layout where the positions of the children can be described in relation to each other or to the parent.
 *
 *  API Documentation:
 *      https://developer.android.com/reference/android/widget/RelativeLayout.html
 *
 * @author Gerald.Hurdle@AlgonquinCollege.com
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
