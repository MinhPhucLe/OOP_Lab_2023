package hust.soict.globalict.aims.media.Comparator;

import hust.soict.globalict.aims.media.Media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    public int compare(Media item1, Media item2) {
        String titleOfItem1 = item1.getTitle();
        String titleOfItem2 = item2.getTitle();
        if (titleOfItem1.compareTo(titleOfItem2) > 0) return 1;
        else if (titleOfItem1.compareTo(titleOfItem2) < 0) return -1;
        else {
            float costOfItem1 = item1.getCost();
            float costOfItem2 = item2.getCost();
            if (costOfItem1 > costOfItem2) return 1;
            else if (costOfItem1 < costOfItem2) return -1;
            else return 0;
        }
    }
}
