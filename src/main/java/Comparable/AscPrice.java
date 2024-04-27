package Comparable;

import DTO.AlbumDTO;
import java.util.Arrays;
import java.util.Comparator;

public class AscPrice implements Comparator<AlbumDTO> {
    @Override
    public int compare(AlbumDTO o1, AlbumDTO o2) {
        int result = 0;

        if(o1.getCollectionPrice() > o2.getCollectionPrice()){
            result = 1;
        } else if(o1.getCollectionPrice() < o2.getCollectionPrice()) {
            result = -1;
        }
        return result;
    }
}
