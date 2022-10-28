package partiallyOpenlabbook;

public class HarmonicSum {

	public static void main(String[] args) {
		final int MAX_DENOMINATOR=50000;
		double sumL2R=0.0;
		double sumR2L=0.0;
		double absDiff;
		for(int denominator=1;denominator<=MAX_DENOMINATOR;++denominator) {
			sumL2R+=(double)1/denominator;
		}
        System.out.println("The sum from left to right is:"+sumL2R);
        for(int denominator=1;denominator<=MAX_DENOMINATOR;++sumR2L) {
        	sumR2L=(double)1/denominator;
        }
        System.out.println("The sum from right to left is:"+sumR2L);
        if(sumL2R > sumR2L)
        {
        	absDiff=sumR2L-sumL2R;
        	System.out.println("Difference of series is:"+absDiff);
        }
        else {
        	absDiff=0;
        	System.out.println("Difference of series is:"+absDiff);
        }
	}
}

