package com.sample.testing;

import com.sample.testing.models.SampleModelA;
import com.sample.testing.models.SampleModelB;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.platform.commons.util.StringUtils;

public class CustomResponseMatcher extends TypeSafeMatcher<Object> {

    @Override
    protected boolean matchesSafely(Object item) {
        if(item instanceof SampleModelA) {
            return StringUtils.isNotBlank(((SampleModelA) item).getMobileNumber()) &&
                    ((SampleModelA) item).getMobileNumber().length() == 10;
        } else {
            return StringUtils.isNotBlank(((SampleModelB) item).getPasswordCombination()) &&
                    ((SampleModelB) item).getPasswordCombination().contains("PWD$123");
        }
    }

    public static Matcher<Object> isValid() {
        return new CustomResponseMatcher();
    }

    @Override
    public void describeTo(Description description) {

    }
}
