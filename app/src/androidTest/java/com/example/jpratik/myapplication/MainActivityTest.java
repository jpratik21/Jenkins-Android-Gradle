package com.example.jpratik.myapplication;

import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.assertion.ViewAssertions;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.TestCase;

import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.action.ViewActions.typeTextIntoFocusedView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by jpratik on 8/5/15.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity activity;
    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception{
        super.setUp();
        activity = getActivity();
    }

    @SmallTest
    public void testShouldLaunchSecondActivity() throws InterruptedException {

        Thread.sleep(10000);

        onView(withId(R.id.editText)).perform(click()).perform(typeText("pratik"));

        onView(withId(R.id.editText2)).perform(click()).perform(typeText("jaiswal"));

        Thread.sleep(10000);

        onView(withId(R.id.button)).perform(click());

        //here, second activity should be launched and so, verify it.

        Thread.sleep(20000);
    }
}
