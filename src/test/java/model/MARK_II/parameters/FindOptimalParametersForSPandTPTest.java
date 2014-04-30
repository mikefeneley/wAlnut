package model.MARK_II.parameters;

import java.io.IOException;

/**
 * @author Quinn Liu (quinnliu@vt.edu)
 * @version Apr 30, 2014
 */
public class FindOptimalParametersForSPandTPTest extends
	junit.framework.TestCase {
    public void setUp() {
	// not necessary since all methods in class FindOptimalParametersForSDR
	// are static(meaning you can directly call them without creating an
	// object)
    }

    public void test_printToFileSDRScoreFor1RetinaTo1RegionModelFor1Digit()
	    throws IOException {
	assertEquals(
		-4.004,
		FindOptimalParametersForSPandTP
			.printToFileSPandTPScoreFor1RetinaTo1RegionModelFor1Digit(
				77.8, 1, 10, 25, 1000, 0.02, 0.005, 0.2, 0.3,
				0.2, 0.005, 0.01,
				"./src/test/java/model/MARK_II/parameters/SPandTPScore.txt"),
		.00001);
    }
}
