package music.comparable.sort.album;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import music.domain.dto.AlbumDTO;

//public class DescReleaseDate implements Comparator<AlbumDTO> {
public class DescReleaseDate implements Comparator<AlbumDTO> {


    @Override
    public int compare(AlbumDTO o1, AlbumDTO o2) {
        String date_o1 = o1.getReleaseDate();
        String date_o2 = (o2.getReleaseDate());
        DateParsing(date_o2);
        DateParsing(date_o1);


        return (date_o1).compareTo(date_o2);
    }

    //ReleaseDate 데이터, String -> Date 변환
    public static void DateParsing(String date){
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date redate = format.parse(date);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}