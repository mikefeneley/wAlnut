package model.MARK_I.SDR;

import java.io.IOException;

/**
 * @author Quinn Liu (quinnliu@vt.edu)
 * @version Apr 10, 2014
 */
public class FindOptimalParametersForSDRTest extends junit.framework.TestCase {

    public void setUp() {
	// not necessary since all methods in class FindOptimalParametersForSDR
	// are static(meaning you can directly call them without creating an
	// object)
    }

    /**
     * Place a description of your method here.
     *
     * @throws IOException
     */
    public void testGetSpatialPoolingScoreWithGivenParametersForMarkNullaModel()
	    throws IOException {
	// TODO: for some reason gradle is causing a build error here
	// view here: https://travis-ci.org/quinnliu/WalnutiQ/jobs/22705645
//	assertEquals(
//		8.827,
//		FindOptimalParametersForSDR
//			.printToFileSDRScoreFor1RetinaTo1RegionModel(50, 3,
//				"./experiments/model/MARK_I/SDR/currentSDRScore.txt"),
//		.001);
    }
}