package co.com.bancolombia.nequi.presentation.activities.base;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by oscargallon on 2/13/17.
 */

public class BaseActivity extends AppCompatActivity {

    public void initViewComponents() {

    }

    public void initComponents() {

    }

    /**
     * This method is used to change the actual fragment and
     * add a transaction animation
     *
     * @param viewElementInWhichTheFragmentWillBeDisplayed the layout element in which
     *                                                     the fragment is displayed
     * @param fragment                                     fragment to replace
     * @param fragmentTag                                  tag to identify the fragment, optional
     * @param enterAnimation                               new fragment animation
     * @param exitAnimation                                animation to the fragment in the stack
     */
    public void changeFragment(int viewElementInWhichTheFragmentWillBeDisplayed,
                               Fragment fragment, @Nullable String fragmentTag,
                               int enterAnimation, int exitAnimation) {
        getSupportFragmentManager().beginTransaction()
                .replace(viewElementInWhichTheFragmentWillBeDisplayed,
                        fragment, fragmentTag)
                .setCustomAnimations(enterAnimation, exitAnimation)
                .commitNowAllowingStateLoss();
    }
}
