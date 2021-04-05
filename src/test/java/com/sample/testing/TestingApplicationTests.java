package com.sample.testing;

import com.sample.testing.models.SampleModelA;
import com.sample.testing.models.SampleModelB;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.sample.testing.CustomResponseMatcher.isValid;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
class TestingApplicationTests {

	@Test
	void contextLoads() {
		SampleModelA modelA = new SampleModelA("8829899931");
		assertThat(modelA, isValid());
		SampleModelB modelB = new SampleModelB("PWD$12_password");
		assertThat(modelB, isValid());
	}

}
