import java.util.Comparator;

public class ReferenceIdComparator implements Comparator<NearEarthObject>
{

    /**
     * Compares two NearEarthObjects based on Reference ID.
     *
     * @param leftSide
     *  the first object to be compared.
     * @param rightSide
     *  the second object to be compared.
     *
     * @return
     *  An integer value of 1,0 or -1 indicating comparison.
     */
    @Override
    public int compare(NearEarthObject leftSide, NearEarthObject rightSide)
    {
        if(leftSide.getReferenceId() == rightSide.getReferenceId())
        {
            return 0;
        }
        if(leftSide.getReferenceId() > rightSide.getReferenceId())
        {
            return 1;
        }
        else {
            return -1;
        }
    }

}
