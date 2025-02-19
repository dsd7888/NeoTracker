import java.util.Comparator;
public class MissDistanceComparator implements Comparator<NearEarthObject>
{
    /**
     * Compares two NearEarthObjects based on Miss Distance.
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
        if(leftSide.getMissDistance() == rightSide.getMissDistance())
        {
            return 0;
        }
        if(leftSide.getMissDistance() > rightSide.getMissDistance())
        {
            return 1;
        }
        return -1;
    }
}
