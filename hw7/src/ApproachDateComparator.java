import java.util.Comparator;

public class ApproachDateComparator implements Comparator<NearEarthObject>
{
    /**
     * Compares two NearEarthObjects based on Approach Date.
     *
     * @param leftSide
     *  the first object to be compared.
     * @param rightSide
     *  the second object to be compared.
     *
     * @return
     *  An integer value of 1,0 or -1 indicating comparison.
     */
    public int compare(NearEarthObject leftSide, NearEarthObject rightSide)
    {
        if(leftSide.getClosestApproach().getTime() == rightSide.getClosestApproach().getTime())
        {
            return 0;
        }
        if(leftSide.getClosestApproach().getTime() > rightSide.getClosestApproach().getTime())
        {
            return 1;
        }
        return -1;
    }
}
